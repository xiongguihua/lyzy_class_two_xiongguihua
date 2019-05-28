package com.example.myapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        final Button login = (Button)findViewById(R.id.button);
        final String user = "";
        final String pass = "";
        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View) {
                String username = " ";
                EditText editText1 = (EditText)findViewById(R.id.editText1);
                username = editText1.getText().toString();
                String password = " ";
                EditText editText2 = (EditText)findViewById(R.id.editText2);
                password = editText2.getText().toString();
                if (username.equals(user) & password.equals(pass)){
                    Intent intent = new Intent(MainActivity.this,Login.class);
                    startActivity(intent);
                }
                else {
                    new AlertDialog.Builder(MainActivity.this).setTitle("Error!").setMessage("Wrong username or password.")
                            .setNegativeButton("OK",null)
                            .show();
                }
            }
        });
        final Button register = (Button)findViewById(R.id.button2);
        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                new AlertDialog.Builder(MainActivity.this).setTitle("Jump").setMessage("Ready to jump?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(MainActivity.this,Register.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("No",null)
                        .show();
            }
        });
    }
}
