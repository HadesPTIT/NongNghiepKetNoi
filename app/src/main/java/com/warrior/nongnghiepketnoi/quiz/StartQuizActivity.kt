package com.warrior.nongnghiepketnoi.quiz

import android.app.Dialog
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.warrior.nongnghiepketnoi.quiz.adapter.StartQuizAdapter
import com.warrior.nongnghiepketnoi.quiz.model.Answer
import com.warrior.nongnghiepketnoi.quiz.model.QuizTest
import kotlinx.android.synthetic.main.activity_start_quiz.*
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size

class StartQuizActivity : AppCompatActivity(), StartQuizAdapter.OnClickStartQuiz {

    private val allQuiz = arrayListOf<QuizTest>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.warrior.nongnghiepketnoi.R.layout.activity_start_quiz)

        ic_info.setOnClickListener{
            onBackPressed()
        }

        val listAnswer = ArrayList<Answer>()
        listAnswer.add((Answer(1, "Cho đất nghỉ ngơi và để ải")))
        listAnswer.add((Answer(2, "Bổ sung thêm đất mới")))
        listAnswer.add((Answer(3, "Bổ sung thêm phân")))
        listAnswer.add((Answer(4, "Bổ sung thêm vôi bột, vỏ trứng")))

        val listAnswer2 = ArrayList<Answer>()
        listAnswer2.add((Answer(1, "Sâu xám")))
        listAnswer2.add((Answer(2, "Sâu đục quả")))
        listAnswer2.add((Answer(3, "Sâu đo")))

        val listAnswer1 = ArrayList<Answer>()
        listAnswer1.add(
            (Answer(
                1,
                "Đợt trồng sớm: Trồng vào khoảng tháng 7-8, thu hoạch vào cuối tháng 10-12."
            ))
        )
        listAnswer1.add(
            (Answer(
                2,
                "Đợt trồng chính : Bắt đầu trồng vào tháng 9-10, thu hoạch vào tháng 2-3 năm sau."
            ))
        )
        listAnswer1.add(
            (Answer(
                3,
                "Đợt trồng muộn: Trồng vào khoảng tháng 11-12, thu hoạch vào tháng 3-4 năm sau."
            ))
        )

        allQuiz.add(
            QuizTest(
                "Các cách cải tạo đất trồng rau sau thu hoạch đơn giản mà hiệu quả",
                "",
                listAnswer,
                0
            )
        )
        allQuiz.add(
            QuizTest(
                "Nên trồng cà chua vào tháng mấy?",
                "",
                listAnswer1,
                0
            )
        )
        allQuiz.add(
            QuizTest(
                "Sâu bệnh hại cà chua",
                "",
                listAnswer2,
                0
            )
        )
        allQuiz.add(
            QuizTest(
                "Các cách cải tạo đất trồng rau sau thu hoạch đơn giản mà hiệu quả",
                "",
                listAnswer,
                0
            )
        )

        progress_question.text = String.format(
            "câu hỏi 1/%d",
            allQuiz.size
        )
        val adapter = StartQuizAdapter(allQuiz, this)
        recycler_view_quiz.adapter = adapter

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recycler_view_quiz.layoutManager = layoutManager
    }

    override fun onClickStartQuizListener(quizTest: QuizTest, position: Int) {
        progress_question.text = String.format("câu hỏi %d/%d", position + 1, allQuiz.size)
        recycler_view_quiz.scrollToPosition(position + 1)

        if (position == allQuiz.size - 1) {
            viewKonfetti.build()
                .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
                .setDirection(0.0, 359.0)
                .setSpeed(1f, 5f)
                .setFadeOutEnabled(true)
                .setTimeToLive(2000L)
                .addShapes(Shape.RECT, Shape.CIRCLE)
                .addSizes(Size(12))
                .setPosition(-50f, viewKonfetti.width + 50f, -50f, -50f)
                .streamFor(300, 5000L)
            val r = Runnable {
                showDialog()
            }
            Handler().postDelayed(r, 2000)
        }
    }

    private lateinit var dialog: Dialog
    private fun showDialog() {
        dialog = Dialog(this@StartQuizActivity)
        dialog.setTitle("Chúc mừng bạn")
        dialog.setContentView(com.warrior.nongnghiepketnoi.R.layout.congratulations_expried)
        dialog.show()
    }
}
