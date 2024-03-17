package com.mehedihasan.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView totalQuestionTextView,questionNo;
    Button AnsA,AnsB,AnsC,AnsD;
    Button submitBTN;

    int score =0;
    int totalQuestion =QuestionAnser.question.length;
    int currentQuestionIndex= 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Connection With XML
        connection();

        totalQuestionTextView.setText("Total Question: " +totalQuestion);

        //Load New Question Method
        loadNewQuestion();
    }

    //LoadNew Question Method
    private void loadNewQuestion() {
        questionNo.setText(QuestionAnser.question[currentQuestionIndex]);
        AnsA.setText(QuestionAnser.choices[currentQuestionIndex] [0]);
        AnsB.setText(QuestionAnser.choices[currentQuestionIndex] [1]);
        AnsC.setText(QuestionAnser.choices[currentQuestionIndex] [2]);
        AnsD.setText(QuestionAnser.choices[currentQuestionIndex] [3]);
    }

    //Connection with XML
    private void connection() {
        totalQuestionTextView=findViewById(R.id.totalQuestion);
        questionNo=findViewById(R.id.questionNo);
        AnsA=findViewById(R.id.ansA);
        AnsB=findViewById(R.id.ansB);
        AnsC=findViewById(R.id.ansC);
        AnsD=findViewById(R.id.ansD);

        AnsA.setOnClickListener(this);
        AnsB.setOnClickListener(this);
        AnsC.setOnClickListener(this);
        AnsD.setOnClickListener(this);
        submitBTN.setOnClickListener(this);
    }

    //OnClick To All Button
    @Override
    public void onClick(View v) {

    }
}