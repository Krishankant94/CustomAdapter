package example.foundation.krishan.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] titles = {"Android", "IOS", "Windows"};
    String[] descriptions = {"Android is open source", "ios by Apple", "windows by microsoft"};
    int[] images = {R.drawable.android, R.drawable.ios, R.drawable.windows};
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        myAdapter = new MyAdapter(this,titles,descriptions,images);
        listView.setAdapter(myAdapter);
    }
}
