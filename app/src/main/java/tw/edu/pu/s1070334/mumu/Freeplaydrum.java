package tw.edu.pu.s1070334.mumu;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Freeplaydrum extends AppCompatActivity {
    static MediaPlayer jazz_bigdrum, jazz_smalldrum, jazz_tondrum, jazz_falldrum, jazz_footcymbals, jazz_cymbals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freeplaydrum);

        ImageView backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jazz_bigdrum.release();
                jazz_smalldrum.release();
                jazz_tondrum.release();
                jazz_falldrum.release();
                jazz_footcymbals.release();
                jazz_cymbals.release();
                finish();
            }
        });
        createDrumList();
        Button bigdrum = findViewById(R.id.bigdrum);
        bigdrum.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                jazz_bigdrum.start();
            }
        });

        Button smalldrum = findViewById(R.id.smalldrum);
        smalldrum.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                jazz_smalldrum.start();
            }
        });

        Button tondrum = findViewById(R.id.tondrum);
        tondrum.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                jazz_tondrum.start();
            }
        });

        Button falldrum = findViewById(R.id.falldrum);
        falldrum.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                jazz_falldrum.start();
            }
        });

        Button footcymbals = findViewById(R.id.footcymbals);
        footcymbals.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                jazz_footcymbals.start();
            }
        });

        Button cymbals = findViewById(R.id.cymbals);
        cymbals.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                jazz_cymbals.start();
            }
        });
    }

    public void createDrumList() {
        jazz_bigdrum = MediaPlayer.create(this, R.raw.jazz_bigdrum);
        jazz_smalldrum = MediaPlayer.create(this, R.raw.jazz_smalldrum);
        jazz_tondrum = MediaPlayer.create(this, R.raw.jazz_tondrum);
        jazz_falldrum = MediaPlayer.create(this, R.raw.jazz_falldrum);
        jazz_footcymbals = MediaPlayer.create(this, R.raw.jazz_footcymbals);
        jazz_cymbals = MediaPlayer.create(this, R.raw.jazz_cymbals);
    }
}
