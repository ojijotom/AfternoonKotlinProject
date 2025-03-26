class Dog(var name:String, var breed:String, var color:String){

}

fun main() {
    var dog1 = Dog("Maureen","Chihuahua","white")
    println(dog1.name)
    var dog2 = Dog("Ojijo","BullDog","Brown")
    println(dog2.breed)
    var dog3 = Dog("Innocent","German Shepherd","Brown")
    println(dog3.color)
    var dog4 = Dog("Abigael","Siberian Husky","white")
    println(dog4.breed)
}