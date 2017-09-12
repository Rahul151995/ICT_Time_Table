package com.ict.ict_timetable;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Online extends Activity {
Button a1,a2,a3,a4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_online);

	
	
	
		a1 = (Button) findViewById(R.id.button1);  //3rd year
		a2 = (Button) findViewById(R.id.button2);  // 4th year
		a3 = (Button) findViewById(R.id.button3);   // 3rd year ec
		a4 = (Button) findViewById(R.id.button4); //2nd year
		
		
		
		a1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(Online.this,OnlineCse3Download.class);
			startActivity(x);
			
			}
		});
	
		
		
		a2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent x = new Intent(Online.this,OnlineCse4Download.class);
				startActivity(x);
				
				
			}
		});
	
		
a3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(Online.this,OnlineEc3Download.class);
				startActivity(x);
				
				
			}
		});
		
	
		
a4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	Intent x = new Intent(Online.this,OnlineCse2Download.class);
startActivity(x);
		
	}
});	
		
		
		
		
	}}

