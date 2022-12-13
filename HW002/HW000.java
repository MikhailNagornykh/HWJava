import java.util.*;
import java.util.Map;

public class HW000 {
    public static void main(String[] args) {
    
        Equation();

        
    }

    public static String GetString(){

	    Scanner str = new Scanner(System.in);
	    String equation;
	    System.out.print("Введите формулу: ");
	    equation = str.nextLine();
	    return equation;
	    
	}

    public static void Equation(){

        Map<String, Integer> states = new HashMap<String, Integer>();
	    	    
	    Scanner str = new Scanner(System.in);
	    // a + b + c + d + c
	    String equation = GetString();
	    equation = String.format(equation).replace(" ","");
	    String[] st1 = equation.split("\\+");
	    

        int sum = 0;
        System.out.print("Введите элемент " + st1[0] + ": ");
        states.put(st1[0], str.nextInt());
        StringBuilder statesKey = new StringBuilder();

        for (int i = 1; i < st1.length; i++ ){
            {
                for(Map.Entry<String, Integer> item : states.entrySet()){
                    if(states.containsKey(st1[i])){

                        statesKey.append(i + st1[i]);
//                        System.out.println(statesKey);
                        String result = statesKey.toString();
                        states.put(result  , item.getValue());
                        break;
                        
                    } else {
                        System.out.print("Введите элемент " + st1[i] + ": ");
                        states.put(st1[i], str.nextInt());
                        break;


                    }

                }
            }
        }    
        
        for(Map.Entry<String, Integer> item : states.entrySet()){
                sum += item.getValue();
            }
            System.out.print(sum);

        }



}









