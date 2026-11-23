public class Student {

    public static final int PASS_MARK = 60;

    public String name;
    public int score;

    public boolean isPassing() {
        return score >= PASS_MARK;
    }

    public void print() {
        System.out.printf("%-10s %4d%n", name, score);
    }

    public String toString() {
        return name + " (" + score + ")";
    }
}
