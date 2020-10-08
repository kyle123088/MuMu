package tw.edu.pu.s1070334.mumu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.shashank.sony.fancygifdialoglib.FancyGifDialog;
import com.shashank.sony.fancygifdialoglib.FancyGifDialogListener;

public class Gameintroduce extends AppCompatActivity {
    static MediaPlayer mper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameintroduce);

        mper = MediaPlayer.create(this, R.raw.gamerule);

        ImageView backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button ruleexplain = findViewById(R.id.ruleexplain);
        ruleexplain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mper.start();
                new FancyGifDialog.Builder(Gameintroduce.this)
                    .setTitle("規則說明") // You can also send title like R.string.from_resources
                    .setMessage("請小朋友們根據聽到的音樂，選擇出對應的樂器名稱，關卡總共有六關，答對一題得到五分，滿分為三十分，請仔細作答，加油！(下滑)") // or pass like R.string.description_from_resources
                    .setNegativeBtnText("退出遊戲") // or pass it like android.R.string.cancel
                    .setPositiveBtnBackground(R.color.colorGreen) // or pass it like R.color.positiveButton
                    .setPositiveBtnText("進入遊戲") // or pass it like android.R.string.ok
                    .setNegativeBtnBackground(R.color.colorDeepRed) // or pass it like R.color.negativeButton
                    .setGifResource(R.drawable.image)   //Pass your Gif here
                    .isCancellable(false)
                    .OnPositiveClicked(new FancyGifDialogListener() {
                        @Override
                        public void OnClick() {
                            Intent it = new Intent();
                            it.setClass(Gameintroduce.this, Game.class);
                            startActivity(it);
                        }
                    })
                    .OnNegativeClicked(new FancyGifDialogListener() {
                        @Override
                        public void OnClick() {
                            finish();
                        }
                    })
                    .build();
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
}
