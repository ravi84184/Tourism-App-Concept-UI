package com.nikdemo.foodapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    RecyclerView rl_image,rl_slider;
    int[] list = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rl_image = findViewById(R.id.rl_image);
        rl_image.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false));
        rl_image.setAdapter(new GalleryAdapter(this,list));


        rl_slider = findViewById(R.id.rl_slider);
        rl_slider.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false));

        rl_slider.setAdapter(new SliderAdapter(this,list));
    }
}
