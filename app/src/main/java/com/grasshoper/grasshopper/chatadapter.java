package com.grasshoper.grasshopper;

/**
 * Created by pradeeppj on 12/02/17.
 */

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class chatadapter extends ArrayAdapter<String> {

    Context context;


    ArrayList<chatFragment> dataset = new ArrayList<>();

    AssetManager assetManager = getContext().getAssets();
    int layoutResourceId;
    Typeface mytypeface;
    Typeface mytypeface1;
    Typeface mytypeface2;
    Typeface mytypeface3;
    Typeface mytypeface4;
    Typeface mytypeface5;
    Typeface mytypeface6;
    Typeface mytypeface7;




    chatadapter(Context context, String[] foods) {
        super(context,R.layout.feed_header1, foods);
    }



    public void setDataset(ArrayList<chatFragment> dataset){
        this.dataset = dataset ;
    }

    @Override
    public int getItemViewType(int position) {
        int i =0;
        return i;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        int type = getItemViewType(position);

        if (convertView == null) {

            switch (type) {

                case 0:

                    LayoutInflater inflater = LayoutInflater.from(getContext());
                    convertView = inflater.inflate(R.layout.chatheader, parent, false);

                    String userName = getItem(position);

                    mytypeface = Typeface.createFromAsset(assetManager, "Montserrat-Regular.ttf");
                    TextView usernametext = (TextView) convertView.findViewById(R.id.friendname);
                    usernametext.setTypeface(mytypeface);



                    Typeface mytypeface1 = Typeface.createFromAsset(assetManager, "Montserrat-Light.ttf");
                    TextView mytextview1 = (TextView) convertView.findViewById(R.id.chatline);
                    mytextview1.setTypeface(mytypeface1);

                    Typeface mytypeface2 = Typeface.createFromAsset(assetManager, "Montserrat-Light.ttf");
                    TextView mytextview2 = (TextView) convertView.findViewById(R.id.timenew);
                    mytextview2.setTypeface(mytypeface2);











                    break;

                case 1:

                    LayoutInflater inflater1 = LayoutInflater.from(getContext());
                    convertView = inflater1.inflate(R.layout.chatheader, parent, false);

                    String userName1 = getItem(position);




                    break;



                default:

                    break;


            }


        }

        return convertView;
    }
}
