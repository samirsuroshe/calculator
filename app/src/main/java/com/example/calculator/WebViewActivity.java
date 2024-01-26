package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    WebView google,youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        google = findViewById(R.id.webview1);
        youtube = findViewById(R.id.webView2);

        google.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });

        youtube.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });

        google.getSettings().setJavaScriptEnabled(true);
        google.loadUrl("https://www.google.com/");

        youtube.getSettings().setJavaScriptEnabled(true);
        youtube.loadUrl("https://www.youtube.com/");
    }

    public void onBackPressed(){
        if(google.canGoBack())
        {
            google.goBack();
        }else if(youtube.canGoBack())
        {
            youtube.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}