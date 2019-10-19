package com.warrior.nongnghiepketnoi.newfeeds;

public class ModelFeed {

    private int id, likes, comments, postpic;
    private String name, time, status,propic;
    private boolean isOwnRice;

    public ModelFeed(int id, int likes, int comments, String propic, int postpic, String name, String time, String status,boolean isOwnRice) {
        this.id = id;
        this.likes = likes;
        this.comments = comments;
        this.propic = propic;
        this.postpic = postpic;
        this.name = name;
        this.time = time;
        this.status = status;
        this.isOwnRice = isOwnRice;
    }

    public boolean isOwnRice() {
        return isOwnRice;
    }

    public void setOwnRice(boolean ownRice) {
        isOwnRice = ownRice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getPropic() {
        return propic;
    }

    public void setPropic(String propic) {
        this.propic = propic;
    }

    public int getPostpic() {
        return postpic;
    }

    public void setPostpic(int postpic) {
        this.postpic = postpic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
