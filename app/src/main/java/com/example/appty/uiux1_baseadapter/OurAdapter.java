package com.example.appty.uiux1_baseadapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by appty on 01/04/18.
 */

public class OurAdapter extends BaseAdapter {

    TypedArray images;
    String[] titles;
    String[] descriptions;
    Context context;
    LayoutInflater layoutInflater;

    OurAdapter(Context adapterContext, TypedArray Images, String[] Titles, String[] Descriptions)
    {
        context = adapterContext;
        images = Images;
        titles = Titles;
        descriptions = Descriptions;

        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    class ViewHolder{
            TextView tv1, tv2;
            ImageView img;
    }
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = new ViewHolder();
        if (view == null)
        {
            view = layoutInflater.inflate(R.layout.list_item, viewGroup, false);
            viewHolder.tv1 = view.findViewById(R.id.tv1);
            viewHolder.tv2 = view.findViewById(R.id.tv2);
            viewHolder.img = view.findViewById(R.id.img);

            view.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.tv1.setText(titles[position]);
        viewHolder.tv2.setText(descriptions[position]);
        viewHolder.img.setImageResource(images.getResourceId(position,0));


        return view;
    }
}
