package com.beta.vietest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created by Kevein on 2019/1/20.23:44
 */
//缩放动画
public class SActivity extends AppCompatActivity implements View.OnClickListener {
	private Button sf_button;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sflayout);
		initView();
	}

	private void initView() {
		sf_button = (Button) findViewById(R.id.sf_button);
		// 步骤1:创建 需要设置动画的 视图
		sf_button.setOnClickListener(this);
		Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.view_animationsc);
		// 步骤2:创建 动画对象 并传入设置的动画效果xml文件
		sf_button.startAnimation(rotateAnimation); // 步骤3:播放动画


/*
		Button mButton = (Button) findViewById(R.id.Button); /
		// / 步骤1:创建 需要设置动画的 视图View
		// Animation rotateAnimation = new ScaleAnimation(0,2,0,2,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
		// 步骤2：创建缩放动画的对象 & 设置动画效果：缩放动画对应的Animation子类为RotateAnimation
		// 参数说明: //
		// 1. fromX ：动画在水平方向X的结束缩放倍数 //
		// 2. toX ：动画在水平方向X的结束缩放倍数 //
		// 3. fromY ：动画开始前在竖直方向Y的起始缩放倍数 //
		// 4. toY：动画在竖直方向Y的结束缩放倍数 //
		// 5. pivotXType:缩放轴点的x坐标的模式 //
		// 6. pivotXValue:缩放轴点x坐标的相对值 //
		// 7. pivotYType:缩放轴点的y坐标的模式 //
		// 8. pivotYValue:缩放轴点y坐标的相对值 //
		// pivotXType = Animation.ABSOLUTE:缩放轴点的x坐标 = View左上角的原点 在x方向 加上 pivotXValue数值的点(y方向同理)
		// pivotXType = Animation.RELATIVE_TO_SELF:缩放轴点的x坐标 = View左上角的原点 在x方向 加上 自身宽度乘上pivotXValue数值的值(y方向同理)
		// pivotXType = Animation.RELATIVE_TO_PARENT:缩放轴点的x坐标 = View左上角的原点 在x方向 加上 父控件宽度乘上pivotXValue数值的值 (y方向同理) scaleAnimation.setDuration(3000);
		// 固定属性的设置都是在其属性前加“set”，如setDuration（） mButton.startAnimation(scaleAnimation);
		// 步骤3：播放动画
*/

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.sf_button:

				break;
		}
	}
}
