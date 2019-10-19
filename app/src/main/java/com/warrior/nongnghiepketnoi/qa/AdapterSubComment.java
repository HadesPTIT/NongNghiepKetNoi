package com.warrior.nongnghiepketnoi.qa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.warrior.nongnghiepketnoi.R;
import com.warrior.nongnghiepketnoi.newfeeds.Comment;

import java.util.ArrayList;


public class AdapterSubComment extends RecyclerView.Adapter<AdapterSubComment.MyViewHolder> {

    Context context;
    ArrayList<Comment> commentArrayList = new ArrayList<>();
    RequestManager glide;
    public AdapterSubComment(Context context, ArrayList<Comment> CommentArrayList) {
        this.context = context;
        this.commentArrayList = CommentArrayList;
        glide = Glide.with(context);

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_qa_sub_comment, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Comment comment = commentArrayList.get(position);

        holder.tv_name.setText(comment.getName());
        holder.tv_time.setText(comment.getTime());
        holder.tv_likes.setText(String.valueOf(comment.getLikes()));
        holder.tv_status.setText(comment.getStatus());

        Glide.with(context).load(comment.getPropic()).apply(RequestOptions.circleCropTransform()).into(holder.imgView_proPic);
        if (comment.getPostpic() == 0) {
            holder.imgView_postPic.setVisibility(View.GONE);
        } else {
            holder.imgView_postPic.setVisibility(View.VISIBLE);
            glide.load(comment.getPostpic()).into(holder.imgView_postPic);
        }
        if(comment.isOwnRice()){
            holder.tv_likes.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
            holder.tvLabelRice.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
            holder.icRice.setImageResource(R.drawable.ic_rice_select);
        }else {
            holder.tv_likes.setTextColor(context.getResources().getColor(R.color.black));
            holder.tvLabelRice.setTextColor(context.getResources().getColor(R.color.black));
            holder.icRice.setImageResource(R.drawable.ic_rice);
        }

    }

    @Override
    public int getItemCount() {
        return commentArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name, tv_time, tv_likes,  tv_status,tvLabelRice;
        ImageView imgView_proPic, imgView_postPic ,icRice;

        public MyViewHolder(View itemView) {
            super(itemView);
            imgView_proPic = (ImageView) itemView.findViewById(R.id.imgView_proPic);
            imgView_postPic = (ImageView) itemView.findViewById(R.id.imgView_postPic);
            tvLabelRice =  itemView.findViewById(R.id.tv_label_rice);
            icRice =  itemView.findViewById(R.id.ic_rice);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_time = (TextView) itemView.findViewById(R.id.tv_time);
            tv_likes = (TextView) itemView.findViewById(R.id.tv_like);
            tv_status = (TextView) itemView.findViewById(R.id.tv_status);
        }
    }
}
