import java.util.*;

class Guesser{
    int gNum;

    int guesseingNum(){
        System.out.println("Guesser,Kindly guess a number");
        Scanner scan = new Scanner(System.in);
        gNum = scan.nextInt();
        return gNum;
    }
}
class Player{
    int pNum;

    int predictingNum(){
        System.out.println("Player,Kindly predict a number");
        Scanner scan = new Scanner(System.in);
        pNum = scan.nextInt();
        return pNum; 
    }
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    
    void collectingNumFromGucesser(){
        Guesser g = new Guesser ();
        numFromGuesser= g.guesseingNum();
    }

    void collectingNumFromPlayer(){
        Player p1 = new Player();
        numFromPlayer1 = p1.predictingNum();
        Player p2 = new Player();
        numFromPlayer2 = p2.predictingNum();
        Player p3 = new Player();
        numFromPlayer3 = p3.predictingNum();

    }

    void  comparing(){
        if(numFromGuesser == numFromPlayer1)
        {
            System.out.println("Congratulation , You guess correct ");
        }
        else if(numFromGuesser == numFromPlayer2)
        {
            System.out.println("Congratulation , You guess correct ");
        }
        else if(numFromGuesser == numFromPlayer3)
        {
            System.out.println("Congratulation , You guess correct ");
        }
    }

}

public  class GuesserGame{
    public static void main (String [] args){
        Umpire u = new Umpire();
        u.collectingNumFromGucesser();
        u.collectingNumFromPlayer();
        u.comparing();
        System.out.println("Thank You");
    }
}


