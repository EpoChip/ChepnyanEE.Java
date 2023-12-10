//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива через пробел: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split("\\s+");

        int[] array = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        System.out.println("Элементы массива, кратные 3:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
