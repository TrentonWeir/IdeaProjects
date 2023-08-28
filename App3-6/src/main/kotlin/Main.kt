


import java.util.Properties

fun main(args: Array<String>) {
    lesson3()
}

fun lesson3() {
    var student = Student(
        "FirstName",
        "LastName",
        "streetAddress",
        "City",
        "State",
        47227,
        4.0,
        "SDEV")

    var teacher = Teacher(
        "FirstName",
        "LastName",
        "streetAddress",
        "City",
        "State",
        47227,
        "Econ")

    println("Student Information:")
    PrintProperties(student)
    println("Teacher Information:")
    PrintProperties(teacher)
}

// ... Rest of your class definitions and functions ...


fun CreateNewTeacher():Teacher{

    val input = java.util.Scanner(System.`in`)

    print("Enter Teacher First Name: ")
    val teacherFirstName = input.nextLine()

    print("Enter Teacher Last Name: ")
    val teacherLastName = input.nextLine()

    print("Enter Teacher Street Address: ")
    val teacherStreetAddress = input.nextLine()

    print("Enter Teacher City: ")
    val teacherCity = input.nextLine()

    print("Enter Teacher State (2 digits): ")
    val teacherState = input.nextLine()

    print("Enter Teacher Zip (4 digits): ")
    val teacherZip = input.nextInt()
    input.nextLine() // Consume the newline character

    print("Enter Teacher Class Name: ")
    val className = input.nextLine()

    val teacher = Teacher(teacherFirstName, teacherLastName, teacherStreetAddress, teacherCity, teacherState, teacherZip, className)

    return teacher

}
fun CreateNewStudent():Student{
    val input = java.util.Scanner(System.`in`)

    print("Enter Student First Name: ")
    val firstName = input.nextLine()

    print("Enter Student Last Name: ")
    val lastName = input.nextLine()

    print("Enter Student Street Address: ")
    val streetAddress = input.nextLine()

    print("Enter Student City: ")
    val city = input.nextLine()

    print("Enter Student State (2 digits): ")
    val state = input.nextLine()

    print("Enter Student Zip (4 digits): ")
    val zip = input.nextInt()
    input.nextLine() // Consume the newline character

    print("Enter Student GPA: ")
    val gpa = input.nextDouble()
    input.nextLine() // Consume the newline character

    print("Enter Student Major: ")
    val major = input.nextLine()

    val student = Student(firstName, lastName, streetAddress, city, state, zip, gpa, major)

    return student
}

fun <T : Any> foreachParam(obj: T) {
    val properties = obj::class.java.declaredFields

    for (prop in properties) {
        prop.isAccessible = true
        val propertyName = prop.name
        val propertyValue = if (prop.name in obj::class.java.declaredFields.map { it.name }) {
            prop.get(obj)
        } else {
            // If property is not directly in the class, try accessing it through super
            val superClassProp = obj::class.java.superclass.getDeclaredField(prop.name)
            superClassProp.isAccessible = true
            superClassProp.get(obj)
        }

        println("$propertyName: $propertyValue")
    }
}

fun <T:Any> foreachSuperProp(obj:T){
    val superProperties = obj::class.java.superclass.declaredFields
    for(prop in superProperties){
        prop.isAccessible = true

        println("${prop.name}:${prop.get(obj)}")
    }
}
fun hasParentClass(clazz: Class<*>): Boolean {
    return clazz.superclass != null && clazz.superclass != Any::class.java
}

fun <T: Any> PrintProperties(obj:T){
    if(hasParentClass(obj::class.java)){
        foreachSuperProp(obj)
    }
    foreachParam(obj)
}





