public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder result = new StringBuilder(drink.getText());

        result.reverse();

        drink.setText(result.toString());
    }
}
