package com.nikdemo.foodapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nikdemo.foodapplication.R;
import com.nikdemo.foodapplication.utils.BaseActivity;

public class DetailsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }
}
