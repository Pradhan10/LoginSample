package com.pradhanrishisharma.www.loginsample.NetwrokCheckModule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.pradhanrishisharma.www.loginsample.DescAndEligibility;
import com.pradhanrishisharma.www.loginsample.R;

public class YojnaActivity extends AppCompatActivity implements View.OnClickListener {

    public static int mYojnaId;
    Integer aboutURL;
    String websiteURL = null;
    String statsURL = null;
    private ImageView image_view_3;
    private Button about, website, stats;


    public YojnaActivity() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yojna);

        image_view_3 = (ImageView) findViewById(R.id.image_view_3);
        about = (Button) findViewById(R.id.about);
        website = (Button) findViewById(R.id.website);
        stats = (Button) findViewById(R.id.stats);
        //Catching the intent which started activity and finding yojna id.
        Intent intent = getIntent();
        Integer id = intent.getIntExtra("mYojnaId", 1);
        //nteger intId = Integer.parseInt(id);

        String[] urls = new String[]{"https://www.akshayush.orgfree.com/barGraph_sample.html",
                "https://www.akshayush.orgfree.com/pie_sample.html"
                , "https://www.akshayush.orgfree.com/PMGSY-Physical.html"
                , "https://www.akshayush.orgfree.com/err.html"
                , "https://www.akshayush.orgfree.com/NRLM.html"
        };

        switch (id) {

            case 1:
                image_view_3.setImageResource(R.drawable.ddu);
                aboutURL = 1;
                statsURL = urls[0];
                //statsURL = // R.strin.n
                break;

            case 2:
                image_view_3.setImageResource(R.drawable.mgnrega);
                aboutURL = 2;
                statsURL = urls[1];
                break;

            case 3:
                image_view_3.setImageResource(R.drawable.nrum);
                aboutURL = 3;
                statsURL = urls[2];
                break;

            case 4:
                image_view_3.setImageResource(R.drawable.pmay);
                aboutURL = 4;
                statsURL = urls[3];
                break;

            case 5:
                image_view_3.setImageResource(R.drawable.pmgsy);
                aboutURL = 5;
                statsURL = urls[2];
                break;

            case 6:
                image_view_3.setImageResource(R.drawable.nsap);
                aboutURL = 6;
                statsURL = urls[3];
                break;

            case 7:
                image_view_3.setImageResource(R.drawable.saanjhi);
                aboutURL = 7;
                statsURL = urls[3];
                break;

            case 8:
                image_view_3.setImageResource(R.drawable.diksha);
                aboutURL = 8;
                statsURL = urls[3];
                break;

            case 9:
                image_view_3.setImageResource(R.drawable.nrlm);
                aboutURL = 9;
                statsURL = urls[4];
                break;

            case 10:
                image_view_3.setImageResource(R.drawable.photo1);
                aboutURL = 10;
                statsURL = urls[3];
                break;

            case 11:
                image_view_3.setImageResource(R.drawable.photo2);
                aboutURL = 11;
                statsURL = urls[0];
                break;

            case 12:
                image_view_3.setImageResource(R.drawable.photo3);
                aboutURL = 12;
                statsURL = urls[2];
                break;

            case 13:
                image_view_3.setImageResource(R.drawable.photo4);
                aboutURL = 13;
                statsURL = urls[1];
                break;

            case 14:
                image_view_3.setImageResource(R.drawable.photo5);
                aboutURL = 14;
                statsURL = urls[3];
                break;

            case 15:
                image_view_3.setImageResource(R.drawable.photo6);
                aboutURL = 15;
                statsURL = urls[4];
                break;

        }


        //Listen for button click event
        about.setOnClickListener(this);
        website.setOnClickListener(this);
        stats.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int setUrls = v.getId();

        switch (setUrls) {

            case R.id.about:
                Intent deseligi = new Intent(YojnaActivity.this, DescAndEligibility.class);
                deseligi.putExtra("mDescID", aboutURL);
                startActivity(deseligi);

            case R.id.website:

            case R.id.stats:

        }


    }


}
