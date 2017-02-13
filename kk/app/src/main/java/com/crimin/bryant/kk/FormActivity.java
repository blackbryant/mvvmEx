package com.crimin.bryant.kk;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.crimin.ViewModel.FormViewModel;
import com.crimin.bryant.kk.databinding.ActivityFormBinding;


public class FormActivity extends AppCompatActivity {
    private static String appid = FormActivity.class.getName();
    public static Intent newIntent(Context context){
        Log.d(appid, "newIntent: "+"bbb");
        Intent i = new Intent(context.getApplicationContext(),FormActivity.class) ;
        return i;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFormBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_form) ;

        FormViewModel viewModel = new FormViewModel(this) ;
        binding.setForm(viewModel) ;

    }
}
