package oops;

public class ProductMain // User - Seller
{
    public static void main(String arg[])
    {
        Product product = new Product("Shampoo123", 34);

        System.out.println(product.getName());
        System.out.println(product.getPrice());

        product.setPrice(50);

        System.out.println(product.getPrice());

        product.setPrice(-5);
        System.out.println(product.getPrice());





    }
}
