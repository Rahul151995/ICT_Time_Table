package com.ict.ict_timetable;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Offline extends Activity {

	Button a1,a2,a3,a4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_offline);
		a1 = (Button) findViewById(R.id.button1);  //3rd year
		a2 = (Button) findViewById(R.id.button2);  // 4th year
		a3 = (Button) findViewById(R.id.button3);   // 3rd year ec
		a4 = (Button) findViewById(R.id.button4); //2nd year
		
		
		
		a1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(Offline.this,PanAndZoomListenerCse3.class);
			startActivity(x);
			
			}
		});
	
		
		
		a2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(Offline.this,PanAndZoomListenerActivityCse4.class);
	startActivity(x);
				
			}
		});
	
		
a3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(Offline.this,PanAndZoomListenerActivityEc4.class);
	startActivity(x);
				
			}
		});
		
	
		
a4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent x = new Intent(Offline.this,PanAndZoomListenerActivitycse2.class);
startActivity(x);
		
	}
});	
		
		
		
		
	}}
