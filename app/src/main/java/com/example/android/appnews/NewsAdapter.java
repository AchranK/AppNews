package com.example.android.appnews;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context,ArrayList<News> news) {
        super(context,0,news);
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_items,parent,false);
        }
        News currentNews = getItem(position);
        TextView newsTitleTextView = (TextView) listItemView.findViewById(R.id.title);
        String title = currentNews.getTitle();
        newsTitleTextView.setText(title);


        TextView newsSectionTextView = (TextView) listItemView.findViewById(R.id.section);
        String section = currentNews.getSection();
        newsSectionTextView.setText(section);

        TextView newsUrlTextView = (TextView) listItemView.findViewById(R.id.url);
        String url = currentNews.getUrl();
        newsUrlTextView.setText(url);


        TextView newsDateTextView = (TextView) listItemView.findViewById(R.id.date);
        String date = currentNews.getDate();
        newsDateTextView.setText(date);

        return listItemView;
    }

}
