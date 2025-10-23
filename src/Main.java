//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main{
    public static void main(String[] args){
      Muffin m1= new Muffin(false);
      m1.addToppings();
      m1.addCream();
      m1.addChocolate();
      m1.getBill();

      ChocolateMuffin ch1= new ChocolateMuffin(false);
        ch1.addToppings();
        ch1.addToppings();
        ch1.addToppings();
        ch1.getBill();
    }
    //hello

}
