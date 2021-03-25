package com.example.aufgabezweizwei;

import android.util.Log;
import android.widget.EditText;


import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private EditText editTextTitle;
    private EditText getEditTextMessage;




    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
        Log.d("TAG", "Neuer Token" + s);
    }











}
