package model;

import IteratorPattern.Iterator;

public abstract class EstructuraIterator implements Iterator {
    protected Estructura estructura;
    protected int x,y;

    protected EstructuraIterator(Estructura estructura){
        this.estructura = estructura;
        x = y = 0;
    }

    @Override
    public abstract Object next();

    @Override
    public abstract boolean hasNext();
}
