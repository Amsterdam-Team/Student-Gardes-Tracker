package feature.monthly_summary

fun main(args: Array<String>) {
    println("monthly_summary_test_case!")
}
fun check(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name")
    }
}