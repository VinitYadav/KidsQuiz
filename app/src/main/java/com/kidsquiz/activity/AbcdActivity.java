package com.kidsquiz.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kidsquiz.R;
import com.kidsquiz.adapter.ViewPagerAdapter;
import com.kidsquiz.databinding.ActivityAbcdBinding;
import com.kidsquiz.model.AbcdModel;

import java.util.ArrayList;


public class AbcdActivity extends AppCompatActivity {

    private ActivityAbcdBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_abcd);
        mBinding.setActivity(this);
        initList();
    }

    /**
     * Set view pager adapter
     */
    private void setupViewPager(ArrayList<AbcdModel> list ) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(AbcdActivity.this,list);
        mBinding.viewPager.setAdapter(adapter);
    }

    /**
     * Initialize list
     */
    private void initList() {
        ArrayList<AbcdModel> list = new ArrayList<>();
        list.add(new AbcdModel("A For Apple", R.drawable.apple));
        list.add(new AbcdModel("A For Apple", R.drawable.apple));

        setupViewPager(list);
    }
}
