import java.util.Scanner;

class GuessingGame {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Boolean run = true;
        Boolean found = false;
        int num=0;
        while(run){
            num = (int)(Math.random()*100)+1;
            int t=0;
            System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
             while (found == false){
                System.out.print("What is your guess?  ");
                int n = sc.nextInt();
                if(n<num){
                    t++;
                  System.out.println("Too low ...");
                }else if(n>num){
                    t++;
                  System.out.println("Too high ...");  
                }else{
                    t++;
                    System.out.println("You've guessed my number! Good job! It only took you " + t + " tries.");
                    found=true;
                }
             }

            System.out.print("Would you like to roll again? (y/n)  ");
            String Ans = sc.next();
            if(Ans.equals("n")||Ans.equals("n")){
                run=false;
            }else{
                found=false;
            }
        }

    }
}
