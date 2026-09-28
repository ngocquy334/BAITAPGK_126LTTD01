package com.example.studentinfo_2415053122235
import com.example.studeninfo_2415053122235.R
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val currentStudent = Student(
            studentId = "2415053122235",
            fullName = "Trương Ngọc Quý",
            className = "126TLTTD01",
            age = 21,
            score = 8.6,
            major = "Công Nghệ Thông Tin"
        )
        val tvStudentId = findViewById<TextView>(R.id.tvStudentId)
        val tvFullName = findViewById<TextView>(R.id.tvFullName)
        val tvClass = findViewById<TextView>(R.id.tvClass)
        val tvAge = findViewById<TextView>(R.id.tvAge)
        val tvScore = findViewById<TextView>(R.id.tvScore)
        val tvMajor = findViewById<TextView>(R.id.tvMajor)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)
        val tvRank = findViewById<TextView>(R.id.tvRank)
        val tvSummary = findViewById<TextView>(R.id.tvSummary)

        tvStudentId.text = "Mã SV: ${currentStudent.studentId}"
        tvFullName.text = "Họ và tên: ${currentStudent.fullName}"
        tvClass.text = "Lớp: ${currentStudent.className}"
        tvAge.text = "Tuổi: ${currentStudent.age}"
        tvScore.text = "Điểm gốc: ${currentStudent.score}"
        tvMajor.text = "Ngành đào tạo: ${currentStudent.major}"
        tvFullName.text = "Họ và tên (Viết hoa): ${currentStudent.getUpperCaseName()}"
        tvScore.text = "Điểm (Định dạng): ${currentStudent.getFormattedScore()}"
        tvStatus.text = "Trạng thái môn học: ${currentStudent.getStatus()}"
        tvRank.text = "Xếp loại học lực: ${currentStudent.getAcademicRank()}"
        tvSummary.text = "Tóm tắt hồ sơ: ${currentStudent.getDetailedSummary()}"
    }
}