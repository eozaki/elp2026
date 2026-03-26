package Semana06

sealed interface Expression {
    fun vars(): List<Variable>
}