package com.flashdroid.findmyconcert;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {


    private ListView mListview;

    private List<String> mNewslist;
    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View fragmentView = inflater.inflate(R.layout.fragment_news, container, false);
        mListview = (ListView) fragmentView.findViewById(R.id.Mylistview);
        mNewslist=new ArrayList<String>();
        mNewslist.add("Hello");
        mNewslist.add("My First Item");
        mNewslist.add("My First Item");
        mNewslist.add("My First Item");
        mNewslist.add("My First Item");
        mNewslist.add("My First Item");

        mListview.setAdapter(new MyAdapter());
        return fragmentView;
    }
    private class MyAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return mNewslist.size();
        }

        @Override
        public Object getItem(int position) {
            return mNewslist.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View rowview =getActivity().getLayoutInflater().inflate(R.layout.row,null);
            TextView textviewrow = (TextView) rowview.findViewById(R.id.textView);
            textviewrow.setText(mNewslist.get(position));
            ImageView imageview = (ImageView) rowview.findViewById(R.id.imageviewpicasso);

            Picasso.with(getActivity()).load("http://i.imgur.com/DvpvklR.png").into(imageview);
            return rowview;
        }
    }


}
