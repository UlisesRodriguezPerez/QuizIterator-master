package model;

import IteratorPattern.IAgreggate;
import IteratorPattern.Iterator;

import java.util.Arrays;


public class Estructura implements IAgreggate{

    int[][] matriz;

    public Estructura(int largo,int ancho){
        matriz = new int[largo][ancho];
        initMatriz();
    }

    public void initMatriz(){
        System.out.println("MATRIZ\n");
        for (int i = 0;i<matriz.length;i++) {
            for(int j = 0;j<matriz[i].length;j++){
                matriz[i][j] = j+1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n*****************************************\n");
    }

    public int getPos(int x,int y){
        return matriz[y][x];
    }

    @Override
    public Iterator getIterator(EnumAlgoritmo tipo) {
        return FactoryIterator.get(this,tipo);
    }
    @Override
    public Iterator getIterator(EnumAlgoritmo tipo,int number) {
        return FactoryIterator.get(this,tipo,number);
    }

    public int sumatoria(EnumAlgoritmo tipo) {
        Iterator<Integer> iterator = getIterator(tipo);
        return sumatoria(iterator);
    }

    public int sumatoria(EnumAlgoritmo tipo,int numero){
        Iterator<Integer> iterator = getIterator(tipo,numero);
        return sumatoria(iterator);
    }

    private int sumatoria(Iterator<Integer> iterator){
        int sumatoria = 0;
        while (iterator.hasNext()){
            sumatoria += iterator.next();
        }
        System.out.println("Result Sum:"+sumatoria);
        return sumatoria;
    }

    //Retorna  el largo de las columnas
    public int getMaxX() {
        return matriz[0].length;
    }

    //Retorna el largo de las filas
    public int getMaxY() {
        return matriz.length;
    }
}
