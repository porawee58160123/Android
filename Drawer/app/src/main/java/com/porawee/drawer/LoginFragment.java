package com.porawee.drawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */

public class LoginFragment extends Fragment {
    View view ;
    EditText username,password;
    Button btn_login;
    Button btn_register;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_login, container, false);
        username = (EditText) view.findViewById(R.id.username);
        password = (EditText) view.findViewById(R.id.password);
        btn_login = (Button) view.findViewById(R.id.button_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendData();
            }
        });

        btn_register = (Button) view.findViewById(R.id.button_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).changeFragment();
            }
        });
        return view;
    }

    public void sendData(){

        String usernameData = username.getText().toString().trim()  ;
        String passwordData = password.getText().toString().trim()  ;
        ((MainActivity) getActivity()).login(usernameData,passwordData);
    }

}
