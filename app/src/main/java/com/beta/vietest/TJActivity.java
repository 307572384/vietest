package com.beta.vietest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Kevein on 2019/1/20.17:47
 */

public class TJActivity extends AppCompatActivity{
	TJView mTJView ;
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tjlayout);
		mTJView = new TJView(this);//初始化自定义View
		this.setContentView(mTJView);//设置当前的用户的界面
	}
}
