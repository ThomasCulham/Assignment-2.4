import java.util.Scanner;

 class Triangle {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What character do you want your bar made of?");
        String let = sc.nextLine();
        System.out.println("How tall do you want your triangle?");
        int tall = sc.nextInt();
        for(int i=0; i<tall;i++){
          for(int n=0; n<i+1;n++){
            System.out.print(let);
          }
           System.out.println("");
        }
            
        
    }
}
