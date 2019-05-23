package com.nikdemo.foodapplication.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.library.banner.BannerLayout;
import com.nikdemo.foodapplication.R;
import com.nikdemo.foodapplication.adapter.GalleryAdapter;
import com.nikdemo.foodapplication.adapter.SliderAdapter;
import com.nikdemo.foodapplication.utils.BaseActivity;

public class MainActivity extends BaseActivity {

    RecyclerView rl_image;
    BannerLayout vp_step;
    int[] list = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp_step = findViewById(R.id.vp_step);


        rl_image = findViewById(R.id.rl_image);
        rl_image.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false));
        rl_image.setAdapter(new GalleryAdapter(this,list));


        vp_step.setAdapter(new SliderAdapter(this,list));
    }
}
