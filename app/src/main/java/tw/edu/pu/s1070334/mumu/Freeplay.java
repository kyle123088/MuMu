package tw.edu.pu.s1070334.mumu;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

import static tw.edu.pu.s1070334.mumu.Freeplaychoose.choose;

public class Freeplay extends AppCompatActivity {
    static MediaPlayer violin_do, violin_re, violin_mi, violin_fa, violin_so, violin_la, violin_si, violin_h_do;
    static MediaPlayer piano_do, piano_re, piano_mi, piano_fa, piano_so, piano_la, piano_si, piano_h_do;
    static MediaPlayer kalimba_do, kalimba_re, kalimba_mi, kalimba_fa, kalimba_so, kalimba_la, kalimba_si, kalimba_h_do;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freeplay);

        ImageView backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        final ImageView violin = findViewById(R.id.violin);
        violin.setVisibility(View.INVISIBLE);
        ImageView piano = findViewById(R.id.piano);
        piano.setVisibility(View.INVISIBLE);
        ImageView kalinba = findViewById(R.id.kalinba);
        kalinba.setVisibility(View.INVISIBLE);
        ImageView guitar = findViewById(R.id.guitar);
        guitar.setVisibility(View.INVISIBLE);
        ImageView drum = findViewById(R.id.drum);
        drum.setVisibility(View.INVISIBLE);
        ImageView flute = findViewById(R.id.flute);
        flute.setVisibility(View.INVISIBLE);




        if (choose.equals("violin")) {
            violin.setVisibility(View.VISIBLE);
            createViolinList();
            Button do_l = findViewById(R.id.do_l);
            do_l.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    violin_do.start();
                }
            });

            Button re = findViewById(R.id.re);
            re.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    violin_re.start();
                }
            });

            Button mi = findViewById(R.id.mi);
            mi.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    violin_mi.start();
                }
            });

            Button fa = findViewById(R.id.fa);
            fa.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    violin_fa.start();
                }
            });

            Button sol = findViewById(R.id.sol);
            sol.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    violin_so.start();
                }
            });

            Button la = findViewById(R.id.la);
            la.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    violin_la.start();
                }
            });
            Button si = findViewById(R.id.si);
            si.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    violin_si.start();
                }
            });
            Button do_h = findViewById(R.id.do_h);
            do_h.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    violin_h_do.start();
                }
            });

        } else if (choose.equals("piano")) {
            piano.setVisibility(View.VISIBLE);
            createPianoList();
            Button do_l = findViewById(R.id.do_l);
            do_l.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    piano_do.start();
                }
            });

            Button re = findViewById(R.id.re);
            re.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    piano_re.start();
                }
            });

            Button mi = findViewById(R.id.mi);
            mi.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    piano_mi.start();
                }
            });

            Button fa = findViewById(R.id.fa);
            fa.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    piano_fa.start();
                }
            });

            Button sol = findViewById(R.id.sol);
            sol.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    piano_so.start();
                }
            });

            Button la = findViewById(R.id.la);
            la.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    piano_la.start();
                }
            });
            Button si = findViewById(R.id.si);
            si.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    piano_si.start();
                }
            });
            Button do_h = findViewById(R.id.do_h);
            do_h.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    piano_h_do.start();
                }
            });

        } else if (choose.equals("kalinba")) {
            kalinba.setVisibility(View.VISIBLE);
            createKalimbaList();;
            Button do_l = findViewById(R.id.do_l);
            do_l.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kalimba_do.start();
                }
            });

            Button re = findViewById(R.id.re);
            re.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kalimba_re.start();
                }
            });

            Button mi = findViewById(R.id.mi);
            mi.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kalimba_mi.start();
                }
            });

            Button fa = findViewById(R.id.fa);
            fa.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kalimba_fa.start();
                }
            });

            Button sol = findViewById(R.id.sol);
            sol.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kalimba_so.start();
                }
            });

            Button la = findViewById(R.id.la);
            la.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kalimba_la.start();
                }
            });
            Button si = findViewById(R.id.si);
            si.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kalimba_si.start();
                }
            });
            Button do_h = findViewById(R.id.do_h);
            do_h.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kalimba_h_do.start();
                }
            });

        } else if (choose.equals("guitar")) {
            guitar.setVisibility(View.VISIBLE);

        } else if (choose.equals("drum")) {
            drum.setVisibility(View.VISIBLE);
        } else if (choose.equals("flute")) {
            flute.setVisibility(View.VISIBLE);
        }
    }

    public void createViolinList() {
        violin_do = MediaPlayer.create(this, R.raw.violin_do);
        violin_re = MediaPlayer.create(this, R.raw.violin_re);
        violin_mi = MediaPlayer.create(this, R.raw.violin_mi);
        violin_fa = MediaPlayer.create(this, R.raw.violin_fa);
        violin_so = MediaPlayer.create(this, R.raw.violin_so);
        violin_la = MediaPlayer.create(this, R.raw.violin_la);
        violin_si = MediaPlayer.create(this, R.raw.violin_si);
        violin_h_do = MediaPlayer.create(this, R.raw.violin_h_do);
    }

    public void createPianoList() {
        piano_do = MediaPlayer.create(this, R.raw.piano_do);
        piano_re = MediaPlayer.create(this, R.raw.piano_re);
        piano_mi = MediaPlayer.create(this, R.raw.piano_mi);
        piano_fa = MediaPlayer.create(this, R.raw.piano_fa);
        piano_so = MediaPlayer.create(this, R.raw.piano_so);
        piano_la = MediaPlayer.create(this, R.raw.piano_la);
        piano_si = MediaPlayer.create(this, R.raw.piano_si);
        piano_h_do = MediaPlayer.create(this, R.raw.piano_h_do);
    }

    public void createKalimbaList() {
        kalimba_do = MediaPlayer.create(this, R.raw.kalimba_do);
        kalimba_re = MediaPlayer.create(this, R.raw.kalimba_re);
        kalimba_mi = MediaPlayer.create(this, R.raw.kalimba_mi);
        kalimba_fa = MediaPlayer.create(this, R.raw.kalimba_fa);
        kalimba_so = MediaPlayer.create(this, R.raw.kalimba_so);
        kalimba_la = MediaPlayer.create(this, R.raw.kalimba_la);
        kalimba_si = MediaPlayer.create(this, R.raw.kalimba_si);
        kalimba_h_do = MediaPlayer.create(this, R.raw.kalimba_h_do);
    }
