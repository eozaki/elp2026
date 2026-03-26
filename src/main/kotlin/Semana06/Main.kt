package Semana06

fun main() {
    val script = Script(
        listOf(
            // b = a * 100
            Assign("b", BinaryExpression(Variable("a"), Operator.TIMES, Literal(100))),
            // c = b + 1
            Assign("c", BinaryExpression(Variable("b"), Operator.PLUS, Literal(1))),
            // 101
            Print(Variable("c"))
        ),
        listOf("a") // parameter
    )

    print(script.validate())

    val interp = Interpreter(script)
    interp.run(mapOf("a" to 1))
}