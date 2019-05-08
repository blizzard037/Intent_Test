package com.example.intent_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                /* new an Intent with a designated class */
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main2Activity.class);
                /* 调用一个新的Activity */
                startActivity(intent);
                /* 关闭原本的Activity */
                MainActivity.this.finish();
            }   /* end of onClick()  */
        } /* end of Button.OnClickListener() */ ) ;
    }  /* end of onCreate()  */
}  /* end of class EX03_10  */



