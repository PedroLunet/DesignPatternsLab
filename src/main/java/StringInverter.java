public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        String invertedText = new StringBuilder(text).reverse().toString();
        drink.setText(invertedText);
    }
    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}


