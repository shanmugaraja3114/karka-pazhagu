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

public class StateBoard_11 extends AppCompatActivity {

    String [] title={"Commerce"};
    String [] description={"English Medium Commerce Book"};
    String [] link={"https://drive.google.com/open?id=1suwHNMck1Io3stkH8pXMO1ey5_0ljnoR"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_board_11);
        listView=(findViewById(R.id.listView_pdf1));
        CustomAdapter c=new CustomAdapter();
        listView.setAdapter(c);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1suwHNMck1Io3stkH8pXMO1ey5_0ljnoR"));
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