package com.ict.ict_timetable;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button b1,b2,b3;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b1 = (Button) findViewById(R.id.button1);   //go to offline content
		b2 = (Button) findViewById(R.id.button2);    // go to online content
		b3 = (Button) findViewById(R.id.button3);     // about us..
		
		
		
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,Offline.class);
				startActivity(i);
				
			}
		});
		
		
b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent j = new Intent(MainActivity.this,Online.class);
				startActivity(j);
					
			}
		});
		
		

b3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent k = new Intent(MainActivity.this,AboutUs.class);
		startActivity(k);
		
	}
});



		
	}
}
