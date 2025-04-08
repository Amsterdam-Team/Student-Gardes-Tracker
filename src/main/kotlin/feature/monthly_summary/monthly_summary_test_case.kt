package feature.monthly_summary

fun main(args: Array<String>) {
    println("monthly_summary_test_case!")
    check("When the value is a valid  ---, then return true", isValid("dddd"), true)

}


fun check(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name")
    }
}


fun isValid(value: String): Boolean {

    return true
}