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
    static MediaPlayer guitar_do, guitar_re, guitar_mi, guitar_fa, guitar_so, guitar_la, guitar_si, guitar_h_do;
//    static MediaPlayer jazz, guitar_re, guitar_mi, guitar_fa, guitar_so, guitar_la, guitar_si, guitar_h_do;
    static MediaPlayer flute_do, flute_re, flute_mi, flute_fa, flute_so, flute_la, flute_si, flute_h_do;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freeplay);

        ImageView backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choose.equals("violin")) {
                    violin_do.release();
                    violin_re.release();
                    violin_mi.release();
                    violin_fa.release();
                    violin_so.release();
                    violin_la.release();
                    violin_si.release();
                    violin_h_do.release();
                } else if (choose.equals("piano")) {
                    piano_do.release();
                    piano_re.release();
                    piano_mi.release();
                    piano_fa.release();
                    piano_so.release();
                    piano_la.release();
                    piano_si.release();
                    piano_h_do.release();
                } else if (choose.equals("kalimba")) {
                    kalimba_do.release();
                    kalimba_re.release();
                    kalimba_mi.release();
                    kalimba_fa.release();
                    kalimba_so.release();
                    kalimba_la.release();
                    kalimba_si.release();
                    kalimba_h_do.release();
                } else if (choose.equals("guitar")) {
                    guitar_do.release();
                    guitar_re.release();
                    guitar_mi.release();
                    guitar_fa.release();
                    guitar_so.release();
                    guitar_la.release();
                    guitar_si.release();
                    guitar_h_do.release();
                } else if (choose.equals("flute")) {
                    flute_do.release();
                    flute_re.release();
                    flute_mi.release();
                    flute_fa.release();
                    flute_so.release();
                    flute_la.release();
                    flute_si.release();
                    flute_h_do.release();
                }
                finish();
            }
        });

        ImageView violin = findViewById(R.id.violin);
        violin.setVisibility(View.INVISIBLE);
        ImageView piano = findViewById(R.id.piano);
        piano.setVisibility(View.INVISIBLE);
        ImageView kalinba = findViewById(R.id.kalinba);
        kalinba.setVisibility(View.INVISIBLE);
        ImageView guitar = findViewById(R.id.guitar);
        guitar.setVisibility(View.INVISIBLE);
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
            createGuitarList();;
            Button do_l = findViewById(R.id.do_l);
            do_l.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    guitar_do.start();
                }
            });

            Button re = findViewById(R.id.re);
            re.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    guitar_re.start();
                }
            });

            Button mi = findViewById(R.id.mi);
            mi.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    guitar_mi.start();
                }
            });

            Button fa = findViewById(R.id.fa);
            fa.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    guitar_fa.start();
                }
            });

            Button sol = findViewById(R.id.sol);
            sol.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    guitar_so.start();
                }
            });

            Button la = findViewById(R.id.la);
            la.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    guitar_la.start();
                }
            });

            Button si = findViewById(R.id.si);
            si.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    guitar_si.start();
                }
            });

            Button do_h = findViewById(R.id.do_h);
            do_h.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    guitar_h_do.start();
                }
            });

        }  else if (choose.equals("flute")) {
            flute.setVisibility(View.VISIBLE);
            createFluteList();
            Button do_l = findViewById(R.id.do_l);
            do_l.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flute_do.start();
                }
            });

            Button re = findViewById(R.id.re);
            re.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flute_re.start();
                }
            });

            Button mi = findViewById(R.id.mi);
            mi.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flute_mi.start();
                }
            });

            Button fa = findViewById(R.id.fa);
            fa.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flute_fa.start();
                }
            });

            Button sol = findViewById(R.id.sol);
            sol.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flute_so.start();
                }
            });

            Button la = findViewById(R.id.la);
            la.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flute_la.start();
                }
            });

            Button si = findViewById(R.id.si);
            si.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flute_si.start();
                }
            });

            Button do_h = findViewById(R.id.do_h);
            do_h.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flute_h_do.start();
                }
            });

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

    public void createGuitarList() {
        guitar_do = MediaPlayer.create(this, R.raw.guitar_do);
        guitar_re = MediaPlayer.create(this, R.raw.guitar_re);
        guitar_mi = MediaPlayer.create(this, R.raw.guitar_mi);
        guitar_fa = MediaPlayer.create(this, R.raw.guitar_fa);
        guitar_so = MediaPlayer.create(this, R.raw.guitar_so);
        guitar_la = MediaPlayer.create(this, R.raw.guitar_la);
        guitar_si = MediaPlayer.create(this, R.raw.guitar_si);
        guitar_h_do = MediaPlayer.create(this, R.raw.guitar_h_do);
    }

    public void createFluteList() {
        flute_do = MediaPlayer.create(this, R.raw.flute_do);
        flute_re = MediaPlayer.create(this, R.raw.flute_re);
        flute_mi = MediaPlayer.create(this, R.raw.flute_mi);
        flute_fa = MediaPlayer.create(this, R.raw.flute_fa);
        flute_so = MediaPlayer.create(this, R.raw.flute_so);
        flute_la = MediaPlayer.create(this, R.raw.flute_la);
        flute_si = MediaPlayer.create(this, R.raw.flute_si);
        flute_h_do = MediaPlayer.create(this, R.raw.flute_h_do);
    }
}
