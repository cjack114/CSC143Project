import java.util.Scanner;//needed in order to be able to use the Scanner class to get the user's input

public class Project_colby_jackson
{
   public static void main(String[] args)
   {
       double clockSpeed = 0;//to hold the clock speed
       double cores = 0;//to hold the number of cores
       int choice = 0;//to hold the menu choice
       
       Scanner keyboard = new Scanner(System.in);//create a Scanner object to get the user's input
       
       System.out.print("Enter the clock speed (in Megahertz) of your processor(CPU): ");//Ask the user to enter their clock speed
       clockSpeed = keyboard.nextDouble();//read in the user's input for the clock speed
       
       System.out.print("Enter the number of cores that your processor(CPU) has: ");//Ask the user to enter the number of cores their processor has
       cores = keyboard.nextDouble();//read in the user's input for the number of cores
       
       //Display the Menu
      System.out.println("Monitor Resolution Menu");
      System.out.println("1. 1280 x 720");
      System.out.println("2. 1920 x 1080");
      System.out.println("3. 2560 x 1440");
      System.out.println("4. 3840 x 2160");
      
      System.out.print("\nEnter your choice: ");//Ask the user to make a selection from the menu
      choice = keyboard.nextInt();//read in the user's input for the menu selection
   }
}