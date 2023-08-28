fun main(args: Array<String>) {
    lesson2()
}

fun lesson2() {
    // First Loop
    loop(10) { index ->
        println("Loop 1 Current Index: $index")
    }
    println("We have exited the first loop")

    // Second Loop
    var exited = false
    loop(10) { index ->
        if (!exited) {
            println("Loop 2: Current Index $index")
            if (index >= 5) {
                exited = true
                return@loop
            }
        }
    }
    println("We have exited the second loop")

    println("The application is complete...")
}

fun loop(numberOfIntervals: Int = 10, callback: (Int) -> Unit = {}) {
    for (i in 1..numberOfIntervals) {
        callback(i)
    }
}

