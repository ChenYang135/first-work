//具体的建造者A--生产A套餐
public class SubMealBuilderA extends MealBuilder
{
	public void buildFood()
	{
		meal.setFood("一个鸡腿堡");
	}
	public void buildDrink()
	{
	    meal.setDrink("一杯可乐");
	}
}
