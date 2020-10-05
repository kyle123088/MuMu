package tw.edu.pu.s1070334.mumu;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    static MediaPlayer init;
    static MediaPlayer mper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button learnmode = findViewById(R.id.learnmode);
        Button gamemode = findViewById(R.id.gamemode);
        Button freemode = findViewById(R.id.freemode);
        learnmode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(MainActivity.this, Instruments.class);
                startActivity(it);
            }
        });
        gamemode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(MainActivity.this, Gameintroduce.class);
                startActivity(it);
            }
        });
        freemode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(MainActivity.this, Freeplaychoose.class);
                startActivity(it);
            }
        });
        init = MediaPlayer.create(this, R.raw.initial);
        mper = MediaPlayer.create(this, R.raw.bgmusic);
        mper.setLooping(true);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mper != null) {
            mper.release();
        }
        if (init != null) {
            init.release();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mper != null && mper.isPlaying()) {
            mper.pause();
        }
        if (init != null && init.isPlaying()) {
            init.pause();
            init.seekTo(0);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mper != null) {
            mper.start();
        }
        if (init != null) {
            init.start();
        }
    }
}
