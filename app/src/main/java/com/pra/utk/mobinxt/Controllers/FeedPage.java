package com.pra.utk.mobinxt.Controllers;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.pra.utk.mobinxt.Controllers.Adapters.FeedListAdapter;
import com.pra.utk.mobinxt.Model.FeedItem;
import com.pra.utk.mobinxt.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pewds on 13-May-16.
 */
public class FeedPage extends Fragment {

    private ListView listView;
    private FeedListAdapter listAdapter;
    private List<FeedItem> feedItems;
    public int[] bg_pic_resource = {R.drawable.tint, R.drawable.photo_1438201743149_3cc16cd4cddd, R.drawable.paris_9};
    public int[] pro_pic_resource = {R.drawable.avatar, R.drawable.avatar, R.drawable.avatar};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.feed_page, container, false);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        listView = (ListView) view.findViewById(R.id.list);

        feedItems = new ArrayList<FeedItem>();

        listAdapter = new FeedListAdapter(getActivity(), feedItems);
        listView.setAdapter(listAdapter);

        setFeedList();

        return view;
    }

    private void setFeedList() {

        for (int i = 0; i < 3 ; i++)
        {
            FeedItem item = new FeedItem();

            if(i == 0) {
                item.setName("Emilia Clarke");
                item.setTimestamp("7h ago");
                item.setTrip("My Euro Trip");
                item.setLocation("Venice, Italy");
                item.setLikes("14");
                System.out.println("\n Resid-----> " + bg_pic_resource[i]);
                item.setBgpic(bg_pic_resource[i]);
//                int a = item.getBgpic();
//                System.out.println("\n A-----> " + a );
                item.setPropic(pro_pic_resource[i]);
            }else if (i == 1){
                item.setName("Juliette Arnett");
                item.setTimestamp("2d ago");
                item.setTrip("Swiss Trek");
                item.setLocation("Zermatt, Switzerland");
                item.setLikes("25");
                item.setBgpic(bg_pic_resource[i]);
//                System.out.println(item.getBgpic()+"");
                item.setPropic(pro_pic_resource[i]);
            }else if (i == 2){
                item.setName("Amy Pond");
                item.setTimestamp("2w ago");
                item.setTrip("French Connection");
                item.setLocation("Paris, France");
                item.setLikes("60");
                item.setBgpic(bg_pic_resource[i]);
                item.setPropic(pro_pic_resource[i]);
            }

            feedItems.add(item);
        }


        // notify data changes to list adapater
        listAdapter.notifyDataSetChanged();

    }
}
