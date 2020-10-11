package tw.edu.pu.s1070334.mumu;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import java.util.Vector;

public class Game extends AppCompatActivity {

    static Vector<Integer> soundList = new Vector<>();
    static int randomInt, rSound;
    private int currentScore = 0;
    final int maxScore = 30;
    ImageView violin, piano, kalinba, guitar, drum, flute;
    TextView score;
    MediaPlayer mper;
    Dialog gameoverdialog, windialog;

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
        gameoverdialog = new Dialog(this);
        windialog = new Dialog(this);

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
                    if (currentScore != maxScore) {
                        playRandomMusic();
                    }
                } else {
                    gameOver();
                    soundList.clear();
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
                    if (currentScore != maxScore) {
                        playRandomMusic();
                    }
                } else {
                    gameOver();
                    soundList.clear();
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
                    if (currentScore != maxScore) {
                        playRandomMusic();
                    }
                } else {
                    gameOver();
                    soundList.clear();
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
                    if (currentScore != maxScore) {
                        playRandomMusic();
                    }
                } else {
                    gameOver();
                    soundList.clear();
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
                    if (currentScore != maxScore) {
                        playRandomMusic();
                    }
                } else {
                    gameOver();
                    soundList.clear();
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
                    if (currentScore != maxScore) {
                        playRandomMusic();
                    }
                } else {
                    gameOver();
                    soundList.clear();
                }
            }
        });
    }

    public void playRandomMusic() {
        Random r = new Random();
        randomInt = r.nextInt(soundList.size());
        rSound = soundList.get(randomInt);
        mper = MediaPlayer.create(this, rSound);
        mper.start();
        mper.setLooping(true);
    }

    public void loadingMusic() {
        soundList.add(R.raw.violinmusic);
        soundList.add(R.raw.pianomusic);
        soundList.add(R.raw.kalinbamusic);
        soundList.add(R.raw.guitarmusic);
        soundList.add(R.raw.drummusic);
        soundList.add(R.raw.flutemusic);
    }

    public void updateSoundList() {
        soundList.remove(randomInt);
        if (currentScore == 30) {
            win();
            soundList.clear();
        }
    }

    public void gameOver() {
        mper.release();
        gameoverdialog.setContentView(R.layout.gameover_layout_dialog);
        gameoverdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        gameoverdialog.setCanceledOnTouchOutside(false);
        ImageView imageViewClose = gameoverdialog.findViewById(R.id.bg);
        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button btnOK = gameoverdialog.findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        gameoverdialog.show();
    }

    public void win() {
        mper.release();
        windialog.setContentView(R.layout.win_layout_dialog);
        windialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        windialog.setCanceledOnTouchOutside(false);
        ImageView imageViewClose = windialog.findViewById(R.id.bg);
        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button btnOK = windialog.findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        windialog.show();
    }
}
