package com.yjf.smsmall.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yjf.smsmall.R;
import com.yjf.smsmall.receiver.SmsReceiver;
import com.yjf.smsmall.service.SmsReceiverService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uriSms = Uri.parse("content://sms/inbox");
        uriSms = uriSms.buildUpon().appendQueryParameter("LIMIT", "10").build();
        String[] projection = {
                "_id", "address", "date", "body"
        };

        Cursor c = getContentResolver().query(uriSms, projection, null,
                null, "date DESC");

    }

}
