package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

public class FilasImpares extends EstructuraIterator {
    public FilasImpares(Estructura estructura){
        super(estructura);
        System.out.println("Suma de filas impares\n");
    }

    @Override
    public Object next() {
        if (y % 2 == 0 && x == 0)
            y++;
        int pos = estructura.getPos(x, y);
        System.out.println("X:"+x+" Y: "+y+" Pos: "+ pos);
        x++;
        if (x == estructura.getMaxX()){
            x = 0;
            y++;
        }
        return pos;
    }

    @Override
    public boolean hasNext() {
        if(estructura.getMaxY() % 2 == 0)
            return y < estructura.getMaxY() && x < estructura.getMaxX();
        else {
            return y < estructura.getMaxX()-1 && x < estructura.getMaxX();
        }
    }
}
