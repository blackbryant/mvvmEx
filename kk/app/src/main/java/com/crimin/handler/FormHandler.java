package com.crimin.handler;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.crimin.ViewModel.FormViewModel;

/**
 * Created by bryant on 2016/12/28.
 */
public class FormHandler {
    private static String appid = FormHandler.class.getName() ;
    private FormViewModel formViewModel ;
    private  Context context ;
    public FormHandler(Context context, FormViewModel formViewModel){
        this.formViewModel = formViewModel ;
        this.context = context ;
    }

    public void addNewOne(View view){
        Log.d(appid, "addNewOne: "+formViewModel);
        Log.d(appid, "addNewOne: "+formViewModel.getId());
        Log.d(appid, "addNewOne: "+ formViewModel.getPassword());
        String message = "id:"+formViewModel.getId()+"\r\n"+
                        "password:"+formViewModel.getPassword()+"\r\n"+
                        "name:"+formViewModel.getName()+"\r\n"+
                        "age:"+formViewModel.getAge()+"\r\n";
        Log.d(appid, "addNewOne: "+message);
        formViewModel.setMessage(message);

    }


}
