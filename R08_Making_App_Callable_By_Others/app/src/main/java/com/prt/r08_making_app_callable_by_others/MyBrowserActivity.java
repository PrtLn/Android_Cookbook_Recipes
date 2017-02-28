package com.prt.r08_making_app_callable_by_others;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Pikalova Lena on 2/28/2017.
 */

public class MyBrowserActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browser);

//        Uri url = getIntent().getData();

        // to retrieve the data passed in using the putExtra()
        Uri url = Uri.parse(getIntent().getStringExtra("URL"));
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new Callback());

        if (url != null) {
            webView.loadUrl(url.toString());
        } else {
            webView.loadUrl("http://www.example.com");
        }
    }

    private class Callback extends WebViewClient {
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        // deprecated
//        public boolean shouldOverrideUrlLoading(
//                WebView view, String url) {
//            return(false);
//        }
        
        public boolean shouldOverrideUrlLoading(
                WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }
    }
}
