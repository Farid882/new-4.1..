public class Tank {

    int x, y;
    int dir;
    private int fuel;

    public Tank() {
        this(0, 0, 100);
    }


    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.fuel = 100;
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public void goForward(int i) {
        if (fuel > i) {
            if (dir == 0) x += i;
            else if (dir == 1) y += i;
            else if (dir == 2) x -= i;
            x += fuel - Math.abs(i);
        } else {
            x += fuel;
        }
        if (y<0)y=0;
    }

//    public void goForward(int i) {
//        if (fuel >= i) {
//            if (dir == 0) x += i;
//            else if (dir == 1) y += i;
//            else if (dir == 2) x -= i;
//            x += fuel - Math.abs(i);
//        } else {
//            x += fuel;
//        }
//    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}
