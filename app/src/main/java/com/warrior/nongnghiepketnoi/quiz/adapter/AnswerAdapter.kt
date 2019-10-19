package com.warrior.nongnghiepketnoi.quiz.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.warrior.nongnghiepketnoi.R
import com.warrior.nongnghiepketnoi.quiz.model.Answer
import kotlinx.android.synthetic.main.item_answer.view.*

class AnswerAdapter(
    private val userList: ArrayList<Answer>,
    private val onClickAnswer: OnClickAnswer
) : RecyclerView.Adapter<AnswerAdapter.QuizViewHolder>() {

    interface OnClickAnswer {
        fun onClickAnswerListener(answer: Answer, position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_answer, parent, false)
        return QuizViewHolder(v, onClickAnswer)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: QuizViewHolder, position: Int) {
        holder.bindView(userList[position])
        holder.itemView.tag = position
    }

    class QuizViewHolder(itemView: View, onClickAnswer: OnClickAnswer) :
        RecyclerView.ViewHolder(itemView) {

        private var answer: Answer? = null

        init {
            itemView.setOnClickListener {
                val color: Int
                val position: Int = itemView.tag as Int

                color = if (position == 1) {
                    R.drawable.button_error
                } else {
                    R.drawable.button_success
                }
                itemView.setBackgroundResource(color)
                onClickAnswer.onClickAnswerListener(answer!!, itemView.tag as Int)
            }
        }

        fun bindView(quiz: Answer) {
            answer = quiz
            itemView.answer.text = quiz.answer
        }
    }
}