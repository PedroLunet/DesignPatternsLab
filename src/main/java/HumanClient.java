class HumanClient implements Client {
    private boolean happyHourStartedCalled = false;
    private boolean happyHourEndedCalled = false;

    @Override
    public void happyHourStarted(Bar bar) {
        happyHourStartedCalled = true;
    }

    @Override
    public void happyHourEnded(Bar bar) {
        happyHourEndedCalled = true;
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
    }
}
