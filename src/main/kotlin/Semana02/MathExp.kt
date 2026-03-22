package Semana02

import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.Token
import kotlin.math.pow

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

fun validateOperators(text: String): Boolean {
    val lexer = Expressions(CharStreams.fromString(text))
    val stream = CommonTokenStream(lexer)
    stream.fill()
    val tokens = stream.tokens.dropLast(1)

    if(tokens.firstOrNull()?.type == Math.OPERATION || tokens.lastOrNull()?.type == Math.OPERATION)
        return false

    for(i in 1 until tokens.size)
        if(tokens[i].type == Math.OPERATION && (tokens[i - 1].type == Math.OPERATION || tokens[i + 1].type == Math.OPERATION))
            return false

    return true
}

fun eval(exp: String): Double {
    val opStack = ArrayDeque<String>()
    val valStack = ArrayDeque<Double>()

    fun calc() {
        val a = valStack.removeLast()
        val res = when(val op = opStack.removeLast()) {
            "+" -> valStack.removeLast() + a
            "*" -> valStack.removeLast() * a
            "-" -> valStack.removeLast() - a
            "/" -> valStack.removeLast() / a
            "^" -> valStack.removeLast().pow(a)
            else -> throw RuntimeException("Invalid operation: $op")
        }

        valStack.addLast(res)
    }

    val lexer = Expressions(CharStreams.fromString(exp))
    val stream = CommonTokenStream(lexer)
    stream.fill()

    stream.tokens.forEach {
        when(it.type) {
            Math.OPERATION -> opStack.addLast(it.text)
            Math.NUMBER -> valStack.addLast(it.text.toDouble())
            Math.CLOSE -> calc()
        }
    }

    return valStack.last()
}
