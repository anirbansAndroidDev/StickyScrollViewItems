package com.emilsjolander.components.StickyScrollViewItems.samples;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.emilsjolander.components.StickyScrollViewItems.R;

public class TestActivity extends Activity {
	/** Called when the activity is first created. */

	ImageView img_note;
	ImageView img_person;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		img_note = (ImageView)findViewById(R.id.mybuttonNote);
		img_person = (ImageView)findViewById(R.id.mybuttonPerson);
	}

	public void note(View v)
	{
		img_note.setImageResource(R.drawable.book_with_arrow);
		img_person.setImageResource(R.drawable.man_vector_active);
		findViewById(R.id.layout_note).setVisibility(View.VISIBLE);
		findViewById(R.id.layout_image_person).setVisibility(View.GONE);
	}

	public void person(View v)
	{
		img_note.setImageResource(R.drawable.book_icon_active);
		img_person.setImageResource(R.drawable.tab_person_with_arrow);
		findViewById(R.id.layout_note).setVisibility(View.GONE);
		findViewById(R.id.layout_image_person).setVisibility(View.VISIBLE);
	}
}
