package Semana06

data class BinaryExpression(val left: Expression, val op: Operator, val right: Expression): Expression {
    override fun vars(): List<Variable> {
        val list = mutableListOf<Variable>()

        list.addAll(left.vars())
        list.addAll(right.vars())

        return list
    }
}