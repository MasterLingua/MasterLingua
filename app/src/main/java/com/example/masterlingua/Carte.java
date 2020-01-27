package com.example.masterlingua;

import java.util.HashMap;
import java.util.Map;

public class Carte {
    private String question;
    private Map<String, Boolean> reponses = new HashMap<String,Boolean>();

    public Carte(String s, String r1, Boolean b1, String r2, Boolean b2, String r3, Boolean b3){
        question = s;
        reponses.put(r1,b1);
        reponses.put(r2,b2);
        reponses.put(r3,b3);
    }
    public Carte(String s, String r1, Boolean b1, String r2, Boolean b2){
        question = s;
        reponses.put(r1,b1);
        reponses.put(r2,b2);
    }
    public Carte(String s, String r1, Boolean b1){
        question = s;
        reponses.put(r1,b1);
    }
    public Carte(String s){
        question = s;
    }

    public void setQuestion(String s){
        question = s;
    }
    public void ajoutReponse(String s, Boolean b){
        reponses.put(s,b);
    }

    public String getQuestion(){
        return question;
    }

    public Map<String, Boolean> getReponse(){
        return reponses;
    }

    public Carte(String s, String r1, Boolean b1, String r2, Boolean b2, String r3, Boolean b3){
        question = s;
        reponses.put(r1,b1);
        reponses.put(r2,b2);
        reponses.put(r3,b3);
    }
    public Carte(String s, String r1, Boolean b1, String r2, Boolean b2){
        question = s;
        reponses.put(r1,b1);
        reponses.put(r2,b2);
    }
    public Carte(String s, String r1, Boolean b1){
        question = s;
        reponses.put(r1,b1);
    }
    public Carte(String s){
        question = s;
    }

    public void setQuestion(String s){
        question = s;
    }
    public void ajoutReponse(String s, Boolean b){
        reponses.put(s,b);
    }

    public String getQuestion(){
        return question;
    }


    public void getReponse(){

        for (Map.Entry reponse : reponses.entrySet()) {
            System.out.println("clé: " + reponse.getKey());
        }
    }

}


}
