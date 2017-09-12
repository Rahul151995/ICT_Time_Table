package com.ict.ict_timetable;

import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils.TruncateAt;
import android.view.Menu;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutUs extends Activity {
	 private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_us);
		  tv = (TextView)findViewById(R.id.info); 
		 
		ImageView img_animation = (ImageView) findViewById(R.id.img_animation);
		 
		/*
		  TranslateAnimation animation = new TranslateAnimation(0.0f, 900.0f, 0.0f, 0.0f);
		  animation.setDuration(5000);
		  animation.setRepeatCount(5);
		  animation.setRepeatMode(5);
		  animation.setFillAfter(true);
		  img_animation.startAnimation(animation);
		  */
		  
		  
		  RotateAnimation rotate
		  = new RotateAnimation(0.0f, 1080.0f,
		                        Animation.RELATIVE_TO_SELF, 0.5f,
		                        Animation.RELATIVE_TO_SELF, 0.5f);  
		  
		  
		  
		  ScaleAnimation scale
		  = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
		                       Animation.RELATIVE_TO_SELF, 0.5f,
		                       Animation.RELATIVE_TO_SELF, 0.5f);
		  
		  AlphaAnimation alpha = new AlphaAnimation(0.0f, 1.0f);
		  AnimationSet set = new AnimationSet(true);
		  set.addAnimation(rotate);
		  set.addAnimation(scale);
		  set.addAnimation(alpha);
		  set.setDuration(2000);
		  
		  img_animation.startAnimation(set);
		  
		  
		  
		  
		  
		  
		  tv.setEllipsize(TruncateAt.MARQUEE);
	        tv.setSelected(true); 
	        
	        
	        tv.setSelected(true);  // Set focus to the textview

	     // in case if you want to do it this in problematically means please use the below lines.
	             tv.setText("For any queries just mail me at rahulkumar151995@gmail.com");
	             tv.setSelected(true);
	            tv.setEllipsize(TruncateAt.MARQUEE);
	             tv.setSingleLine(true); 
		
	}
}
