package predavanje4.loops;
//Razlika izmedju while i do while petlje je u početnim uslovima
// DOWHILE - ista kao while sa razlikom sto ce se prvo uci u blok koda DO pa onda provjeravati uslov
// dok kod while prvo provjerava uslov pa onda uci u blok koda

public class DoWhileDemo {

    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Count is " + count);
            count++;
        } while (count < 11);
    }

}
