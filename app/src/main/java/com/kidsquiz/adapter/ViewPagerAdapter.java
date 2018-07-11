package com.kidsquiz.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kidsquiz.R;
import com.kidsquiz.model.AbcdModel;

import java.util.ArrayList;

public class ViewPagerAdapter extends PagerAdapter {

    private Activity mActivity;
    private ArrayList<AbcdModel> mList = new ArrayList<>();

    public ViewPagerAdapter(Activity activity, ArrayList<AbcdModel> list) {
        this.mActivity = activity;
        this.mList = list;
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup collection, int position) {
        View view = LayoutInflater.from(mActivity)
                .inflate(R.layout.abcd_item, collection, false);
        collection.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View arg0, @NonNull Object arg1) {
        return arg0 == arg1;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        // No super
    }
}
