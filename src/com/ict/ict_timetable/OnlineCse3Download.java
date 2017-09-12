package com.ict.ict_timetable;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;

public class OnlineCse3Download extends Activity {
	// URL Address
	 WebView web;
	    ProgressBar progressBar;
	 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_online_cse3_download);
	

        web = (WebView) findViewById(R.id.webview01);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
 
        web.setWebViewClient(new myWebClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("http://cse3rdyear.blogspot.in/");
	}
	 public class myWebClient extends WebViewClient
	    {
	        @Override
	        public void onPageStarted(WebView view, String url, Bitmap favicon) {
	            // TODO Auto-generated method stub
	            super.onPageStarted(view, url, favicon);
	        }
	 
	        @Override
	        public boolean shouldOverrideUrlLoading(WebView view, String url) {
	            // TODO Auto-generated method stub
	                progressBar.setVisibility(View.VISIBLE);
	            view.loadUrl(url);
	            return true;
	 
	        }
	 
	        @Override
	        public void onPageFinished(WebView view, String url) {
	            // TODO Auto-generated method stub
	            super.onPageFinished(view, url);
	 
	            progressBar.setVisibility(View.GONE);
	        }
	    }
	 
	    // To handle "Back" key press event for WebView to go back to previous screen.
	    @Override
	    public boolean onKeyDown(int keyCode, KeyEvent event)
	    {
	        if ((keyCode == KeyEvent.KEYCODE_BACK) && web.canGoBack()) {
	            web.goBack();
	            return true;
	        }
	        return super.onKeyDown(keyCode, event);
	    }
	}
