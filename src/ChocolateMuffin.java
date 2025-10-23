public class ChocolateMuffin extends Muffin{

    public ChocolateMuffin(boolean blueberry) {
        super(blueberry);

        super.addCream();
    }
    @Override
    public void addToppings(){

    }

    @Override
    public void addSoda() {

    }

    private void addChocolatePrice(){
        setPrice(getPrice() + 50);
    }
}
