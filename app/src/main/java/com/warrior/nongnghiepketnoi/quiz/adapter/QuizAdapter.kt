package com.warrior.nongnghiepketnoi.quiz.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.warrior.nongnghiepketnoi.R
import com.warrior.nongnghiepketnoi.quiz.model.QuizCategory
import kotlinx.android.synthetic.main.item_test_quiz.view.*

class QuizAdapter(
    private val userList: ArrayList<QuizCategory>,
    private val onClick: OnClickQuizAll
) : RecyclerView.Adapter<QuizAdapter.QuizViewHolder>() {

    interface OnClickQuizAll {
        fun onClickQuizAllListener(category: QuizCategory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_test_quiz, parent, false)
        return QuizViewHolder(v, onClick)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: QuizViewHolder, position: Int) {
        holder.bindView(userList[position])
    }

    class QuizViewHolder(itemView: View, onClickQuizAll: OnClickQuizAll) :
        RecyclerView.ViewHolder(itemView) {

        private var category: QuizCategory? = null

        init {
            itemView.setOnClickListener {
                onClickQuizAll.onClickQuizAllListener(category!!)
            }
        }

        fun bindView(quiz: QuizCategory) {
            category = quiz
            itemView.name_quiz.text = quiz.name
            itemView.image.setBackgroundResource(quiz.image)
            itemView.content_quiz.text =
                quiz.content
        }

        companion object
    }
}