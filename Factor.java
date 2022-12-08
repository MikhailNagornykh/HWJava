/*
 * Вычислить n! (произведение чисел от 1 до n)
 */
import java.util.Scanner;


public class Factor {
    public static void main(String[] args) {
       
        System.out.print("Введите пложтельное целое число: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int fact = 1;
       
        if (number == 0 && number == 1){
            System.out.println("Факториал числа равен:" + fact);
        } else {
            while(number > 1 ){
                fact *= number;
                number -=1;
            }
        System.out.println("Факториал числа равен:" + fact);    
        }
    }
    
}
