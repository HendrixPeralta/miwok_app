package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hdx on 21/02/18.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

   public WordAdapter(Activity context, ArrayList<Word> lisOfWords){
        super (context, 0, lisOfWords);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        englishTextView.setText(currentWord.getEnglishWord());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokWord());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()){
            iconView.setImageResource(currentWord.getIdImage());
        }
        else{
            iconView.setVisibility(View.GONE);
        }



        return listItemView;
    }
}
