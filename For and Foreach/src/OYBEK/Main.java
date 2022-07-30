package OYBEK;

public class Main {

    public static void main(String[] args) {
	// For va Foreach

        int [] array = new int[3];
        array[2] = 10;
        array[1] = 20;
        array[0] = 30;
        System.out.println("Foreach ");

        for (int a : array) {
            System.out.println(a);
        }

        System.out.println("For ");


        for (int i = 0; i < array.length; i++) {
            System.out.println(i);

        }
    }
}
