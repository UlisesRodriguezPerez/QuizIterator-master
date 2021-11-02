package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

public class ColumnasImpares extends EstructuraIterator {

    public ColumnasImpares(Estructura estructura) {
        super(estructura);
        System.out.println("Suma de las columnas Impares\n");
    }

    @Override
    public Object next() {
        int valor = 0;
        if (!esPar(this.x)) {
            System.out.println("X:"+ x + " Y:" + y);
            valor = estructura.getPos(x, y);
            y++;
        }else {
            x++;
            y = 0;
        }
        if (y == estructura.getMaxY()){
            x++;
            y = 0;
        }

        return valor;
    }

    @Override
    public boolean hasNext() {
        return this.x < this.estructura.getMaxX() || (x+1 == estructura.getMaxX() && !esPar(x+1));
    }

    private boolean esPar(int pos){
        return pos%2 == 0;
    }
}
