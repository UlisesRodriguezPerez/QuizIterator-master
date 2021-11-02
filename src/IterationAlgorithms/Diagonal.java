package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

public class Diagonal extends EstructuraIterator {

    public Diagonal(Estructura estructura){
        super(estructura);
        System.out.println("Suma de diagonal\n");
    }

    @Override
    public Object next() {
        int toReturn = this.estructura.getPos(x,y);
        System.out.println("X:"+x+" Y: "+y +" Pos: "+ toReturn);
        x = y = y+1;
        return toReturn;
    }

    @Override
    public boolean hasNext() {
        return x <= estructura.getMaxX()-1;
    }
}
