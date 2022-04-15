package com.example.dictionaryapp.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionaryapp.R;

public class DefinitionViewHolder extends RecyclerView.ViewHolder {

    public TextView textview_definitions, textview_example, textview_synonyms, textview_antonyms;

    public DefinitionViewHolder(@NonNull View itemView) {
        super(itemView);

        textview_definitions = itemView.findViewById(R.id.textview_definitions);
        textview_example = itemView.findViewById(R.id.textview_example);
        textview_synonyms = itemView.findViewById(R.id.textview_synonyms);
        textview_antonyms = itemView.findViewById(R.id.textview_antonyms);
    }
}
