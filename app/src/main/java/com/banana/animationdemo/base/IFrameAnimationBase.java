package com.banana.animationdemo.base;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

/**
 * @anthor: Banana
 * @function:
 * @date: 2019/7/24
 */
public interface IFrameAnimationBase {
    public AnimationDrawable stat(ImageView imageView);

    public AnimationDrawable javaCodeStat(ImageView imageView,Context context);
}
