import java.util.Scanner; 

class Question7 {
    public static void main(String[] args){
       Scanner Scan = new Scanner(System.in);
       int NumberOfDice = 0;
       int DiceSides = 0;
       int Total = 0;
       int RolledNumbers = 0;
       int RollResult = 0;
       String Continue = "Y";
       
       System.out.println("");
       System.out.println(": Welcome to the bar! Wanna roll some dice? Let's go cowboy.");
       System.out.println("");

       while (Continue.equals("Y")){
           Total = 0;
           System.out.print("How many dice do you want to roll? ");
           NumberOfDice = Scan.nextInt();
           if (NumberOfDice <= 0){
               System.out.println("");
               System.out.println("What? Someone get this drunk out of here.");
               Continue = "N";
           }
           else {
               System.out.print("How many sides do these dice have? ");
               DiceSides = Scan.nextInt();
               if (DiceSides <= 0){
                   System.out.println("");
                   System.out.println("Are you looking for troubles or drinks? Leave before I call my boys.");
                   Continue = "N";
               }
           }
            
           if (NumberOfDice > 0 && DiceSides > 0){
               System.out.println("");
               System.out.print("You rolled: ");
               for(int i = 0; i < NumberOfDice; i++){
                   RollResult = rollDie(DiceSides);
                   Total = Total + RollResult;
                   System.out.print(RollResult + " ");
               }
               
               System.out.println("");
               System.out.println("Total: " + Total);
               System.out.println("Wanna play again? [Y/N]");
               Continue = Scan.next();
               System.out.println("");
           }
       }
       
       if (NumberOfDice > 0 && DiceSides > 0){
           System.out.println("");
           System.out.println("Thank You for playing, I hope to see you again.");
       }
    }
    
    public static int rollDie(int Sides){
        return (int) (Math.random() * Sides) + 1;
    }
}