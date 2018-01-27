package com.prijitcreations.dyaneshwari;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by sukanya on 13/1/18.
 */

public class GiftFragment extends Fragment {

    LinearLayout ll_ms;
    AdView mAdView_gift1,mAdView_gift2,mAdView_gift3,mAdView_gift4,mAdView_gift5;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View view = inflater.inflate(R.layout.giftfragment, container, false);
        ll_ms = (LinearLayout)view.findViewById(R.id.ll_ms);
        ll_ms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rateIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getActivity().getApplicationContext().getPackageName()));
                startActivity(rateIntent);
            }
        });

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(getActivity(), String.valueOf(R.string.app_id_prijit));


        mAdView_gift1 = (AdView)view.findViewById(R.id.adView_gift1);
        mAdView_gift2 = (AdView)view.findViewById(R.id.adView_gift2);
        mAdView_gift3 = (AdView)view.findViewById(R.id.adView_gift3);
        mAdView_gift4 = (AdView)view.findViewById(R.id.adView_gift5);
    //    mAdView_gift5 = (AdView)view.findViewById(R.id.adView_gift5);

        AdRequest adRequest1 = new AdRequest.Builder().build();
        AdRequest adRequest2 = new AdRequest.Builder().build();
        AdRequest adRequest3 = new AdRequest.Builder().build();
        AdRequest adRequest4 = new AdRequest.Builder().build();
      //  AdRequest adRequest5 = new AdRequest.Builder().build();
        mAdView_gift1.loadAd(adRequest1);
        mAdView_gift2.loadAd(adRequest2);
        mAdView_gift3.loadAd(adRequest3);
        mAdView_gift4.loadAd(adRequest4);
     //   mAdView_gift5.loadAd(adRequest5);
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle(R.string.app_name);
    }
}
