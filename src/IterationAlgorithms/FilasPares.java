package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

public class FilasPares extends EstructuraIterator {

    public FilasPares(Estructura estructura) {
        super(estructura);
        System.out.println("Suma de filas pares\n");
    }

    @Override
    public Object next() {
        int valor = 0;
        if (esPar(this.y)) {
            System.out.println("X:"+ x + " Y:" + y);
            valor = estructura.getPos(x, y);
            x++;
        }else {
            y++;
            x = 0;
        }
        if (x == estructura.getMaxX()){
            y++;
            x = 0;
        }

        return valor;
    }

    @Override
    public boolean hasNext() {
        return this.y < this.estructura.getMaxY() || (y+1 == estructura.getMaxY() && !esPar(y+1));
    }

    private boolean esPar(int pos){
        return pos%2 == 0;
    }
}
