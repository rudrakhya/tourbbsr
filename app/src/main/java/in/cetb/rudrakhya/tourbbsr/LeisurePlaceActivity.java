package in.cetb.rudrakhya.tourbbsr;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class LeisurePlaceActivity extends ActionBarActivity {

    String  placeName;
    String placeLoc;
    Integer placeIMG;
    TextView tvName, tvLoc;
    ImageView ivIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leisure_place);

        Intent intent = getIntent();
        placeName = intent.getStringExtra(LeisureActivity.LENAME);
        placeLoc = intent.getStringExtra(LeisureActivity.LELOC);
        placeIMG = intent.getIntExtra(LeisureActivity.LEIMG, 0);

        tvName = (TextView) findViewById(R.id.textViewname);
        tvLoc = (TextView) findViewById(R.id.textViewloc);
        ivIMG = (ImageView) findViewById(R.id.imageView);

        tvName.setText(placeName);
        tvLoc.setText("Open in Maps");
        ivIMG.setBackgroundResource(placeIMG);

        tvLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(placeLoc));
                startActivity(mapIntent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_leisure_place, menu);
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
