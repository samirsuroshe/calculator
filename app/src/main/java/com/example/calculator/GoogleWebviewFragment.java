package com.example.calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GoogleWebviewFragment extends Fragment {

        public GoogleWebviewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        WebView googleWebView;

        View view = inflater.inflate(R.layout.fragment_google_webview, container, false);
        googleWebView = view.findViewById(R.id.googleWebView);

        googleWebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });

        googleWebView.getSettings().setJavaScriptEnabled(true);
        googleWebView.loadUrl("https://www.google.com/");

        return view;
    }
}