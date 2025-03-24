import java.util.Scanner
fun main() {
    var  read=Scanner(System.`in`)

    println("Enter your firstname:")
    var firstname = readln()
    println("Hello there,$firstname")


    println("How old are you?")
    var age =read.nextInt()
    println("$firstname is $age years old")

    println("Enter your weight(kg):")
    var weight =read.nextDouble()
    println("$firstname is $weight kilograms")

}