import java.util.Scanner
fun main() {
    var read=Scanner(System.`in`)

    println("Enter room temperature:")
    var temperature = read.nextInt()


    if (temperature < 25){
        println("It is cold")
    }
    else{
        println("It is hot")
    }

}