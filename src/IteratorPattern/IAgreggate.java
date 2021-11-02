package IteratorPattern;


import model.EnumAlgoritmo;

public interface IAgreggate {
    Iterator getIterator(EnumAlgoritmo tipo);
    Iterator getIterator(EnumAlgoritmo tipo,int number);
}

