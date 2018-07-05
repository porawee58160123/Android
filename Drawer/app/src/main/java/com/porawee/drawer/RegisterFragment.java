package com.porawee.drawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */

public class RegisterFragment extends Fragment {
    View view ;
    EditText name,surname,email,username,password,comfirm;
    Button btn;


    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_register, container, false);
        name = (EditText) view.findViewById(R.id.text_name);
        surname = (EditText) view.findViewById(R.id.text_surname);
        email = (EditText) view.findViewById(R.id.text_email);
        username = (EditText) view.findViewById(R.id.text_user);
        password = (EditText) view.findViewById(R.id.text_pass);
        comfirm = (EditText) view.findViewById(R.id.text_conpass);
        btn = (Button) view.findViewById(R.id.btnRegis);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
            }
        });
        return view;
    }
//    trim = อักษระพิเศษ
    public void sendData(){
        String nameData = name.getText().toString().trim()  ;
        String surnameData = surname.getText().toString().trim()  ;
        String emailData = email.getText().toString().trim()  ;
        String usernameData = username.getText().toString().trim()  ;
        String passwordData = password.getText().toString().trim()  ;
        String comfirmData = comfirm.getText().toString().trim()  ;
        ((MainActivity) getActivity()).addData(nameData,surnameData,emailData,usernameData,passwordData,comfirmData);
    }

}
