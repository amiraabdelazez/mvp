package com.example.mvptask1.model;

public interface MainActivityContract {

    interface View {
        void onSuccess(String message);

        void onError(String message);
    }

    interface Presenter{
        void dologin(String email,String password);
    }
}
