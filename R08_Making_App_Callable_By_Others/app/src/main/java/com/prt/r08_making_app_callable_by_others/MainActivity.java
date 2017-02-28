package com.prt.r08_making_app_callable_by_others;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // to invoke MyBrowserActivity class
//        Intent intent = new Intent("com.prt.r08_making_app_callable_by_others.MyBrowser");
//        intent.setData(Uri.parse("http://www.example.com"));
//        startActivity(intent);

        // or
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("http://www.example.com"));
//        startActivity(intent);

        // to call activity with MEME type
        Intent intent = new Intent(Intent.ACTION_VIEW);
        // if you are using setTupe(), no need to use setData()
        intent.setData(Uri.parse("http://www.example.com"));

        // indicates the type that the target activity will handle
        intent.setType("text/html");
        intent.putExtra("URL", "http://example.com");

        startActivity(intent);
    }
}
