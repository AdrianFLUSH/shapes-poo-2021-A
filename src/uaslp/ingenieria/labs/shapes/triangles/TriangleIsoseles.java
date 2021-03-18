package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleIsoseles extends Triangle {
    private int side;
    private int side2;

    public TriangleIsoseles(int side, int side2) {

        this.side = side;
        this.side2 = side2;
    }

    public int getArea(){
        return ((this.side*(this.side2^2-(this.side^2)/4)^(1/2))/2);
    }
    public int getPerimeter(){
        return (this.side + this.side2*2);
    }
    public int getSidesCount(){
        return 3;
    }
}
