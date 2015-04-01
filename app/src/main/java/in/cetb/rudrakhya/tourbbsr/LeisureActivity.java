package in.cetb.rudrakhya.tourbbsr;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class LeisureActivity extends ActionBarActivity {

    static final String LENAME = "in.cetb.rudrakhya.tourbbsr.LeisureActivity.LENAME";
    public static final String LELOC = "in.cetb.rudrakhya.tourbbsr.LeisureActivity.LELOC";
    public static final String LEIMG = "in.cetb.rudrakhya.tourbbsr.LeisureActivity.LEIMG";
    ListView lv;
    public ArrayList<String> placeNameList;
    public ArrayList<String> placeLocList;
    public ArrayList<Integer> placeIMGList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leisure);

        lv = (ListView) findViewById(R.id.listView);
        placeNameList = new ArrayList<String>();
        placeLocList = new ArrayList<String>();
        placeIMGList = new ArrayList<Integer>();

        getPlacesList();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, placeNameList);

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(LeisureActivity.this, LeisurePlaceActivity.class);
                intent.putExtra(LENAME, placeNameList.get(position));
                intent.putExtra(LELOC, placeLocList.get(position));
                intent.putExtra(LEIMG, placeIMGList.get(position));
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_leisure, menu);
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

    void getPlacesList() {
        placeNameList.add("Buddha Jayanti Park");
        placeLocList.add("http://goo.gl/maps/G9tEc");
        placeIMGList.add(R.drawable.budhajayantipark);

        placeNameList.add("Indira Gandhi Park");
        placeLocList.add("http://goo.gl/maps/A2EUx");
        placeIMGList.add(R.drawable.indiragandhipark);

        placeNameList.add("Ekamra Kanan Park");
        placeLocList.add("http://goo.gl/maps/B4Dl2");
        placeIMGList.add(R.drawable.ekamrakanan);

        placeNameList.add("Forest Park");
        placeLocList.add("http://goo.gl/maps/ekOxS");
        placeIMGList.add(R.drawable.bijupattnaikforestpark);

        placeNameList.add("Mahatma Gandhi Park");
        placeLocList.add("http://goo.gl/maps/Mlmxa");
        placeIMGList.add(R.drawable.mahatmagandhipark);


        placeNameList.add(" Market buillding");
        placeLocList.add("http://goo.gl/maps/xtMJc");
        placeIMGList.add(R.drawable.marketbuilding);

        placeNameList.add("Pal heights");
        placeLocList.add("http://goo.gl/maps/7z4nx");
        placeIMGList.add(R.drawable.palheights);

        placeNameList.add("Pantaloons");
        placeLocList.add("http://goo.gl/maps/pwbaz");
        placeIMGList.add(R.drawable.pantaloons);

        placeNameList.add("Forum Mart");
        placeLocList.add("http://goo.gl/maps/UdMk8");
        placeIMGList.add(R.drawable.forummart_);

        placeNameList.add("Bhawani Mall");
        placeLocList.add("http://goo.gl/maps/i0WfI");
        placeIMGList.add(R.drawable.bhabanimall);

        placeNameList.add("Maharaja Talkies");
        placeLocList.add("http://goo.gl/maps/YEKbi");
        placeIMGList.add(R.drawable.maharaja);

        placeNameList.add("INOX");
        placeLocList.add("http://goo.gl/maps/KZSaj");
        placeIMGList.add(R.drawable.inox);


        placeNameList.add("Keshari Talkies");
        placeLocList.add("http://goo.gl/maps/3B0cj\n");
        placeIMGList.add(R.drawable.keshari);

        placeNameList.add("Shriya Talkies");
        placeLocList.add("http://goo.gl/maps/ZlsM4\n");
        placeIMGList.add(R.drawable.sriya);

        placeNameList.add("Ekamra talkies");
        placeLocList.add("http://goo.gl/maps/VyQn5");
        placeIMGList.add(R.drawable.ekamra);
    }
}
