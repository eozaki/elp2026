package Semana01

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class ExpressionTest {
    @Test
    fun testHtmlTag() {
        assertTrue(htmlTag.matches("<tag>"))
        assertFalse(htmlTag.matches("</a>"))
        assertFalse(htmlTag.matches("<tag"))
    }

    @Test
    fun testBinaryNumber() {
        assertTrue(binaryNumber.matches("01101"))
        assertFalse(binaryNumber.matches("0110211"))
        assertFalse(binaryNumber.matches("binario"))
    }

    @Test
    fun testJavaAccess() {
        assertTrue(javaAccessIdentifier.matches("public"))
        assertTrue(javaAccessIdentifier.matches("private"))
        assertTrue(javaAccessIdentifier.matches("protected"))
        assertFalse(javaAccessIdentifier.matches("private matter"))
        assertFalse(javaAccessIdentifier.matches("matter"))
    }

    @Test
    fun testJavaIdentifier() {
        assertTrue(javaIdentifier.matches("variavel"))
        assertTrue(javaIdentifier.matches("var_iable1"))
        assertTrue(javaIdentifier.matches("var_1iable"))
        assertFalse(javaIdentifier.matches("1var_1iable"))
    }

    @Test
    fun testXmlBlock() {
        assertTrue(xmlBlock.matches("<doc>"))
        assertTrue(xmlBlock.matches("</doc>"))
        assertFalse(xmlBlock.matches("<doc"))
    }

    @Test
    fun testRationalNegativeNumber() {
        assertTrue(rationalNegativeNumber.matches("0"))
        assertTrue(rationalNegativeNumber.matches("1"))
        assertTrue(rationalNegativeNumber.matches("3.14"))
        assertTrue(rationalNegativeNumber.matches("-1"))
        assertTrue(rationalNegativeNumber.matches("-3.14"))
        assertFalse(rationalNegativeNumber.matches("3."))
        assertFalse(rationalNegativeNumber.matches("-.14"))
    }

    @Test
    fun testDate() {
        assertTrue(date.matches("14-03-1991"))
        assertFalse(date.matches("14-3-1991"))
        assertFalse(date.matches("4-03-1991"))
        assertTrue(date.matches("04-03-1991"))
    }

    @Test
    fun testInternationalPhone() {
        assertTrue(internationalPhone.matches("(+55) 11993199951"))
        assertFalse(internationalPhone.matches("(+) 11993199951"))
        assertFalse(internationalPhone.matches("(+55) 1111993199951"))
        assertFalse(internationalPhone.matches("(55) 11993199951"))
        assertFalse(internationalPhone.matches("(+55) 190"))
    }

    @Test
    fun testString() {
        assertTrue(string.matches("\"\""))
        assertTrue(string.matches("\"abc sa ew, 32!\""))
        assertFalse(string.matches("la la la"))
    }

    @Test
    fun testEmail() {
        assertTrue(email.matches("email@example.com"))
        assertTrue(email.matches("email@example"))
        assertFalse(email.matches("emailexample"))
        assertFalse(email.matches("email@@example"))
        assertFalse(email.matches("email@example."))
    }
}
