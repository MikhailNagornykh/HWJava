/*
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n)
 */
import java.util.Scanner;



public class Tnumber {
    public static void main(String[] args) {
        
        System.out.print("Введите пложтельное целое число: ");
        Scanner input = new Scanner(System.in);
        int order = input.nextInt();
        System.out.println("Треугольное число равно: " + 0.5*order*(order+1));
    }   

}
