package com.example.educate4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class StateBoard_6 extends AppCompatActivity {

    String [] title={"Term-1-Science"};
    String [] description={"English Medium Maths Book"};
    String [] link={"https://drive.google.com/file/d/1AYGdDUST3r1rft3AN__yOxqpUMz84qP5/view"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_board_6);
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