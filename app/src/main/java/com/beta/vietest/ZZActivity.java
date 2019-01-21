package com.beta.vietest;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Kevein on 2019/1/21.17:58
 */
//逐帧动画
public class ZZActivity extends AppCompatActivity  {
	private ImageView zz_iv;
	private Button    zz_start;
	private Button    zz_stop;
	private AnimationDrawable mAnimationDrawable;
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zzlayout);
		initView();

	}

	private void initView() {
		zz_iv = (ImageView) findViewById(R.id.zz_img);
		zz_start = (Button) findViewById(R.id.start);
		zz_stop = (Button) findViewById(R.id.stop);

		zz_start.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				zz_iv.setImageResource(R.drawable.view_zhuzhen);
				mAnimationDrawable=(AnimationDrawable) zz_iv.getDrawable();
				mAnimationDrawable.start();

			}
		});
		zz_stop.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				zz_iv.setImageResource(R.drawable.view_zhuzhen);
				mAnimationDrawable=(AnimationDrawable)zz_iv.getDrawable();
				mAnimationDrawable.stop();
			}
		});
	}


}
