package vohra.com.finance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class TechnologyService extends ActionBarActivity {

    public static String URL = "url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.technology_layout);

        ImageView userImage = (ImageView) findViewById(R.id.user);
        ImageView travelImage = (ImageView) findViewById(R.id.travel);
        ImageView reportImage = (ImageView) findViewById(R.id.report);

        userImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), WebViewActivity.class)
                        .putExtra(TechnologyService.URL, "http://www.tableau.com/learn/gallery");
                startActivity(i);
            }
        });

        travelImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), WebViewActivity.class)
                        .putExtra(TechnologyService.URL, "https://www.grapevinesurveys.com/pdf/report_samples_3dchar.pdf");
                startActivity(i);
            }
        });

        reportImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), WebViewActivity.class)
                        .putExtra(TechnologyService.URL, "http://www.yumasupt.org/science-expo-docs/Making-Data-Into-Charts.pptx");
                startActivity(i);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }


}
