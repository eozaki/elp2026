package Semana06

import kotlin.math.exp

data class Interpreter(val script: Script) {
    var vars = mutableMapOf<String, Int>()

    fun run(params: Map<String, Int>): Int {
        val errors = script.validate()

        if(errors.isNotEmpty())
            throw RuntimeException("Errors when validating: " + errors.joinToString("\n"))

        for(param in params)
            vars[param.key] = param.value

        for(instruction in script.instructions)
            when(instruction) {
                is Print -> print(calc(instruction.exp))
                is Assign -> vars[instruction.varId] = calc(instruction.exp)
            }

        return 0;
    }

    fun calc(exp: Expression): Int {
        when(exp) {
            is Literal -> return exp.value
            is Variable -> {
                val value = vars[exp.varId] ?: throw RuntimeException("Variable not found: ${exp.varId}")

                return value
            }
            is BinaryExpression -> {
                when(exp.op) {
                    Operator.PLUS -> return calc(exp.left) + calc(exp.right)
                    Operator.MINUS -> return calc(exp.left) - calc(exp.right)
                    Operator.TIMES -> return calc(exp.left) * calc(exp.right)
                    Operator.DIVISION -> {
                        if(calc(exp.right) == 0) throw RuntimeException("Division by zero")

                        return calc(exp.left) / calc(exp.right)
                    }
                }
            }
        }
    }
}
