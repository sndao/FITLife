/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Food {
    private String food;
    private int unit;
    private String unitName;
    private int cals;
    private int carbs;
    private int netcarbs;
    private int fats;
    private int protein;
    
    public Food(String food, int unit, String unitName, int cals, int fats, int carbs, int netcarbs, int protein)
    {
        this.food = food;
        this.unitName = unitName;
        this.unit = unit;
        this.cals = cals;
        this.carbs = carbs;
        this.netcarbs = netcarbs;
        this.fats = fats;
        this.protein = protein;
    }
    

    public String getFood(){
        return food;
    }
    public int getUnit(){
        return unit;
    }   
    public String getUnitName(){
        return unitName;
    }    
    public int getCals()
    {
        return cals;
    }
    public int getCarbs(){
        return carbs;
    } 
    
    public int getNetCarbs(){
        return netcarbs;
    }     
    public int getFats(){
        return fats;
    }     
    public int getProtein(){
        return protein;
    }    
    
    
    
    
    
    @Override
    public String toString()
    {
        return (food + " " + unit + " " + unitName + " " + cals + " " + carbs + "(" + netcarbs + ") " + fats + " " + protein);
    }    
}
