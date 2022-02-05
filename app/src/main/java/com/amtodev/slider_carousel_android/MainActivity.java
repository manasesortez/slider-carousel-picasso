package com.amtodev.slider_carousel_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
    Button button1;
    int[] images = {R.drawable.image1,
            R.drawable.images2,
            R.drawable.images3,
            R.drawable.images4,
            R.drawable.images5,
            R.drawable.images6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.imdb.com/title/tt4154796/"));
                startActivity(intent);

            }
        });

    }



}