package com.banana.animationdemo.propertyAnimation;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.widget.ImageView;

import com.banana.animationdemo.R;
import com.banana.animationdemo.base.IPropertyAnimatorBase;

import java.util.PropertyPermission;

/**
 * @anthor: Banana
 * @function:
 * @date: 2019/7/25
 */
public class PropertyAnimator implements IPropertyAnimatorBase {

    AnimatorSet set;
    @Override
    public AnimatorSet stat(ImageView imageView,Context context) {
        set= (AnimatorSet) AnimatorInflater.loadAnimator(context,R.animator.property_animator);
        set.setTarget(imageView);
        return set;
    }

    @Override
    public ObjectAnimator javaCodeStat(ImageView imageView, Context context) {
        PropertyValuesHolder rotation=PropertyValuesHolder.ofFloat(
                "rotation",0,180,90,180,180,360,270,360);
        PropertyValuesHolder alpha=PropertyValuesHolder.ofFloat(
                "alpha",1,0.5f,0.5f,1);
        PropertyValuesHolder translationX=
                PropertyValuesHolder.ofFloat("translationX",0,200,0);
        ObjectAnimator together=ObjectAnimator.ofPropertyValuesHolder(imageView,rotation,alpha,translationX);
        together.setDuration(3000);

        return together;
    }
}
