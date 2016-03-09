/*
 * Main Page showing hash tag text.
 * 
 *  @auther Ramesh M Nair
 * 
 * */

package com.example.sanju.lndhashtagdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void exampleActivity(View v) {
		startActivity(new Intent(getApplicationContext(), HashTagActivity.class));
	}

	public void exampleListview(View v) {
		startActivity(new Intent(getApplicationContext(), ListViewHashTag.class));

	}

}
