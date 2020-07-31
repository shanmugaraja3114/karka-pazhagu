package com.example.educate4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Bsc extends AppCompatActivity {

    String [] name={"Biotechnology","Physics","Mathematics","Computer Science","Electronics","Economics"};
    int [] myimages={R.drawable.biotech,R.drawable.physic,
            R.drawable.mathematic,R.drawable.computr,R.drawable.electronic,R.drawable.economic};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc);

        listView=(findViewById(R.id.listview5));
        CustomAdapter c=new CustomAdapter();
        listView.setAdapter(c);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(getApplicationContext(), Bl.class));
                }
                if(position==1){
                    startActivity(new Intent(getApplicationContext(), Bl.class));
                }
                if(position==2){
                    startActivity(new Intent(getApplicationContext(), Bl.class));
                }
                if(position==3){
                    startActivity(new Intent(getApplicationContext(), Bl.class));
                }
                if(position==4){
                    startActivity(new Intent(getApplicationContext(), Bl.class));
                }

            }
        });
    }
    class  CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return myimages.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v=getLayoutInflater().inflate(R.layout.mylayout,null);
            ImageView ima=v.findViewById(R.id.imageview);
            TextView t=v.findViewById(R.id.textview);
            ima.setImageResource(myimages[position]);
            t.setText(name[position]);
            return  v;
        }
    }
}