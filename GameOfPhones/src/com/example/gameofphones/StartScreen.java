package com.example.gameofphones;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.LinearLayout;

public class StartScreen extends Activity {


	Button startButton;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_screen);
		
		 LinearLayout backgroundImage = new LinearLayout(this);
		 //R.drawable.startScreenBackgroundImage should be the setBackGroundResourceValue 
		 backgroundImage.setBackgroundResource(0);
		 this.setContentView(backgroundImage);

	//Need Button Function
		 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_start_screen, menu);
		return true;
	}

}
