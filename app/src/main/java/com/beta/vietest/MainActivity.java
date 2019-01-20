package com.beta.vietest;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	private Button           enttj;
	private Button           entbj;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();

	}

	private void initView() {
		enttj = (Button) findViewById(R.id.enttj);
		entbj = (Button) findViewById(R.id.entbj);


		enttj.setOnClickListener(this);
		entbj.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.enttj://进入太极图自定义View
				Intent tintent = new Intent(MainActivity.this,TJActivity.class);
				startActivity(tintent);
				break;
			case R.id.entbj://进入自定义补间动画
				Intent tjintent = new Intent(MainActivity.this,TActivity.class);
				startActivity(tjintent);
				break;
		}
	}
}
