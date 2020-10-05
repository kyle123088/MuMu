package tw.edu.pu.s1070334.mumu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Freeplaychoose extends AppCompatActivity {
    static MediaPlayer mper;
    static String choose = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freeplaychoose);

        mper = MediaPlayer.create(this, R.raw.pick);
        mper.start();

        Button violinbtn = findViewById(R.id.violinbtn);
        violinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose = "violin";
                Intent it = new Intent();
                it.setClass(Freeplaychoose.this, Freeplay.class);
                startActivity(it);
            }
        });

        Button pianobtn = findViewById(R.id.pianobtn);
        pianobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose = "piano";
                Intent it = new Intent();
                it.setClass(Freeplaychoose.this, Freeplay.class);
                startActivity(it);
            }
        });

        Button kalinbabtn = findViewById(R.id.kalinbabtn);
        kalinbabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose = "kalinba";
                Intent it = new Intent();
                it.setClass(Freeplaychoose.this, Freeplay.class);
                startActivity(it);
            }
        });

        Button guitarbtn = findViewById(R.id.guitarbtn);
        guitarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose = "guitar";
                Intent it = new Intent();
                it.setClass(Freeplaychoose.this, Freeplay.class);
                startActivity(it);
            }
        });

        Button drumbtn = findViewById(R.id.drumbtn);
        drumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose = "drum";
                Intent it = new Intent();
                it.setClass(Freeplaychoose.this, Freeplay.class);
                startActivity(it);
            }
        });

        Button flutebtn = findViewById(R.id.flutebtn);
        flutebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose = "flute";
                Intent it = new Intent();
                it.setClass(Freeplaychoose.this, Freeplay.class);
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
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mper != null && mper.isPlaying()) {
            mper.pause();
            mper.seekTo(0);
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
