import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import Semana02.Expressions

fun main() {
    val lexer = Expressions(CharStreams.fromString("1 2.1 3"))
    val stream = CommonTokenStream(lexer)
    stream.fill()
    stream.tokens.forEach {
        val typeName = lexer.vocabulary.getSymbolicName(it.type)
        println("${it.text} ($typeName)")
    }
}
