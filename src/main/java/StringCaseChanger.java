public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        StringBuilder modifiedText = new StringBuilder(text.length());

        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c)) {
                modifiedText.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                modifiedText.append(Character.toLowerCase(c));
            } else {
                modifiedText.append(c);
            }
        }

        drink.setText(modifiedText.toString());
    }
    @Override
    public void undo(StringDrink drink) {
        execute(drink); // Case changer's undo is the same as execution (reversal)
    }
}


