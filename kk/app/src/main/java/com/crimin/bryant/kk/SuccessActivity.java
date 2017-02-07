package com.crimin.bryant.kk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class SuccessActivity extends AppCompatActivity {

    public static Intent newIntent(Context context){
        Log.d("BBB", "newIntent: "+"bbb");
        Intent i = new Intent(context.getApplicationContext(),SuccessActivity.class) ;
        return i;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
    }
}
