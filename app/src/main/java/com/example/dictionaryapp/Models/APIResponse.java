package com.example.dictionaryapp.Models;

import java.util.List;

public class APIResponse {
    String word;
    String phonetic;
    List<phonetics> phonetics;
 //   String origin;
    List<meanings> meanings;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public List<com.example.dictionaryapp.Models.phonetics> getPhonetics() {
        return phonetics;
    }

    public void setPhonetics(List<com.example.dictionaryapp.Models.phonetics> phonetics) {
        this.phonetics = phonetics;
    }

//    public String getOrigin() {
//        return origin;
//    }
//
//    public void setOrigin(String origin) {
//        this.origin = origin;
//    }

    public List<com.example.dictionaryapp.Models.meanings> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<com.example.dictionaryapp.Models.meanings> meanings) {
        this.meanings = meanings;
    }
}
