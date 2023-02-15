package ua.pp.voronin.serhii.tommy.model.packaging;

public class Box {

    private int side; // в міліметрах

    public Box(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "ящик {" + side + '*' + side + '*' + side + '}';
    }
}
