public class gg {
    public static void main(String[] args) {
        Shape arr [] = new Shape[]{new Shape(), new Square(), new Circle()};
        for (int i = 0; i <arr.length ; i++) {
            arr[i].draw();
        }

    }
}
