package com.prijitcreations.dyaneshwari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Read extends AppCompatActivity {

    TextView read;
    String text;
    private AdView mAdView_banner_read;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        read = (TextView)findViewById(R.id.text_read);

        Bundle extras = getIntent().getExtras();


        if (extras != null) {
            text = extras.getString("read");
            Log.i("rec",text);
            // and get whatever type user account id is
        }

        read.setText(text);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, String.valueOf(R.string.app_id_prijit));


        mAdView_banner_read = (AdView)findViewById(R.id.adView_read);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView_banner_read.loadAd(adRequest);

        MobileAds.initialize(this,
                getResources().getString(R.string.app_id_prijit)+"");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getResources().getString(R.string.interstitial_full_screen_prijit)+"");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });

    }

    @Override
    public void onBackPressed() {

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        super.onBackPressed();

    }
}
