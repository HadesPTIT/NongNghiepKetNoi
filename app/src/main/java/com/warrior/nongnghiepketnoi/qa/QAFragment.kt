package com.warrior.nongnghiepketnoi.qa

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.warrior.nongnghiepketnoi.R
import com.warrior.nongnghiepketnoi.constance.Const
import com.warrior.nongnghiepketnoi.newfeeds.AdapterFeed
import com.warrior.nongnghiepketnoi.newfeeds.ModelFeed
import kotlinx.android.synthetic.main.fragment_new_feedsqa.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class QAFragment : Fragment(), AdapterFeed.Listener {
    override fun onClickItem(modelFeed: ModelFeed?) {
        val intent = Intent(activity, DeatailQAActivity::class.java)
        intent.putExtra("modelFeed",modelFeed)
        activity?.startActivity(intent)
    }

    private var param1: String? = null
    private var param2: String? = null
    private lateinit var recyclerView: RecyclerView
    var modelFeedArrayList = ArrayList<ModelFeed>()
    lateinit var adapterFeed: AdapterFeed

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_feedsqa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerView) as RecyclerView
        val layoutManager = LinearLayoutManager(context)
        context?.let {
            Glide.with(it).load("http://kenh14cdn.com/2016/img-20160930-104023-1477075473425.jpg").apply(
                RequestOptions.circleCropTransform())
                .into(imgView_proPic)
        }

        recyclerView.layoutManager = layoutManager

        adapterFeed = AdapterFeed(context, modelFeedArrayList)
        adapterFeed.setListener(this)
        recyclerView.adapter = adapterFeed
        modelFeedArrayList.addAll(Const.populateQARecyclerView())
        adapterFeed.notifyDataSetChanged()
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            QAFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
