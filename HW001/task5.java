import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * *+Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, 
 * например 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
 *  
 */



public class task5 {
    public static void main(String[] args) {
       
        String task = "2? + ?5 = 69";
        task = task.replaceAll("\\s+", "");
        task = task.replace('+', '=');
//        System.out.println(task);
        String[] numbers = task.split("\\=");
//        int length = numbers.length; 
//        System.out.println(length);
    
//    System.out.println( arrayS(numbers[1]));
        char[] num1 = arrayS(numbers[0]);
        char[] num2 = arrayS(numbers[1]);
        char[] summ = arrayS(numbers[2]);
        
        int num = numbInt(num1);

        System.out.println(num);



    }


        public static char[] arrayS(String str) {
            String element = str;
            char[] array = element.toCharArray();
            return array;
        }    

//  

        public static int numbInt(char[]arr1, char[]arr2, char[]arr3) {
            int x = 0;
            char[] num1 = new char [arr1.length];
            char[] num2 = new char [arr2.length];
            char[] summ = new char [arr3.length];
            num1 = arr1;
            num2 = arr2;
            summ = arr3;

            int[] arrInt1 =new int[num1.length];
            for(int i = 0; i <num1.length; i++){
                if(num1[i]=='?'){
                    for(int j = 0; j < 10; j++){
                        arrInt1[i] = j;
                        
                        
                    } 
                    
                } else {
                    arrInt1[i] = Character.digit(num1[i], 10); 
              
                }
            
            }
            return x = arrInt[0]*10+arrInt[1];

        } 
    }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
        /*       
        String task = "2? + ?5 = 69";
        task = task.replaceAll("\\s+", "");
        char[] array = task.toCharArray();
       
        for(int i = 0; i < array.length; i++){
            if(array[i] == '?'){
                array[i] = 'k';
                for (int j = i; j < array.length; j++){
                    if(array[j] == '?'){
                        array[j] = 'm';
                    }
                }
            }
        }
        
    }


    public static char number() {
        char x = ' '; 
        for(int j = 0; j < 10; j++){

            x = (char) j;

        }
        return x;
    }
}







        int length = array.length;
        int[] num = new int[length];

        for (int i = 0; i < length; i++) {
        num[i] = Character.digit(array[i], 10);
        }

        System.out.println(Arrays.toString(num));


        qwee(array);
    }
    
    public static void qwee(char[] array) {
        System.out.println(array);

        
        for(int i = 0; i< array.length; i++)
            if(array[i] == 'k'){
                array[i] = 'p';

            }
        for(int k = 0; k <= 9; k++ ){
            for(int m = 0; m <=9; m++){
                if(array[0]*10+array[1] + array[3]*10+array[4] == array[6]*10+array[7]){
                    System.out.println("Пропущенные числа:" + k + m );
                } 


            }
        }

    }
        
    }    
       


*/