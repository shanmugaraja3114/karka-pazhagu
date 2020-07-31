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

public class Stateboard_1 extends AppCompatActivity {

    String [] title={"Term-1-Maths","Term-1-English","Term-1-Tamil"};
    String [] description={"English Medium Maths Book","English Medium English Book","English Medium Tamil Book"};
    String [] link={"https://drive.google.com/file/d/1MZTXvmwk8FNyvjzZ52_xKO0KYDxBPDvM/view","https://drive.google.com/file/d/1fM1Bql6FYnETN2WhNsA_tr1Yk1ZJ-Gg4/view",
    "https://drive.google.com/file/d/11TDLUEf2jS28ACK6nLHRKt2cpTORFn1D/view"};

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stateboard_1);

        listView=(findViewById(R.id.listView_pdf1));
        CustomAdapter c=new CustomAdapter();
        listView.setAdapter(c);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1MZTXvmwk8FNyvjzZ52_xKO0KYDxBPDvM/view"));
                    startActivity(b);
                }
                if(position==1){
                    Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1fM1Bql6FYnETN2WhNsA_tr1Yk1ZJ-Gg4/view"));
                    startActivity(b);
                }
                if(position==2){
                    Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/11TDLUEf2jS28ACK6nLHRKt2cpTORFn1D/view"));
                    startActivity(b);
                }
            }
        });


    }

    class  CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return description.length;
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
            View v=getLayoutInflater().inflate(R.layout.adapter_pdf1,null);
            TextView t=v.findViewById(R.id.tv_name);
            TextView d=v.findViewById(R.id.description1);
            TextView l=v.findViewById(R.id.link1);
            t.setText(title[position]);
            d.setText(description[position]);
            l.setText(link[position]);
            return  v;
        }
    }
}