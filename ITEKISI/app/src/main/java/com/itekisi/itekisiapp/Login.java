package com.itekisi.itekisiapp;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Login extends Fragment implements View.OnClickListener {
    private Button btn_SignIn;
    private Button btn_SingUp;
    

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login, container, false);
        initViews(view);
        return view;

    }


    private void initViews(View view) {
        btn_SignIn = view.findViewById(R.id.btnSignIn);
        btn_SingUp = view.findViewById(R.id.btnSignUp);

        btn_SingUp.setOnClickListener(this);
        btn_SignIn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSignIn:
                goToLogin();
                break;
            case R.id.btnSignUp:
                goToSignUp();
                break;
        }
    }

    private void goToSignUp() {
        Fragment _signUp = new SignUp();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame, _signUp);
        ft.commit();
    }

    private void goToLogin() {
        Intent intent = new Intent(getActivity(), DashboardActivity.class);
        startActivity(intent);
    }
}