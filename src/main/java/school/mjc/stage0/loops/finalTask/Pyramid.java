package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        String x = "";
        for (int i = 1; i <= cathetusLength; i++) {
            x = "1";
            for (int j = 2; j <= cathetusLength; j++) {
                if (j <= i) {
                    x = j + x + j;
                } else {
                    x=" "+x;
                }
            }
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
