package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleEquilatero extends Triangle {
    private int side;

    public TriangleEquilatero(int side) {

        this.side = side;
    }
    public int getArea(){
        return (((3^(1/2))/4)*(this.side/2)^2);
    }
    public int getPerimeter(){
        return this.side*3;
    }
    public int getSidesCount(){
        return 3;
    }
}
