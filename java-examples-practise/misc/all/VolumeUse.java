package volume;

public class VolumeUse {

    public static void main(String args[]) {

        Cylinder cy = new Cylinder();
        cy.getVolume();
        Box bx = new Box();
        bx.getVolume();
    }
}


class Cylinder {
    int r;
    int h;


    public float getVolume() {
        return (float) (Math.PI * r * r * h);
    }
}


class Box {
    int l;
    int w;
    int h;

    public float getVolume() {
        return l * w * h;
    }
}