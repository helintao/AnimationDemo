package com.banana.animationdemo.base;

import android.content.Context;
import android.view.animation.Animation;
import android.widget.ImageView;

/**
 * @anthor: Banana
 * @function:
 * @date: 2019/7/24
 */
public interface ITweenAnimationBase {

    public Animation stat(Context context);

    public Animation javaCodeStat(ImageView imageView,Context context);
}
