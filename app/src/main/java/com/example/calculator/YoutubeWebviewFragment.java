package com.example.calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class YoutubeWebviewFragment extends Fragment {


    public YoutubeWebviewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        WebView youtubeWebView;

        View view = inflater.inflate(R.layout.fragment_youtube_webview, container, false);
        youtubeWebView = view.findViewById(R.id.youtubeWebView);

        youtubeWebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });

        youtubeWebView.getSettings().setJavaScriptEnabled(true);
        youtubeWebView.loadUrl("https://www.youtube.com/");

        return view;
    }
}