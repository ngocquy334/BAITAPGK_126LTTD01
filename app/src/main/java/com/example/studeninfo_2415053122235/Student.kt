package com.example.studentinfo_2415053122235
data class Student(
    val studentId: String,
    val fullName: String,
    val className: String,
    val age: Int,
    val score: Double,
    val major: String = "Công nghệ thông tin"
)
fun Student.getUpperCaseName(): String {
    return this.fullName.uppercase()
}
fun Student.getStatus(): String {
    return if (this.score >= 5.0) "Đạt" else "Chưa đạt"
}
// Extension Function: Xếp loại học lực
fun Student.getAcademicRank(): String {
    return when {
        this.score >= 8.5 -> "Xuất sắc"
        this.score >= 7.0 -> "Khá"
        this.score >= 5.0 -> "Trung bình"
        else -> "Yếu"
    }
}
fun Student.getFormattedScore(): String {
    return String.format("%.1f / 10", this.score)
}
fun Student.getDetailedSummary(): String {
    return "Sinh viên: ${this.getUpperCaseName()} | MSSV: ${this.studentId} | Xếp loại: ${this.getAcademicRank()}"
}