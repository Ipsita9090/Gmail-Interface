package com.example.gmail;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;

import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    TextView txt1, txt2,sc1,sc2,sc3, scc1, scc2, scc3, scc4, scc5, scc6, scc9, bigtext1, default_txt1, bigtext2, default_txt2, from1, to1, cc1, from2, to2, cc2, from3, to3, cc3;
    View line1, line1short, line2, line2mini;
    ImageButton down_btn1,down_btn2,down_btn3;
    LinearLayout down1,down2,down3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        sc1=findViewById(R.id.sc1);
        sc2=findViewById(R.id.sc2);
        sc3=findViewById(R.id.sc3);
        scc1=findViewById(R.id.scc1);
        scc2=findViewById(R.id.scc2);
        scc3=findViewById(R.id.scc3);
        scc4=findViewById(R.id.scc4);
        scc5=findViewById(R.id.scc5);
        scc6=findViewById(R.id.scc6);
        scc9=findViewById(R.id.scc9);
        default_txt1=findViewById(R.id.default_txt1);
        default_txt2=findViewById(R.id.default_txt2);
        bigtext1=findViewById(R.id.bigtxt1);
        bigtext2=findViewById(R.id.bigtxt2);
        line1=findViewById(R.id.line1);
        line1short=findViewById(R.id.line1short);
        line2=findViewById(R.id.line2);
        from1=findViewById(R.id.from1);
        to1=findViewById(R.id.to1);
        cc1=findViewById(R.id.cc1);
        from2=findViewById(R.id.from2);
        to2=findViewById(R.id.to2);
        cc2=findViewById(R.id.cc2);
        from3=findViewById(R.id.from3);
        to3=findViewById(R.id.to3);
        cc3=findViewById(R.id.cc3);
        down_btn1=findViewById(R.id.down_btn1);
        down_btn2=findViewById(R.id.down_btn2);
        down_btn3=findViewById(R.id.down_btn3);
        down1=findViewById(R.id.down1);
        down2=findViewById((R.id.down2));
        down3=findViewById(R.id.down3);
        line2mini=findViewById(R.id.line2mini);

        String text = "<font color=#eac9e7>< </font> <font color=#4a7fd6>uscbc20011@xustudent.edu.in</font><font color=#eac9e7>> wrote:</font> ";
        scc2.setText(Html.fromHtml(text));
        scc6.setText(Html.fromHtml(text));

        String text1 = "<font color=#eac9e7>< </font> <font color=#4a7fd6>sahoo5046@gmail.com</font><font color=#eac9e7>> wrote:</font> ";
        scc4.setText(Html.fromHtml(text1));

        String namemail_akash = "<font color=#FFFFFFFF>AKASH SAHOO</font> <font color=#CBBAB6>•uscbc20011@xustudent.edu.in</font>";
        from1.setText(Html.fromHtml(namemail_akash));
        to2.setText(Html.fromHtml(namemail_akash));
        to3.setText(Html.fromHtml(namemail_akash));


        String namemail_uncle = "<font color=#FFFFFFFF>NANDA KISHORE SAHOO</font> <font color=#CBBAB6>•sahoo5046@gmail.com</font>";
        cc1.setText(Html.fromHtml(namemail_uncle));
        from2.setText(Html.fromHtml(namemail_uncle));


        String namemail_rmt = "<font color=#FFFFFFFF>Ranjan Kumar Swain</font> <font color=#CBBAB6>•ranjan@xim.edu.in</font>";
        to1.setText(Html.fromHtml(namemail_rmt));
        from3.setText(Html.fromHtml(namemail_rmt));
        cc2.setText(Html.fromHtml(namemail_rmt));

        String special_cc = "<font color=#CBBAB6>rmt@xim.edu.in\n</font><font color=#FFFFFFFF>NANDA KISHORE SAHOO</font> <font color=#CBBAB6>•sahoo5046@gmail.com</font>";
        cc3.setText(Html.fromHtml(special_cc));

        LinearLayout container=(LinearLayout) findViewById(R.id.ll);

        final boolean[] isTextView1Clicked = {false};

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isTextView1Clicked[0])
                {
                    txt1.setMaxLines(3);
                    isTextView1Clicked[0]=false;
                }
                else{
                    txt1.setMaxLines(Integer.MAX_VALUE);
                    isTextView1Clicked[0] =true;
                }
            }
        });

        final boolean[] isTextView2Clicked = {false};

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isTextView2Clicked[0])
                {
                    txt2.setMaxLines(2);
                    line1short.setVisibility(view.GONE);
                    sc1.setVisibility(view.GONE);
                    sc2.setVisibility(view.GONE);
                    isTextView2Clicked[0]=false;
                }
                else{
                    txt2.setMaxLines(Integer.MAX_VALUE);
                    line1short.setVisibility(view.VISIBLE);
                    sc1.setVisibility(view.VISIBLE);
                    sc2.setVisibility(view.VISIBLE);
                    isTextView2Clicked[0] =true;
                }
            }
        });

        final boolean[] issc1Clicked = {true};

        sc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(issc1Clicked[0])
                {
                    sc1.setText("Hide quoted text");
                    scc1.setVisibility(view.VISIBLE);
                    scc2.setVisibility(view.VISIBLE);
                    issc1Clicked[0]=false;
                }
                else{
                    sc1.setText("Show quoted text");
                    scc1.setVisibility(view.GONE);
                    scc2.setVisibility(view.GONE);
                    issc1Clicked[0] =true;
                }
            }
        });

        final boolean[] issc2Clicked = {true};

        sc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(issc2Clicked[0])
                {
                    sc2.setText("Hide quoted text");
                    line1.setVisibility(view.VISIBLE);
                    line1short.setVisibility(view.GONE);
                    bigtext1.setVisibility(view.VISIBLE);
                    default_txt1.setVisibility(view.VISIBLE);
                    issc2Clicked[0]=false;
                }
                else{
                    sc2.setText("Show quoted text");
                    line1.setVisibility(view.GONE);
                    line1short.setVisibility(view.VISIBLE);
                    bigtext1.setVisibility(view.GONE);
                    default_txt1.setVisibility(view.GONE);
                    issc2Clicked[0] =true;
                }
            }
        });

        final boolean[] issc3Clicked = {true};

        sc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(issc3Clicked[0])
                {
                    sc3.setText("Hide quoted text");
                    line2.setVisibility(view.VISIBLE);
                    line2mini.setVisibility(view.VISIBLE);
                    scc3.setVisibility(view.VISIBLE);
                    scc4.setVisibility(view.VISIBLE);
                    scc9.setVisibility(view.VISIBLE);
                    scc5.setVisibility(view.VISIBLE);
                    scc6.setVisibility(view.VISIBLE);
                    bigtext2.setVisibility(view.VISIBLE);
                    default_txt2.setVisibility(view.VISIBLE);
                    issc3Clicked[0]=false;
                }
                else{
                    sc3.setText("Show quoted text");
                    line2.setVisibility(view.GONE);
                    line2mini.setVisibility(view.GONE);
                    scc3.setVisibility(view.GONE);
                    scc4.setVisibility(view.GONE);
                    scc9.setVisibility(view.GONE);
                    scc5.setVisibility(view.GONE);
                    scc6.setVisibility(view.GONE);
                    bigtext2.setVisibility(view.GONE);
                    default_txt2.setVisibility(view.GONE);
                    issc1Clicked[0] =true;
                }
            }
        });

        final boolean[] isdown_btn1Clicked = {true};

        down_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isdown_btn1Clicked[0])
                {

                    down1.setVisibility(view.VISIBLE);
                    isdown_btn1Clicked[0]=false;
                }
                else{
                    down1.setVisibility(view.GONE);
                    isdown_btn1Clicked[0] =true;
                }
            }
        });

        final boolean[] isdown_btn2Clicked = {true};

        down_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isdown_btn2Clicked[0])
                {

                    down2.setVisibility(view.VISIBLE);
                    isdown_btn2Clicked[0]=false;
                }
                else{
                    down2.setVisibility(view.GONE);
                    isdown_btn2Clicked[0] =true;
                }
            }
        });

        final boolean[] isdown_btn3Clicked = {true};

        down_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isdown_btn3Clicked[0])
                {

                    down3.setVisibility(view.VISIBLE);
                    isdown_btn3Clicked[0]=false;
                }
                else{
                    down3.setVisibility(view.GONE);
                    isdown_btn3Clicked[0] =true;
                }
            }
        });




    }
    }
