package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

    public class UnaFila extends  EstructuraIterator{

        public UnaFila(Estructura estructura, int columna){
            super(estructura);
            this.y = columna;
            System.out.println("Suma de una fila");
    }

    @Override
    public Object next() {

        int pos = estructura.getPos(x, y);
        System.out.println("X:"+x+" Y: "+y+" Pos: "+ pos);
        x++;
        return pos;
    }

    @Override
    public boolean hasNext() {
        return x < estructura.getMaxX() ;
    }
}

