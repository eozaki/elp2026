package Semana06

data class Literal(val value: Int): Expression {
    override fun vars(): List<Variable> = emptyList()
}