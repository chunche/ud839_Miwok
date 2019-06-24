package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/* Special adapter to view the array list of words than a simple arrayAdapter cant manage */
public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        //get the link object located at this position in the list
        Word currentWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiworkTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.miwok_default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //return the whole list item layout(containing 2 TextViews and ImageView)
        return listItemView;
    }
}
