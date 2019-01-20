package com.beta.vietest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created by Kevein on 2019/1/20.17:47
 */
//补间动画

public class TActivity extends AppCompatActivity {

	private Button bj_button;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bjlayout);
		initView();


	}

	private void initView() {
		bj_button = (Button) findViewById(R.id.bj_button);

		// 步骤2:创建 动画对象 并传入设置的动画效果xml文件
		Animation translateAnimation = AnimationUtils.loadAnimation(this,R.anim.view_animation);
		bj_button.startAnimation(translateAnimation);
		// 步骤3:播放动画
	}


}
