package com.example.masterlingua;

import android.content.Context;
//import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CreerCarte extends AppCompatActivity {
    private Carte carte;
    private EditText question;
    private List<String> answers;
    private boolean b1, b2, b3;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creer_carte);

        question = findViewById(R.id.question);
        EditText answer1 = findViewById(R.id.answer1);
        RadioGroup rbanswer1 = findViewById(R.id.rbanswer1);
        EditText answer2 = findViewById(R.id.answer2);
        RadioGroup rbanswer2 = findViewById(R.id.rbanswer2);
        EditText answer3 = findViewById(R.id.answer3);
        RadioGroup rbanswer3 = findViewById(R.id.rbanswer3);
        Button validate = findViewById(R.id.validate);
        answers = new ArrayList<>();
        if(!answer1.getText().toString().isEmpty()){
            answers.add(answer1.getText().toString());
            if(rbanswer1.getCheckedRadioButtonId() == R.id.radio_true1) b1 = true;
        }
        if(!answer2.getText().toString().isEmpty()){
            answers.add(answer2.getText().toString());
            if(rbanswer2.getCheckedRadioButtonId() == R.id.radio_true2) b2 = true;
        }
        if(!answer3.getText().toString().isEmpty()){
            answers.add(answer3.getText().toString());
            if(rbanswer3.getCheckedRadioButtonId() == R.id.radio_true3) b3 = true;
        }

        validate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //si le champ de la question est vide : toast pour dire que la question est obligatoire pour valider la question
                if (question.getText().toString().isEmpty()){
                    CharSequence text = getText(R.string.warning_question);
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(context, text, duration).show();
                }
                else {
                    if (answers.size() == 3) {
                        carte = new Carte(question.getText().toString(), answers.get(0), b1, answers.get(1), b2, answers.get(2), b3);
                    }
                    if (answers.size() == 2) {
                        carte = new Carte(question.getText().toString(), answers.get(0), b1, answers.get(1), b2);
                    }
                    if (answers.size() == 1) {
                        carte = new Carte(question.getText().toString(), answers.get(0), b1);
                    }
                    if (answers.size() == 0) {
                        carte = new Carte(question.getText().toString());
                    }
                }
            }
        });


        Intent afficherCarte = new Intent(getApplicationContext(), AfficherCarte.class);
        Bundle bundle = new Bundle();
        afficherCarte.putExtras(bundle);
        afficherCarte.putExtra(carte.getQuestion(),1);
        startActivity(afficherCarte);
        finish();


    }

}
