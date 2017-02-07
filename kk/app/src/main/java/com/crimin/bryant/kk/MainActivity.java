package com.crimin.bryant.kk;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.crimin.ViewModel.UserViewModel;
import com.crimin.bryant.kk.databinding.ActivityMainBinding;
import com.crimin.handler.UserHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main) ;

        UserViewModel viewModel = new UserViewModel(this) ;
        UserHandler userHandler = new UserHandler(this,viewModel);
        viewModel.setId("");
        viewModel.setPassword("");
        binding.setUser(viewModel);
        binding.setUserHandler(userHandler);
    }
}
