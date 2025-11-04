
import java.util.Scanner;

class atm{
    int pin = 7645;
    float balance = 1000;
    Scanner sc = new Scanner(System.in);
    public void checkpin(){
      
        int enteredpin = sc.nextInt(); 
     if(enteredpin == pin){
      menu();
     }
     else{System.out.println("enter valid pin");}
    
    }

   public void menu(){
     System.out.println("1 : check the bank balance");
     System.out.println("2 : withdraw money");
     System.out.println("3 : set pin");
     System.out.println("4 : exit");
    
        System.out.println("enter the number");
        int number = sc.nextInt();
        if(number==1){
            balance();
        }
        else if(number == 2){
            withdraw();
        }
        else if(number == 3){
            setpin();
        }
        else if(number == 4){
            System.out.println("break");
            return;
         }
         else {
         System.out.println("enter valid number");
         }

     
    }
    public void balance(){
      System.out.println(balance);
      menu();
    }
    public void withdraw(){
       
          float amount = sc.nextFloat();
          if(amount < balance){
            System.out.println("get the money");
          }
          else{
            System.out.println("in suffecient balance");
          }
        
        menu();
    }

  
    public void setpin(){
      System.out.println("your pin number is changed ");
      menu();
    }
    
}
public class kiran {
    public static void main(String[] args) {
        atm a = new atm();
        a.checkpin();
    }
    
}
