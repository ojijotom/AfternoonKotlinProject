import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("Enter your firstnumber:")
    var firstnumber = read.nextInt()

    println("Enter your secondnumber:")
    var secondnumber = read.nextInt()

    println("Enter your thirdnumber:")
    var thirdnumber = read.nextInt()

    if (firstnumber > secondnumber && firstnumber > thirdnumber) {
        println("$firstnumber is greater than $secondnumber and $thirdnumber")

    } else if (secondnumber > firstnumber && secondnumber > thirdnumber) {
        println("$secondnumber is greater than $firstnumber and $thirdnumber")
    }
    else{
        println("$thirdnumber is greater than $secondnumber and $firstnumber")
    }








}
