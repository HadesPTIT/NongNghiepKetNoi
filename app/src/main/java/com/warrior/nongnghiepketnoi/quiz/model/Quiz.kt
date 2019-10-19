package com.warrior.nongnghiepketnoi.quiz.model

class QuizCategory(
    val image: Int,
    val name: String,
    val content: String
)

class QuizTest(
    val content: String,
    private val image: String,
    val listQuiz: ArrayList<Answer>,
    val idQuizTrue: Int
)

class Answer(val id: Number, val answer: String)