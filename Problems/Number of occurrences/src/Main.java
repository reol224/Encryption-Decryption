import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        /*String input = scanner.nextLine();

        String subinput = scanner.nextLine();

        char[] inputt = input.toCharArray();
        char[] subinputt = subinput.toCharArray();
        int count = 0;
        int j;

        for (int i = 0; i < inputt.length;i++) {
            for (j = 0; j < subinputt.length; j++) {
                if (inputt[i + j] != subinputt[j]) {
                    break;
                }
            }
            if (j == subinputt.length) {
                count++;
            }
        }*/

        String str = scanner.nextLine();
        String substr = scanner.nextLine();
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            int index = str.indexOf(substr, i);
            if (index >= 0) {
                counter++;
                i = index + 1;
            }
        }

        System.out.println(counter);
    }
}