package com.warrior.nongnghiepketnoi.newfeeds

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.warrior.nongnghiepketnoi.R
import com.warrior.nongnghiepketnoi.constance.Const
import com.warrior.nongnghiepketnoi.qa.DeatailQAActivity
import java.util.ArrayList

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class NewFeedsFragment : Fragment(), AdapterFeed.Listener {
    override fun onClickItem(modelFeed: ModelFeed?) {
        val intent = Intent(activity, DeatailQAActivity::class.java)
        intent.putExtra("modelFeed",modelFeed)
        getActivity()?.startActivity(intent)
    }

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
        adapterFeed.setListener(this)
        recyclerView.adapter = adapterFeed
        modelFeedArrayList.addAll(Const.populateRecyclerView())

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
