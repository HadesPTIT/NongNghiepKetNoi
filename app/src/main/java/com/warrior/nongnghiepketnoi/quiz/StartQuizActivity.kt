package com.warrior.nongnghiepketnoi.quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.warrior.nongnghiepketnoi.R
import com.warrior.nongnghiepketnoi.quiz.adapter.StartQuizAdapter
import com.warrior.nongnghiepketnoi.quiz.model.Answer
import com.warrior.nongnghiepketnoi.quiz.model.QuizTest
import kotlinx.android.synthetic.main.activity_start_quiz.*

class StartQuizActivity : AppCompatActivity(), StartQuizAdapter.OnClickStartQuiz {

    private val allQuiz = arrayListOf<QuizTest>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_quiz)

        val listAnswer = ArrayList<Answer>()
        listAnswer.add((Answer(1, "A")))
        listAnswer.add((Answer(1, "B")))
        listAnswer.add((Answer(1, "C")))
        listAnswer.add((Answer(1, "D")))

        allQuiz.add(QuizTest("ABCD", "", listAnswer, 0))
        allQuiz.add(QuizTest("AB", "", listAnswer, 1))
        allQuiz.add(QuizTest("ABC", "", listAnswer, 2))
        allQuiz.add(QuizTest("ABCE", "", listAnswer, 3))

        progress_question.text = String.format("câu hỏi 1/%d", allQuiz.size)
        val adapter = StartQuizAdapter(allQuiz, this)
        recycler_view_quiz.adapter = adapter

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recycler_view_quiz.layoutManager = layoutManager
    }

    override fun onClickStartQuizListener(quizTest: QuizTest, position: Int) {
        progress_question.text = String.format("câu hỏi %d/%d", position + 1, allQuiz.size)
        recycler_view_quiz.scrollToPosition(position + 1)
    }
}
