package com.warrior.nongnghiepketnoi.newfeeds

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.warrior.nongnghiepketnoi.R
import java.util.ArrayList

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class NewFeedsFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null
     lateinit var recyclerView: RecyclerView
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
        return inflater.inflate(R.layout.fragment_new_feeds, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerView) as RecyclerView

        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager

        adapterFeed = AdapterFeed(context, modelFeedArrayList)
        recyclerView.adapter = adapterFeed

        populateRecyclerView()
    }
    fun populateRecyclerView() {

        var modelFeed = ModelFeed(
            1,
            9,
            2,
            "https://image-us.24h.com.vn/upload/4-2018/images/2018-12-03/1543833238-98-bo-luong-33-ty-ve-lam-nong-dan-7-nam-1-1543758863-width500height333.jpeg",
            R.drawable.phong_benh_vai2,
            "Nguyễn Thị Mai",
            "2 hrs",
            "Quả bị chàm đen nhưng không bị rụng, số lượng bị nhiều. Hỏi nguyên nhân và cách khắc phục? Mọi năm quả rất đẹp nhưng năm nay quả gần chín thì trên vỏ quả xuất hiện vết nám, sau đó chuyển sang màu chàm xanh. Hỏi nguyên nhân và cách khắc phục?"
        )
        modelFeedArrayList.add(modelFeed)
        modelFeed = ModelFeed(
            2, 26, 6, "http://kenh14cdn.com/2016/img-20160930-104023-1477075473425.jpg", 0,
            "Thảo Bùi", "9 hrs", "Hỏi cách phòng và trị bệnh tụ huyết trùng trên lợn"
        )
        modelFeedArrayList.add(modelFeed)
        modelFeed = ModelFeed(
            3,
            17,
            5,
            "https://i.a4vn.com/2018/7/30/hinh-anh-gay-cuoi-gian-di-nhu-nong-dan-cua-mc-quyen-linh-5d67bb.jpg",
            R.drawable.ga_chet_dgln,
            "Lê Lâm",
            "13 hrs",
            "Gà tự nhiên lăn ra chết phải làm sao"
        )
        modelFeedArrayList.add(modelFeed)

        adapterFeed.notifyDataSetChanged()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            NewFeedsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
