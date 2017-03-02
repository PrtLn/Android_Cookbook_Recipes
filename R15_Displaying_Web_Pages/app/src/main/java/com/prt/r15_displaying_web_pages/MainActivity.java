package com.prt.r15_displaying_web_pages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.WebView01);
        webView.setWebViewClient(new Callback());
        WebSettings webSettings = webView.getSettings();
        webSettings.setBuiltInZoomControls(true);

        // (1) Loading from web
//        webView.loadUrl("http://cgimg.s3.amazonaws.com/cg/g62/54062/54062_1315855037_orig.jpg");

        // (2) Loading from a String
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
        String html = "<H1>A simple HTML page</H1><body>" +
                "<p>The quik brown fox jumps over the lazy dog</p></body?";
//        webView.loadDataWithBaseURL("", html, mimeType, encoding, "");

        // (3) Loading from an Assets Folder
        webView.loadUrl("file:///android_asset/index.html");
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return (false);
        }
    }
}
