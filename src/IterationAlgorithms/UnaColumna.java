package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

public class UnaColumna extends EstructuraIterator {
    public UnaColumna(Estructura estructura, int columna){
        super(estructura);
        this.x = columna;
        System.out.println("Suma de una columna\n");
    }

    @Override
    public Object next() {

        int pos = estructura.getPos(x, y);
        System.out.println("X:"+x+" Y: "+y+" Pos: "+ pos);
        y++;
        return pos;
    }

    @Override
    public boolean hasNext() {
        return y < estructura.getMaxY();
    }
}
