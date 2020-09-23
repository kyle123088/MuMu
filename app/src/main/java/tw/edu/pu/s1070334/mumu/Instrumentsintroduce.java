package tw.edu.pu.s1070334.mumu;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import static tw.edu.pu.s1070334.mumu.Instruments.str;

public class Instrumentsintroduce extends AppCompatActivity {
    MediaPlayer mper;
    MediaPlayer explain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrumentsintroduce);

        ImageView backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView speaker = findViewById(R.id.speaker);
        speaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                explainWord();
            }
        });


        ImageView violin = findViewById(R.id.violin);
        ImageView violinword = findViewById(R.id.violinword);
        violin.setVisibility(View.INVISIBLE);
        violinword.setVisibility(View.INVISIBLE);

        ImageView piano = findViewById(R.id.piano);
        ImageView pianoword = findViewById(R.id.pianoword);
        piano.setVisibility(View.INVISIBLE);
        pianoword.setVisibility(View.INVISIBLE);

        ImageView kalinba = findViewById(R.id.kalinba);
        ImageView kalinbaword = findViewById(R.id.kalinbaword);
        kalinba.setVisibility(View.INVISIBLE);
        kalinbaword.setVisibility(View.INVISIBLE);

        ImageView guitar = findViewById(R.id.guitar);
        ImageView guitarword = findViewById(R.id.guitarword);
        guitar.setVisibility(View.INVISIBLE);
        guitarword.setVisibility(View.INVISIBLE);

        ImageView drum = findViewById(R.id.drum);
        ImageView drumword = findViewById(R.id.drumword);
        drum.setVisibility(View.INVISIBLE);
        drumword.setVisibility(View.INVISIBLE);

        ImageView flute = findViewById(R.id.flute);
        ImageView fluteword = findViewById(R.id.fluteword);
        flute.setVisibility(View.INVISIBLE);
        fluteword.setVisibility(View.INVISIBLE);

        if(str.equals("violin")){
            violin.setVisibility(View.VISIBLE);
            violinword.setVisibility(View.VISIBLE);
            mper = MediaPlayer.create(this, R.raw.violinmusic);
            explain = MediaPlayer.create(this,R.raw.violinexplain);
        }else if(str.equals("piano")){
            piano.setVisibility(View.VISIBLE);
            pianoword.setVisibility(View.VISIBLE);
            mper = MediaPlayer.create(this, R.raw.pianomusic);
            explain = MediaPlayer.create(this,R.raw.pianoexplain);
        }else if(str.equals("kalinba")){
            kalinba.setVisibility(View.VISIBLE);
            kalinbaword.setVisibility(View.VISIBLE);
//            mper = MediaPlayer.create(this, R.raw.kalinba);
        }else if(str.equals("guitar")){
            guitar.setVisibility(View.VISIBLE);
            guitarword.setVisibility(View.VISIBLE);
            mper = MediaPlayer.create(this, R.raw.guitarmusic);
            explain = MediaPlayer.create(this,R.raw.guitarexplain);
        }else if(str.equals("drum")){
            drum.setVisibility(View.VISIBLE);
            drumword.setVisibility(View.VISIBLE);
            mper = MediaPlayer.create(this, R.raw.drummusic);
            explain = MediaPlayer.create(this,R.raw.drumexplain);
        }else if(str.equals("flute")){
            flute.setVisibility(View.VISIBLE);
            fluteword.setVisibility(View.VISIBLE);
            mper = MediaPlayer.create(this, R.raw.flutemusic);
            explain = MediaPlayer.create(this,R.raw.fluteexplain);
        }
        mper.setLooping(true);
        mper.start();
    }

    public void explainWord(){
        if(explain != null){
            explain.start();
        }else{
            explain.seekTo(0);
        }
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mper != null) {
            mper.release();
        }
        if(explain != null){
            explain.release();
        }
    }


    @Override
    public void onPause() {
        super.onPause();
        if(mper != null && mper.isPlaying()) {
            mper.pause();
        }
        if(explain != null && explain.isPlaying()){
            explain.pause();
        }
    }

    @Override
    public void onResume(){
        super.onResume();
        if(mper != null) {
            mper.start();
        }
        if(explain != null){
            explain.start();
        }
    }
}
