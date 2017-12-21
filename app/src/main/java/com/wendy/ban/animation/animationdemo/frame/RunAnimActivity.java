package com.wendy.ban.animation.animationdemo.frame;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.wendy.ban.animation.animationdemo.R;

/**
 * Created by zktx on 2017/12/21.
 * 实现一个小人奔跑的动画
 */

public class RunAnimActivity extends Activity {
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView runiv = (ImageView) findViewById(R.id.iv_anim_run);
        //使用AnimaDrawable类作为动画载体
        animationDrawable = (AnimationDrawable) runiv.getBackground();
        animationDrawable.addFrame(getDrawable(R.drawable.run4), 50); //动态添加图片
        Button startbtn = findViewById(R.id.btn_start);
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationDrawable.start();
            }
        });
        Button stopbtn = findViewById(R.id.btn_stop);
        stopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationDrawable.stop();
            }
        });
    }
}
