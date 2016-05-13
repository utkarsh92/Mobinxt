package com.pra.utk.mobinxt;

/**
 * Created by Pewds on 20-Nov-15.
 */

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
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

        int type = getItemViewType(position);
        FeedItem item = feedItems.get(position);

        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

//        if (type == 0)
//        {
            convertView = inflater.inflate(R.layout.feed_item, null);

            TextView name = (TextView) convertView.findViewById(R.id.name);
            TextView timestamp = (TextView) convertView.findViewById(R.id.timestamp);
            TextView trip = (TextView) convertView.findViewById(R.id.trip);
            TextView location = (TextView) convertView.findViewById(R.id.location);
            TextView likes = (TextView) convertView.findViewById(R.id.likes);
            ImageView bgpic = (ImageView) convertView.findViewById(R.id.bg_image);
            ImageView propic = (ImageView) convertView.findViewById(R.id.profile_pic);

            name.setText(item.getName());
            timestamp.setText(item.getTimestamp());
            trip.setText(item.getTrip());
            location.setText(item.getLocation());
            likes.setText(item.getLikes());
//            item.setBgpic();
//        }

        return convertView;
    }
}
