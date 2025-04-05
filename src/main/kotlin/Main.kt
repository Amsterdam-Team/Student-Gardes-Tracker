fun main(args: Array<String>) {
    val student1 = Student("Mohamed Ibrahim",100)
    val student2 = Student("Mo",100)
    val allStudents = listOf(student1,student2)

    getAllStudents(allStudents)
    println(calculateGradesAvg(allStudents))
    println("hello from mina maher")
}
fun getAllStudents(allStudents: List<Student>) {
    allStudents.forEach {
        if (it.grade>=50){
            println("Good Work ${it.name} you are Passed ")
        }
    }
}
fun calculateGradesAvg(students:List<Student>) = students.map { it.grade }.average()

fun calculateMinMaxGrade(student:List<Student>){
    val grades = student.map{it.grade}

    val maxGrade=grades.max()
    val minGrade=grades.min()

    println("Your max Grade is:  $maxGrade , MinGrade is: $minGrade ")
}