/**
 * Fabrizio Ferreto
 * Ulises Rodriguez
 * Fernando Álvarez
 * Crystel Montero
 * */

import model.EnumAlgoritmo;
import model.Estructura;
import model.FactoryIterator;

public class Main {
    public static void main(String[] args) {
        FactoryIterator.initFactory();
        Estructura e = new Estructura(6,6);
        System.out.println("Algoritmos\n");
        e.sumatoria(EnumAlgoritmo.DIAGONAL);
        System.out.println("********************************************************\n");
        e.sumatoria(EnumAlgoritmo.UNACOLUMNA,4);
        System.out.println("********************************************************\n");
        e.sumatoria(EnumAlgoritmo.FILASIMPARES);
        System.out.println("********************************************************\n");
        e.sumatoria(EnumAlgoritmo.COLUMNASPARES);
        System.out.println("********************************************************\n");
        e.sumatoria(EnumAlgoritmo.UNAFILA, 2);
        System.out.println("********************************************************\n");
        e.sumatoria(EnumAlgoritmo.COLUMNASIMPARES);
        System.out.println("********************************************************\n");
        e.sumatoria(EnumAlgoritmo.FILASPORCOLUMNAS);
        System.out.println("********************************************************\n");
        e.sumatoria(EnumAlgoritmo.FILASPARES);
        System.out.println("********************************************************\n");
        e.sumatoria(EnumAlgoritmo.COLUMNASPORFILAS);
        System.out.println("********************************************************\n");
        e.sumatoria(EnumAlgoritmo.DIAGONALINVERTIDA);
        System.out.println("********************************************************\nFIN");
    }
}
