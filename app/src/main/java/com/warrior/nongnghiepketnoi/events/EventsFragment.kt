package com.warrior.nongnghiepketnoi.events

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.warrior.nongnghiepketnoi.R
import kotlinx.android.synthetic.main.fragment_events.*

/**
 * Created by Hades on 10/19/2019.
 */

class EventsFragment : Fragment(), EventAdapter.Listener {

    var eventAdapter: EventAdapter? = null
    var list: ArrayList<Event> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_events, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getAllEvents()

        Handler().postDelayed({
            progress_loading?.visibility = View.GONE
            rvEvents?.apply {
                layoutManager = LinearLayoutManager(context)
                eventAdapter = EventAdapter(context, list)
                eventAdapter?.setListener(this@EventsFragment)
                adapter = eventAdapter
            }
        }, 500L)
    }

    override fun onClickItem(event: Event) {
        fragmentManager?.beginTransaction()?.addToBackStack("")?.replace(R.id.rl_event_container,EventDetailFragment())?.commit()
    }

    private fun getAllEvents() {
        list.clear()
        list.add(
            Event(
                "https://png.pngtree.com/png_detail/20181017/creative-farm-icon-png-clipart_867813.png",
                "Ngày hội khuyến nông Quảng nam lần thứ 1",
                "Hôm nay - lúc 13h - Cung văn hóa Quảng Nam - An Hòa - An Xá - VN",
                969,
                false
            )
        )
        list.add(
            Event(
                "https://vandienfmp.vn/wp-content/uploads/2019/07/27-300x188.jpg",
                "Ngày hội khuyến nông Quảng nam lần thứ 2",
                "Hôm nay - lúc 13h - Cung văn hóa Quảng Nam - An Hòa - An Xá - VN",
                3256,
                true
            )
        )
        list.add(
            Event(
                "https://starnewsphilly.com/wp-content/uploads/sites/27/2019/05/1O4sSY3W72DnQphgJErWOWw.jpeg",
                "Ngày hội khuyến nông Quảng nam lần thứ 3",
                "Hôm nay - lúc 13h - Cung văn hóa Quảng Nam - An Hòa - An Xá - VN",
                559,
                true
            )
        )
        list.add(
            Event(
                "http://baotuyenquang.com.vn/media/images/2019/03/img_20190306092630.jpg",
                "Ngày hội khuyến nông Quảng nam lần thứ 4",
                "Hôm nay - lúc 13h - Cung văn hóa Quảng Nam - An Hòa - An Xá - VN",
                999,
                false
            )
        )
        list.add(
            Event(
                "https://canghaisan.com/wp-content/uploads/2018/07/Ca-Dong-tuoi-ngon-re.jpg",
                "Ngày hội khuyến nông Quảng nam lần thứ 5",
                "Hôm nay - lúc 13h - Cung văn hóa Quảng Nam - An Hòa - An Xá - VN",
                999,
                false
            )
        )
        list.add(
            Event(
                "https://image.nongnghiep.vn/upload/2018/9/6/tq1095035169.jpg",
                "Ngày hội khuyến nông Quảng nam lần thứ 6",
                "Hôm nay - lúc 13h - Cung văn hóa Quảng Nam - An Hòa - An Xá - VN",
                999,
                false
            )
        )
        list.add(
            Event(
                "http://baotuyenquang.com.vn/media/images/2019/03/img_20190306092630.jpg",
                "Ngày hội khuyến nông Quảng nam lần thứ 7",
                "Hôm nay - lúc 13h - Cung văn hóa Quảng Nam - An Hòa - An Xá - VN",
                999,
                false
            )
        )
        list.add(
            Event(
                "https://image.nongnghiep.vn/upload/2018/9/6/tq1095035169.jpg",
                "Ngày hội khuyến nông Quảng nam lần thứ 8",
                "Hôm nay - lúc 13h - Cung văn hóa Quảng Nam - An Hòa - An Xá - VN",
                999,
                false
            )
        )
        list.add(
            Event(
                "http://baotuyenquang.com.vn/media/images/2019/03/img_20190306092630.jpg",
                "Ngày hội khuyến nông Quảng nam lần thứ 9",
                "Hôm nay - lúc 13h - Cung văn hóa Quảng Nam - An Hòa - An Xá - VN",
                999,
                false
            )
        )
        list.add(
            Event(
                "https://image.nongnghiep.vn/upload/2018/9/6/tq1095035169.jpg",
                "Ngày hội khuyến nông Quảng nam lần thứ 10",
                "Hôm nay - lúc 13h - Cung văn hóa Quảng Nam - An Hòa - An Xá - VN",
                999,
                false
            )
        )
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            EventsFragment().apply {
            }
    }
}