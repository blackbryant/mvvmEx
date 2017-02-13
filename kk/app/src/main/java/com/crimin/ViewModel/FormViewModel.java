package com.crimin.ViewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.crimin.FormUtil;
import com.crimin.bryant.kk.BR;

/**
 * Created by bryant on 2016/12/27.
 */


public   class FormViewModel extends BaseObservable{
    private static String appid = FormViewModel.class.getName() ;
    public final ObservableField<String> name = new   ObservableField<>();
    public final ObservableField<String> id = new ObservableField<>() ;
    public final ObservableField<String> password = new ObservableField<>() ;
    public final  ObservableField<String> age = new     ObservableField<String>("0");
    public final ObservableField<String> message = new ObservableField<>();

    public FormUtil util = new FormUtil() ;

    private Context context ;
    public  FormViewModel(Context context){
        this.context = context;

    }


    @Bindable
    public String getName(){
        return this.name.get() ;
    }

    @Bindable
    public String getId(){
        return this.id.get();
    }

    @Bindable
    public String getPassword(){
        return this.password.get() ;
    }

    @Bindable
    public  String getAge(){
        return this.age.get();
    }

    @Bindable
    public  String getMessage(){
            return this.message.get();
    }


    @Bindable
    public String getNameError(){
        if(this.name.get()==null|| this.name.get().isEmpty() ){
            Log.d(appid, "getNameError: "+"");
            return  "姓名必填" ;
        }
        return null ;
    }

    @Bindable
    public String getIdError(){
        if(this.id.get()==null|| this.id.get().isEmpty() ){

            return  "身分證必填" ;
        }
        return null ;
    }

    @Bindable
    public String getPasswordError(){
        if(this.password.get()==null|| this.password.get().isEmpty()) {
            Log.d(appid, "getIdError: " + "");
            return "密碼必填";
        }
        if(!util.checkPassword(this.password.get())){
            return  "密碼全部需是數字且必須超過六位數" ;
         }
        return null ;
    }

    @Bindable
    public String getAgeError(){
        if(util.checkAgeGreaterThanTeenage(this.age.get())){
            return  "申請必須超過18歲" ;
        }
        return null ;
    }


    public TextWatcher nameWatcher() {
       TextWatcher nameWatcher=  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                name.set(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d(appid, "afterTextChanged: "+s);

            }
        };
        return nameWatcher ;
    }

    public EditText.OnFocusChangeListener nameFocusChangeListener(){
        return new View.OnFocusChangeListener(

        ) {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    notifyPropertyChanged(BR.nameError);
                }
            }
        };


    }

    public  void setName(String name){
        this.name.set(name);
    }


    public TextWatcher idWatcher(){
        TextWatcher watch = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                id.set(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d(appid, "afterTextChanged: "+s);
            }
        };
        return watch ;
    }

    public EditText.OnFocusChangeListener idFocusChangeListener(){
        return new View.OnFocusChangeListener(

        ) {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    notifyPropertyChanged(BR.idError);
                }
            }
        };
    }



    public void setId(String id) {
        this.id.set(id);
        notifyPropertyChanged(BR.id);
    }



    public void setPassword(String password) {
        this.password.set(password);
        notifyPropertyChanged(BR.password);
    }


    public EditText.OnFocusChangeListener passwordFocusChangeListener(){
        return new View.OnFocusChangeListener(

        ) {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    notifyPropertyChanged(BR.passwordError);
                }
            }
        };
    }

    public TextWatcher passwordWatcher(){
        TextWatcher watch = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                password.set(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d(appid, "afterTextChanged: "+s);
            }
        };
        return watch ;
    }




    public void setAge(String  age){
        this.age.set(age);
        notifyPropertyChanged(BR.age);
    }

    public  void setMessage(String message){
        this.message .set(message);
        notifyPropertyChanged(BR.message);

    }


}
