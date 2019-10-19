package com.warrior.nongnghiepketnoi.quiz.model

class QuizCategory {
    private val image: String = ""
    private val name: String = ""
    private val content: String = ""
    private val id: Int = 0
}

class QuizTest(
    val content: String,
    private val image: String,
    val listQuiz: ArrayList<Answer>,
    val idQuizTrue: Int
)

class Answer(val id: Number, val answer: String)