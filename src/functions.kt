fun main() {
    //Standard-library functions/ Predefined functions
    var output = Math.sqrt(144.0)
    println("The square root of 144 is $output")

    var number = Math.round(45.89)
    println(number)

    school()
    add()
    student("Tom","Male",20)
    student("Ann","Female",20)
    employee("Peter",20,20000.0,true)
    employee("James",23,40000.0,false)
}

//User-Defined functions
fun school(){
    println("eMobilis")

}

fun add(){
    var x = 3
    var y = 5
    println(x + y)
}

//Parameters/Variables  and Arguments/Values
fun student( name:String,gender:String,age:Int){
    println("$name is a $gender.$name is $age years old")
}
fun employee( name:String,age:Int,salary:Double,disability:Boolean){
    println("$name is $age years old earning ksh.$salary .Disability $disability")
}
