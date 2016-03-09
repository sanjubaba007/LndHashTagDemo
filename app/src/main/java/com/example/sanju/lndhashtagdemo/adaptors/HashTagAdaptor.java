/***
 * Tile : Adaptor class Shows Category view
 * @author Ramesh M Nair
 * 
 * **/

package com.example.sanju.lndhashtagdemo.adaptors;

import android.app.Activity;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.widget.Toast;

import com.example.sanju.lndhashtagdemo.R;
import com.example.sanju.lndhashtagdemo.TagSelectingTextview;
import com.example.sanju.lndhashtagdemo.interfaces.TagClick;


public class HashTagAdaptor extends BaseAdapter implements TagClick {

	// Declaring Variables

	private Activity activity;

	private static LayoutInflater inflater = null;

	TagSelectingTextview mTagSelectingTextview;

	String[] hashtags = { "hell there how are you @sanjay #github", "#dwts #glee #idol #xfactor",
			"#teachers", "", "#jobs #business #sales #economy",
			"#testing #github", "#dwts #glee #idol #xfactor", "#teachers", "",
			"#jobs #business #sales #economy", "#climate, #solar" };

	public static int hashTagHyperLinkEnabled = 1;
	public static int hashTagHyperLinkDisabled = 0;

	String hastTagColorBlue = "#be4d66";

	public HashTagAdaptor(Activity mActivity) {

		activity = mActivity;

		inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		mTagSelectingTextview = new TagSelectingTextview();

	}

	public int getCount() {

		return hashtags.length;

	}

	public Object getItem(int position) {

		return position;

	}

	public long getItemId(int position) {

		return position;

	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View vi = convertView;
		if (convertView == null)

			// Get the view from mainpage_row.xml

			vi = inflater.inflate(R.layout.tagviewrow, null);

		TextView tags = (TextView) vi.findViewById(R.id.tag_row);

		tags.setMovementMethod(LinkMovementMethod.getInstance());

		tags.setText(mTagSelectingTextview.addClickablePart(hashtags[position],
				this, hashTagHyperLinkDisabled, hastTagColorBlue),
				BufferType.SPANNABLE);



		return vi;
	}

	@Override
	public void clickedTag(CharSequence tag) {
		// TODO Auto-generated method stub
		Toast.makeText(activity, "Clicked on " + tag, 1).show();
	}

}