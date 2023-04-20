public class Task1 {
    public static void main(String[] args) {
//        char c1 = 'A';
//        char c2 = 'b';
//        Scanner iScanner = new Scanner(System.in);
//        System.out.println("Input amount of chars: ");
//        int amountOfChars = iScanner.nextInt();
//        String result = "";
//        char tmpC = c1;
//        for (int i = 0; i < amountOfChars; i++) {
//            if (tmpC == c1) {
//                result += c2;
//                tmpC = c2;
//            } else {
//                result += c1;
//                tmpC = c1;
//            }
//        }
//        System.out.println(result);

        // solve 2
//        Scanner cs = new Scanner(System.in);
//        System.out.print("Input amount of chars: ");
//        int amountOfChar = cs.nextInt();
//
//        String[] c= new String[] {"A","b"};
//
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < amountOfChar; i++) {
//            result.append(c[i % 2]);
//        }
//        System.out.println(result);

        // solve 3

        char a = 'A';
        char b = 'b';
        int n = 5;
        String str = "" + a + b;
        str = str.repeat(n / 2) + ((n % 2 == 1) ? a : "");

        System.out.println(str);
    }
}
