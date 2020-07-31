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

public class Icse extends AppCompatActivity {

    String [] name={"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"};
    int [] myimages={R.drawable.first2,R.drawable.second2,R.drawable.third2,R.drawable.four2,R.drawable.five2,R.drawable.six2,
            R.drawable.seven2,R.drawable.eight2,R.drawable.nine2,R.drawable.ten2,R.drawable.eleven2,R.drawable.twelve2};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icse);
        listView=(findViewById(R.id.listview3));
        CustomAdapter c=new CustomAdapter();
        listView.setAdapter(c);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(getApplicationContext(),Icse_1.class));
                }
                if(position==1){
                    startActivity(new Intent(getApplicationContext(),Icse_2.class));
                }
                if(position==2){
                    startActivity(new Intent(getApplicationContext(),Icse_3.class));
                }
                if(position==3){
                    startActivity(new Intent(getApplicationContext(),Icse_4.class));
                }
                if(position==4){
                    startActivity(new Intent(getApplicationContext(),Icse_5.class));
                }
                if(position==5){
                    startActivity(new Intent(getApplicationContext(),Icse_6.class));
                }
                if(position==6){
                    startActivity(new Intent(getApplicationContext(),Icse_7.class));
                }
                if(position==7){
                    startActivity(new Intent(getApplicationContext(),Icse_8.class));
                }
                if(position==8){
                    startActivity(new Intent(getApplicationContext(),Icse_9.class));
                }
                if(position==9){
                    startActivity(new Intent(getApplicationContext(),Icse_10.class));
                }
                if(position==10){
                    startActivity(new Intent(getApplicationContext(),Icse_11.class));
                }
                if(position==11){
                    startActivity(new Intent(getApplicationContext(),Icse_12.class));
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