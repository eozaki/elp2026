package Semana02

import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.Token

fun validateBrackets(expression: String): Boolean {
    val stack = ArrayDeque<Token>()
    val lexer = Math(CharStreams.fromString(expression))
    val stream = CommonTokenStream(lexer)

    stream.fill()
    stream.tokens.forEach {
        when(it.type) {
            Math.OPEN -> stack.addLast(it)
            Math.CLOSE -> if(stack.isEmpty() || stack.removeLast().type != Math.OPEN)
                return false
        }
    }
    
    return stack.isEmpty()
}
