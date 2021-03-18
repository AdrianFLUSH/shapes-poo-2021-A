package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Rectangle extends Shape {

    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    public int getPerimeter(){
        return(2*this.base + 2*this.height);
    }
    public int getArea(){
        return (this.base * this.height);
    }
    public int getSidesCount(){
        return 4;
    }

    public String getName() {
        return "Rectangle";
    }
}
