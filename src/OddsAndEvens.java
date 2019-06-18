import java.util.*;

public class OddsAndEvens {

    public static void main(String[] args){
        System.out.println("Let’s play a game called Odds and Evens");

        System.out.println("What's your name loser?");
        Scanner input1 = new Scanner(System.in);
        String name = input1.nextLine().toUpperCase();

        System.out.println("Hi "+ name +", which do you choose? (O)dds or (E)vens?");
        Scanner input2 = new Scanner(System.in);
        String choose = input2.nextLine().toUpperCase();

        if (choose.equals("O")) {
            System.out.println(name +" has picked \"ODDS\"! The computer will be evens.");
        }else if(choose.equals("E")){
            System.out.println(name +" has picked \"EVENS\"! The computer will be odds.");
        }else System.out.println(name +" you must pick O or E \n **********************************************");

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("How many “fingers” do you put out?");
        Scanner input3 = new Scanner(System.in);
        int userFingers = input3.nextInt();

        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays number "+ computer);

        System.out.println("--------------------------------------------------------------------------------------------");

        int sum = userFingers + computer;
        System.out.println(userFingers + " + " + computer + " = " + sum);

        boolean oddOrEven = sum % 2 == 0;

        if (oddOrEven){
            System.out.println(sum + " is... even!");
            if (choose.equals("E")){
                System.out.print("That means "+ name + " wins!");
            } else {
                System.out.print("That means Computer wins!");
            }
        } else {
            System.out.print(sum + " is... odd!");
            if (choose.equals("O")){
                System.out.print("That means " + name + " wins!");
            } else {
                System.out.print("That means Computer wins!");
            }
        }
    }
}
