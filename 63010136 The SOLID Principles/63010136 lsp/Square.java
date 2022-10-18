package com.solid.lsp;

public class Square {

    private Rectangle rec = new Rectangle();
    public Square(int side) {
        this.setSide(side);
    }

    public void setSide(int side) {
        rec.setWidth(side);
        rec.setHeight(side);
    }

    public int getSide() {
        return rec.getWidth();
    }

    public int getArea() {
        return rec.getArea();
    }
}
