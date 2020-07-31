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

public class Engg extends AppCompatActivity {

    String [] name={"CSE","IT","ECE","EEE","MECH","EIE","AE","CHEM","CIVIL","BIOMEDICAL","MINING","METALLURGICAL","AERO"};
    int [] myimages={R.drawable.cse,R.drawable.it,R.drawable.ece,R.drawable.eee,R.drawable.mech,R.drawable.eie,R.drawable.agri,R.drawable.chemical,
            R.drawable.civil,R.drawable.biomedical,R.drawable.mining,R.drawable.metallurgical,R.drawable.aerospace};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engg);
        listView=(findViewById(R.id.listview4));
        CustomAdapter c=new CustomAdapter();
        listView.setAdapter(c);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(getApplicationContext(),Cse.class));
                }
                if(position==1){
                    startActivity(new Intent(getApplicationContext(),It.class));
                }
                if(position==2){
                    startActivity(new Intent(getApplicationContext(),Ece.class));
                }
                if(position==3){
                    startActivity(new Intent(getApplicationContext(),Eee.class));
                }
                if(position==4){
                    startActivity(new Intent(getApplicationContext(),Mech.class));
                }
                if(position==5){
                    startActivity(new Intent(getApplicationContext(),Eie.class));
                }
                if(position==6){
                    startActivity(new Intent(getApplicationContext(),Ae.class));
                }
                if(position==7){
                    startActivity(new Intent(getApplicationContext(),Chem.class));
                }
                if(position==8){
                    startActivity(new Intent(getApplicationContext(),Civil.class));
                }
                if(position==9){
                    startActivity(new Intent(getApplicationContext(),Biomedical.class));
                }
                if(position==10){
                    startActivity(new Intent(getApplicationContext(),Mining.class));
                }
                if(position==11){
                    startActivity(new Intent(getApplicationContext(),Metallurgical.class));
                }
                if(position==12){
                    startActivity(new Intent(getApplicationContext(),Aero.class));
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