package in.cetb.rudrakhya.tourbbsr;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class TourismPlaceActivity extends ActionBarActivity {

    String  placeName;
    String placeDesc;
    String placeLoc;
    Integer placeIMG;
    TextView tvName, tvDesc, tvLoc;
    ImageView ivIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism_place);

        Intent intent = getIntent();
        placeName = intent.getStringExtra(TourismActivity.TPNAME);
        placeDesc = intent.getStringExtra(TourismActivity.TPDESC);
        placeLoc = intent.getStringExtra(TourismActivity.TPLOC);
        placeIMG = intent.getIntExtra(TourismActivity.TPIMG, 0);

        tvName = (TextView) findViewById(R.id.textViewname);
        tvDesc = (TextView) findViewById(R.id.textViewdesc);
        tvLoc = (TextView) findViewById(R.id.textViewloc);
        ivIMG = (ImageView) findViewById(R.id.imageView);

        tvName.setText(placeName);
        tvDesc.setText(placeDesc);
        tvLoc.setText(placeLoc);
        ivIMG.setBackgroundResource(placeIMG);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tourism_place, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
