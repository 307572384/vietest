package com.beta.vietest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created by Kevein on 2019/1/21.16:32
 */

public class zhActivity extends AppCompatActivity implements View.OnClickListener {
	private Button zh_button;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zhlayout);
		initView();

	}

	private void initView() {
		zh_button = (Button) findViewById(R.id.zh_button);

		zh_button.setOnClickListener(this);
		Animation zhAnimation = AnimationUtils.loadAnimation(this,R.anim.view_animationzh);
		zh_button.startAnimation(zhAnimation);




	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.zh_button:

				break;
		}
	}
}
