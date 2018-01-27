package com.prijitcreations.dyaneshwari;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by sukanya on 13/1/18.
 */

public class AboutusFragment extends Fragment {
    AdView mAdView_about1,mAdView_about2,mAdView_about3,mAdView_about4,mAdView_about5;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View view = inflater.inflate(R.layout.aboutus, container, false);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(getActivity(), String.valueOf(R.string.app_id_prijit));


        mAdView_about1 = (AdView)view.findViewById(R.id.adView_about1);
        mAdView_about2 = (AdView)view.findViewById(R.id.adView_about2);
        mAdView_about3 = (AdView)view.findViewById(R.id.adView_about3);
        mAdView_about4 = (AdView)view.findViewById(R.id.adView_about4);
        mAdView_about5 = (AdView)view.findViewById(R.id.adView_about5);

        AdRequest adRequest1 = new AdRequest.Builder().build();
        AdRequest adRequest2 = new AdRequest.Builder().build();
        AdRequest adRequest3 = new AdRequest.Builder().build();
        AdRequest adRequest4 = new AdRequest.Builder().build();
        AdRequest adRequest5 = new AdRequest.Builder().build();
        mAdView_about1.loadAd(adRequest1);
        mAdView_about2.loadAd(adRequest2);
        mAdView_about3.loadAd(adRequest3);
        mAdView_about4.loadAd(adRequest4);
        mAdView_about5.loadAd(adRequest5);
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle(R.string.app_name);
    }
}


