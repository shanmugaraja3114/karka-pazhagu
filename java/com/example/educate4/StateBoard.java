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

public class StateBoard extends AppCompatActivity {

    String [] name={"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"};
    int [] myimages={R.drawable.f,R.drawable.s,R.drawable.t,R.drawable.fou,R.drawable.fiv,R.drawable.six,
            R.drawable.seve,R.drawable.eight,R.drawable.nine,R.drawable.ten,R.drawable.eleven,R.drawable.twelve};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_board);
        listView=(findViewById(R.id.listview1));
        CustomAdapter c=new CustomAdapter();
        listView.setAdapter(c);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(getApplicationContext(),Stateboard_1.class));
                }
                if(position==1){
                    startActivity(new Intent(getApplicationContext(),StateBoard_2.class));
                }
                if(position==2){
                    startActivity(new Intent(getApplicationContext(),StateBoard_3.class));
                }
                if(position==3){
                    startActivity(new Intent(getApplicationContext(),StateBoard_4.class));
                }
                if(position==4){
                    startActivity(new Intent(getApplicationContext(),StateBoard_5.class));
                }
                if(position==5){
                    startActivity(new Intent(getApplicationContext(),StateBoard_6.class));
                }
                if(position==6){
                    startActivity(new Intent(getApplicationContext(),StateBoard_7.class));
                }
                if(position==7){
                    startActivity(new Intent(getApplicationContext(),StateBoard_8.class));
                }
                if(position==8){
                    startActivity(new Intent(getApplicationContext(),StateBoard_9.class));
                }
                if(position==9){
                    startActivity(new Intent(getApplicationContext(),StateBoard_10.class));
                }
                if(position==10){
                    startActivity(new Intent(getApplicationContext(),StateBoard_11.class));
                }
                if(position==11){
                    startActivity(new Intent(getApplicationContext(),StateBoard_12.class));
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