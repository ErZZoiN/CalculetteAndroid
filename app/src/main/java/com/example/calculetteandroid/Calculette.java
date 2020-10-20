package com.example.calculetteandroid;

import java.lang.Object;
import java.util.Stack;

public class Calculette {
    private Stack<Float> pile;
    private String saisie;

    public Calculette()
    {
        pile = new Stack<Float>();
        saisie="";
    }

    public Stack<Float> getPile()
    {
        return pile;
    }

    public void Erase()
    {
        pile.clear();
        saisie="";
    }

    public void setPile(Stack<Float> p)
    {
        pile = p;
    }

    public String getSaisie(){return saisie;}
    public void setSaisie(String s){saisie=s;}

    public void saisirChiffre(int i)
    {
        saisie = saisie.concat(String.valueOf(i));
    }

    public void clearSaisie()
    {
        saisie="";
    }
    public void plusOuMoins()
    {
        float buf = pile.pop();
        buf = -buf;
        pile.push(buf);
    }

    public void Plus()
    {
        float a = pile.pop();
        float b = pile.pop();

        pile.push(a+b);
    }

    public void Moins()
    {
        float a = pile.pop();
        float b = pile.pop();

        pile.push(b-a);
    }

    public void Fois()
    {
        float a = pile.pop();
        float b = pile.pop();

        pile.push(a*b);
    }

    public void Divise()
    {
        float a = pile.pop();
        float b = pile.pop();

        pile.push(b/a);
    }

    public void Enter()
    {
        pile.push(Float.parseFloat(saisie));
        clearSaisie();
    }
}
