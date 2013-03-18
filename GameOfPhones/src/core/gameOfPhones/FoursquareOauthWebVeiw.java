package core.gameOfPhones;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class FoursquareOauthWebVeiw extends Activity {

	private static final String TAG = "FoursquareOauthWebVeiw";

	/**
	 * Get these values after registering your oauth app at:
	 * https://foursquare.com/oauth/
	 */
	public static final String CALLBACK_URL = "https://cgutshal.com";
	public static final String CLIENT_ID = "JQ40M5ZLDW5EW5TOWWL2OJT0DZV5GUFCGIEWKNHA13X4YEPR";

	
	@SuppressLint("SetJavaScriptEnabled")
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forusquare_oauth_web_veiw);

		String url = "https://foursquare.com/oauth2/authenticate"
				+ "?client_id=" + CLIENT_ID + "&response_type=token"
				+ "&redirect_uri=" + CALLBACK_URL;

		// If authentication works, we'll get redirected to a url with a pattern
		// like:
		//
		// http://YOUR_REGISTERED_REDIRECT_URI/#access_token=ACCESS_TOKEN
		//
		// We can override onPageStarted() in the web client and grab the token
		// out.
		WebView webview = (WebView) findViewById(R.id.webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.setWebViewClient(new WebViewClient() {
			public void onPageStarted(WebView view, String url, Bitmap favicon) {
				String fragment = "#access_token=";
				int start = url.indexOf(fragment);
				if (start > -1) {
					// You can use the accessToken for api calls now.
					String accessToken = url.substring(
							start + fragment.length(), url.length());

					Log.v(TAG, "OAuth complete, token: [" + accessToken + "].");

					Toast.makeText(FoursquareOauthWebVeiw.this,
							"Token: " + accessToken, Toast.LENGTH_SHORT).show();

				}
			}
		});
		webview.loadUrl(url);
		
		// Bad Process?
		
		// Generate User Profile

		Intent menuScreen = new Intent(this, MenuScreen.class);
		startActivity(menuScreen);
		}

}
