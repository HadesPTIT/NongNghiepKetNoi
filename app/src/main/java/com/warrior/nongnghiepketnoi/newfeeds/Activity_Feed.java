package com.warrior.nongnghiepketnoi.newfeeds;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.warrior.nongnghiepketnoi.R;

import java.util.ArrayList;

public class Activity_Feed extends AppCompatActivity {

    RecyclerView recyclerView;
    private ArrayList<ModelFeed> modelFeedArrayList = new ArrayList<>();
    AdapterFeed adapterFeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_feed);
//
//        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//
//        adapterFeed = new AdapterFeed(this, modelFeedArrayList);
//        recyclerView.setAdapter(adapterFeed);
//
//        populateRecyclerView();
    }

    public void populateRecyclerView() {

        ModelFeed modelFeed = new ModelFeed(1, 9, 2, "https://image-us.24h.com.vn/upload/4-2018/images/2018-12-03/1543833238-98-bo-luong-33-ty-ve-lam-nong-dan-7-nam-1-1543758863-width500height333.jpeg", R.drawable.phong_benh_vai2,
                "Nguyễn Thị Mai", "2 hrs", "Quả bị chàm đen nhưng không bị rụng, số lượng bị nhiều. Hỏi nguyên nhân và cách khắc phục? Mọi năm quả rất đẹp nhưng năm nay quả gần chín thì trên vỏ quả xuất hiện vết nám, sau đó chuyển sang màu chàm xanh. Hỏi nguyên nhân và cách khắc phục?");
        modelFeedArrayList.add(modelFeed);
        modelFeed = new ModelFeed(2, 26, 6, "http://kenh14cdn.com/2016/img-20160930-104023-1477075473425.jpg", 0,
                "Thảo Bùi", "9 hrs", "Hỏi cách phòng và trị bệnh tụ huyết trùng trên lợn");
        modelFeedArrayList.add(modelFeed);
        modelFeed = new ModelFeed(3, 17, 5,"https://i.a4vn.com/2018/7/30/hinh-anh-gay-cuoi-gian-di-nhu-nong-dan-cua-mc-quyen-linh-5d67bb.jpg", R.drawable.ga_chet_dgln,
                "Lê Lâm", "13 hrs", "Gà tự nhiên lăn ra chết phải làm sao");
        modelFeedArrayList.add(modelFeed);

        adapterFeed.notifyDataSetChanged();
    }
}
