package com.pradhanrishisharma.www.loginsample.NetwrokCheckModule;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.pradhanrishisharma.www.loginsample.CandleStickChartActivity;
import com.pradhanrishisharma.www.loginsample.DescAndEligibility;
import com.pradhanrishisharma.www.loginsample.HalfPieChartActivity;
import com.pradhanrishisharma.www.loginsample.InvertedLineChartActivity;
import com.pradhanrishisharma.www.loginsample.PieChartActivity;
import com.pradhanrishisharma.www.loginsample.R;
import com.pradhanrishisharma.www.loginsample.RealtimeLineChartActivity;

import static com.pradhanrishisharma.www.loginsample.R.drawable.nrlm;

public class YojnaActivity extends AppCompatActivity implements View.OnClickListener {

    public static int mYojnaId;
    Integer aboutURL;
    String websiteURL = null;
    String statsURL = null;
    private ImageView image_view_3;
    private Button about, website, stats;
    private Class open;
    private TextView mYojna;

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

        mYojna = (TextView) findViewById(R.id.yojnadetail);
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

        String[] webUrls = new String[]{"http://ddugky.gov.in/",
                "http://nrlm.gov.in/outerReportAction.do?methodName=showIndex",
                "http://www.pmgsy.nic.in/",
                "https://registration.csc.gov.in/pmay/index.html",
                "http://rurban.gov.in/about.html",
                "http://www.nrega.nic.in/netnrega/home.aspx",
                "http://ruraldiksha.nic.in/",
                "http://ruraldiksha.nic.in/",
                "http://nsap.nic.in/"};

        switch (id) {

            case 1:
                image_view_3.setImageResource(R.drawable.ddu);
                aboutURL = 1;
                open = PieChartActivity.class;
                mYojna.setText(R.string.ddu_gky);
                websiteURL = webUrls[0];
                //statsURL = // R.strin.n
                break;

            case 2:
                image_view_3.setImageResource(R.drawable.mgnrega);
                aboutURL = 2;
                open = InvertedLineChartActivity.class;
                mYojna.setText(R.string.mgnrega);
                websiteURL = webUrls[5];
                break;

            case 3:
                image_view_3.setImageResource(R.drawable.nrum);
                aboutURL = 3;
                open = HalfPieChartActivity.class;
                mYojna.setText(R.string.nrum);
                websiteURL = webUrls[1];
                break;

            case 4:
                image_view_3.setImageResource(R.drawable.pmay);
                aboutURL = 4;
                mYojna.setText(R.string.pmay);
                open = CandleStickChartActivity.class;
                websiteURL = webUrls[3];

                break;

            case 5:
                image_view_3.setImageResource(R.drawable.pmgsy);
                aboutURL = 5;
                mYojna.setText(R.string.pmgsy);
                open = RealtimeLineChartActivity.class;
                websiteURL = webUrls[6];
                break;

            case 6:
                image_view_3.setImageResource(R.drawable.nsap);
                aboutURL = 6;
                mYojna.setText(R.string.nsap);
                open = CandleStickChartActivity.class;
                websiteURL = webUrls[7];
                break;

            case 7:
                image_view_3.setImageResource(R.drawable.saanjhi);
                aboutURL = 7;
                open = HalfPieChartActivity.class;
                mYojna.setText(R.string.saanjhi);
                websiteURL = webUrls[4];
                break;

            case 8:
                image_view_3.setImageResource(R.drawable.diksha);
                aboutURL = 8;
                mYojna.setText(R.string.ddu_gky);
                open = RealtimeLineChartActivity.class;
                websiteURL = webUrls[0];
                break;

            case 9:
                image_view_3.setImageResource(nrlm);
                aboutURL = 9;
                mYojna.setText(R.string.day_nrlm);
                open = PieChartActivity.class;
                websiteURL = webUrls[1];
                break;

            case 10:
                image_view_3.setImageResource(R.drawable.photo1);
                aboutURL = 10;
                mYojna.setText(R.string.ddp);
                open = InvertedLineChartActivity.class;
                websiteURL = webUrls[5];
                break;

            case 11:
                image_view_3.setImageResource(R.drawable.photo2);
                aboutURL = 11;
                mYojna.setText(R.string.dpap);
                open = RealtimeLineChartActivity.class;
                websiteURL = webUrls[6];
                break;

            case 12:
                image_view_3.setImageResource(R.drawable.photo3);
                aboutURL = 12;
                mYojna.setText(R.string.hariyali);
                open = HalfPieChartActivity.class;
                websiteURL = webUrls[3];
                break;

            case 13:
                image_view_3.setImageResource(R.drawable.photo4);
                aboutURL = 13;
                mYojna.setText(R.string.gwd);
                open = InvertedLineChartActivity.class;
                websiteURL = webUrls[1];
                break;

            case 14:
                image_view_3.setImageResource(R.drawable.photo5);
                aboutURL = 14;
                mYojna.setText(R.string.ips);
                open = PieChartActivity.class;
                websiteURL = webUrls[4];
                break;

            case 15:
                image_view_3.setImageResource(R.drawable.photo6);
                aboutURL = 15;
                mYojna.setText(R.string.tdet);
                open = RealtimeLineChartActivity.class;
                websiteURL = webUrls[5];
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
                break;

            case R.id.website:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteURL));
                startActivity(browserIntent);
                break;

            case R.id.stats:
                Intent showstat = new Intent(YojnaActivity.this, open);
                startActivity(showstat);
                break;
        }


    }


}
