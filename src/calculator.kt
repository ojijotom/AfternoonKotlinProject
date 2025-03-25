import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)

    println("Enter first number: ")
    val num1 = read.nextDouble()

    println("Enter an operator (+, -, *, /): ")
    val operator = read.next()[0]

    println("Enter second number: ")
    val num2 = read.nextDouble()

    val result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> if (num2 != 0.0) num1 / num2 else "Cannot divide by zero"
        else -> "Invalid operator"
    }

    println("Result: $result")
}