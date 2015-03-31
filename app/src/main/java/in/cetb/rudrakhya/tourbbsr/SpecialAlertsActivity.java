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


public class SpecialAlertsActivity extends ActionBarActivity {

    static final String SANAME = "in.cetb.rudrakhya.tourbbsr.SpecilAlertsActivity.SANAME";
    public static final String SADESC = "in.cetb.rudrakhya.tourbbsr.SpecilAlertsActivity.SADESC";
    ListView lv;
    public ArrayList<String> saNameList;
    public ArrayList<String> saDescList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_alerts);

        lv = (ListView) findViewById(R.id.listView);
        saNameList = new ArrayList<String>();
        saDescList = new ArrayList<String>();

        getSAList();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, saNameList);

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SpecialAlertsActivity.this, SpecialAlertEventActivity.class);
                intent.putExtra(SANAME, saNameList.get(position));
                intent.putExtra(SADESC, saDescList.get(position));
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_special_alerts, menu);
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

    void getSAList() {
        saNameList.add("MTV Bollyland");
        saDescList.add("TIME: Sun Mar 29 2015 at 04:00 pm to Mon Mar 30 2015 at 12:00 am \n" +
                "\n" +
                "\n" +
                "VENUE: Janta Maidan, Bhubaneswar, India\n" +
                "\n" +
                "CREATED BY: Mohammad Anish \n" +
                "\n" +
                "This is one of the biggest event ever hapenning in Bhubneswar. Its an event where Bollywood will meet EDM . So people here is your chance to grab your passes for this event.\n" +
                "Online passes are available from BookMyShow.com.");
        saNameList.add("I AM BELOVED (A Day for Women)");
        saDescList.add("TIME: Sun Mar 29 2015 at 11:30 am \n" +
                "\n" +
                "\n" +
                "VENUE: Y.M.C.A., Behind Kalyan Mandap, Unit-8, Nayapalli, Bhubaneswar\n" +
                "\n" +
                "CREATED BY: Indian Church of Christ- Odisha \n" +
                "\n" +
                "\n" +
                "Celebrating a day dedicated to women. A beautiful yet a powerful creation of God.\n" +
                "God values you, cherishes you. The world may not understand you.\n" +
                "But, for God you are more than whatever the world uses to define you.\n" +
                "Join us to hear from His words & be inspired to get the picture God has drawn for you");
        saNameList.add("Parallel Universe");
        saDescList.add("TIME: Sat Sep 12 2015 at 03:00 pm to Sun Sep 13 2015 at 09:00 pm \n" +
                "\n" +
                "VENUE: Kiit Stadium, KIIT university, Bhubaneshwar, India\n" +
                "\n" +
                "CREATED BY: Parallel Universe Follow Promote this event\n" +
                "\n" +
                "\n" +
                "Can ROCK and EDM culture be together?\n" +
                "Well it can be at Parallel Universe .\n" +
                "\n" +
                "Theme - Music beyond boundaries.\n" +
                "\n" +
                "Stars coming down to Parallel Universe are as follows :\n" +
                "*Jal The Band* (Pakistan)\n" +
                "*Sunburn with DJ Shaan*\n" +
                "*Underground Authority*\n" +
                "*Few more DJs and Bands to be updated soon*\n" +
                "\n" +
                "Tickets - Rs 300\n" +
                "\n" +
                "Come and be part of this 2 day Fest at Parallel Universe.\n" +
                "\n" +
                "For Bookings keep following our official page.");
    }
}
