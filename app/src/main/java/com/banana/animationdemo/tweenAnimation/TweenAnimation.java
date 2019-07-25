package com.banana.animationdemo.tweenAnimation;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.banana.animationdemo.R;
import com.banana.animationdemo.base.IFrameAnimationBase;
import com.banana.animationdemo.base.ITweenAnimationBase;

/**
 * @anthor: Banana
 * @function:
 * @date: 2019/7/24
 */
public class TweenAnimation implements ITweenAnimationBase {

    Animation animation;

    @Override
    public Animation stat(Context context) {
        animation= AnimationUtils.loadAnimation(context, R.anim.tween_animation);
        return animation;
    }

    @Override
    public Animation javaCodeStat(ImageView imageView, Context context) {
        return animation;
    }
}
