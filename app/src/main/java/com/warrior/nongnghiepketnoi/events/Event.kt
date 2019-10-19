package com.warrior.nongnghiepketnoi.events

/**
 * Created by Hades on 10/19/2019.
 */
data class Event(
    var url: String? = null,
    var name: String? = null,
    var content: String? = null,
    var numberInterest: Int = 0,
    var isFollow : Boolean = false
)