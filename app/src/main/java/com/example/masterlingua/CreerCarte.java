package com.example.masterlingua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CreerCarte extends AppCompatActivity {
    private Carte carte;
    private EditText question;
    private EditText answer1;
    private EditText answer2;
    private EditText answer3;
    private Button validate;
    private List<String> answers;
    //String a1, a2, a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bouton_creation_carte);
        question = findViewById(R.id.question);
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        validate = findViewById(R.id.validate);
        answers = new ArrayList<>();
        if(!answer1.getText().toString().isEmpty()){
            answers.add(answer1.getText().toString());
        }
        if(!answer2.getText().toString().isEmpty()){
            answers.add(answer2.getText().toString());
        }
        if(!answer3.getText().toString().isEmpty()){
            answers.add(answer3.getText().toString());
        }

        final CharSequence w = getText(R.string.warning_question);
        validate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //si le champ de la question est vide : toast pour dire que la question est obligatoire pour valider la question
                if (question.getText().toString().isEmpty()){
                    Toast.makeText(this, w, Toast.LENGTH_LONG).show();
                }
                if(answers.size()==3){

                }
                if(answers.size()==2){

                }
                if(answers.size()==1){
                    carte = new Carte(question.getText().toString(), answers.get(0),);
                }
                if(answers.size()==0){
                    carte = new Carte(question.getText().toString());
                }
            }
        });

        /*Intent secondActivity = new Intent(getApplicationContext(), CreerCarte.class);
        startActivity(secondActivity);*/
        finish();


    }

}
