public class StringReplacer implements StringTransformer {
    private char target;
    private char replacement;
    private String originalText; // Store the original text for undo

    public StringReplacer(char target, char replacement) {
        this.target = target;
        this.replacement = replacement;
    }

    @Override
    public void execute(StringDrink drink) {
        originalText = drink.getText(); // Store the original text
        String modifiedText = drink.getText().replace(target, replacement);
        drink.setText(modifiedText);
    }
    @Override
    public void undo(StringDrink drink) {
        drink.setText(originalText);
    }
}


