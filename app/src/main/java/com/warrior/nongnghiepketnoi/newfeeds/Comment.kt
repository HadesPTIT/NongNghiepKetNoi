package com.warrior.nongnghiepketnoi.newfeeds

import java.io.Serializable

class Comment(
    var id: Int,
    var likes: Int,
    var propic: String?,
    var postpic: Int,
    var name: String?,
    var time: String?,
    var status: String?,
    var isOwnRice: Boolean
) : Serializable {
    var commentList: List<Comment>? = null
}
