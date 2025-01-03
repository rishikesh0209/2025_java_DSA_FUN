package ArraysAndArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args){

            ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
            ArrayList<String> veggiesList = new ArrayList<>();

            veggiesList.add("carrot");
            veggiesList.add("potato");
            veggiesList.add("cucumber");

            ArrayList<String> fruitsList = new ArrayList<>();
            fruitsList.add("apple");
            fruitsList.add("mango");
            fruitsList.add("papaya");

            ArrayList<String> drinksList = new ArrayList<>();
            drinksList.add("wine");
            drinksList.add("cola");
            drinksList.add("soda");

            groceryList.add(veggiesList);
            groceryList.add(fruitsList);
            groceryList.add(drinksList);

            for(int row=0;row<groceryList.size();row++){
                System.out.println(groceryList.get(row).toString());
            }
            System.out.println(groceryList);


    }
}
