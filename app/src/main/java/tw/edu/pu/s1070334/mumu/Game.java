package tw.edu.pu.s1070334.mumu;

import android.app.Dialog;
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
    static int randomInt,rSound;
    private int currentScore = 0;
    ImageView violin, piano, kalinba, guitar, drum, flute;
    TextView score;
    MediaPlayer mper;

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

        loadingMusic();
        playRandomMusic();

        violin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rSound == R.raw.violinmusic) {
                    currentScore += 5;
                    score.setText("你的分數為:" + currentScore);
                    mper.release();
                    updateSoundList();
                    if(currentScore != 30) {
                        playRandomMusic();
                    }
                } else {
                    gameOver();
                }
            }
        });

        piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rSound == R.raw.pianomusic) {
                    currentScore += 5;
                    score.setText("你的分數為:" + currentScore);
                    mper.release();
                    updateSoundList();
                    if(currentScore != 30) {
                        playRandomMusic();
                    }
                } else {
                    gameOver();
                }
            }
        });

        kalinba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rSound == R.raw.kalinbamusic) {
                    currentScore += 5;
                    score.setText("你的分數為:" + currentScore);
                    mper.release();
                    updateSoundList();
                    if(currentScore != 30) {
                        playRandomMusic();
                    }
                } else {
                    gameOver();
                }
            }
        });

        guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rSound == R.raw.guitarmusic) {
                    currentScore += 5;
                    score.setText("你的分數為:" + currentScore);
                    mper.release();
                    updateSoundList();
                    if(currentScore != 30) {
                        playRandomMusic();
                    }
                } else {
                    gameOver();
                }
            }
        });

        drum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rSound == R.raw.drummusic) {
                    currentScore += 5;
                    score.setText("你的分數為:" + currentScore);
                    mper.release();
                    updateSoundList();
                    if(currentScore != 30) {
                        playRandomMusic();
                    }
                } else {
                    gameOver();
                }
            }
        });

        flute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rSound == R.raw.flutemusic) {
                    currentScore += 5;
                    score.setText("你的分數為:" + currentScore);
                    mper.release();
                    updateSoundList();
                    if(currentScore != 30) {
                        playRandomMusic();
                    }
                } else {
                    gameOver();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mper.release();
        startActivity(new Intent(getApplication(), Gameintroduce.class));
    }

    public void playRandomMusic() {
        Random r = new Random();
        randomInt = r.nextInt(soundList.size());
        rSound = soundList.get(randomInt);
        mper = MediaPlayer.create(this, rSound);
        mper.start();
        mper.setLooping(true);
    }

    public void loadingMusic(){
        soundList.add(R.raw.violinmusic);
        soundList.add(R.raw.pianomusic);
        soundList.add(R.raw.kalinbamusic);
        soundList.add(R.raw.guitarmusic);
        soundList.add(R.raw.drummusic);
        soundList.add(R.raw.flutemusic);
    }

    public void updateSoundList() {
        soundList.remove(randomInt);
        if(currentScore == 30){
            win();
        }
    }

    public void gameOver() {
        mper.release();
        AlertDialog.Builder bulider = new AlertDialog.Builder(this);
        bulider.setMessage("哎呀你答錯了，本次成績為："+ currentScore +"，別氣餒下次再挑戰");
        bulider.setCancelable(false);
        bulider.setPositiveButton("再玩一次", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                startActivity(new Intent(getApplication(), Game.class));
            }
        });
        bulider.setNegativeButton("結束", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                startActivity(new Intent(getApplication(), Gameintroduce.class));
            }
        });
        bulider.show();
    }

    public void win() {
        mper.release();
        AlertDialog.Builder bulider = new AlertDialog.Builder(this);
        bulider.setMessage("恭喜過關，成績為：" + currentScore);
        bulider.setCancelable(false);
        bulider.setPositiveButton("再玩一次", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                startActivity(new Intent(getApplicationContext(), Game.class));
            }
        });
        bulider.setNegativeButton("結束", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                startActivity(new Intent(getApplicationContext(), Gameintroduce.class));
            }
        });
        bulider.show();
    }
}
