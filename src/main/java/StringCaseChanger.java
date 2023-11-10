public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
       StringBuilder sb = new StringBuilder();

        for(int i = 0; i<drink.getText().length();i++){
           if(Character.isUpperCase(drink.getText().charAt(i))){
               char elem = Character.toLowerCase(drink.getText().charAt(i));
               sb.append(elem);
           }
           else{
               char elem = Character.toUpperCase(drink.getText().charAt(i));
               sb.append(elem);
           }
       }

        drink.setText(sb.toString());
    }
}
