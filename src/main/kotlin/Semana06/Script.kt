package Semana06

data class Script(val instructions: List<Instruction>, val params: List<String>) {
    data class VarError(val msg: String)

    fun validate(): List<VarError> {
        val errors = emptyList<VarError>().toMutableList()
        val knownVars = mutableSetOf<String>()

        for(param in params)
            knownVars.add(param)

        for(instruction in instructions) {
            when(instruction) {
                is Assign -> {
                    knownVars.add(instruction.varId)

                    checkVars(instruction.exp, knownVars, errors)
                }

                is Print -> {
                    checkVars(instruction.exp, knownVars, errors)
                }
            }
        }

        return errors
    }

    fun checkVars(exp: Expression, knownVars: MutableSet<String>, errors: MutableList<VarError>) {
        when(exp) {
            is Variable -> {
                if (!knownVars.contains(exp.varId))
                    errors.add(VarError("${exp.varId} is not a known var"))
            }
            is BinaryExpression -> {
                for(newVar in exp.vars())
                    if(!knownVars.contains(newVar.varId))
                        errors.add(VarError("${newVar.varId} is not a known var"))
            }
            else -> {}
        }
    }
}