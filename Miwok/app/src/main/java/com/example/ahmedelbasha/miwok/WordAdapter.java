package com.example.ahmedelbasha.miwok;

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

public class WordAdapter extends ArrayAdapter<Word>{
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param words A List of Word objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        TextView miwokTranslationTextView = listItemView.findViewById(R.id.word_in_miwok_text);
        miwokTranslationTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTranslationTextView = listItemView.findViewById(R.id.word_in_english_text);
        defaultTranslationTextView.setText(currentWord.getmDefaultTranslation());

        ImageView wordImage = listItemView.findViewById(R.id.item_image);

        if (currentWord.hasImage()) {
            wordImage.setImageResource(currentWord.getmImageResourceId());
            wordImage.setVisibility(View.VISIBLE);
        }else {
            wordImage.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
