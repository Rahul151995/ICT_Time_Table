package com.ict.ict_timetable;

import com.ict.ict_timetable.PanAndZoomListener.Anchor;
//import com.ict.ict_timetable.PanAndZoomListenere.R;


import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class PanAndZoomListenerCse3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_pan_and_zoom_listener_cse3);
	
	
	
		FrameLayout.LayoutParams fp = new FrameLayout.LayoutParams (FrameLayout.LayoutParams.MATCH_PARENT, 
                FrameLayout.LayoutParams.MATCH_PARENT, 
                Gravity.TOP | Gravity.LEFT);
FrameLayout view = new FrameLayout (this);
setContentView (view);

ImageView imageView = new ImageView(this);
//Use line below for large images if you have hardware rendering turned on
//imageView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
// Line below is optional, depending on what scaling method you want
view.addView(imageView, fp);

imageView.setScaleType(ImageView.ScaleType.MATRIX);
view.setOnTouchListener(new PanAndZoomListener(view, imageView, Anchor.TOPLEFT));

imageView.setImageResource (R.drawable.cse3);

/*
FrameLayout container = (FrameLayout) findViewById (R.id.container);
container.addView (view, fp);
*/
/*
FrameLayout frame = (FrameLayout) findViewById (R.id.frame);
ImageView iv = (ImageView) findViewById (R.id.image);
if (iv != null) {
iv.setOnTouchListener(new PanAndZoomListener(frame, iv, Anchor.TOPLEFT));
}
*/
}}
