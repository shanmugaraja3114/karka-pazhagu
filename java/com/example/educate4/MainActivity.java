package com.example.educate4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String [] name={"State Board","CBSE","ICSE","Engineering","BSC","MBBS","BL","CA","B.com","BBA"};
    int [] myimages={R.drawable.stateboard1,R.drawable.cbse1,R.drawable.icse1,R.drawable.engineering,R.drawable.bsc1,R.drawable.mbbs1,R.drawable.bl1,R.drawable.ca1,
    R.drawable.bcom1,R.drawable.bba1};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView=(findViewById(R.id.listview));
        CustomAdapter c=new CustomAdapter();
        listView.setAdapter(c);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(getApplicationContext(), StateBoard.class));

                }
                if(position==1){
                    startActivity(new Intent(getApplicationContext(), Cbse.class));

                }
                if(position==2){
                    startActivity(new Intent(getApplicationContext(), Icse.class));

                }
                if(position==3){
                    startActivity(new Intent(getApplicationContext(), Engg.class));

                }
                if(position==4){
                    startActivity(new Intent(getApplicationContext(), Bsc.class));

                }
                if(position==5){
                    startActivity(new Intent(getApplicationContext(), Mbbs.class));

                }
                if(position==6){
                    startActivity(new Intent(getApplicationContext(), Bl.class));

                }
                if(position==7){
                    startActivity(new Intent(getApplicationContext(), Ca.class));

                }if(position==8){
                    startActivity(new Intent(getApplicationContext(), Bcom.class));

                }
                if(position==9){
                    startActivity(new Intent(getApplicationContext(), Bba.class));

                }

            }
        });




        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), popup_Activity.class));
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.logout) {

            Toast.makeText(MainActivity.this, "Logged out Successfully", Toast.LENGTH_SHORT).show();
            FirebaseAuth.getInstance().signOut();//logout
            startActivity(new Intent(getApplicationContext(),Login.class));
            finish();

        }
        if(id==R.id.chatbot){
            Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web-chat.global.assistant.watson.cloud.ibm.com/preview.html?region=eu-gb&integrationID=6fca1f90-dcf7-4da0-ab01-cee80554056e&serviceInstanceID=faf5e2da-0250-446a-8ac6-31e40d6d49a6"));
            startActivity(b);
        }

        return super.onOptionsItemSelected(item);
    }


}