package org.rohan.com.svg;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.ahmadrosid.svgloader.SvgLoader;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    ImageView smapler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smapler = (ImageView) findViewById(R.id.sample);
        SvgLoader.pluck()
                .with(this)
                .setPlaceHolder(R.mipmap.ic_launcher, R.mipmap.ic_launcher)
                .load("https://firebasestorage.googleapis.com/v0/b/ferme-6721b.appspot.com/o/Category%2Fa1.svg?alt=media&token=5b8e6a7d-9112-4091-aab1-9efa43018501", smapler);
   //     HttpImageRequestTask httpImageRequestTask=new HttpImageRequestTask();
  //      httpImageRequestTask.execute();


    }

/*    private  class HttpImageRequestTask extends AsyncTask<Void, Void, Drawable> {
        @Override
        protected Drawable doInBackground(Void... params) {
            try {


                final URL url = new URL("https://firebasestorage.googleapis.com/v0/b/ferme-6721b.appspot.com/o/Category%2Fa1.svg?alt=media&token=5b8e6a7d-9112-4091-aab1-9efa43018501");
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = urlConnection.getInputStream();
                SVG svg = SVGParser. getSVGFromInputStream(inputStream);
                Drawable drawable = svg.createPictureDrawable();
                return drawable;
            } catch (Exception e) {
                Log.e("MainActivity", e.getMessage(), e);
            }

            return null;
        }

        @Override
        protected void onPostExecute(Drawable drawable) {
            // Update the view
            updateImageView(drawable);
        }
    }

    @SuppressLint("NewApi")
    private void updateImageView(Drawable drawable){
        if(drawable != null){

            // Try using your library and adding this layer type before switching your SVG parsing
            smapler.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
            smapler.setImageDrawable(drawable);
        }
    }
    */

}
