package predavanje3;
// 1. | --> Bitwise OR 
// 2. & --> Bitwise AND
// 3. ^ --> Bitwise XOR
// 4. ~ --> Bitwise komplement 

public class BitOperatorDemo {

    public static void main(String[] args) {
        int a = 5; 
        int b = 7;
        // 0b0101 = 5
        // 0b0111= 7
  //result = 0111 (Bitwise OR) = 7 jer je 7 veći broj od 5
  int result = a|b;
        System.out.println(result);
               //2. & --> Bitwise AND result = oba 
        int result1 = a&b;
        System.out.println(result1);
        //3. ^ --> Bitwise XOR --> ako su odg BITi različiti rezultat je 1 a ako su isti bit će 0
        int result2 = a^b;
        System.out.println(result2);
        //4. Bitwise komplement ~ obrce vrijednost u binarnom broju
        // 0111 --> 1110
        int result3= ~b;
        System.out.println(result3); 
        
    }
}
