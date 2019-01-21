package com.beta.vietest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
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
		Animation translateAnimation = AnimationUtils.loadAnimation(this, R.anim.view_animation);
		bj_button.startAnimation(translateAnimation);
		// 步骤3:播放动画
		/*
直接写补间动画不通过xml
Button mButton = (Button) findViewById(R.id.Button); // 步骤1:创建 需要设置动画的
视图ViewAnimation translateAnimation = new TranslateAnimation(0，500，0，500);
// 步骤2：创建平移动画的对象：平移动画对应的Animation子类为TranslateAnimation
// 参数分别是： // 1. fromXDelta ：视图在水平方向x 移动的起始值
 / / 2. toXDelta ：视图在水平方向x 移动的结束值 //
 3. fromYDelta ：视图在竖直方向y 移动的起始值 //
  4. toYDelta：视图在竖直方向y 移动的结束值 translateAnimation.setDuration(3000);
  // 固定属性的设置都是在其属性前加“set”，如setDuration（） mButton.startAnimation(translateAnimation);
   / / 步骤3:播放动画
*/
	}


}
