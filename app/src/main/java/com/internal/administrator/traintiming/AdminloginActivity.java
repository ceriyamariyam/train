package com.internal.administrator.traintiming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminloginActivity extends AppCompatActivity {
    EditText uname,pswd;
    Button log;
    String getuname,getpass;
    String userna="officer";
    String passwd="train";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
        uname=(EditText)findViewById(R.id.username);
        pswd=(EditText)findViewById(R.id.password);
        log=(Button) findViewById(R.id.l);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getuname=uname.getText().toString();
                getpass=pswd.getText().toString();
                if (getuname.equals(userna) && (getpass.equals(passwd))){
                    Intent i=new Intent(getApplicationContext(),InsertdetActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Incorrect Password or username", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
