val Name:String = "Trenton Weir"


fun main(args: Array<String>) {
    printContent()
}

fun testing(){
    hello()
    hello("This is from ${Name}")
    space(2)
    var x: Double = 5.01
    var y: Double = 2.04
    println("The result of X:${x} + Y:${y} = Z:${addXYAndReturnZ(x,y)}")

    space()
    printPriceAndTax(10.00, .70)
    space()
    arrayOfNumbers(arrayOf(1,2,3,4,5,8,9,3,13), "Printing From Array: ")
    space(5)
}

fun hello(str: String? = null) {
    var message = if (str == null) "Hello, Android ATC" else str
    println(message)
}

fun space(numberOfSpaces:Int = 1){
    //Print space this many times
    repeat(numberOfSpaces){
        println()
    }
}

fun addXYAndReturnZ(x: Double, y: Double): Double {
    var z: Double = x + y
    return z
}

fun printPriceAndTax(price:Double, tax:Double){
    print("Price = $${price} and tax = $${tax}")
}

fun <T> arrayOfNumbers(array: Array<T>, message: String? = null) {
    if (message != null) {
        for ((index, value) in array.withIndex()) {
            println("${message} Index:${index} Value:${value}")
        }
    } else {
        for (a in array) {
            println(a)
        }
    }
}
fun isNul(str:String?):Boolean{
    return if(str == null) true else false
}

fun Decorate(decoration: String? = null, message: String? = null) {
    val decor: String = decoration ?: "="
    val decorText: String = message ?: "Welcome to Android ATC"
    val decorLength: Int = if (decorText.length > 30) decorText.length else 30
    val decorSpaceLength: Int = if (decorLength % 2 == 0) (decorLength - decorText.length) / 2 else ((decorLength - decorText.length) + 1) / 2

    val decorLine = decor.repeat(decorLength)
    val decorSpaces = " ".repeat(decorSpaceLength)

    val decoratedMessage = "$decorSpaces$decorText$decorSpaces"

    println(decorLine)
    println(decoratedMessage)
    println(decorLine)
}

fun inputStuff(){
    println("Enter Your Name: ")
    var name:String = readln()
    println("Enter Your Age: ")
    var age:Int = readln().toInt()
    println("Thank you, Your Name is: ${name}, and your age is: ${age}")

}

fun printContent(){
    Decorate()
    inputStuff()
    space(2)
}





