package com.example.dictionaryapp.Models;

import java.util.List;

public class meanings {
    String partOfSpeech;
    List<definitions> definitions;


    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public List<com.example.dictionaryapp.Models.definitions> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<com.example.dictionaryapp.Models.definitions> definitions) {
        this.definitions = definitions;
    }
}
