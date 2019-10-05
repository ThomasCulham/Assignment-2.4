import java.util.Scanner;

 class RunningTally {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        boolean run=true;
        int total=0;
        System.out.println("Let's add some numbers! [Type a negative number to quit]");
        while(run){
          int Input = sc.nextInt();
          if(Input>=0){
              total+=Input;
            }else{
              run=false;
              System.out.println("Total: "+total);
            }
            
        }
    }
}
