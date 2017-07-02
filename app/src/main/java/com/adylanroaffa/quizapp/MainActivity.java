package com.adylanroaffa.quizapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int [] correctAnswer = new int[14];
    int [] wrongAnswer = new int[5];

    float score = 0;
    float minus = 0;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Radio Group 1
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.RadioGroup1);
        rg1.clearCheck();
        rg1.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
                                           @Override
                                           public void onCheckedChanged(RadioGroup group, int checkedId) {

                                               RadioButton rb = (RadioButton) group.findViewById(checkedId);
                                               if (null != rb && checkedId > -1) {

                                                   // checkedId is the RadioButton selected
                                                   if (checkedId == R.id.number1opt1) {
                                                       correctAnswer[0] = 10;
                                                   } else {
                                                       correctAnswer[0] = 0;
                                                   }
                                               }
                                           }
                                       });
//                Radio Group 2
        RadioGroup rg2 = (RadioGroup) findViewById(R.id.RadioGroup2);
        rg2.clearCheck();
        rg2.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (null != rb && checkedId > -1) {

                    // checkedId is the RadioButton selected
                    if (checkedId==R.id.number2opt3){
                        correctAnswer[1]=10;
                    }
                    else {
                        correctAnswer[1]=0;
                    }
                }
            }
        });
//        Radio Group 4
        RadioGroup rg4 = (RadioGroup) findViewById(R.id.RadioGroup4);
        rg4.clearCheck();
        rg4.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (null != rb && checkedId > -1) {
                    // checkedId is the RadioButton selected
                    if (checkedId==R.id.number4opt3){
                        correctAnswer[2]=10;
                    }
                    else {
                        correctAnswer[2]=0;
                    }
                }
            }
        });
//  Radio group 6
        RadioGroup rg6 = (RadioGroup) findViewById(R.id.RadioGroup6);
        rg6.clearCheck();
        rg6.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (null != rb && checkedId > -1) {

                    // checkedId is the RadioButton selected
                    if (checkedId==R.id.number6opt3){
                        correctAnswer[3]=10;
                    }
                    else {
                        correctAnswer[3]=0;
                    }
                }
            }
        });
// Radio group 9
        RadioGroup rg9 = (RadioGroup) findViewById(R.id.RadioGroup9);
        rg9.clearCheck();
        rg9.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (null != rb && checkedId > -1) {

                    // checkedId is the RadioButton selected
                    if (checkedId==R.id.number9opt4){
                        correctAnswer[4]=10;
                    }
                    else {
                        correctAnswer[4]=0;
                    }
                }
            }
        });

    //Number 5
        final CheckBox cb5opt1 = (CheckBox) findViewById(R.id.number5opt1);
        final CheckBox cb5opt2 = (CheckBox) findViewById(R.id.number5opt2);
        final CheckBox cb5opt3 = (CheckBox) findViewById(R.id.number5opt3);
        final CheckBox cb5opt4 = (CheckBox) findViewById(R.id.number5opt4);

        cb5opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb5opt1.isChecked()){
                    correctAnswer[5]=10;
                }
                else{
                    correctAnswer[5]=0;
                }
            }
        });

        cb5opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb5opt2.isChecked()){
                    wrongAnswer[0]=5;
                }
                else{
                    wrongAnswer[0]=0;
                }
            }
        });

        cb5opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb5opt3.isChecked()){
                    correctAnswer[6]=10;
                }
                else{
                    correctAnswer[6]=0;
                }
            }
        });

        cb5opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb5opt4.isChecked()){
                    wrongAnswer[1]=5;
                }
                else{
                    wrongAnswer[1]=0;
                }
            }
        });

//    Number 8
        final CheckBox cb8opt1 = (CheckBox) findViewById(R.id.number8opt1);
        final CheckBox cb8opt2 = (CheckBox) findViewById(R.id.number8opt2);
        final CheckBox cb8opt3 = (CheckBox) findViewById(R.id.number8opt3);
        final CheckBox cb8opt4 = (CheckBox) findViewById(R.id.number8opt4);

        cb8opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb8opt1.isChecked()){
                    correctAnswer[7]=10;
                }
                else{
                    correctAnswer[7]=0;
                }
            }
        });

        cb8opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb8opt2.isChecked()){
                    correctAnswer[8]=10;
                }
                else{
                    correctAnswer[8]=0;
                }
            }
        });

        cb8opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb8opt3.isChecked()){
                    wrongAnswer[2]=5;
                }
                else{
                    wrongAnswer[2]=0;
                }
            }
        });

        cb8opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb8opt4.isChecked()){
                    correctAnswer[9]=10;
                }
                else{
                    correctAnswer[9]=0;
                }
            }
        });

