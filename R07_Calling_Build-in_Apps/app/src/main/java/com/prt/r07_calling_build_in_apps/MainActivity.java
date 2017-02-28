package com.prt.r07_calling_build_in_apps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import static android.content.Intent.ACTION_SEND;
import static android.content.Intent.ACTION_VIEW;
import static android.content.Intent.EXTRA_ASSIST_INPUT_HINT_KEYBOARD;
import static android.content.Intent.EXTRA_CC;
import static android.content.Intent.EXTRA_EMAIL;
import static android.content.Intent.EXTRA_PROCESS_TEXT_READONLY;
import static android.content.Intent.EXTRA_SUBJECT;
import static android.content.Intent.EXTRA_TEXT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // displaying Maps
//        Intent intent = new Intent(ACTION_VIEW);
//        intent.setData(Uri.parse("geo:50.445782, 30.485999"));
//        startActivity(intent);
        

        // launching Google Play
//        Intent intent= new Intent(ACTION_VIEW);
//        intent.setData(Uri.parse("https://play.google.com/store"));
//        startActivity(intent);


        // sending e-mail
//        Intent intent = new Intent(ACTION_SEND);
//        intent.setData(Uri.parse("mailto:"));
//        String[] to = { "someone1@example.com", "someone2@example.com" };
//        String[] cc = { "someone3@example.com", "someone4@example.com" };
//        intent.putExtra(EXTRA_EMAIL, to);
//        intent.putExtra(EXTRA_CC, cc);
//        intent.putExtra(EXTRA_SUBJECT, "Subject here...");
//        intent.putExtra(EXTRA_TEXT, "Message here...");
//        intent.setType("message/rfc822");
//        startActivity(Intent.createChooser(intent, "Email"));


        // sending content to other apps
//        Intent intent = new Intent(ACTION_SEND);
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject...");
//        intent.putExtra(EXTRA_TEXT, "Text...");
//        startActivity(Intent.createChooser(intent, "Apps that can respond to this"));


        // sending binary content
//        Uri uriToImage = Uri.parse(
//                "android.resource://com.prt.r07_calling_build_in_apps/drawable/" +
//        Integer.toString(R.drawable.creature));
//
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("image/jpeg");

//        intent.putExtra(Intent.EXTRA_STREAM, uriToImage);
//        intent.putExtra(Intent.EXTRA_TEXT, "Text...");
//        startActivity(Intent.createChooser(intent, "Apps that can respond to this"));


        // sending multiple images
//        Uri uriToImage1 =
//                Uri.parse("android.resource://com.prt.r07_calling_build_in_apps/drawable/" +
//                        Integer.toString(R.drawable.simpsons));
//        Uri uriToImage2 =
//                Uri.parse("android.resource://com.prt.r07_calling_build_in_apps/drawable/" +
//                        Integer.toString(R.drawable.creature));
//
//        ArrayList<Uri> urisToImages = new ArrayList<Uri>();
//        urisToImages.add(uriToImage1);
//        urisToImages.add(uriToImage2);
//
//        Intent intent = new Intent(Intent.ACTION_SEND_MULTIPLE);
//        intent.setType("image/*");
//
//        intent.putExtra(Intent.EXTRA_STREAM, urisToImages);
//        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject...");
//        intent.putExtra(Intent.EXTRA_TEXT, "Text...");
//        startActivity(Intent.createChooser(intent, "Apps that can respond to this"));


        // an application that enables to view images
//        Intent intent = new Intent(ACTION_VIEW);
//        // indicates the type that the target activity will handle
//        intent.setType("image/jpeg");
//        startActivity(intent);


        // send image from SD card to an image viewer application
        Intent intent = new Intent(ACTION_VIEW);
        intent.setDataAndType(Uri.parse(
                "file:///storage/sdcard0/MyPhoto.jpg"), "image/*");
        startActivity(intent);
    }
}
