public class HumanClient implements Client {
    private boolean happyHourStartedCalled = false;
    private boolean happyHourEndedCalled = false;
    private OrderingStrategy orderingStrategy;

    public HumanClient(OrderingStrategy orderingStrategy) {
        this.orderingStrategy = orderingStrategy;
    }

    @Override
    public void happyHourStarted(Bar bar) {
        happyHourStartedCalled = true;
        orderingStrategy.happyHourStarted((StringBar) bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        happyHourEndedCalled = true;
        orderingStrategy.happyHourEnded((StringBar) bar);
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        orderingStrategy.wants(drink, recipe, bar);
    }
}

