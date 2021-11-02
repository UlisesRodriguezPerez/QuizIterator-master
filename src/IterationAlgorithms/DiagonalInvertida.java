package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

public class DiagonalInvertida extends EstructuraIterator {

    public DiagonalInvertida(Estructura estructura){
        super(estructura);
        this.x = estructura.getMaxX()-1;
        this.y = 0;
        System.out.println("Suma de la diagonal invertida\n");
    }

    @Override
    public Object next() {
        int pos = estructura.getPos(x, y);
        System.out.println("X:"+x+" Y: "+y+" Pos: "+ pos);
        x--;
        y++;
        return pos;
    }

    @Override
    public boolean hasNext() {
        return x >= 0 && y < estructura.getMaxY();
    }
}