package Semana06

data class Variable(val varId: String): Expression {
    override fun vars(): List<Variable> = listOf(this)
}