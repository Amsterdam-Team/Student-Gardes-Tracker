fun main(args: Array<String>) {
    val student1 = Student("Mohamed Ibrahim",100)
    val student2 = Student("Mo",100)
    val allStudents = listOf(student1,student2)

    getAllStudents(allStudents)
    println(calculateGradesAvg(allStudents))


}
fun getAllStudents(allStudents: List<Student>) {
    allStudents.forEach {
        if (it.garde>=50){
            println("Good Work ${it.name} you are Passed ")
        }
    }
}
fun calculateGradesAvg(students:List<Student>) = students.map { it.garde }.average()
