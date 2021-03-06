package epson.rukpanich.pornpan.epsontraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ETHRPornpan on 16/10/2558.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private int[] iconInts;
    private String[] title1Strings, title2Strings;

    public MyAdapter(Context objContext, int[] iconInts, String[] title1Strings, String[] title2Strings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.title1Strings = title1Strings;
        this.title2Strings = title2Strings;
    }

    @Override
    public int getCount() {
        return title1Strings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.test, viewGroup, false);

        //setuo For Icon
       ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);

        //Setup for title1

        TextView title1TextView = (TextView) objView1.findViewById(R.id.txtTitle1);
        title1TextView.setText(title1Strings[i]);

        //setup for title2
        TextView title2TextView = (TextView) objView1.findViewById(R.id.txtTitle2);
        title2TextView.setText(title2Strings[i]);

        return objView1;
    }
}//main class
