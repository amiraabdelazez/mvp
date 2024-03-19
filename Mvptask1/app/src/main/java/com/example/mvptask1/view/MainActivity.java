package com.example.mvptask1.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvptask1.model.MainActivityContract;
import com.example.mvptask1.presenter.MainActivityPresenter;
import com.example.mvptask1.R;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    MainActivityContract.Presenter presenter;

    EditText email,password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter =new MainActivityPresenter(this);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btn_login = findViewById(R.id.login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email1=email.getText().toString();
                String password1=password.getText().toString();

                if(TextUtils.isEmpty(email1) || TextUtils.isEmpty(password1)) {
                    onError("field required");
                }else {
                    presenter.dologin(email1,password1);
                }

            }
        });


    }

    @Override
    public void onSuccess(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();

    }
}