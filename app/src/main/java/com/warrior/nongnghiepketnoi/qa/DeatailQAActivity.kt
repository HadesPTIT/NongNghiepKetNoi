package com.warrior.nongnghiepketnoi.qa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.warrior.nongnghiepketnoi.R
import com.warrior.nongnghiepketnoi.newfeeds.ModelFeed
import kotlinx.android.synthetic.main.activity_deatail_qa.*

class DeatailQAActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deatail_qa)
        var modelFeed = intent.getSerializableExtra("modelFeed") as ModelFeed
        tv_name.setText(modelFeed.getName())
        tv_time.setText(modelFeed.getTime())
        tv_like.setText(modelFeed.getLikes().toString())
        tv_status.setText(modelFeed.getStatus())

        Glide.with(this).load(modelFeed.getPropic()).apply(RequestOptions.circleCropTransform())
            .into(imgView_proPic)
        if (modelFeed.getPostpic() == 0) {
            imgView_postPic.setVisibility(View.GONE)
        } else {
            imgView_postPic.setVisibility(View.VISIBLE)
            Glide.with(this).load(modelFeed.getPostpic()).into(imgView_postPic)
        }
        if (modelFeed.isOwnRice()) {
            tv_like.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            tv_label_rice.setTextColor(getResources().getColor(R.color.colorPrimaryDark))
            ic_rice.setImageResource(R.drawable.ic_rice_select)
        } else {
            tv_like.setTextColor(getResources().getColor(R.color.black))
            tv_label_rice.setTextColor(getResources().getColor(R.color.black))
            ic_rice.setImageResource(R.drawable.ic_rice)
        }
    }
}
