package com.crimin.ViewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import com.crimin.bryant.kk.BR;

/**
 * Created by bryant on 2016/12/27.
 */


public   class UserViewModel extends BaseObservable{
    private static String Appid = UserViewModel.class.getName();
    private String id ="";
    private String password="";
    private Context context ;


    public  UserViewModel(Context context){
        this.context = context;

    }

    @Bindable
    public String getId() {
        return this.id;
    }

    @Bindable
    public String getPassword() {
        return this.password;
    }

    public void setId(String id) {
        this.id = id;
        Log.d(Appid, "setId: "+id);
        notifyPropertyChanged(BR.id);
    }



    public void setPassword(String password) {
        this.password = password;
        Log.d(Appid, "setId: "+password);
        notifyPropertyChanged(BR.password);

    }
}
