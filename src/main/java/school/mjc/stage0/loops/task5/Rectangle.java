package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < length; i++) {
                if (j == 0 || j == height - 1) {
                    System.out.print("8");
                } else if (i == 0 || i == length - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
