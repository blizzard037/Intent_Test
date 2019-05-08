package com.example.intent_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                /* new an intent with class to be active */
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this, MainActivity.class);
                /* 调用一个新的Activity */
                startActivity(intent);
                /* 关闭原本的Activity */
                Main2Activity.this.finish();
            }   /* end of onClick()  */
        } /* end of Button.OnClickListener() */ ) ;
    }  /* end of onCreate()  */
}  /* end of class EX03_10  */







