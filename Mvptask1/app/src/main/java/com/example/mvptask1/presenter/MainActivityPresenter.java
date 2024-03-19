package com.example.mvptask1.presenter;

import com.example.mvptask1.model.MainActivityContract;

public class MainActivityPresenter implements MainActivityContract.Presenter
{
    MainActivityContract.View view;
    public MainActivityPresenter(MainActivityContract.View view){
        this.view=view;
    }
    @Override
    public void dologin(String email, String password) {

        //email=amira@gmail.com
        //pass=12345

        if(email.equals("amira@gmail.com")&& password.equals("12345")){
            view.onSuccess("successful");
        }
        else{
            view.onError("wrong email or password");
        }




    }
}
