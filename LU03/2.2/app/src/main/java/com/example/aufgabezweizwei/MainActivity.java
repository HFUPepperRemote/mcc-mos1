package com.example.aufgabezweizwei;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.util.Log;

import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import static com.example.aufgabezweizwei.App.CHANNEL_1_ID;
import static com.example.aufgabezweizwei.App.CHANNEL_2_ID;

public class MainActivity extends AppCompatActivity {
    private NotificationManagerCompat notificationmanager;
    public EditText editTextTitle;
    public EditText getEditTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationmanager = NotificationManagerCompat.from(this);
        editTextTitle = findViewById(R.id.edit_text_title);
        getEditTextMessage = findViewById(R.id.edit_text_message);


        if (getIntent().getExtras() != null) {
            for (String key : getIntent().getExtras().keySet()) {
                if (key.equals("title"))
                    editTextTitle.setText(getIntent().getExtras().getString(key));
                else if (key.equals("message"))
                    getEditTextMessage.setText(getIntent().getExtras().getString(key));
            }

        }




    }

    public void sendOnChannel1(View v) {
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_1_ID)
                .setContentTitle("neue Benachrichtigung")
                .setContentText("neue Benachrichtigung")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        notificationmanager.notify(1, notification);


    }
}