package com.banana.animationdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

import com.banana.animationdemo.R;
import com.banana.animationdemo.frameAnimation.FrameFrameAnimation;
import com.banana.animationdemo.propertyAnimation.PropertyAnimator;
import com.banana.animationdemo.tweenAnimation.TweenAnimation;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AnimationDrawable animationDrawable;
    private Animation animation;
    private AnimatorSet animatorSet;

    private Intent intent;

    private PropertyAnimator propertyAnimator = null;
    private ObjectAnimator objectAnimator=null;

    private ImageView imageView;
    private ImageView tweenIv;

    private Button frameBtn;
    private Button frameCodeBtn;
    private Button tweenBtn;
    private Button propertyBtn;
    private Button propertyCodeBtn;
    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        imageView = findViewById(R.id.main_frame_iv);
        frameBtn = findViewById(R.id.main_frame_btn);
        frameBtn.setOnClickListener(this);
        frameCodeBtn = findViewById(R.id.main_frame_code_btn);
        frameCodeBtn.setOnClickListener(this);
        tweenIv = findViewById(R.id.main_tween_iv);
        tweenBtn = findViewById(R.id.main_tween_btn);
        tweenBtn.setOnClickListener(this);
        propertyBtn = findViewById(R.id.main_property_btn);
        propertyBtn.setOnClickListener(this);
        propertyCodeBtn = findViewById(R.id.main_property_code_btn);
        propertyCodeBtn.setOnClickListener(this);
        nextBtn=findViewById(R.id.main_next_btn);
        nextBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_frame_btn:
                if (animationDrawable != null && animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable = new FrameFrameAnimation().stat(imageView);
                animationDrawable.start();
                break;
            case R.id.main_frame_code_btn:
                if (animationDrawable != null && animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable = new FrameFrameAnimation().javaCodeStat(imageView, this);
                imageView.setImageDrawable(animationDrawable);
                animationDrawable.start();
                break;
            case R.id.main_tween_btn:
                animation = new TweenAnimation().stat(this);
                tweenIv.startAnimation(animation);
                break;
            case R.id.main_property_btn:
                if (propertyAnimator == null) {
                    propertyAnimator = new PropertyAnimator();
                }
                animatorSet = propertyAnimator.stat(tweenIv, this);
                animatorSet.start();
                break;
            case R.id.main_property_code_btn:
                if (propertyAnimator == null) {
                    propertyAnimator = new PropertyAnimator();
                }
                objectAnimator=propertyAnimator.javaCodeStat(tweenIv, this);
                objectAnimator.start();
                break;
            case R.id.main_next_btn:
                intent=new Intent(this,NextActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        if (animationDrawable != null && animationDrawable.isRunning()) {
            animationDrawable.stop();
        }
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.end();
        }

        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.end();
        }

        super.onDestroy();
    }
}
