package Task1_2.Products;

import java.util.Objects;

public class Recipe {
    private final ProductSet productSet;
    private Double costOfRecipe;
    private final String nameOfRecipe;

    public Recipe(ProductSet productSet, String nameOfRecipe) {
        this.productSet = productSet;

        this.costOfRecipe = productSet.sumPriceProduct();

        if (nameOfRecipe == null || nameOfRecipe.isBlank()) {
            this.nameOfRecipe = "Безымённый";
        } else {
            this.nameOfRecipe = nameOfRecipe;
        }
    }

    public Double getCostOfRecipe() {
        return costOfRecipe;
    }

    public ProductSet getProductSet() {
        return productSet;
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameOfRecipe, recipe.nameOfRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe);
    }

    @Override
    public String toString() {
        return nameOfRecipe +
                " состав: " + productSet +
                " стоимость: " + costOfRecipe;
    }
}
