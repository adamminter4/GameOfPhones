package com.example.gameofphones;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuScreen extends Activity {


	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_screen);

		//Doublecheck XML to make sure this bitch gets a button. 
		 Button friendsButton = (Button)findViewById(R.id.button);
		 friendsButton.setOnClickListener(new OnClickListener() {
	         public void onClick(View v) {
	        	Intent friendsList = new Intent(MenuScreen.this, FriendsList.class);
	 			startActivity(friendsList);
	         }
	     });
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_menu_screen, menu);
		return true;
	}

}
