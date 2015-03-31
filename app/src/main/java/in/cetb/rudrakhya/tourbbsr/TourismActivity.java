package in.cetb.rudrakhya.tourbbsr;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class TourismActivity extends ActionBarActivity {

    static final String TPNAME = "in.cetb.rudrakhya.tourbbsr.TourismActivity.TPNAME";
    public static final String TPDESC = "in.cetb.rudrakhya.tourbbsr.TourismActivity.TPDESC";
    public static final String TPLOC = "in.cetb.rudrakhya.tourbbsr.TourismActivity.TPLOC";
    public static final String TPIMG = "in.cetb.rudrakhya.tourbbsr.TourismActivity.TPIMG";
    ListView lv;
    public ArrayList<String> placeNameList;
    public ArrayList<String> placeDescList;
    public ArrayList<String> placeLocList;
    public ArrayList<Integer> placeIMGList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism);

        lv = (ListView) findViewById(R.id.listView);
        placeNameList = new ArrayList<String>();
        placeDescList = new ArrayList<String>();
        placeLocList = new ArrayList<String>();
        placeIMGList = new ArrayList<Integer>();

        getPlacesList();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, placeNameList);

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(TourismActivity.this, TourismPlaceActivity.class);
                intent.putExtra(TPNAME, placeNameList.get(position));
                intent.putExtra(TPDESC, placeDescList.get(position));
                intent.putExtra(TPLOC, placeLocList.get(position));
                intent.putExtra(TPIMG, placeIMGList.get(position));
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tourism, menu);
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
        placeNameList.add("Nandankan");
        placeIMGList.add(R.drawable.nandankanan);
        placeLocList.add("https://goo.gl/maps/FKZow");
        placeDescList.add("The Nandankanan Zoological Park is located in Bhubaneswar, Orissa surrounded by the natural beauty of the forest and near to the Kanjia Lake. Mythologically, The zoo is home to over 67 kinds of mammals, 18 varieties of reptiles and 81 species of birds that co-exist in the deeply forested boundaries. For gharial crocodiles, a captive breeding centre is also located within the zoo.\n" +
                "\n" +
                "White tiger breeding also takes place at the zoo. Asiatic lions, Indian crocodiles,    Nilgirilangurs   and countless birds, reptiles and fish are also housed within the zoo. In the zoo are also housed");

        placeNameList.add("Sikharchandi temple");
        placeIMGList.add(R.drawable.sikharchandi);
        placeLocList.add("https://goo.gl/maps/Ywspn");
        placeDescList.add("The hill near Chandaka Industrial Estate, famous for its deity Sikharchandi, with lots of granary this place is a good place for tourist. Sikharchandi hills is a major tourism and recreational hub.\n" +
                "At least visit Sikharchandi once to enjoy the beauties &scenery of nature. It’s good to have a tour with family as picnic or holiday trip.");

        placeNameList.add("Deras Dam");
        placeIMGList.add(R.drawable.deras);
        placeLocList.add("https://goo.gl/maps/PK40E\n");
        placeDescList.add("The picturesque view of this natural place catches the attention of the visitors. River is surrounded with evergreen rain forest and hills. Main highlight of the area is the dam, bamboo house, a small temple& lots of wild animals. Sprawling green surrounding offers fresh environment to the travellers. This is the best spot for picnic with family as well as romantic place for the couples to spend some time.  The attractive feature of deras dam is the bamboo houses. A night in the Jungle--great idea. You have cosy rooms(two in number) in the watch towers where you can spend your night. A few hundred bucks to the Forest Department-Room booking, and the night and the jungle is all yours. More experience to come after we spend a night out in those watch towers.");

        placeNameList.add("Kedargouri Temple");
        placeIMGList.add(R.drawable.kedargouri);
        placeLocList.add("https://goo.gl/maps/w47xk\n");
        placeDescList.add(" one of the eight Astasambhu Temples, is near the Mukteswar Temple, in Bhubaneswar, Orissa. The presiding deity is Lord Shiva, referred to locally by the name ‘Kedareshwar’. It is in the precinct of Kedara-Gouri on the right side of the road leading to Puri from Bhubaneswar and at a distance of 40 metres south of Muktesvara. It is one of the ten monuments within the precinct. It is the main temple of the complex. The temple is facing south and the enshrined deity is a circular yonipitha made of sandstone. The linga at the centre is missing. The sanctum is 2.5 square meters which is 0.8 meters below the present ground. It stands near the yard of the Mukteswar Temple.");

        placeNameList.add("Dhauli");
        placeIMGList.add(R.drawable.dhauli);
        placeLocList.add("https://goo.gl/maps/V6IH2\n");
        placeDescList.add("Dhauli hills are located on the banks of the river Daya, 8 km south of Bhubaneswar in Odisha (India). It is a hill with vast open space adjoining it, and has major Edicts of Ashoka engraved on a mass of rock, by the side of the road leading to the summit of the hill. Dhauli hill is presumed to be the area where the Kalinga War was fought. ");

        placeNameList.add("Lingaraj temple");
        placeIMGList.add(R.drawable.lingaraj);
        placeLocList.add("https://goo.gl/maps/MQOrM\n");
        placeDescList.add("The temple is dedicated to Lord Shiva, also known as ‘Lingaraj’. It is adorned with beautiful sculptures, which have been carved on the spire. Lingaraja temple is approximately 54.8 metres high and enshrines a huge statue of Lord Shiva, made up of granite. The idol is 8 feet in diameter and is placed on a platform that is about 8 inches above ground. The deity is bathed everyday with water, milk and bhang (marijuana).");
    }
}

