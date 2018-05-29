package com.example.euan.wordcounterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class wordCounterActivity extends AppCompatActivity {

    EditText enterEditText;
    TextView answerText;
    Button countWordsText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        enterEditText = findViewById(R.id.enter_text);
        answerText = findViewById(R.id.answer_text);
        countWordsText = findViewById(R.id.count_words);
    }

    public void oncountWordsClicked(View button) {
        String countWords = countWordsText.getText().toString();
    }
}
