enum Fruit
{
    Apple (10,1), Mango (9,2), Pineapple (12,3), Banana (15,4), Orange (8,5);
    private int price;
    private int weight;
    //Constructor
    Fruit (int p,int w)
    {
        price = p;
        weight = w;
    }
    int getPrice ()
    {
        return price;
      
    }
    int getWeight()
    {
    	return weight;
    }
}

public class EnumDemo2
{
    public static void main (String[]args)
    {
        Fruit fr;
        // Display price of Mango
        System.out.println ("Mango costs: " + Fruit.Mango.getPrice () + "cents." + "and Weight is " + Fruit.Mango.getWeight()+ " kgs");

        //Display all fruits and prices
        System.out.println ("All fruits prices:");
        for (Fruit f:Fruit.values ())
            System.out.println (f + " costs " + f.getPrice () + " cents" + " of " + f.getWeight() + " kgs");
    }
}