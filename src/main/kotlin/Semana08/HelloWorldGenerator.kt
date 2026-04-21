package Semana08

// evita estar a escrever sempre “Opcodes.”
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Label
import java.io.FileOutputStream

fun main() {
    val cw = ClassWriter(ClassWriter.COMPUTE_FRAMES)

    // inicio de escrita da classe
    cw.visit(V1_8, ACC_PUBLIC, "HelloWorld", null, "java/lang/Object", null)

    generateMainWithCall(cw)
    addIncMethod(cw)
    absMethod(cw)
    evenMethod(cw)
    firstDigitMethod(cw)

    // termino de escrita da classe
    cw.visitEnd()

    // conversao para bytes e escrita em ficheiro
    val code = cw.toByteArray()
    val outputStream = FileOutputStream("HelloWorld.class")
    outputStream.write(code)
    outputStream.close()
}

fun generateMain(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null)

    // inicio de escrita de corpo
    mv.visitCode()

    // push objeto PrintStream
    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")

    // push objeto String
    mv.visitLdcInsn("Hello, World!")

    // invocacao (2 x pop)
    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false)

    // retorno (sem resultado)
    mv.visitInsn(RETURN)

    // os parametros são ignorados (dado COMPUTE_FRAMES),
    // mas esta chamada eh necessaria antes de terminar a escrita do metodo
    mv.visitMaxs(0, 0)

    // termino de escrita de metodo
    mv.visitEnd()
}

fun generateMainWithCall(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null)
    mv.visitCode()

    // conversao de primeiro argumento de programa em inteiro
    mv.visitVarInsn(ALOAD, 0)
    mv.visitInsn(ICONST_0)
    mv.visitInsn(AALOAD)
    mv.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;)I", false);

    // invocacao
    mv.visitMethodInsn(INVOKESTATIC, "HelloWorld", "abs", "(I)I", false)
    mv.visitMethodInsn(INVOKESTATIC, "HelloWorld", "even", "(I)Z", false)
    mv.visitMethodInsn(INVOKESTATIC, "HelloWorld", "firstDigit", "(I)I", false)

    // argumento
    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")

    // troca ordem dos dois valores no topo da pilha
    mv.visitInsn(SWAP)

    // invocacao
    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false)

    // retorno (sem resultado)
    mv.visitInsn(RETURN)
    mv.visitMaxs(0, 0)
    mv.visitEnd()
}

fun addIncMethod(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "inc", "(I)I", null, null)
    mv.visitCode()

    mv.visitVarInsn(ILOAD, 0)
    mv.visitInsn(ICONST_1)
    mv.visitInsn(IADD)
    mv.visitInsn(IRETURN)

    mv.visitMaxs(0, 0)
    mv.visitEnd()
}

fun absMethod(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "abs", "(I)I", null, null)
    val lt = Label()
    val end = Label()

    mv.visitCode()
    mv.visitVarInsn(ILOAD, 0)

    mv.visitJumpInsn(IFLT, lt)

    mv.visitVarInsn(ILOAD, 0)
    mv.visitJumpInsn(GOTO, end)

    mv.visitLabel(lt)
    mv.visitVarInsn(ILOAD, 0)
    mv.visitInsn(INEG)

    mv.visitLabel(end)
    mv.visitInsn(IRETURN)
    mv.visitMaxs(0, 0)
    mv.visitEnd()
}

fun evenMethod(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "even", "(I)Z", null, null)
    val even = Label()
    val end = Label()

    mv.visitCode()

    mv.visitVarInsn(ILOAD, 0)

    mv.visitIntInsn(BIPUSH, 2)

    mv.visitInsn(IREM)
    mv.visitJumpInsn(IFEQ, even)
    mv.visitInsn(ICONST_0)
    mv.visitJumpInsn(GOTO, end)

    mv.visitLabel(even)
    mv.visitInsn(ICONST_1)

    mv.visitLabel(end)
    mv.visitInsn(IRETURN)
    mv.visitMaxs(0, 0)
    mv.visitEnd()
}

fun firstDigitMethod(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "firstDigit", "(I)I", null, null)
    val loop = Label()
    val end  = Label()

    mv.visitCode()

    mv.visitLabel(loop)
    mv.visitVarInsn(ILOAD, 0)
    mv.visitIntInsn(BIPUSH, 10)
    mv.visitJumpInsn(IF_ICMPLT, end)
    mv.visitVarInsn(ILOAD, 0)
    mv.visitIntInsn(BIPUSH, 10)
    mv.visitInsn(IDIV)
    mv.visitVarInsn(ISTORE, 0)
    mv.visitJumpInsn(GOTO,loop)

    mv.visitLabel(end)
    mv.visitVarInsn(ILOAD, 0)
    mv.visitInsn(IRETURN)
    mv.visitMaxs(0, 0)
    mv.visitEnd()
}
