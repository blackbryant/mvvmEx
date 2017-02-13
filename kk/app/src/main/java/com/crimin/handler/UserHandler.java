package com.crimin.handler;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.crimin.ViewModel.UserViewModel;
import com.crimin.bryant.kk.FormActivity;
import com.crimin.bryant.kk.SuccessActivity;

/**
 * Created by bryant on 2016/12/28.
 */
public class UserHandler {
    private static String appid = UserHandler.class.getName();
    private UserViewModel userVM ;
    private  Context context ;
    public UserHandler(Context context, UserViewModel userVM){
        this.userVM = userVM ;
        this.context = context ;
    }

    public void onClickLogin(View view){
        Log.d(appid, "onClickLogin: "+userVM);
        Log.d(appid, "onClickLogin: "+userVM.getId());
        Log.d(appid, "onClickLogin: "+ userVM.getPassword());
        if(userVM.getId().equals("")|| userVM.getPassword().equals("")  ){
            Toast.makeText(view.getContext(), "帳號/密碼錯誤",Toast.LENGTH_SHORT).show();
        }else {
            Intent i = SuccessActivity.newIntent(this.context);
            this.context.startActivity(i);
        }
    }

    public void onClickRegister(View view){
        Intent i = FormActivity.newIntent(this.context);
        this.context.startActivity(i);

    }

}
