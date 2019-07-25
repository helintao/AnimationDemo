package com.banana.animationdemo.base;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.ImageView;

/**
 * @anthor: Banana
 * @function:
 * @date: 2019/7/25
 */
public interface IPropertyAnimatorBase {
    public AnimatorSet stat(ImageView imageView, Context context);

    public ObjectAnimator javaCodeStat(ImageView imageView, Context context);
}
