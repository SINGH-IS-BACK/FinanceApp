package vohra.com.finance;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.webkit.WebView;


public class WebViewActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        String url = "http://www.google.com";
        if (savedInstanceState == null) {
            url = getIntent().getStringExtra(TechnologyService.URL);
        }

        if(url.equals("https://www.grapevinesurveys.com/pdf/report_samples_3dchar.pdf")){
            WebView browser = (WebView) findViewById(R.id.webview);
            browser.loadUrl("https://docs.google.com/gview?embedded=true&url=" + url);

        }
        else {
            WebView browser = (WebView) findViewById(R.id.webview);
            browser.loadUrl(url);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }


}
