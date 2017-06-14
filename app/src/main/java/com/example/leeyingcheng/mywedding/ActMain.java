package com.example.leeyingcheng.mywedding;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActMain extends AppCompatActivity {



    private View.OnClickListener btnFbSignIn_click=new View.OnClickListener(){
        @Override
        public void onClick(View v) {

        }
    };

    private View.OnClickListener btnSignIn_click=new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            startActivity(new Intent(ActMain.this,Act_Navi.class));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);

      InitialComplement();

    }

    private void InitialComplement() {

        btnSignIn=(Button)findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(btnSignIn_click);
        btnFbSignIn=(Button)findViewById(R.id.btnFbSignIn);
        btnFbSignIn.setOnClickListener(btnFbSignIn_click);
        txtAccount=(EditText)findViewById(R.id.txtAccount);
        txtPassword=(EditText)findViewById(R.id.txtPassword);
    }

    Button btnSignIn ;
    Button btnFbSignIn ;
    EditText txtPassword;
    EditText txtAccount;

}
