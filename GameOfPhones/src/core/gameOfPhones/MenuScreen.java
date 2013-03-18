package core.gameOfPhones;



import core.gameOfPhones.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuScreen extends Activity {


	private Button closeButton;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_screen);
		friendsButton();
	
	}

	private void friendsButton() {
		this.closeButton = (Button)this.findViewById(R.id.friends);
		  this.closeButton.setOnClickListener(new OnClickListener() {
			    @Override
			    public void onClick(View v) {
			    	Intent display = new Intent(MenuScreen.this, DisplayFriends.class);
					startActivity(display);
			    }
			  });
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_menu_screen, menu);
		return true;
	}

}
