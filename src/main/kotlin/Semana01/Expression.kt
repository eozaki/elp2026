package Semana01

val htmlTag = Regex("<[a-z]+>")

val binaryNumber = Regex("(0|1)+")

val javaAccessIdentifier = Regex("(public|private|protected)")

val javaIdentifier = Regex("[a-z]([a-z]|[A-Z]|\\d|_)*")

val xmlBlock = Regex("<(/)?doc>")

val rationalNegativeNumber = Regex("(-)?\\d+(\\.\\d+)?")

val date = Regex("\\d{2}-\\d{2}-\\d{4}")

val internationalPhone = Regex("\\(\\+(\\d){1,3}\\)\\ *\\d{9,12}")

val string = Regex("\".*\"")

val email = Regex("[A-Z0-9a-z-_]+@([A-Z0-9a-z-_])+(\\.[a-z]+)*")

val seqNumbers = Regex("[0-9]+(,( )?[0-9])*")

val jsonSequence = Regex("\\[(${rationalNegativeNumber.pattern}|${rationalNegativeNumber.pattern}(,${rationalNegativeNumber})*)*]")