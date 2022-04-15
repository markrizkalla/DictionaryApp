package com.example.dictionaryapp.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionaryapp.R;

public class MeaningViewHolder extends RecyclerView.ViewHolder {
    public TextView textview_partOfSpeech;
    public RecyclerView recycler_definitions;
    public MeaningViewHolder(@NonNull View itemView) {
        super(itemView);

        textview_partOfSpeech = itemView.findViewById(R.id.textview_partOfSpeech);
        recycler_definitions = itemView.findViewById(R.id.recycler_definitions);
    }
}
