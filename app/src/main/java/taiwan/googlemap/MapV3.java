package taiwan.googlemap;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by TenWang on 2016/5/13.
 */
public class MapV3 extends AppCompatActivity {

    @Bind(R.id.webView)
    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_v3);
        ButterKnife.bind(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/GoogleMap.html");
        // Taipei 25.033146,121.5637343
        // Kaohsiung 22.38,120.17
        webView.addJavascriptInterface(new JavaScriptInterface(22.38,120.17), "android");
    }
}
