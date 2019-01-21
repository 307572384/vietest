package com.beta.vietest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created by Kevein on 2019/1/21.15:57
 */

public class TmdActivity extends AppCompatActivity implements View.OnClickListener {
	private Button tmd_button;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tmdlayout);
		initView();

	}

	private void initView() {
		tmd_button = (Button) findViewById(R.id.tmd_button);

		tmd_button.setOnClickListener(this);
		Animation alphaAnimation = AnimationUtils.loadAnimation(this,R.anim.view_animationtmd);
		tmd_button.startAnimation(alphaAnimation);
		/*

Button mButton = (Button) findViewById(R.id.Button);
// 步骤1:创建 需要设置动画的 视图ViewAnimation alphaAnimation = new AlphaAnimation(1,0);
// 步骤2：创建透明度动画的对象 & 设置动画效果：透明度动画对应的Animation子类为AlphaAnimation
// 参数说明: // 1. fromAlpha:动画开始时视图的透明度(取值范围: -1 ~ 1)
// 2. toAlpha:动画结束时视图的透明度(取值范围: -1 ~ 1)alphaAnimation.setDuration(3000);
// 固定属性的设置都是在其属性前加“set”，如setDuration（） mButton.startAnimation(alphaAnimation);
// 步骤3：播放动画

*/
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.tmd_button:

				break;
		}
	}
}
