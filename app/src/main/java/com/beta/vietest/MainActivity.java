package com.beta.vietest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	private Button enttj;
	private Button entbj;
	private Button entsf;
	private Button entxz;
	private Button enttmd;
	private Button enttzh;
	private Button entzz;


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
		entsf = (Button) findViewById(R.id.entsf);
		entsf.setOnClickListener(this);
		entxz = (Button) findViewById(R.id.entxz);
		entxz.setOnClickListener(this);
		enttmd = (Button) findViewById(R.id.enttmd);
		enttmd.setOnClickListener(this);
		enttzh = (Button) findViewById(R.id.enttzh);
		enttzh.setOnClickListener(this);
		entzz = (Button) findViewById(R.id.entzz);
		entzz.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.enttj://进入太极图自定义View
				Intent tintent = new Intent(MainActivity.this, TJActivity.class);
				startActivity(tintent);
				break;
			case R.id.entbj://进入自定义补间动画
				Intent tjintent = new Intent(MainActivity.this, TActivity.class);
				startActivity(tjintent);
				break;
			case R.id.entsf://进入缩放动画
				Intent sfintent = new Intent(MainActivity.this, SActivity.class);
				startActivity(sfintent);
				break;
			case R.id.entxz://进入旋转动画
				Intent xzintent = new Intent(MainActivity.this, SZActivity.class);
				startActivity(xzintent);
				break;
			case R.id.enttmd://进入透明度动画
				Intent tmdintent = new Intent(MainActivity.this, TmdActivity.class);
				startActivity(tmdintent);
				break;
			case R.id.enttzh://进入组合动画
				Intent zhintent = new Intent(MainActivity.this, zhActivity.class);
				startActivity(zhintent);
				break;
			case R.id.entzz://进入逐帧动画
				Intent zzintent = new Intent(MainActivity.this, ZZActivity.class);
				startActivity(zzintent);
				break;
		}
	}
}
