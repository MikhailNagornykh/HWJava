/*
 * простой калькулятор 
 * ("введите первое число"... "Введите второе число"... 
 * "укажите операцию, которую надо выполнить с этими числами"... 
 * "ответ: ...")
 */

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("введите первое число: ");
        double num1 = input.nextDouble();
        System.out.print("введите второе число: ");
        double num2 = input.nextDouble();
        System.out.print("укажите операцию выполнения(+, -, *, /): ");
        char ch = input.next().charAt(0); 

        if (ch == '+'){
            System.out.println("Сумма чисел равна: " + summ(num1, num2));
        } else if (ch == '-') {
            System.out.println("Разность чисел равна: " + diff(num1, num2));
        } else if(ch == '*'){
            System.out.println("Произведение чисел равно: " + multi(num1, num2)); 
        } else if(ch == '/') {
            System.out.println("Результат деления: " + div(num1, num2));
        } else {
            System.out.println("Выбрана не верная операция");
        }
    }

    public static double summ(double a, double b) {

            double res = 0;
            res = a + b;
            return res;
        }

    public static double diff(double a, double b) {

            double res = 0;
            res = a - b;
            return res;
        }

    public static double multi(double a, double b) {

            double res = 0;
            res = a + b;
            return res;
        }

    public static double div(double a, double b) {

            double res = 0;
            res = a / b;
            return res;
        }

    }

