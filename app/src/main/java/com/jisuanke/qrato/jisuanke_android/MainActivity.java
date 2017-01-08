package com.jisuanke.qrato.jisuanke_android;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.content.pm.ActivityInfo;
public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar()!=null)
        {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        initWebView();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if ((keyCode==KeyEvent.KEYCODE_BACK)&&webView.canGoBack()){
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode,event);

    }

    private void initWebView() {
        webView=(WebView)findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new webViewClient());
        webView.loadUrl("https://www.jisuanke.com");
    }

    class webViewClient extends WebViewClient{

        //重写shouldOverrideUrlLoading方法，使点击链接后不使用其他的浏览器打开。

        @Override

        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;

        }
    }
}
