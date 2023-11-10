public class StringReplacer implements StringTransformer{
    private char initialChar, finalchar;

    public StringReplacer(char initialChar_, char finalChar_){
        this.initialChar = initialChar_;
        this.finalchar = finalChar_;
    }


    @Override
    public void execute(StringDrink drink) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < drink.getText().length(); i++){
            if(drink.getText().charAt(i) == this.initialChar){
                sb.append(this.finalchar);
            }
            else{
                sb.append(drink.getText().charAt(i));
            }
        }
        drink.setText(sb.toString());
    }
}
