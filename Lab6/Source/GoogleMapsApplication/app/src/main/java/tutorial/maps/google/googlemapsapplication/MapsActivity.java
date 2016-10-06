package tutorial.maps.google.googlemapsapplication;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.widget.ImageView;

import java.io.File;
import java.lang.Object;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

	private GoogleMap mMap;
	public Geocoder geocoder;
	@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_maps);
			/* getActionBar().setTitle("Map location");*/
			SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map);
			mapFragment.getMapAsync(this);
		}

	@Override
		public void onMapReady(GoogleMap googleMap) {
			mMap = googleMap;
			geocoder = new Geocoder(this);
			StringBuilder userAddress = new StringBuilder();
			// Add a marker in Sydney and move the camera
			LocationManager userCurrentLocation = (LocationManager) this
				.getSystemService(Context.LOCATION_SERVICE);
			LocationListener userCurrentLocationListener = new LocationListener() {
				@Override
					public void onLocationChanged(Location location) {

					}

				@Override
					public void onStatusChanged(String provider, int status, Bundle extras) {

					}

				@Override
					public void onProviderEnabled(String provider) {

					}

				@Override
					public void onProviderDisabled(String provider) {

					}
			};
			LatLng userCurrentLocationCorodinates = null;
			double latitute = 0, longitude = 0;
			if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
					!= PackageManager.PERMISSION_GRANTED && ActivityCompat
					.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
					!= PackageManager.PERMISSION_GRANTED) {
				//show message or ask permissions from the user.
				return;
			}
			//Getting the current location of the user.
			userCurrentLocation.requestLocationUpdates(LocationManager.GPS_PROVIDER,
					0, 0, userCurrentLocationListener);
			latitute = userCurrentLocation
				.getLastKnownLocation(LocationManager.GPS_PROVIDER)
				.getLatitude();
			longitude = userCurrentLocation
				.getLastKnownLocation(LocationManager.GPS_PROVIDER)
				.getLongitude();
			userCurrentLocationCorodinates = new LatLng(latitute,longitude);
			//Getting the address of the user based on latitude and longitude.
			try {
				List<Address> addresses = geocoder.getFromLocation(latitute, longitude, 1);
				Address address = addresses.get(0);
				userAddress =  new StringBuilder();
				for (int i = 0; i < address.getMaxAddressLineIndex(); i++) {
					userAddress.append(address.getAddressLine(i)).append("\t");
				}
				userAddress.append(address.getCountryName()).append("\t");

			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			//Setting our image as the marker icon.
			//        mMap.addMarker(new MarkerOptions().position(userCurrentLocationCorodinates)
			//              .title("Your current address.").snippet(userAddress.toString())
			//     .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker_maps)));
		//	File path = new File( Environment.getExternalStorageDirectory()+"/"+getApplicationContext().getPackageName()+"/image"+".jpg" );
	String path = "/"+"storage"+"/"+"sdcard0"+"/"+"tutorial"+".maps"+".google"+".googlemapsapplication"+"/image"+".jpg";
	BitmapFactory.Options options = new BitmapFactory.Options();
			options.inJustDecodeBounds = true;
			BitmapFactory.decodeFile(path, options);
			int imageHeight = options.outHeight;
			int imageWidth = options.outWidth;
			String imageType = options.outMimeType;
			if(imageWidth > imageHeight) {
				options.inSampleSize = calculateInSampleSize(options,150,150);//if     landscape
			} else{
				options.inSampleSize = calculateInSampleSize(options,150,150);//if     portrait
			}
			options.inJustDecodeBounds = false;
		Bitmap	bitmap = BitmapFactory.decodeFile(path,options);

//			mMap.addMarker(new MarkerOptions().position(userCurrentLocationCorodinates)
//					.title("Your current address.").snippet(userAddress.toString())
//					.icon(BitmapDescriptorFactory.fromPath(Environment.getExternalStorageDirectory() + "/"+getApplicationContext().getPackageName()+"/image"+".jpg")));

 mMap.addMarker(new MarkerOptions().position(userCurrentLocationCorodinates)
                                        .title("Your current address.").snippet(userAddress.toString())
                                        .icon(BitmapDescriptorFactory.fromBitmap(bitmap)));
			//Setting the zoom level of the map.
			mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(userCurrentLocationCorodinates, 7));


		}

	public static int calculateInSampleSize(
			BitmapFactory.Options options, int reqWidth, int reqHeight) {
		// Raw height and width of image
		final int height = options.outHeight;
		final int width = options.outWidth;
		int inSampleSize = 1;

		if (height > reqHeight || width > reqWidth) {

			// Calculate ratios of height and width to requested height and     width
			final int heightRatio = Math.round((float) height / (float)     reqHeight);
			final int widthRatio = Math.round((float) width / (float) reqWidth);

			// Choose the smallest ratio as inSampleSize value, this will     guarantee
			// a final image with both dimensions larger than or equal to the
			// requested height and width.
			inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
		}

		return inSampleSize;
	}
}
