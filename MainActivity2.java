package com.example.android.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * This is a quiz app about our solar system
 */
public class MainActivity2 extends AppCompatActivity {

    //declares the grade variable
    int grade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }


    /**
     * This method is called when the Grade button is clicked
     * @param: grade, failed
     */
    public void showGrade(View view) {

        /**
         *Stores the state of the radio button in a boolean value
         */
        RadioButton question1 = (RadioButton) findViewById(R.id.question1_eight);
        boolean correct1 = question1.isChecked();

        RadioButton question2 = (RadioButton) findViewById(R.id.question2_earth);
        boolean correct2 = question2.isChecked();

        RadioButton question3 = (RadioButton) findViewById(R.id.question3_mercury);
        boolean correct3 = question3.isChecked();

        RadioButton question4 = (RadioButton) findViewById(R.id.question4_jupiter);
        boolean correct4 = question4.isChecked();

        RadioButton question5 = (RadioButton) findViewById(R.id.question5_earth);
        boolean correct5 = question5.isChecked();

        RadioButton question6 = (RadioButton) findViewById(R.id.question6_5);
        boolean correct6 = question6.isChecked();

        /**
         * Adds 1 to grade if the variable in the bracket is true
         */
        if (correct1) grade++;
        if (correct2) grade++;
        if (correct3) grade++;
        if (correct4) grade++;
        if (correct5) grade++;
        if (correct6) grade++;

        /**
         * Creates a variable newName with a data type of editText
         */
        EditText newName = (EditText) findViewById(R.id.name_view);

        /**
         * Creates a toast message that displays the grade to the user
         */
        Context context = this;
        CharSequence text = newName.getText().toString() + "You got " + grade + "/6 questions correct";
        int duration = Toast.LENGTH_LONG;
        Toast.makeText(context, text, duration).show();

        /**
         * Clears the Edit text Line
         * Clears the grade variable
         * Unchecks all checked radio buttons
         * @param: grade, q1-q6, newName
         */
        newName.setText("");
        grade = 0;
        RadioGroup q1 = (RadioGroup) findViewById(R.id.question1_group);
        q1.clearCheck();

        RadioGroup q2 = (RadioGroup) findViewById(R.id.question2_group);
        q2.clearCheck();

        RadioGroup q3 = (RadioGroup) findViewById(R.id.question3_group);
        q3.clearCheck();

        RadioGroup q4 = (RadioGroup) findViewById(R.id.question4_group);
        q4.clearCheck();

        RadioGroup q5 = (RadioGroup) findViewById(R.id.question5_group);
        q5.clearCheck();

        RadioGroup q6 = (RadioGroup) findViewById(R.id.question6_group);
        q6.clearCheck();
    }
}
