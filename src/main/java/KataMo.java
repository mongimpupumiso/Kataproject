import java.util.Arrays;
import java.util.Scanner;

// OUR CLASS KataMo BY Mo and Mo.

public class KataMo{

// Write a function hello.
        public static String hello(String name) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String m = scanner.next();
            System.out.println("hello " + m);
            return m;
        }

// The Code to check if the number is even or odd.

        public static void evenOrOdd() {
        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        if (m % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }

// Draw a square.

    public static void square(int num) {
        for (int i = 0; i < num; i++) {
            for (int m = 0; m < num; m++) {
                System.out.print(" * ");
            }
            System.out.println("");

        }
    }

// Draw a triangle.

    public static void triangle(int number) {
        for (int k = 0; k < number; k++) {


            for (int l = 0; l <= k; l++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }

// Draw an isosceles triangle.

    public static void pyramid(int rows, int m) {
        for (int i = 1; i <= rows; ++i, m = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }
            while (m != 2 * i - 1) {
                System.out.print("* ");
                ++m;
            }
            System.out.println();
        }

    }


//Find the longest string.

    public static String findLongestName(String[] words) {
        int length = words.length;
        String longestName = words[0];
        for (int i = 0; i <= 6; i++) {
            if (words[i].length() > longestName.length()) {
                longestName = words[i];
            }
        }
            return longestName;
    }

// Combine two lists or arrays.

    public static void concatStrings(){
        int[] array1 = {11, 22, 33};
        int[] array2 = {1, 2, 3};
        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];
        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);
        System.out.println(Arrays.toString(result));
    }

//Frame some text.

//    public static void frame() {
//        for (int i = 1; i <= 5; i++) {
//            for (int m = 1; m <= 8; m++)
//                if (i >= 2 && m >= 2 && m <= 4) {
//                    System.out.print("");
//                } else {
//                    System.out.print("*");
//                }
//        }
//        System.out.println();
//    }

// Frame some text.

    public static void frame(String[] arr){
        String longestString = arr[0];
        for(int a = 0; a < arr.length; a++){
            if(arr[a].length()>longestString.length()){
                longestString = arr[a];
            }
        }
        int FrLength = longestString.length()+4;
        for(int b = 0; b<FrLength; b++){
            if(b==(FrLength-1)){
                System.out.println("*");
            }else{
                System.out.print("*");
            }
        }
        for(String c : arr) {
            System.out.print("* "+c);
            int rmgSpace = FrLength - (c.length()+3);
            for(int k = 0; k<rmgSpace; k++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int b = 0; b<FrLength; b++){
            if(b==(FrLength-1)){
                System.out.println("*");
            }else{
                System.out.print("*");
            }
        }
    }


// THE MAIN METHOD WHERE I AM CALLING ALL FUNCTIONS ABOVE.


    public static void main(String[] args){
        hello("Mongi");
        System.out.println("<=====================================================>\n<=====================================================>");
        evenOrOdd();
        System.out.println("<=====================================================>\n<=====================================================>");
        square(4);
        System.out.println("<=====================================================>\n<=====================================================>");
        triangle(4);
        System.out.println("<=====================================================>\n<=====================================================>");
        pyramid(2, 0);
        System.out.println("<=====================================================>\n<=====================================================>");
        String [] names = {"the","quick","brown", "fox", "ate", "my", "chickens"};
        String word = findLongestName(names);
        System.out.println( word);
        System.out.println("<=====================================================>\n<=====================================================>");
        concatStrings();
        System.out.println("<=====================================================>\n<=====================================================>");
//        frame();
        System.out.println("<=====================================================>\n<=====================================================>");
        Scanner Obj = new Scanner(System.in);
        System.out.println("Please enter Space separated words to frame");
        String input = Obj.nextLine();
        String[] words = input.split(" ");
        frame(words);

    }
}
