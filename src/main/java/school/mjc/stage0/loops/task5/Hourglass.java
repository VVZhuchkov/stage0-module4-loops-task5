package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((j < i || j > height - i - 1) && (j > i || j < height - i - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("8");
                }
            }
            System.out.println();
        }
    }
}