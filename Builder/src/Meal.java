public class Meal {
    private String mealId;
    private String burger;
    private String drink;
    private String dessert;
    private boolean fries;

    private Meal(MealBuilder mealBuilder){
        this.mealId = mealBuilder.getMealId();

        //We do validation in the constructor to prevent incorrect input values being initializing during the object creation
/*        if(mealBuilder.getBurger().isEmpty() || !mealBuilder.getBurger().equals(BurgerType.CHEESE) ||
            !mealBuilder.getBurger().equals(BurgerType.VEGGIE) || mealBuilder.getBurger().equals(BurgerType.CHICKEN)){
            throw new IllegalArgumentException("Incorrect input parameter");
        }*/
        this.burger = mealBuilder.getBurger();

/*        if(mealBuilder.getDrink().isEmpty() || !mealBuilder.getDrink().equals(DrinkType.COKE) ||
            !mealBuilder.getDrink().equals(DrinkType.FANTA) || mealBuilder.getDrink().equals(DrinkType.SPRITE)){
            throw new IllegalArgumentException("Incorrect input parameter");
        }*/
        this.drink = mealBuilder.getDrink();

/*        if(mealBuilder.getDessert().isEmpty() || !mealBuilder.getDessert().equals(DesertType.PASTERY) ||
            !mealBuilder.getDessert().equals(DesertType.FROZEN) || mealBuilder.getDessert().equals(DesertType.PUDDING)){
            throw new IllegalArgumentException("Incorrect input parameter");
        }*/
        this.dessert = mealBuilder.getDessert();

        this.fries = mealBuilder.isFries();
    }

    //method to create a new instance of MealBuilder
    public MealBuilder createMealBuilderInstance(){
        return new MealBuilder();
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getMealId() {
        return mealId;
    }

    public void setMealId(String mealId) {
        this.mealId = mealId;
    }

    public String getBurger() {
        return burger;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public boolean isFries() {
        return fries;
    }

    public void setFries(boolean fries) {
        this.fries = fries;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealId='" + mealId + '\'' +
                ", burger='" + burger + '\'' +
                ", drink='" + drink + '\'' +
                ", dessert='" + dessert + '\'' +
                ", fries=" + fries +
                '}';
    }

    //Inner class is created since the constructor of the Student is private and cant be accessed outside the class
    public static class MealBuilder{
        private String mealId;
        private String burger;
        private String drink;
        private String dessert;
        private boolean fries;

        public String getMealId() {
            return mealId;
        }

        public MealBuilder setMealId(String mealId) {
            this.mealId = mealId;
            return this;
        }

        public MealBuilder setBurger(String burger){
            this.burger = burger;   //return the MealBuilder obj to allow method chaining
            return this;
        }

        public String getBurger() {
            return burger;
        }

        public String getDrink() {
            return drink;
        }

        public MealBuilder setDrink(String drink) {
            this.drink = drink;
            return this;    //return the MealBuilder obj to allow method chaining
        }

        public String getDessert() {
            return dessert;
        }

        public MealBuilder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public boolean isFries() {
            return fries;
        }

        public MealBuilder setFries(boolean fries) {
            this.fries = fries;
            return this;
        }

        //Build method is added to remove seperate instance creation in the Client
        public Meal build(){
            return new Meal(this);   //return the Meal object
        }
    }
}
