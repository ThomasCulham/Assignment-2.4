import java.util.Scanner;

 class DiceRoll {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Boolean run = true;
        int out;
        while(run){
            System.out.println("How many six sided dice do you want to roll?");
            int n = sc.nextInt();
            for(int i=0; i<n;i++){
              out= (int)(Math.random()*6)+1;
              System.out.print(  out +  " "  );
            }
           System.out.println(""); 
           System.out.println("Would you like to roll again? (y/n)");
           String Ans = sc.next();
           if(Ans.equals("n")||Ans.equals("n")){
               run=false;
           }
        }
            
        
    }
}
