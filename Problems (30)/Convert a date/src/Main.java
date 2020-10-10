import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        String[] line = date.split("-");
        System.out.println(line[1] + "/" + line[2] + "/" + line[0]);
    }
}