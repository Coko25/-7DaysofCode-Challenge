package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * On click of the Start button, switches over to the activity_main2
     *
     * @param view
     */
    public void startQuiz(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        //Button button = (Button) findViewById(R.id.start_button);
        startActivity(intent);

    }


}
