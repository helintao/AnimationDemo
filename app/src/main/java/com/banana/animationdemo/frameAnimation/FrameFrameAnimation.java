package com.banana.animationdemo.frameAnimation;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.banana.animationdemo.R;
import com.banana.animationdemo.base.IFrameAnimationBase;

/**
 * @anthor: Banana
 * @function:
 * @date: 2019/7/24
 */
public class FrameFrameAnimation implements IFrameAnimationBase {

    AnimationDrawable animationDrawable;

    @Override
    public AnimationDrawable stat(ImageView imageView) {
        imageView.setImageResource(R.drawable.frame_animation);
        animationDrawable= (AnimationDrawable) imageView.getDrawable();
        return animationDrawable;
    }

    @Override
    public AnimationDrawable javaCodeStat(ImageView imageView,Context context) {
        if(animationDrawable==null){
            animationDrawable=new AnimationDrawable();
        }
        for(int i=1;i<=35;i++){
            int id = context.getResources().getIdentifier(
                    "xhr_"+i,"drawable",context.getPackageName());
            Drawable drawable=context.getResources().getDrawable(id);
            animationDrawable.addFrame(drawable,50);
        }
        animationDrawable.setOneShot(false);
        return animationDrawable;
    }


}
