package com.example.sanju.lndhashtagdemo;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sanju.lndhashtagdemo.adaptors.HashTagAdaptor;

public class ListViewHashTag extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hashtag_listview);

		ListView lv = (ListView) findViewById(R.id.list);
		lv.setAdapter(new HashTagAdaptor(ListViewHashTag.this));
	}

}
