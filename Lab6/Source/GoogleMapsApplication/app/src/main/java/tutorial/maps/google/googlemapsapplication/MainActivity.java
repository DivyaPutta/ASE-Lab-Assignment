package tutorial.maps.google.googlemapsapplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity {
	private static final int TAKE_PHOTO_CODE = 1;
	ImageView imageView;
	// User name
	private EditText et_Username;
	// Password
	private EditText et_Fullname;
	private EditText et_Password;
	private EditText et_email;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
		et_Username = (EditText) findViewById(R.id.input_name);
		et_Password = (EditText) findViewById(R.id.input_password);
		et_email = (EditText) findViewById(R.id.input_email);
		et_Fullname = (EditText) findViewById(R.id.input_fullname);
		imageView = (ImageView) this.findViewById(R.id.imageView1);
		imageView.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {

				//Toast.makeText(MainActivity.this, "You clicked on ImageView", Toast.LENGTH_LONG).show();
				final Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				Uri imageUri = Uri.fromFile(getTempFile());

				intent.putExtra(MediaStore.EXTRA_OUTPUT,imageUri);
				intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);
				startActivityForResult(intent, TAKE_PHOTO_CODE);

				}
				});

		Button signupButton = (Button) this.findViewById(R.id.btn_signup);

		signupButton.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
				Intent redirect = new Intent(MainActivity.this, MapsActivity.class);
					startActivity(redirect);
					finish();
				}
				});
	}


	private File getTempFile() {
		// TODO Auto-generated method stub
		final File path = new File( Environment.getExternalStorageDirectory(), getApplicationContext().getPackageName() );
		System.out.println("path........... "+path);
		if(!path.exists()){
			path.mkdir();
		}
		return new File(path, "image.jpg");
	}
	protected void onDestroy(){
		super.onDestroy();
		finish();
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == RESULT_OK && requestCode == TAKE_PHOTO_CODE) {
			Toast.makeText(this, "Picture was  taken", Toast.LENGTH_SHORT).show();

			final File file = getTempFile();

			try {
				Bitmap captureBmp = Media.getBitmap(getContentResolver(), Uri.fromFile(file));
				imageView.setImageBitmap(captureBmp);
				//FileOutputStream fos = new FileOutputStream(file);
				//captureBmp.compress(Bitmap.CompressFormat.JPEG, 100, fos);
				//fos.flush();
				//fos.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		else if (resultCode == RESULT_CANCELED) {
			Toast.makeText(this, "Picture was not taken", Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(this, "Picture was not taken", Toast.LENGTH_SHORT).show();
		}      	 
	}
}
