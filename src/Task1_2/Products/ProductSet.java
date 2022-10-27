package Task1_2.Products;

import java.util.*;

public class ProductSet {
    private Map<Product, Integer> productSet;

    public ProductSet() {
       productSet = new HashMap<>();
    }

    public void addProduct(Product product, Integer count) throws RuntimeException {
        try {
            if (!productSet.containsKey(product.getName())) {
                productSet.put(product, count);
            } else {
                throw new RuntimeException(product.getName() + " уже в списке");
            }
        } catch (RuntimeException e)  {
            System.out.println(e.getMessage());
        }

    }

    public void removeProduct(Product product) {
        if (productSet.containsKey(product)) {
            productSet.remove(product);
        } else {
            throw new IllegalArgumentException(product.getName() + " уже нет в списке");
        }
    }

    public Double sumPriceProduct(){
        double sum = 0;
        for (Map.Entry<Product, Integer> product: productSet.entrySet()) {
            sum += (product.getKey().getPrice() * product.getValue());
        }

        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSet that = (ProductSet) o;
        return Objects.equals(productSet, that.productSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productSet);
    }

    @Override
    public String toString() {
        return "ProductSet{" +
                "productSet=" + productSet +
                '}';
    }
}
