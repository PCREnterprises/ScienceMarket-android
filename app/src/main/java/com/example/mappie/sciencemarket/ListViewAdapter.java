package com.example.mappie.sciencemarket;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Hero> {

    //the hero list that will be displayed
    private List<Hero> heroList;

    //the context object
    private Context mCtx;

    //here we are getting the herolist and context
    //so while creating the object of this adapter class we need to give herolist and context
    public ListViewAdapter(List<Hero> heroList, Context mCtx) {
        super(mCtx, R.layout.list_items, heroList);
        this.heroList = heroList;
        this.mCtx = mCtx;
    }

    //this method will return the list item
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //getting the layoutinflater
        LayoutInflater inflater = LayoutInflater.from(mCtx);

        //creating a view with our xml layout
        View listViewItem = inflater.inflate(R.layout.list_items, null, true);

        //getting text views
        TextView textQtitle = listViewItem.findViewById(R.id.textQtitle);
        TextView textQdesc = listViewItem.findViewById(R.id.textQdesc);


        //Getting the hero for the specified position
        Hero hero = heroList.get(position);

        //setting hero values to textviews
        textQtitle.setText(hero.getQstn_titl());
        textQdesc.setText(Html.fromHtml(hero.getQstn_desc()));


        //returning the listitem
        return listViewItem;
    }
}