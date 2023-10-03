fun main() {
    val phoneNumber: String? = "dtrognn"
    val nullValue: String? = null

    if (phoneNumber != null) {
        println(phoneNumber.length)
    } else {
        println("phoneNumber is null")
    }

    val length = nullValue?.length
    println(length)

    // elvis operator
    val defaultValue = nullValue?.length ?: "nil"

    phoneNumber?.let {
        println("abc")
    }

    val exact = nullValue!!.length
    println(exact)
}
