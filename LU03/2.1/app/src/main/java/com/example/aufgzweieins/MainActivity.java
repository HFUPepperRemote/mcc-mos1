package com.example.aufgzweieins;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.util.Log;

import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessagingService;

import static com.example.aufgzweieins.App.CHANNEL_1_ID;
import static com.example.aufgzweieins.App.CHANNEL_2_ID;

public class MainActivity extends AppCompatActivity {
    private NotificationManagerCompat notificationmanager;
    private EditText editTextTitle;
    private EditText getEditTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationmanager = NotificationManagerCompat.from(this);

        editTextTitle = findViewById(R.id.edit_text_title);
        getEditTextMessage = findViewById(R.id.edit_text_message);


    }

    public void sendOnChannel1(View v) {
        String title = editTextTitle.getText().toString();
        String message = getEditTextMessage.getText().toString();

        Notification notification = new NotificationCompat.Builder(this, CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_one)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        notificationmanager.notify(1, notification);



    }
    public void sendOnChannel2(View v) {
        String title = editTextTitle.getText().toString();
        String message = getEditTextMessage.getText().toString();



        Notification notification = new NotificationCompat.Builder(this, CHANNEL_2_ID)
                .setSmallIcon(R.drawable.ic_two)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .build();


        notificationmanager.notify(2, notification);

    }






}