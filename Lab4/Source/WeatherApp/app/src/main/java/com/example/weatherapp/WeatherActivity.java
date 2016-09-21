package com.example.weatherapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.weatherapp.R;

public class WeatherActivity extends AppCompatActivity {

	Button logout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weather);
		logout = (Button) findViewById(R.id.bt_Logout);
		logout.setOnClickListener(new OnClickListener() {


			public void onClick(View view) {
				Intent intent = new Intent(WeatherActivity.this,MainActivity.class);
			//	intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
				startActivity(intent);
				finish();
			}
		});
	    if (savedInstanceState == null) {
	        getSupportFragmentManager().beginTransaction()
	                .add(R.id.container, new WeatherFragment())
	                .commit();
	    }


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.weather, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		/*int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);*/
	    if(item.getItemId() == R.id.change_city){
	        showInputDialog();

	    }
	    return false;

	}


	private void showInputDialog(){
	    AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    builder.setTitle("Edit city");
	    final EditText input = new EditText(this);
	    input.setInputType(InputType.TYPE_CLASS_TEXT);
	    builder.setView(input);
	    builder.setPositiveButton("Go", new DialogInterface.OnClickListener() {
	        @Override
	        public void onClick(DialogInterface dialog, int which) {
	            changeCity(input.getText().toString());
	        }
	    });
	    builder.show();
	}

	public void changeCity(String city){
	    WeatherFragment wf = (WeatherFragment)getSupportFragmentManager()
	                            .findFragmentById(R.id.container);
	    wf.changeCity(city);
	    new CityPreference(this).setCity(city);
	}
	
}
