import java.util.UUID;

public class Client {
    public static void main(String[] args) {

        MealDirector mealDirector = new MealDirector();

        Meal deluxeMeal = mealDirector.constructSpecialDeluxeMeal();
        Meal kidsMeal = mealDirector.constructKidsMeal();

        Meal customMeal = new Meal.MealBuilder()
                .setMealId(UUID.randomUUID().toString())
                .setBurger(BurgerType.CHEESE.toString())
                .setDrink(DrinkType.COKE.toString())
                .setDessert(DesertType.PASTERY.toString())
                .setFries(true)
                .build();


        System.out.println(deluxeMeal);
        System.out.println(kidsMeal);
        System.out.println(customMeal);
    }
}
