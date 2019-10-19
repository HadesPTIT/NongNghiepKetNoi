package com.warrior.nongnghiepketnoi.setting

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.warrior.nongnghiepketnoi.R
import com.warrior.nongnghiepketnoi.quiz.QuizesActivity
import kotlinx.android.synthetic.main.fragment_setting.*

class SettingFragment : Fragment() {
    companion object Factory {
        fun newInstance(): SettingFragment {
            val args = Bundle()
            val fragment = SettingFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        test.setOnClickListener { gotoQuizz() }

    }

    fun gotoQuizz() {
        val intent = Intent(activity, QuizesActivity::class.java)
        startActivity(intent)
    }
}