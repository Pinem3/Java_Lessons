package Gornik;
import  java.util.Scanner;
public class FirstProject {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int j = 1;
                System.out.print("Введите длину массива: ");
                while(!sc.hasNextInt()){
                    System.out.print("Неверный ввод. Введите целое число: ");
                }
                j = sc.nextInt();
                int[] numbers = new int[j];
                System.out.print("Введите числа массива: ");
                        int sum = 0;
                for( int i = 0; i < numbers.length; i++){
                        numbers[i] = sc.nextInt();
                        sum += numbers[i];
                }
                int med = sum/j;
                System.out.print("Сумма элементов массива: ");
                System.out.println(sum);
                System.out.print("Среднее арифметическое массива: ");
                System.out.print(med);
        }
}