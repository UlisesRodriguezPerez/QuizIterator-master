package IterationAlgorithms;


import model.Estructura;
import model.EstructuraIterator;

public class ColumnasXFilas extends  EstructuraIterator{

    public ColumnasXFilas(Estructura estructura){
        super(estructura);
        System.out.println("Suma de columnas por fila\n");
    }

    @Override
    public Object next() {

        int pos = estructura.getPos(x, y);
        System.out.println("X:"+x+" Y: "+y+" Pos: "+ pos);
        if(y < (estructura.getMaxY()-1)){
            y++;
        }else{
            x++;
            y=0;
        }
        return pos;
    }

    @Override
    public boolean hasNext() {
        return x < estructura.getMaxX();
    }

}
