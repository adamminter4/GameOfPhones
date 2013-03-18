package core.gameOfPhones;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class DisplayFriends extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_friends);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_friends, menu);
		return true;
	}

}
