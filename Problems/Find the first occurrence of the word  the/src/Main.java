import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        System.out.print(input.indexOf("the"));

    }
}