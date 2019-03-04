package com.example.latihanpertama;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtusername, password;
    Button txtbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtusername = (EditText) findViewById(R.id.txtusername);
        password = (EditText) findViewById(R.id.password);
        txtbutton = (Button) findViewById(R.id.txtbutton);

        txtbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtusernameKey = txtusername.getText().toString();
                String passwordKey = password.getText().toString();
                if (txtusernameKey.equals("safira") && passwordKey.equals("87654321")) {
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Login Berhasil!!",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent (MainActivity.this, Login.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password Anda Salah").setNegativeButton("Retry", null).create().show();


                }
            }
        });
    }
}
