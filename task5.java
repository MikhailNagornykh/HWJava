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

// исправить перебор в новую Ф. 

        public static int numbInt(char[]arr) {
            int x = 0;
            int[] arrInt =new int[arr.length];
            for(int i = 0; i < arr.length; i++){
                if(arr[i]=='?'){
                    for(int j = 0; j < 10; j++){
                        
                        arrInt[i] = j;
                        System.out.println(arrInt[i]);
                    } 
                    
                } else {
                    arrInt[i] = Character.digit(arr[i], 10); 
              
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