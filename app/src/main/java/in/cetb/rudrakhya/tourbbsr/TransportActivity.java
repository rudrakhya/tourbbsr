package in.cetb.rudrakhya.tourbbsr;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class TransportActivity extends ActionBarActivity {
    
    ListView lv1;
    ListView lv2;
    public ArrayList<String> autoNameList;
    public ArrayList<String> autoNumList;
    public ArrayList<String> cabNameList;
    public ArrayList<String> cabNumList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        lv1 = (ListView) findViewById(R.id.listView1);
        lv2 = (ListView) findViewById(R.id.listView2);
        autoNameList = new ArrayList<String>();
        autoNumList = new ArrayList<String>();
        cabNameList = new ArrayList<String>();
        cabNumList = new ArrayList<String>();

        getAutoList();
        getCabList();

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, autoNameList);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cabNameList);

        lv1.setAdapter(arrayAdapter1);
        lv2.setAdapter(arrayAdapter2);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(autoNumList.get(position)));
                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(callIntent);
            }
        });

        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(cabNumList.get(position)));
                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(callIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_transport, menu);
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

    void getAutoList() {
        autoNameList.add("Dilu Lenka");
        autoNameList.add("Ashis Routray");
        autoNameList.add("Basua Behera");
        autoNameList.add("Bata  Mohapatra");
        autoNumList.add("tel:8093762187");
        autoNumList.add("tel:9778558364");
        autoNumList.add("tel:9861287820");
        autoNumList.add("tel:9337304518");
    }

    void getCabList() {
        cabNameList.add("Ola Cabs");
        cabNameList.add("Meru Cabs");
        cabNameList.add("Dail a taxi");
        cabNameList.add("Ori cabs");
        cabNameList.add("Savari");
        cabNumList.add("tel:06743355335");
        cabNumList.add("tel:06743399339");
        cabNumList.add("tel:9776697766");
        cabNumList.add("tel:9583838383");
        cabNumList.add("tel:09045450000");
    }
}
