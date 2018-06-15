package icepbru.monchaikaewbuadee.pbru1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //Create ListView
        creatListView();




    }//Main Method

    private void creatListView() {
        MyData objMyData = new MyData();
        int[] intIcon = objMyData.icon();
        String[] strName = objMyData.name();
        String[] strDetail = objMyData.detail();


        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this,intIcon,strName,strDetail);
        ListView myListView = (ListView) findViewById(R.id.listview1);
        myListView.setAdapter(objMyAdapter);

        //Active When Click ListView
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                myIntenToDetail(i);
            }
        });


    }//createListView

    private void myIntenToDetail(int intClick) {

        Intent objIntent = new Intent(MainActivity.this, ShowDetailActivity.class);
        objIntent.putExtra("click", intClick);
        startActivity(objIntent);


    }


    public void clickAboutMe(View view) {
        Intent objIntent = new Intent(Intent.ACTION_VIEW);
        objIntent.setData(Uri.parse("https://www.facebook.com/Ribbon.notez"));
        startActivity(objIntent);

    }// Click





}
