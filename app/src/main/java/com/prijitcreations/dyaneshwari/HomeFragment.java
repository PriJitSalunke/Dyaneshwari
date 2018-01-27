package com.prijitcreations.dyaneshwari;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
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

public class HomeFragment extends Fragment {

    private AdView mAdView_banner;

    LinearLayout read1,read2,read3,read4,read5,read6,read7,read8,read9,read10,read11,read12,
            read13,read14,read15,read16,read17,read18,
    view1,view2,view3,view4,view5,view6,view7,view8,view9,view10,view11,view12,view13,view14,view15,view16,view17,view18;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View v = inflater.inflate(R.layout.home_fragment, container, false);
        read1 = (LinearLayout)v.findViewById(R.id.read1);
        read2 = (LinearLayout)v.findViewById(R.id.read2);
        read3 = (LinearLayout)v.findViewById(R.id.read3);
        read4 = (LinearLayout)v.findViewById(R.id.read4);
        read5 = (LinearLayout)v.findViewById(R.id.read5);
        read6 = (LinearLayout)v.findViewById(R.id.read6);
        read7 = (LinearLayout)v.findViewById(R.id.read7);
        read8 = (LinearLayout)v.findViewById(R.id.read8);
        read9 = (LinearLayout)v.findViewById(R.id.read9);
        read10 = (LinearLayout)v.findViewById(R.id.read10);
        read11 = (LinearLayout)v.findViewById(R.id.read11);
        read12= (LinearLayout)v.findViewById(R.id.read12);
        read13 = (LinearLayout)v.findViewById(R.id.read13);
        read14 = (LinearLayout)v.findViewById(R.id.read14);
        read15 = (LinearLayout)v.findViewById(R.id.read15);
        read16 = (LinearLayout)v.findViewById(R.id.read16);
        read17 = (LinearLayout)v.findViewById(R.id.read17);
        read18 = (LinearLayout)v.findViewById(R.id.read18);

        view1 = (LinearLayout)v.findViewById(R.id.view1);
        view2 = (LinearLayout)v.findViewById(R.id.view2);
        view3 = (LinearLayout)v.findViewById(R.id.view3);
        view4 = (LinearLayout)v.findViewById(R.id.view4);
        view5 = (LinearLayout)v.findViewById(R.id.view5);
        view6 = (LinearLayout)v.findViewById(R.id.view6);
        view7 = (LinearLayout)v.findViewById(R.id.view7);
        view8 = (LinearLayout)v.findViewById(R.id.view8);
        view9 = (LinearLayout)v.findViewById(R.id.view9);
        view10 = (LinearLayout)v.findViewById(R.id.view10);
        view11 = (LinearLayout)v.findViewById(R.id.view11);
        view12 = (LinearLayout)v.findViewById(R.id.view12);
        view13 = (LinearLayout)v.findViewById(R.id.view13);
        view14 = (LinearLayout)v.findViewById(R.id.view14);
        view15 = (LinearLayout)v.findViewById(R.id.view15);
        view16 = (LinearLayout)v.findViewById(R.id.view16);
        view17 = (LinearLayout)v.findViewById(R.id.view17);
        view18 = (LinearLayout)v.findViewById(R.id.view18);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(getActivity(), String.valueOf(R.string.app_id_prijit));


        mAdView_banner = (AdView)v.findViewById(R.id.adView_home);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView_banner.loadAd(adRequest);

        read1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                Log.i("read1",R.string.read1+"");
                it.putExtra("read",getActivity().getResources().getString(R.string.read1));
                Log.i("sent","1234"+it.getStringExtra("read"));
                startActivity(it);
            }
        });

        read2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read2));
                startActivity(it);
            }
        });
        read3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read3));
                startActivity(it);
            }
        });
        read4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read4));
                startActivity(it);
            }
        });
        read5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read5));
                startActivity(it);
            }
        });
        read6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read6));
                startActivity(it);
            }
        });
        read7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read7));
                startActivity(it);
            }
        });
        read8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read8));
                startActivity(it);
            }
        });
        read9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read9));
                startActivity(it);
            }
        });
        read10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read10));
                startActivity(it);
            }
        });
        read11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read11));
                startActivity(it);
            }
        });
        read12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read12));
                startActivity(it);
            }
        });
        read13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read13));
                startActivity(it);
            }
        });
        read14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read14));
                startActivity(it);
            }
        });
        read15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read15));
                startActivity(it);
            }
        });
        read16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read16));
                startActivity(it);
            }
        });
        read17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read17));
                startActivity(it);
            }
        });
        read18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),Read.class);
                it.putExtra("read",getActivity().getResources().getString(R.string.read18));
                startActivity(it);
            }
        });

        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("e2OKXv4wtTg");
            }
        });
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("Hou7D4Wprng");
            }
        });
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("XOm2dsOO8gk");
            }
        });
        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("BXpGMIFUM0w");
            }
        });
        view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("XBc591nJj9c");
            }
        });
        view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("5Bu3GAqOKQY");
            }
        });
        view7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("X_5CdrUrZ9A");
            }
        });
        view8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("2XWc43BXOCo");
            }
        });
        view9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("XKRyvsTsxHM");
            }
        });
        view10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("jXrA5YXkgno");
            }
        });
        view11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("hrclcHPlreo");
            }
        });
        view12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("K5MXEbGkYeA");
            }
        });
        view13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("bQfg83I5Bvw");
            }
        });
        view14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("MPDtGqx6pFA");
            }
        });
        view15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("ZIDNDC1cc00");
            }
        });
        view16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("PeEHTsQfN40");
            }
        });
        view17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("NzeFbwigYfc");
            }
        });
        view18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchYoutubeVideo("gnBoC4p3RWk");
            }
        });
        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle(R.string.app_name);
    }

    public void watchYoutubeVideo(String id) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + id));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=" + id));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }

}


