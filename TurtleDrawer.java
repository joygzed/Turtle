public class TurtleDrawer {

    public static void Polygon(Turtle t, int sides, int size) {
        for (int i = 0; i < sides; i++) {
            t.forward(size);
            t.left(360 / sides);
        }
    }
    public static void Body(Turtle t, int size) {
        t.penColor("blue");
        t.width(5);
        Polygon(t, 4, size);
    }
    public static void Roof(Turtle t, int size) {
        t.up();
        t.left(90);
        t.forward(size);
        t.right(90);
        t.down();
        t.penColor("red");
        t.width(5);
        Polygon(t, 3, size);
        t.up();
        t.right(90);
        t.forward(size);
        t.left(90);
        t.down();
    }
    public static void Door(Turtle t, int size) {
        t.up();
        t.forward(size / 2 - 15);
        t.down();
        t.penColor("green");
        t.width(4);
        for (int i = 0; i < 2; i++) {
            t.forward(30);
            t.left(90);
            t.forward(size / 2);
            t.left(90);
        }
        t.up();
        t.backward(size / 2 - 15);
        t.down();
    }
    public static void Window(Turtle t, int size) {
        t.up();
        t.forward(15);
        t.left(90);
        t.forward(size - 35);
        t.right(90);
        t.down();
        t.penColor("purple");
        t.width(3);
        Polygon(t, 4, 20);
    }
    public static void Sun(Turtle t, int size) {
        t.up();
        t.forward(size + 40);
        t.left(90);
        t.forward(size + 30);
        t.right(90);
        t.down();
        t.penColor("orange");
        t.width(3);
        Polygon(t, 12, 10);
    }
    public static void House(Turtle t, int size) {
        Body(t, size);
        Roof(t, size);
        Door(t, size);
        Window(t, size);
        Sun(t, size);
    }
    public static void main(String[] args) {
        Turtle bob = new Turtle();
        bob.penColor("red");
        bob.width(2);
        Polygon(bob, 3, 50);
        bob.up();
        bob.forward(135);
        bob.down();
        bob.penColor("blue");
        bob.width(3);
        Polygon(bob, 4, 50);
        bob.up();
        bob.right(90);
        bob.forward(135);
        bob.left(90);
        bob.down();
        bob.penColor("green");
        bob.width(4);
        Polygon(bob, 5, 45);
        bob.up();
        bob.backward(135);
        bob.down();
        bob.penColor("purple");
        bob.width(5);
        Polygon(bob, 6, 40);
        bob.up();
        bob.right(90);
        bob.forward(170);
        bob.left(90);
        bob.down();
        House(bob, 100);
    }
}
