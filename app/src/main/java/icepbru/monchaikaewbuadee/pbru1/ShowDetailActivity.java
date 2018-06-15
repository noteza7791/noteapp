package icepbru.monchaikaewbuadee.pbru1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetailActivity extends AppCompatActivity {

    //Explicit
    private TextView showTitleTextView;
    private ImageView showImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        //Bind Widget
        bindWidget();

        //Show Widget
        showWidget();


    }//Main method

    private void showWidget() {

        //Receive from Inten
        int intClick = getIntent().getIntExtra("click", 0);
        //ShowTitle
        MyData objMyData = new MyData();
        String[] strTitle = objMyData.name();
        showTitleTextView.setText(strTitle[intClick]);


        //show Image
        int[] intImage = objMyData.icon();
        showImageView.setImageResource(intImage[intClick]);





    }//showWidget

    private void bindWidget() {
        showTitleTextView = findViewById(R.id.textView5);
        showImageView = findViewById(R.id.imageView3);

    }//bind Widget
}
