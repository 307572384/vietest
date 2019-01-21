package com.beta.vietest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;

/**
 * Created by Kevein on 2019/1/21.15:45
 */
//旋转动画

public class SZActivity extends AppCompatActivity implements View.OnClickListener {
	private Button sz_button;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.szlayout);
		initView();
	}

	private void initView() {
		sz_button = (Button) findViewById(R.id.sz_button);

		sz_button.setOnClickListener(this);
		Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.view_animationsz);
		sz_button.startAnimation(scaleAnimation);


		/*Button mButton = (Button) findViewById(R.id.Button); */
		// 步骤1:创建 需要设置动画的 视图ViewAnimation rotateAnimation = new RotateAnimation(0,270,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
		// 步骤2：创建旋转动画的对象 & 设置动画效果：旋转动画对应的Animation子类为RotateAnimation
		// 参数说明:
		// 1. fromDegrees ：动画开始时 视图的旋转角度(正数 = 顺时针，负数 = 逆时针)
		// 2. toDegrees ：动画结束时 视图的旋转角度(正数 = 顺时针，负数 = 逆时针)
		// 3. pivotXType：旋转轴点的x坐标的模式
		// 4. pivotXValue：旋转轴点x坐标的相对值
		// 5. pivotYType：旋转轴点的y坐标的模式
		// 6. pivotYValue：旋转轴点y坐标的相对值
		// pivotXType = Animation.ABSOLUTE:旋转轴点的x坐标 = View左上角的原点 在x方向 加上 pivotXValue数值的点(y方向同理)
		// pivotXType = Animation.RELATIVE_TO_SELF:旋转轴点的x坐标 = View左上角的原点 在x方向 加上 自身宽度乘上pivotXValue数值的值(y方向同理)
		// pivotXType = Animation.RELATIVE_TO_PARENT:旋转轴点的x坐标 = View左上角的原点 在x方向 加上 父控件宽度乘上pivotXValue数值的值 (y方向同理) rotateAnimation.setDuration(3000);
		// 固定属性的设置都是在其属性前加“set”，如setDuration（） mButton.startAnimation(rotateAnimation);
		// 步骤3：播放动画

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.sz_button:

				break;
		}
	}
}
