package 建造者模式;

public class SubMealBuilderA extends MealBuilder {
    @Override
    public void BuildFood(){
        meal.setFood("Hambagar");
    }

    @Override
    public void BuildDrinks(){
        meal.setDrinks("kole" );
    }

}
