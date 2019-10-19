package com.warrior.nongnghiepketnoi.quiz.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.warrior.nongnghiepketnoi.R
import com.warrior.nongnghiepketnoi.quiz.model.Answer
import com.warrior.nongnghiepketnoi.quiz.model.QuizTest
import kotlinx.android.synthetic.main.item_start_quiz.view.*
import kotlinx.android.synthetic.main.item_test_quiz.view.content_quiz

class StartQuizAdapter(
    private val userList: ArrayList<QuizTest>,
    private val onClickStartQuiz: OnClickStartQuiz
) :
    RecyclerView.Adapter<StartQuizAdapter.QuizViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_start_quiz, parent, false)
        return QuizViewHolder(v, onClickStartQuiz)
    }

    interface OnClickStartQuiz {
        fun onClickStartQuizListener(quizTest: QuizTest, position: Int)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: QuizViewHolder, position: Int) {
        holder.bindView(userList[position])
        holder.itemView.tag = position
    }

    class QuizViewHolder(itemView: View, onClickStartQuiz: OnClickStartQuiz) :
        RecyclerView.ViewHolder(itemView), AnswerAdapter.OnClickAnswer {

        private var quizTest: QuizTest? = null
        private val clickAnswer = onClickStartQuiz

        fun bindView(quiz: QuizTest) {
            quizTest = quiz
            itemView.content_quiz.text = quiz.content
            val allAnswer = quiz.listQuiz
            val adapter = AnswerAdapter(allAnswer, this)
            itemView.recycler_quiz_test.adapter = adapter
        }

        override fun onClickAnswerListener(answer: Answer, position: Int) {
            clickAnswer.onClickStartQuizListener(quizTest!!, itemView.tag as Int)
        }
    }
}