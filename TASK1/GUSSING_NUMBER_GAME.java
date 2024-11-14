package task;
import java.util.Scanner;
import java.util.Random;

public class tk1 {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
    	Random random = new Random();
        // Generate a random integer between 0 and 100
        int randomInt;
        int usernum,temp=1;
        char ch;
        char cha;
       do
    	 {
    	   randomInt = random.nextInt(10);
    	  do
    	   
        {
        	  System.out.println("Enter the num");
              usernum=sc.nextInt(); //Promt from User Input 
        	if (usernum==randomInt) //True if the statement is Equal
        	{
        		System.out.println("*********************");
        		System.out.println("You Won");
        		System.out.println("*********************");
            		break;
        	}
        	else if(usernum>randomInt)//True if the statement is Greaterthen the Gussnum
        	{
        		System.out.println("*********************");       	
        		System.out.println("Greater then Guessing number");
        		System.out.println("*********************");
        	}
        	else//True if the statement is lesserthen the Gussnum
        	{
        		System.out.println("*********************");
        		System.out.println("lesser then Guessing number");
        		System.out.println("*********************");
        	}
        	temp++;
        	if(temp<=5)//count the Limit of Attempt
        	{
        		System.out.println("#####################");
        		System.out.println("\nyour limit will be 5 out"+temp+"/nyou want to continue type 'y'");
        		System.out.println("#####################");
        		
           	}
        	else//Terminate the loop if there Attempt almost 5 
        	{
        		System.out.println("*********************");
        		System.out.println("Better Luck Next Time");
        		System.out.println("*********************");
        		break;
        	}
        	cha=sc.next().charAt(0);
        	if(cha=='y') //True if the statement is y and continue the game
        	{
        	 continue;
        	}
        	else//True if the statement is N or other alphabet  and Terminate the game
        	
        	{
        		System.out.println("Thank you");
        		break;
        	}
        }while(cha=='y' &&temp<=5);
    	   		System.out.println("Do You want to play Again [y/n]");
    	   		ch=sc.next().charAt(0);
    	   }while(ch=='y');
		  		System.out.println("Thank you");
	       
}
}
