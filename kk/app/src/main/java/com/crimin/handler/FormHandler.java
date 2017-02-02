package com.crimin.handler;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.crimin.ViewModel.FormViewModel;

/**
 * Created by bryant on 2016/12/28.
 */
public class FormHandler {

    private FormViewModel formViewModel ;
    private  Context context ;
    public FormHandler(Context context, FormViewModel formViewModel){
        this.formViewModel = formViewModel ;
        this.context = context ;
    }

    public void addNewOne(View view){
        Log.d("AAA", "addNewOne: "+formViewModel);
        Log.d("AAA", "addNewOne: "+formViewModel.getId());
        Log.d("AAA", "addNewOne: "+ formViewModel.getPassword());
        String message = "id:"+formViewModel.getId()+"\r\n"+
                        "password:"+formViewModel.getPassword()+"\r\n"+
                        "name:"+formViewModel.getName()+"\r\n"+
                        "age:"+formViewModel.getAge()+"\r\n";
        Log.d("AAA", "addNewOne: "+message);
        formViewModel.setMessage(message);

    }


}
