package com.example.mad;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class practical_7_CustomAdapter extends BaseAdapter {

    Activity context;
    String names[];
    int photos[];
    String enroll_no[];

    public practical_7_CustomAdapter(Activity context, String names[], int photos[], String enroll_no[]){
        this.context = context;
        this.names = names;
        this.photos = photos;
        this.enroll_no = enroll_no;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.practical_7_custom_listview, null,true);

        TextView name = (TextView) rowView.findViewById(R.id.Name);
        ImageView profile_photo = (ImageView) rowView.findViewById(R.id.Profile_Photo);
        TextView enroll_number = (TextView) rowView.findViewById(R.id.Enroll_Number);

        name.setText(names[i]);
        profile_photo.setImageResource(photos[i]);
        enroll_number.setText(enroll_no[i]);

        return rowView;
    }
}
