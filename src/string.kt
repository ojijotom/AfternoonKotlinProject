fun main() {
    var firstname="Tom"
    var lastname="Ojijo"
    var school = "eMobilis"

    println(firstname)
    println(firstname + " " + lastname) //String concatination
    println(firstname[0])
    println(firstname.uppercase())
    println(lastname.lowercase())

    //String interpolation
    println("$school is a coding school")
    println("My fullname is $firstname $lastname")

}