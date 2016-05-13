package com.pra.utk.mobinxt;

import android.widget.ImageView;

/**
 * Created by Pewds on 14-May-16.
 */
public class FeedItem {
    String name,timestamp,trip,location;
    int likes;
    ImageView bgpic,propic;

    public FeedItem(){
    }

    public FeedItem(String name, String timestamp, String trip, String location, int likes, ImageView bgpic, ImageView propic) {
        this.name = name;
        this.timestamp = timestamp;
        this.trip = trip;
        this.location = location;
        this.likes = likes;
        this.bgpic = bgpic;
        this.propic = propic;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ImageView getBgpic() {
        return bgpic;
    }

    public void setBgpic(ImageView bgpic) {
        this.bgpic = bgpic;
    }

    public ImageView getPropic() {
        return propic;
    }

    public void setPropic(ImageView propic) {
        this.propic = propic;
    }
}


