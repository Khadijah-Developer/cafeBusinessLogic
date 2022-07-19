import java.util.ArrayList;
import java.util.Arrays;
import java.io.Console;

public class CafeUtil {
    public int getStreackGoal(int numWeeks){
        int sum = 0;
        for(int i = 0; i < numWeeks + 1; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        int sum = 0;
        for (int i=0 ; i < prices.length ; i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName);
        int numberPersons = customers.size();
        System.out.println("There are" + numberPersons + "people in front of you");
        customers.add(userName);
        System.out.println(customers);

    }
}
