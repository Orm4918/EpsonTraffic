package epson.rukpanich.pornpan.epsontraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private ListView trafficListView;
    private Button aboutmeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();
        //button controlller
        buttoncontroller();


    }   // Main Method

    private void buttoncontroller() {
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sound effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.lion);
                buttonMediaPlayer.start();

                //Intent to Webview
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/rWgstovKOuE"));
                startActivity(objIntent);
            }  //event
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmeButton = (Button) findViewById(R.id.button);
    }
} // Main Class คลาสหลัก
