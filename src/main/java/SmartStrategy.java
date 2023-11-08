import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {
    private List<StringDrink> orderedDrinks = new ArrayList<>();

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) {
            recipe.mix(drink);
        } else {
            orderedDrinks.add(drink);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for (StringDrink drink : orderedDrinks) {
            bar.order(drink, new StringRecipe(new ArrayList<>()));
        }
        orderedDrinks.clear();
    }

    @Override
    public void happyHourEnded(StringBar bar) {
    }
}
