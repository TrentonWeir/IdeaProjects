package Utils

class Looping {
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
}