//
//    public void createGuitarList() {
//        guitarList.add(R.raw.guitar_do);
//        guitarList.add(R.raw.guitar_re);
//        guitarList.add(R.raw.guitar_mi);
//        guitarList.add(R.raw.guitar_fa);
//        guitarList.add(R.raw.guitar_so);
//        guitarList.add(R.raw.guitar_la);
//        guitarList.add(R.raw.guitar_si);
//        guitarList.add(R.raw.guitar_h_do);
//    }
//
//    public void createDrumList() {
//        drumList.add(R.raw.jazz_bigdrum);
//        drumList.add(R.raw.jazz_smalldrum);
//        drumList.add(R.raw.jazz_falldrum);
//        drumList.add(R.raw.jazz_footcymbals);
//        drumList.add(R.raw.jazz_copperdrum);
//        drumList.add(R.raw.jazz_cymbals);
//    }
//
//    public void createFluteList() {
//        fluteList.add(R.raw.flute_do);
//        fluteList.add(R.raw.flute_re);
//        fluteList.add(R.raw.flute_mi);
//        fluteList.add(R.raw.flute_fa);
//        fluteList.add(R.raw.flute_so);
//        fluteList.add(R.raw.flute_la);
//        fluteList.add(R.raw.flute_si);
//        fluteList.add(R.raw.flute_h_do);
//    }
}
