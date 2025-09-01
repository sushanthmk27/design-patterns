import java.util.UUID;

/*
    The director class is responsible for managing the construction process, help to pre-define meal configuration.
    The client code can create complex meal objects without needing to know the details of their construction.
 */
public class MealDirector {

    public Meal constructKidsMeal(){
        return new Meal.MealBuilder()
                .setMealId(UUID.randomUUID().toString())
                .setBurger(BurgerType.VEGGIE.name())
                .setDrink(DrinkType.COKE.name())
                .setDessert(DesertType.PASTERY.name())
                .setFries(true)
                .build();
    }

    public Meal constructSpecialDeluxeMeal(){
        return new Meal.MealBuilder()
                .setMealId(UUID.randomUUID().toString())
                .setBurger(BurgerType.CHICKEN.name())
                .setDrink(DrinkType.FANTA.name())
                .setDessert(DesertType.FROZEN.name())
                .setFries(true)
                .build();
    }
}
