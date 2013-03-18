package core.gameOfPhones;

import core.gameOfPhones.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class StartScreen extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_screen);
		
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_start_screen, menu);
		return true;
	}

	public void switchToMenuScreen(View veiw){
	//Code to switch to other screen
		Intent loginScreen = new Intent(this, LoginToFoursquare.class);
		startActivity(loginScreen);
	}
	
}
