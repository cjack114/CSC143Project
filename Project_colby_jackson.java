import java.util.Scanner;//needed in order to be able to use the Scanner class to get the user's input

public class Project_colby_jackson
{
   public static void main(String[] args)
   {
       double gpuSpeed = 0;//to hold the clock speed
       double cpuSpeed = 0;//to hold the clock speed
       double cores = 0;//to hold the number of cores
       int choice = 0;//to hold the menu choice
       double performanceScore = 0.0;//to hold the performance score
       double multiplier = 0;//to hold the multiplier variable
       String graphicsQuality = " ";
       String monitorResolution = " ";
       String recommendationTool = "Computer Hardware Graphics Quality Recommendation Tool";
       
       //constants to hold the resolution multiplier
       final double FIRST_RESOLUTION = 1;
       final double SECOND_RESOLUTION = .75;
       final double THIRD_RESOLUTION = .55;
       final double FOURTH_RESOLUTION = .35;
       
       //constants to represent the menu options
       final int FIRST_CHOICE = 1;
       final int SECOND_CHOICE = 2;
       final int THIRD_CHOICE = 3;
          
       Scanner keyboard = new Scanner(System.in);//create a Scanner object to get the user's input
       
       System.out.print("Enter the clock speed (in Megahertz) of your graphics card(GPU): ");//Ask the user to enter their clock speed
       gpuSpeed = keyboard.nextDouble();//read in the user's input for the clock speed
       
       System.out.print("Enter the clock speed (in Megahertz) of your processor(CPU): ");//Ask the user to enter their clock speed
       cpuSpeed = keyboard.nextDouble();//read in the user's input for the clock speed
       
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
      
      //Use if/else statement to appropriately handle the user's selection
      if(choice == FIRST_CHOICE)
      {
         multiplier = FIRST_RESOLUTION;       
      }
      else if(choice == SECOND_CHOICE)
      {
         multiplier = SECOND_RESOLUTION;
      }
      else if(choice == THIRD_CHOICE)
      {
         multiplier = THIRD_RESOLUTION;
      }
      else
      {
         multiplier = FOURTH_RESOLUTION;
      }
      
      //Calculate performance score
      performanceScore = ((5 * gpuSpeed) + (cores * cpuSpeed)) * multiplier;
      
      //Use if/else statement to determine recommended graphics quality 
      if(performanceScore > 17000)
      {
         graphicsQuality = "Ultra";
      }
      else if(performanceScore > 15000 || performanceScore <= 17000)
      {
         graphicsQuality = "High";
      }
      else if(performanceScore > 13000 || performanceScore <= 15000)
      {
         graphicsQuality = "Medium";
      }
      else if(performanceScore > 11000 || performanceScore <= 13000)
      {
         graphicsQuality = "Low";
      }
      else
      {
         graphicsQuality = "Unable to Play";
      }
      
      //Use if/else statement to apply monitor resolution to menu option choice
      if(choice == 1)
      {
         monitorResolution = "1280x720";
      }
      else if(choice == 2)
      {
         monitorResolution = "1920x1080";
      }
      else if(choice == 3)
      {
         monitorResolution = "2560x1440";
      }
      else
      {
         monitorResolution = "3840x2160";
      }
      
      System.out.println(recommendationTool);//display recommendation tool String
      
      System.out.println("The GPU clock speed is: " + gpuSpeed);//display the GPU speed
      
      System.out.println("The CPU clock speed is: " + cpuSpeed);//display the CPU speed
      
      System.out.println("The number of cores is: " + cores);//display the number of cores
      
      System.out.println("The monitor resolution is: " + monitorResolution);//display the monitor resolution
      
      System.out.printf("The performance score is: %,.3f\n", performanceScore);//display the performance score
      
      System.out.print("The recommended graphics quality is: " + graphicsQuality);//display the recommended graphics quality
   }
}