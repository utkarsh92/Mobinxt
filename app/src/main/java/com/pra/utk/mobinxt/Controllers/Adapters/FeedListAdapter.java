package com.pra.utk.mobinxt.Controllers.Adapters;

/**
 * Created by Pewds on 20-Nov-15.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pra.utk.mobinxt.Models.FeedItem;
import com.pra.utk.mobinxt.R;

import java.util.List;

public class FeedListAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private FeedListAdapter listAdapter;
    private List<FeedItem> feedItems;

    public FeedListAdapter(Activity activity, List<FeedItem> feedItems) {
        this.activity = activity;
        this.feedItems = feedItems;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

//    @Override
//    public int getItemViewType(int position) {
//        return feedItems.get(position).getType();
//    }

    @Override
    public int getCount() {
        return feedItems.size();
    }

    @Override
    public Object getItem(int location) {
        return feedItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView name,timestamp,trip,location,likes;
        ImageView bgpic,propic;
        FeedItem item;

        item = feedItems.get(position);

        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(R.layout.feed_item, null);

        name = (TextView) convertView.findViewById(R.id.name);
        timestamp = (TextView) convertView.findViewById(R.id.timestamp);
        trip = (TextView) convertView.findViewById(R.id.trip);
        location = (TextView) convertView.findViewById(R.id.location);
        likes = (TextView) convertView.findViewById(R.id.likes);
        bgpic = (ImageView) convertView.findViewById(R.id.bg_image);
        propic = (ImageView) convertView.findViewById(R.id.profile_pic);

        name.setText(item.getName());
        timestamp.setText(item.getTimestamp());
        trip.setText(item.getTrip());
        location.setText(item.getLocation());
        likes.setText(item.getLikes());
        bgpic.setImageResource(item.getBgpic());
        propic.setImageResource(item.getPropic());

        return convertView;
    }
}
