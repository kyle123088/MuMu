package tw.edu.pu.s1070334.mumu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Instruments extends AppCompatActivity {
    static MediaPlayer mper, learning_mode;
    static String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruments);

        learning_mode = MediaPlayer.create(this, R.raw.learning_mode);
        learning_mode.start();

        mper = MediaPlayer.create(this, R.raw.pick);
        mper.start();

        Button violinbtn = findViewById(R.id.violinbtn);
        violinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "violin";
                Intent it = new Intent();
                it.setClass(Instruments.this, Instrumentsintroduce.class);
                startActivity(it);
            }
        });

        Button pianobtn = findViewById(R.id.pianobtn);
        pianobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "piano";
                Intent it = new Intent();
                it.setClass(Instruments.this, Instrumentsintroduce.class);
                startActivity(it);
            }
        });

        Button kalinbabtn = findViewById(R.id.kalinbabtn);
        kalinbabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "kalinba";
                Intent it = new Intent();
                it.setClass(Instruments.this, Instrumentsintroduce.class);
                startActivity(it);
            }
        });

        Button guitarbtn = findViewById(R.id.guitarbtn);
        guitarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "guitar";
                Intent it = new Intent();
                it.setClass(Instruments.this, Instrumentsintroduce.class);
                startActivity(it);
            }
        });

        Button drumbtn = findViewById(R.id.drumbtn);
        drumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "drum";
                Intent it = new Intent();
                it.setClass(Instruments.this, Instrumentsintroduce.class);
                startActivity(it);
            }
        });

        Button flutebtn = findViewById(R.id.flutebtn);
        flutebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "flute";
                Intent it = new Intent();
                it.setClass(Instruments.this, Instrumentsintroduce.class);
                startActivity(it);
            }
        });

        ImageView backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mper != null) {
            mper.release();
        }
        if (learning_mode != null) {
            learning_mode.release();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mper != null && mper.isPlaying()) {
            mper.pause();
            mper.seekTo(0);
        }
        if (learning_mode != null && learning_mode.isPlaying()) {
            learning_mode.pause();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mper != null) {
            mper.start();
        }
    }
}
