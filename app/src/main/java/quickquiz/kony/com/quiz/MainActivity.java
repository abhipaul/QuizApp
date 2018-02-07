package quickquiz.kony.com.quiz;


import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import quickquiz.kony.com.quiz.listener.FragmentDialogueDismiss;

public class MainActivity extends AppCompatActivity implements FragmentDialogueDismiss{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getQuestion(View v)
    {
        Intent i= new Intent(MainActivity.this, QuestionActivity.class);
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @Override
    public void onDismiss(boolean b) {

    }
}
//test changes
