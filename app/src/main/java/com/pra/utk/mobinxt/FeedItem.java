package com.pra.utk.mobinxt;

/**
 * Created by Pewds on 14-May-16.
 */
public class FeedItem {
    String name,timestamp,trip,location;
    int likes;

    public FeedItem(){
    }

    public FeedItem(String name, String timestamp, String trip, String location, int likes) {
        this.name = name;
        this.timestamp = timestamp;
        this.trip = trip;
        this.location = location;
        this.likes = likes;
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
}


