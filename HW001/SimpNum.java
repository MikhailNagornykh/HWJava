/*
 * Вывести все простые числа от 1 до 1000 (простые числа - 
 * это числа которые делятся только на себя и на единицу без остатка. 
 * Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
 */


public class SimpNum {
    public static void main(String[] args) {
        
        int number = 1000;
        boolean flag = true;
        for(int i = 2 ; i <= number; i++) {
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0){
                   flag = false; // "ru.stackoverflow.com" мне в помощь
                   break; 
                }
            }
            if (flag) System.out.print(i + " ");
            else flag = true;
        }
    }
}
