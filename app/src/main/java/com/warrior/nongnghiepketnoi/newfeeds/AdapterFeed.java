package com.warrior.nongnghiepketnoi.newfeeds;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.warrior.nongnghiepketnoi.R;


import java.util.ArrayList;


public class AdapterFeed extends RecyclerView.Adapter<AdapterFeed.MyViewHolder> {
    public interface Listener {
         void onClickItem(ModelFeed modelFeed);
    }
    Context context;
    ArrayList<ModelFeed> modelFeedArrayList = new ArrayList<>();
    RequestManager glide;
    private Listener listener ;
    public AdapterFeed(Context context, ArrayList<ModelFeed> modelFeedArrayList) {

        this.context = context;
        this.modelFeedArrayList = modelFeedArrayList;
        glide = Glide.with(context);

    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_feed, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final ModelFeed modelFeed = modelFeedArrayList.get(position);

        holder.tv_name.setText(modelFeed.getName());
        holder.tv_time.setText(modelFeed.getTime());
        holder.tv_likes.setText(String.valueOf(modelFeed.getLikes()));
        holder.tv_comments.setText(modelFeed.getComments() + " bình luận");
        holder.tv_status.setText(modelFeed.getStatus());

        Glide.with(context).load(modelFeed.getPropic()).apply(RequestOptions.circleCropTransform()).into(holder.imgView_proPic);
        if (modelFeed.getPostpic() == 0) {
            holder.imgView_postPic.setVisibility(View.GONE);
        } else {
            holder.imgView_postPic.setVisibility(View.VISIBLE);
            glide.load(modelFeed.getPostpic()).into(holder.imgView_postPic);
        }
        if(modelFeed.isOwnRice()){
            holder.tv_likes.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
            holder.tvLabelRice.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
            holder.icRice.setImageResource(R.drawable.ic_rice_select);
        }else {
            holder.tv_likes.setTextColor(context.getResources().getColor(R.color.black));
            holder.tvLabelRice.setTextColor(context.getResources().getColor(R.color.black));
            holder.icRice.setImageResource(R.drawable.ic_rice);
        }
        holder.btnComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClickItem(modelFeed);
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClickItem(modelFeed);
            }
        });
        holder.icTick.setVisibility(modelFeed.isTick()? View.VISIBLE:View.GONE);

    }

    @Override
    public int getItemCount() {
        return modelFeedArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name, tv_time, tv_likes, tv_comments, tv_status,tvLabelRice;
        ImageView imgView_proPic, imgView_postPic ,icRice,icTick;
        LinearLayout btnComment;

        public MyViewHolder(View itemView) {
            super(itemView);

            imgView_proPic = (ImageView) itemView.findViewById(R.id.imgView_proPic);
            imgView_postPic = (ImageView) itemView.findViewById(R.id.imgView_postPic);
            tvLabelRice =  itemView.findViewById(R.id.tv_label_rice);
            icRice =  itemView.findViewById(R.id.ic_rice);
            btnComment =  itemView.findViewById(R.id.btnComment);

            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_time = (TextView) itemView.findViewById(R.id.tv_time);
            tv_likes = (TextView) itemView.findViewById(R.id.tv_like);
            tv_comments = (TextView) itemView.findViewById(R.id.tv_comment);
            tv_status = (TextView) itemView.findViewById(R.id.tv_status);
            icTick = itemView.findViewById(R.id.id_tick);
        }
    }
}
