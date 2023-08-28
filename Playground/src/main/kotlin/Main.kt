fun main(args: Array<String>) {
    var arr = arrayOf(1,2,3,4,5,6,7)
    indexLoop(arr){ index,value ->
        var text = "The value of index$index is: $value"
        println(text)
    }
}

fun <T> loop(array: Array<T>, param: (T) -> Unit) {
    for (value in array) {
        param(value)
    }
}


    fun <T> indexLoop(array: Array<T>, param: (Int, T) -> Unit) {
        for ((index, value) in array.withIndex()) {
            param(index, value)
        }
    }




