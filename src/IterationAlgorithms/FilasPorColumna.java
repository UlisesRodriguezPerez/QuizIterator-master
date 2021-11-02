package IterationAlgorithms;

import model.Estructura;
import model.EstructuraIterator;

public class FilasPorColumna extends EstructuraIterator {

    public FilasPorColumna(Estructura estructura) {
        super(estructura);
        System.out.println("Suma de filas por columna\n");
    }

    @Override
    public Object next() {
        System.out.println("X:"+ x + " Y:" + y);
        int valor = this.estructura.getPos(x, y);
        x++;
        if (x == estructura.getMaxX()) {
            y++;
            x = 0;
        }
        return valor;
    }

    @Override
    public boolean hasNext() {
        return y<this.estructura.getMaxY();
    }
}
