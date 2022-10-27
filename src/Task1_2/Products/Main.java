package Task1_2.Products;

public class Main {
    public static void main(String[] args) {
        Product banana = new Product("Банан", 13.99, 2.0);
        Product apple = new Product("Яблоко", 12.99, 4.3);
        Product apple1 = new Product("Яблоко", 12.99, 4.3);
        Product tomato = new Product("Помидор", 16.5, 11.0);
        Product cucumber = new Product("Огурец", 7.5, 9.9);
        Product carrot = new Product("Морковка", 12.5,10.5);
        Product cabbage = new Product("Капуста", 14.5, 6.3);
        Product mango = new Product("Манго", 33.5, 11.9);



        ProductSet productSet = new ProductSet();
        ProductSet productSet1 = new ProductSet();
        ProductSet productSet2 = new ProductSet();

        productSet.addProduct(banana, 2);
        productSet.addProduct(apple, 3);
        productSet.addProduct(apple1,4);
        productSet.addProduct(tomato, 5);
        productSet.addProduct(cucumber,2);
        productSet.addProduct(carrot,3);
        productSet.addProduct(cabbage,7);
        productSet.addProduct(mango,7);
        System.out.println(productSet);
        productSet.removeProduct(tomato);
        productSet.removeProduct(carrot);
        productSet.removeProduct(cucumber);
        productSet.removeProduct(cabbage);

        productSet1.addProduct(tomato, 4);
        productSet1.addProduct(carrot,5);
        productSet1.addProduct(cucumber,4);
        productSet1.addProduct(cabbage,6);

        productSet2.addProduct(tomato,5);
        productSet2.addProduct(carrot,8);
        productSet2.addProduct(cucumber,4);
        productSet2.addProduct(cabbage,3);

        System.out.println();
        System.out.println(productSet);
        System.out.println();

        Recipe borsh = new Recipe(productSet, "Борщ");
        Recipe borsh1 = new Recipe(productSet1, "Борщ");
        Recipe borsh2 = new Recipe(productSet2, "НЕ Борщ");

        System.out.println(borsh);
        System.out.println();
        RecipeBook cookBook = new RecipeBook();
        cookBook.addRecipe(borsh);
        cookBook.addRecipe(borsh1);
        cookBook.addRecipe(borsh2);
        System.out.println(cookBook);
    }
}
