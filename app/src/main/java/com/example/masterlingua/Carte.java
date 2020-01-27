package com.example.masterlingua;

import java.util.HashMap;
import java.util.Map;

public class Carte {
    private String question;
    private Map<String, Boolean> reponses = new HashMap<String,Boolean>();
    private String langueQuestion;
    private String langueReponse;

    public Carte(String q, String r, String s, String r1, Boolean b1, String r2, Boolean b2, String r3, Boolean b3){
        langueQuestion = q;
        langueReponse = r;
        question = s;
        reponses.put(r1,b1);
        reponses.put(r2,b2);
        reponses.put(r3,b3);
    }
    public Carte(String q, String r, String s, String r1, Boolean b1, String r2, Boolean b2){
        langueQuestion = q;
        langueReponse = r;
        question = s;
        reponses.put(r1,b1);
        reponses.put(r2,b2);
    }
    public Carte(String q, String r, String s, String r1, Boolean b1){
        langueQuestion = q;
        langueReponse = r;
        question = s;
        reponses.put(r1,b1);
    }
    public Carte(String q, String r, String s){
        langueQuestion = q;
        langueReponse = r;
        question = s;
    }

    public void setQuestion(String s){
        question = s;
    }
    public void setReponses(String s, Boolean b){
        reponses.put(s,b);
    }

    public String getQuestion(){
        return question;
    }

    public Map<String, Boolean> getReponses(){
        return reponses;
    }

    public String getLangueReponse() {
        return langueReponse;
    }

    public void setLangueQuestion(String langueQuestion) {
        this.langueQuestion = langueQuestion;
    }

    public void setLangueReponse(String langueReponse) {
        this.langueReponse = langueReponse;
    }

    public String getLangueQuestion() {
        return langueQuestion;
    }
}
