package model;

import java.util.HashMap;

import IterationAlgorithms.*;
import IteratorPattern.Iterator;

public class FactoryIterator {

    static HashMap<EnumAlgoritmo,Iterator<Integer>> iterators;

    public static void initFactory(){

    }

    public static Iterator<Integer> get(Estructura estructura,EnumAlgoritmo tipo){
        switch(tipo){
            case DIAGONAL:
                return new Diagonal(estructura);
            case COLUMNASIMPARES:
                return new ColumnasImpares(estructura);
            case COLUMNASPARES:
                return new ColumnasPares(estructura);
            case COLUMNASPORFILAS:
                return new ColumnasXFilas(estructura);
            case DIAGONALINVERTIDA:
                return new DiagonalInvertida(estructura);
            case FILASIMPARES:
                return new FilasImpares(estructura);
            case FILASPARES:
                return new FilasPares(estructura);
            case FILASPORCOLUMNAS:
                return new FilasPorColumna(estructura);
            case UNACOLUMNA:
//                return new UnaColumna(estructura,3);
            case UNAFILA:
               // return new UnaFila(estructura,5);
        }
        return null;
    } 
    public static Iterator<Integer> get(Estructura estructura,EnumAlgoritmo tipo,int number){
        switch(tipo){
            case UNACOLUMNA:
                return new UnaColumna(estructura,number);
            case UNAFILA:
                return new UnaFila(estructura,number);
            default:
                return get(estructura,tipo);
        }
    } 
}
