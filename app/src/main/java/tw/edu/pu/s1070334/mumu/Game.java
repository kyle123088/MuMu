package tw.edu.pu.s1070334.mumu;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.util.Vector;

public class Game extends AppCompatActivity {

    static Vector<Integer> soundList = new Vector<>();
    static int rSound;
    private int currentScore = 0;
    ImageView violin, piano, kalinba, guitar, drum, flute;
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        /**
         * 按鈕
         */
        violin = findViewById(R.id.violin);
        piano = findViewById(R.id.piano);
        kalinba = findViewById(R.id.kalinba);
        guitar = findViewById(R.id.guitar);
        drum = findViewById(R.id.drum);
        flute = findViewById(R.id.flute);
        score = findViewById(R.id.score);

        /**
         * Vector新增音樂
         */
        soundList.add(R.raw.violinmusic);
        soundList.add(R.raw.pianomusic);
//        soundList.add(R.raw.kalinbamusic);
        soundList.add(R.raw.guitarmusic);
        soundList.add(R.raw.drummusic);
        soundList.add(R.raw.flutemusic);

        playRandomMusic();

        violin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rSound==1800016) {
                    currentScore += 5;
                    score.setText("你的分數為:"+currentScore);
                } else {
                    gameOver();
                }
            }
        });

        piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rSound==1800005) {
                    currentScore += 5;
                    score.setText("你的分數為:"+currentScore);
                } else {
                    gameOver();
                }
            }
        });

        kalinba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rSound==1800016) {
                    currentScore += 5;
                    score.setText("你的分數為:"+currentScore);
                } else {
                    gameOver();
                }
            }
        });

        guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rSound==1800008) {
                    currentScore += 5;
                    score.setText("你的分數為:"+currentScore);
                } else {
                    gameOver();
                }
            }
        });

        drum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rSound==1800004) {
                    currentScore += 5;
                    score.setText("你的分數為:"+currentScore);
                } else {
                    gameOver();
                }
            }
        });

        flute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rSound==1800003) {
                    currentScore += 5;
                    score.setText("你的分數為:"+currentScore);
                } else {
                    gameOver();
                }
            }
        });
    }

    public void playRandomMusic(){
        Random r = new Random();
        int randomInt = r.nextInt(soundList.size());
        rSound = soundList.get(randomInt);
        MediaPlayer mper = MediaPlayer.create(this,rSound);
        mper.start();
        mper.setLooping(true);
    }

    public void gameOver(){
        AlertDialog.Builder alertDialogBulider = new AlertDialog.Builder(this);
        alertDialogBulider.setMessage("哎呀你答錯了，本次成績為：%d，別氣餒下次再挑戰"+currentScore);
        alertDialogBulider.setCancelable(false);
        alertDialogBulider.setPositiveButton("再玩一次", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(getApplicationContext(), Game.class));
            }
        });
        alertDialogBulider.setNegativeButton("結束", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
    }
}
