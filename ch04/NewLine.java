public class NewLine {

    public static void newLine() {
        System.out.println();
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    public static void messageSandwhich() {
    System.out.println("You're doing great sweetie!");
    }

    public static void main(String[] args) {
        System.out.println("First line.");
        messageSandwhich();
        System.out.println("Second line.");
    }

}
