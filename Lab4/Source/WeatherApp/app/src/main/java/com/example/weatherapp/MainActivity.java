package com.example.weatherapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.weatherapp.R;

public class MainActivity extends Activity {
	// User name
    private EditText et_Username;
    // Password
    private EditText et_Password;
    // Sign In
    private Button bt_SignIn;
    // Message
    private TextView tv_Message;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Initialization
        et_Username = (EditText) findViewById(R.id.et_Username);
        et_Password = (EditText) findViewById(R.id.et_Password);
        bt_SignIn = (Button) findViewById(R.id.bt_SignIn);
        tv_Message = (TextView) findViewById(R.id.tv_Message);
       
        bt_SignIn.setOnClickListener(new OnClickListener() {
           
          
            public void onClick(View view) {
                // Stores User name
                String username = String.valueOf(et_Username.getText());
                // Stores Password
                String password = String.valueOf(et_Password.getText());
               
                // Validates the User name and Password for admin, admin
                if (username.equals("divya") && password.equals("divya")) {
                    tv_Message.setText("Login Successful!");
                    Intent intent = new Intent(MainActivity.this,WeatherActivity.class);
                   // intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        			startActivity(intent);
				finish();
                } else {
                    tv_Message.setText("Wrong credentials!");
                }
            }
        });
    }
	protected void onDestroy(){
        super.onDestroy();
        finish();
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
