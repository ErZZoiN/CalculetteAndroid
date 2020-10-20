package com.example.calculetteandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Calculette calc = new Calculette();

        Button b0 = null;
        Button b1 = null;
        Button b2 = null;
        Button b3 = null;
        Button b4 = null;
        Button b5 = null;
        Button b6 = null;
        Button b7 = null;
        Button b8 = null;
        Button b9 = null;

        Button berase = null;
        Button benter = null;
        Button bclearsaisie = null;

        Button bplus = null;
        Button bmoins = null;
        Button bfois = null;
        Button bdivise = null;
        Button bplusoumoins = null;

    TextView pile0=null;
    TextView pile1=null;
    TextView pile2=null;
    TextView pile3=null;

    TextView saisie=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_calculette);

        b0=(Button)findViewById(R.id.B0);
        b1=(Button)findViewById(R.id.B1);
        b2=(Button)findViewById(R.id.B2);
        b3=(Button)findViewById(R.id.B3);
        b4=(Button)findViewById(R.id.B4);
        b5=(Button)findViewById(R.id.B5);
        b6=(Button)findViewById(R.id.B6);
        b7=(Button)findViewById(R.id.B7);
        b8=(Button)findViewById(R.id.B8);
        b9=(Button)findViewById(R.id.B9);

        berase=(Button)findViewById(R.id.BErase);
        benter=(Button)findViewById(R.id.BEnter);
        bclearsaisie=(Button)findViewById(R.id.BClearSaisie);
        bplus=(Button)findViewById(R.id.BPlus);
        bmoins=(Button)findViewById(R.id.BMoins);
        bfois=(Button)findViewById(R.id.BFois);
        bdivise=(Button)findViewById(R.id.BDivise);
        bplusoumoins=(Button)findViewById(R.id.BPlusOuMoins);

        pile0=(TextView)findViewById(R.id.pile0);
        pile1=(TextView)findViewById(R.id.pile1);
        pile2=(TextView)findViewById(R.id.pile2);
        pile3=(TextView)findViewById(R.id.pile3);

        saisie=(TextView)findViewById(R.id.saisie);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        berase.setOnClickListener(this);
        benter.setOnClickListener(this);
        bclearsaisie.setOnClickListener(this);
        bplus.setOnClickListener(this);
        bmoins.setOnClickListener(this);
        bfois.setOnClickListener(this);
        bdivise.setOnClickListener(this);
        bplusoumoins.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Object[] ts = calc.getPile().toArray();

        switch(v.getId()) {
            case R.id.B0:
                calc.saisirChiffre(0);
                break;
            case R.id.B1:
                calc.saisirChiffre(1);
                break;
            case R.id.B2:
                calc.saisirChiffre(2);
                break;
            case R.id.B3:
                calc.saisirChiffre(3);
                break;
            case R.id.B4:
                calc.saisirChiffre(4);
                break;
            case R.id.B5:
                calc.saisirChiffre(5);
                break;
            case R.id.B6:
                calc.saisirChiffre(6);
                break;
            case R.id.B7:
                calc.saisirChiffre(7);
                break;
            case R.id.B8:
                calc.saisirChiffre(8);
                break;
            case R.id.B9:
                calc.saisirChiffre(9);
                break;
            case R.id.BClearSaisie:
                calc.clearSaisie();
                break;
            case R.id.BEnter:
                calc.Enter();
                break;
            case R.id.BErase:
                calc.Erase();
                break;
            case R.id.BFois:
                if (ts.length >= 2) {
                    calc.Fois();
                }
                else
                    Toast.makeText(MainActivity.this, "IL MANQUE DES TRUCS LOL", Toast.LENGTH_SHORT).show();
                break;
            case R.id.BMoins:
                if (ts.length >= 2) {
                    calc.Moins();
                }
                else
                    Toast.makeText(MainActivity.this, "IL MANQUE DES TRUCS LOL", Toast.LENGTH_SHORT).show();
                break;
            case R.id.BPlus:
                if (ts.length >= 2) {
                    calc.Plus();
                }
                else
                    Toast.makeText(MainActivity.this, "IL MANQUE DES TRUCS LOL", Toast.LENGTH_SHORT).show();
                break;
            case R.id.BDivise:
                if (ts.length >= 2) {
                    calc.Divise();
                }
                else
                    Toast.makeText(MainActivity.this, "IL MANQUE DES TRUCS LOL", Toast.LENGTH_SHORT).show();
                break;
            case R.id.BPlusOuMoins:
                if (ts.length >= 1)
                    calc.plusOuMoins();
                else
                    Toast.makeText(MainActivity.this, "IL MANQUE DES TRUCS LOL", Toast.LENGTH_SHORT).show();
                break;
        }

        ts = calc.getPile().toArray();

        saisie.setText(calc.getSaisie());

        int tmp = ts.length;
        if(tmp>=1)
        {
            pile0.setText(ts[tmp-1].toString());
        }
        else
            pile0.setText("");
        if(tmp>=2)
        {
            pile1.setText(ts[tmp-2].toString());
        }
        else
            pile1.setText("");
        if(tmp>=3)
        {
            pile2.setText(ts[tmp-3].toString());
        }
        else
            pile2.setText("");
        if(tmp>=4)
        {
            pile3.setText(ts[tmp-4].toString());
        }
        else
            pile3.setText("");
       /* if(!(ts.length<1))
            pile0.setText(ts[0].toString());
        else
            pile0.setText("");
        if(!(ts.length<2))
            pile1.setText(ts[1].toString());
        else
            pile1.setText("");
        if(!(ts.length<3))
            pile2.setText(ts[2].toString());
        else
            pile2.setText("");
        if(!(ts.length<4))
            pile3.setText(ts[3].toString());
        else
            pile3.setText("");*/

    }
}
