package com.warrior.nongnghiepketnoi.quiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.warrior.nongnghiepketnoi.R
import com.warrior.nongnghiepketnoi.quiz.adapter.QuizAdapter
import com.warrior.nongnghiepketnoi.quiz.model.QuizCategory
import kotlinx.android.synthetic.main.activity_quizes.*
import kotlin.math.max
import kotlin.math.min


class QuizesActivity : AppCompatActivity(), QuizAdapter.OnClickQuizAll {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizes)

        ic_back.setOnClickListener {
            onBackPressed()
        }

        val users = ArrayList<QuizCategory>()
        users.add(
            QuizCategory(
                R.drawable.default_img_test,
                "Kỹ thuật trồng chè",
                "Để đạt được các công nhận về chuyên gia trồng chè bạn cần thực hiện bài kiểm tra." +
                        "Hoàn thành bài kiểm tra sẽ được công nhận bạn là chuyên gia"
            )
        )
        users.add(
            QuizCategory(
                R.drawable.cafe,
                "Kỹ thuật trồng cây cà phê\n",
                "Để đạt được các công nhận về chuyên gia trồng cafe bạn cần thực hiện bài kiểm tra." +
                        "Hoàn thành bài kiểm tra sẽ được công nhận bạn là chuyên gia"
            )
        )

        val adapter = QuizAdapter(users, this)
        recycler_quiz.adapter = adapter


        val snapHelper = object : LinearSnapHelper() {
            override fun findTargetSnapPosition(
                layoutManager: RecyclerView.LayoutManager?,
                velocityX: Int,
                velocityY: Int
            ): Int {
                val centerView = findSnapView(layoutManager!!) ?: return RecyclerView.NO_POSITION

                val position = layoutManager.getPosition(centerView)
                var targetPosition = -1
                if (layoutManager.canScrollHorizontally()) {
                    targetPosition = if (velocityX < 0) {
                        position - 1
                    } else {
                        position + 1
                    }
                }

                if (layoutManager.canScrollVertically()) {
                    targetPosition = if (velocityY < 0) {
                        position - 1
                    } else {
                        position + 1
                    }
                }

                val firstItem = 0
                val lastItem = layoutManager.itemCount - 1
                targetPosition = min(lastItem, max(targetPosition, firstItem))
                return targetPosition
            }
        }
        snapHelper.attachToRecyclerView(recycler_quiz)
    }

    override fun onClickQuizAllListener(category: QuizCategory) {
        val intent = Intent(this@QuizesActivity, StartQuizActivity::class.java)
        startActivity(intent)
    }
}
