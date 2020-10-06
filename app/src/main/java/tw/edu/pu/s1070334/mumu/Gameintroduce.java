package tw.edu.pu.s1070334.mumu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Gameintroduce extends AppCompatActivity {
    static MediaPlayer mper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameintroduce);

        ImageView backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button startgamebtn = findViewById(R.id.startgamebtn);
        startgamebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(Gameintroduce.this, Game.class);
                startActivity(it);
            }
        });

        mper = MediaPlayer.create(this, R.raw.gamerule);
        mper.start();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mper != null){
            mper.release();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if(mper != null && mper.isPlaying()) {
            mper.pause();
            mper.seekTo(0);
        }
    }

    @Override
    public void onResume(){
        super.onResume();
        if(mper != null) {
            mper.start();
        }
    }
}
