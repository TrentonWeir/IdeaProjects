class Teacher(
    firstName: String,
    lastName: String,
    streetAddress: String,
    city: String,
    state: String,
    zip: Int,
    val className: String
) : Student(firstName, lastName, streetAddress, city, state, zip, 0.0, "") {

    override fun toString(): String {
        val studentString = super.toString()
        return "$studentString\nClass: $className"
    }
}