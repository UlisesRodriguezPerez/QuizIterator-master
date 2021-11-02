package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

public class ColumnasPares extends EstructuraIterator {
    public ColumnasPares(Estructura estructura){
        super(estructura);
        System.out.println("Suma columnas pares\n");
    }

    @Override
    public Object next() {
        if (x % 2 != 0 && y == 0)
            x++;
        int pos = estructura.getPos(x, y);
        System.out.println("X:"+x+" Y: "+y+" Pos: "+ pos);
        y++;
        if (y == estructura.getMaxY()){
            y = 0;
            x++;
        }
        return pos;
    }

    @Override
    public boolean hasNext() {
        if(estructura.getMaxX() % 2 == 0)
            return x < estructura.getMaxX()-1 && y < estructura.getMaxY();
        else {
            return x < estructura.getMaxX() && y < estructura.getMaxY();
        }
    }
}
