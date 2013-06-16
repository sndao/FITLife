
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;


public class ProgramController {
    private ArrayList<Food> foodData = new ArrayList<Food>();
    private ArrayList<Food> todaysFood = new ArrayList<Food>();
    private int[] todaysMacros = {0,0,0,0,0};
    

    
    
    public void loadFoodData()
    {
        Scanner inStream = null;
        try
        {
        inStream = new Scanner(new FileInputStream("data/fooddata.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Unable to access food database.");
        }
        while (inStream.hasNext())
        {
           inStream.useDelimiter("\n"); 
           String s = inStream.next();
           String[] t = s.split(",");
           Food newFood = new Food(t[0], Integer.parseInt(t[1]), t[2], Integer.parseInt(t[3])
                   , Integer.parseInt(t[4]), Integer.parseInt(t[5]), Integer.parseInt(t[6]), Integer.parseInt(t[7].replaceAll("\\D+","")));
           foodData.add(newFood);
        }
    }


    
//ACCESSOR/MUTATOR FUNCTIONS
    public ArrayList<Food> getFoodData(){
        return foodData;
    }
    public ArrayList<Food> getTodaysFood(){
        return todaysFood;
    }
    public int[] getTodaysMacros(){
        for (int i=0; i<5; i++)
        {
            todaysMacros[i]=0;
        }
        for (int i=0; i<foodData.size(); i++) // change to Todays foods!!
        {
            todaysMacros[0] += foodData.get(i).getCals();
        }
        for (int i=0; i<foodData.size(); i++) // change to Todays foods!!
        {
            todaysMacros[1] += foodData.get(i).getFats();
        }
        for (int i=0; i<foodData.size(); i++) // change to Todays foods!!
        {
            todaysMacros[2] += foodData.get(i).getCarbs();
        }
        for (int i=0; i<foodData.size(); i++) // change to Todays foods!!
        {
            todaysMacros[3] += foodData.get(i).getNetCarbs();
        }
        for (int i=0; i<foodData.size(); i++) // change to Todays foods!!
        {
            todaysMacros[4] += foodData.get(i).getProtein();
        }
        return todaysMacros;         
}
}