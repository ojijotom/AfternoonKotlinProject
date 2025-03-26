class Person{
    var name = "John"
    var age = 45
    var gender ="Male"

    fun speak(){
        println("Doctor is speaking")
    }
}

fun main() {
    var doctor1 = Person()
    doctor1.speak()
    println(doctor1.name)


}