//    Number 8

        //get checkbox id
        final CheckBox cb10opt1 = (CheckBox) findViewById(R.id.number10opt1);
        final CheckBox cb10opt2 = (CheckBox) findViewById(R.id.number10opt2);
        final CheckBox cb10opt3 = (CheckBox) findViewById(R.id.number10opt3);
        final CheckBox cb10opt4 = (CheckBox) findViewById(R.id.number10opt4);


        //
        cb10opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb10opt1.isChecked()){
                    correctAnswer[10]=10;
                }
                else{
                    correctAnswer[10]=0;
                }
            }
        });

        cb10opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb10opt2.isChecked()){
                    wrongAnswer[3]=5;
                }
                else{
                    wrongAnswer[3]=0;
                }
            }
        });

        cb10opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb10opt3.isChecked()){
                    correctAnswer[11]=10;
                }
                else{
                    correctAnswer[11]=0;
                }
            }
        });

        cb10opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb10opt4.isChecked()){
                    wrongAnswer[4]=5;
                }
                else{
                    wrongAnswer[4]=0;
                }
            }
        });


    }

    public void checkEditText (View view){
        switch (view.getId()){
            case R.id.number3_editText_Button:
                //get edit text ID
                EditText editText3 = (EditText) findViewById(R.id.number3_editText);
                Button check3 = (Button) findViewById(R.id.number3_editText_Button);

                //get EditText text
                String answer3 = editText3.getText().toString();

                //make the button disabled
                check3.setEnabled(false);
                editText3.setEnabled(false);

                //change the button text color
                check3.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

                //answer evaluation
                if (answer3.equalsIgnoreCase("bagimu negeri")){
                    correctAnswer[12]=10;
                }
                else {
                    correctAnswer[12]=0;
                }
                break;


            case R.id.number7_editText_Button:
                //IDEM
                EditText editText7 = (EditText) findViewById(R.id.number7_editText);
                Button check7 = (Button) findViewById(R.id.number7_editText_Button);

                String answer7 = editText7.getText().toString();

                check7.setEnabled(false);
                editText7.setEnabled(false);
                check7.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                if (answer7.equalsIgnoreCase("manokwari")){
                    correctAnswer[13]=10;
                }
                else {
                    correctAnswer[13]=0;
                }
                break;
        }



    }

    //METHOD FOR PLAYING AUDIO FILE
    public void playMusic (View view) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.bagimu_negri);
        mp.start();
    }
    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }




    //display Score
    public void displayScore (View view) {

        //initialize final score variable.
        float finalScore = 0;

        //Submit button got disabled after clicked.
        Button submit = (Button) findViewById(R.id.submit_button);
        submit.setEnabled(false);
        submit.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        //Get score and minus for each of the question
        for (int i = 0; i < correctAnswer.length; i++) {
            score+=correctAnswer[i];
        }
        for (int i = 0; i < wrongAnswer.length; i++) {
            minus += wrongAnswer[i];
        }

        //assigning the final score
        finalScore = (score-minus)/14*10;

        //set LayoutInflater.
        LayoutInflater li = getLayoutInflater();

        //Getting the View object in custom_toast
        View layout = li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        //string format the display
        String display = String.format("%.0f",finalScore);

        //changing the text view in custom toast
        TextView toast_tv = (TextView) layout.findViewById(R.id.toast_text);
        toast_tv.setText(display);

        //make new toast object
        Toast displayscore = new Toast(getApplicationContext());

        //toast settings.
        displayscore.setDuration(Toast.LENGTH_LONG);
        displayscore.setGravity(Gravity.CENTER_VERTICAL,0,0);
        displayscore.setView(layout);

        //show toast
        displayscore.show();

    }

    public void restartApp(View view){
        finish();
        startActivity(getIntent());
    }

}

