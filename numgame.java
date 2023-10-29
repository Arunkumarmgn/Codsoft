import java.util.Scanner;
import java.util.Random;

class numgame
{
   public static void main(String [] args)
   {
	   Random random=new Random();
	   
	   int min =1;
	   int max=5;
	   
	   int randomnumber=random.nextInt(max-min+1)+min;
	   int chance=0;
	   int max_chances=3;
	   Scanner s=new Scanner(System.in);
	   do 
	   {
	   System.out.println("Enter your number");
	   int mychoice=s.nextInt();
	   chance+=1;
	   if (mychoice<randomnumber)
	   {
		   System.out.println("Your number is too low.");
	   }
	   if (mychoice>randomnumber)
	   {
		   System.out.println("Your number is too high.");
	   }
	   if(mychoice==randomnumber)
	   {
		   System.out.println("You guessed it right in" +chance+"rd " + "chance");
		   
		   break;
	   }
       }
	   while(chance<max_chances);
	   
	   System.out.println("The target is "+randomnumber);
	   
   }
}
	   
   