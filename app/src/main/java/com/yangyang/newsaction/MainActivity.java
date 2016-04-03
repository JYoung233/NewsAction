package com.yangyang.newsaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    Button send;
    ListView list;
    SocketClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_chat);
        edit= (EditText) findViewById(R.id.edit);
        send= (Button) findViewById(R.id.sent);
        list= (ListView) findViewById(R.id.list1);
        client=new SocketClient();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               client.start(edit.getText().toString());


            }
        });

    }
}
