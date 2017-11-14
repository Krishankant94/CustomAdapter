package example.foundation.krishan.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by krishan on 11/14/2017.
 */

public class MyAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] titles;
    private final String[] descriptions;
    private final int[] images;

    TextView tv_title,tv_description;
    ImageView imageView;
    public MyAdapter(Context context, String[] titles,String[] descriptions,int[] images) {
        super(context, R.layout.row_layout, titles);
        this.context = context;
        this.titles = titles;
        this.descriptions = descriptions;
        this.images = images;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row_view = inflater.inflate(R.layout.row_layout,parent,false);

        tv_title = (TextView)row_view.findViewById(R.id.textview1);
        tv_description = (TextView)row_view.findViewById(R.id.textview2);
        imageView =(ImageView)row_view.findViewById(R.id.imageView);

        tv_title.setText(titles[position]);
        tv_description.setText(descriptions[position]);
        imageView.setImageResource(images[position]);
        return row_view;
    }
}
