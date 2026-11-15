package oops;

public class Product
{
    private String name;
    private double price;

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    // Setters
    public void setPrice(double price)
    {
        if (price < 0)
        {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
}
