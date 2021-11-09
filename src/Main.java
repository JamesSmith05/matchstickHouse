import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many houses are you building ?");
        System.out.println("That will require " + calculator() + " matchsticks");
    }
    public static int calculator(){
        int houses = input.nextInt();
        if (houses==0){
            return 0;
        }
        else{
            return (5*houses)+1;
        }
    }
}
