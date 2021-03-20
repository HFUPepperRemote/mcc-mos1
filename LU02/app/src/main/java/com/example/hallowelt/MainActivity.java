package com.example.hallowelt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.DataOutputStream;

public class MainActivity extends AppCompatActivity {
    PrintWriter pw;

    public TextView getTxtWelcome() {
        return txtWelcome;
    }

    public TextView txtWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //hier ist die normale Methode die einfach nur den Welcome Test ändert
    public void onHelloBtnClicked(View view) {
        TextView txtWelcome = findViewById(R.id.txtWelcome);
        TextView ersteEingabe = findViewById(R.id.ersteEingabe);
        txtWelcome.setText("hallo Welt " + ersteEingabe.getText().toString());



    }




}


