/* 
* Project: Advanced Order System
 * Developed by: Beshoy2Khalil
 * GitHub: https://github.com/Beshoy2Khalil
 * Description: An improved version of a university assignment 
 * featuring nested logic and input validation.
 */



import java.util.Scanner ;


public class week_01_oop_Basics {
    public static void main(String[] args) throws Exception {
       
        Scanner input = new Scanner(System.in);


        System.out.println("=== Welcome to Coffee Shop ===");
        System.out.print("Do you want drink or food: ");
        String choice = input.nextLine().toLowerCase();

        if (choice.equals("food")) {
            System.out.print("Do you want pizza or burger: ");
            String foodSelection = input.nextLine().toLowerCase();

            if (foodSelection.equals("pizza")) {
                System.out.println("- 1 Pizza: $5 USD");
            } else if (foodSelection.equals("burger")) {
                System.out.println("- 1 Burger: $4 USD");
            } else {
                System.out.println("Sorry, we don't serve this food.");
            }
        } 
        
        else if (choice.equals("drink")) {
            System.out.print("Do you want cold or hot: ");
            String drinkType = input.nextLine().toLowerCase();

            if (drinkType.equals("cold")) {
                System.out.print("Choose: Pepsi or Juice: ");
                String coldDrinkSelection = input.nextLine().toLowerCase();
                
                if (coldDrinkSelection.equals("pepsi")) {
                    System.out.println("The Pepsi: $8");
                } else if (coldDrinkSelection.equals("juice")) {
                    System.out.println("The Fresh Juice: $19");
                } else {
                    System.out.println("Not available.");
                }
            } 
            else if (drinkType.equals("hot")) {
                System.out.print("Choose: Coffee or Latte: ");
                String hotDrinkSelection = input.nextLine().toLowerCase();
                
                if (hotDrinkSelection.equals("coffee")) {
                    System.out.println("The Black Coffee: $23");
                } else if (hotDrinkSelection.equals("latte")) {
                    System.out.println("The Hot Latte: $19");
                } else {
                    System.out.println("Not available.");
                }
            }
        } 
        
        else {
            System.out.println("Invalid choice.");
        }

        System.out.println("Thank you for using our shop");
        input.close();
    }
}
        