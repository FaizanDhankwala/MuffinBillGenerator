public class Muffin {
   private int price;
    private Boolean blueberry;



    public Muffin(boolean blueberry) {

        this.blueberry = blueberry;
        if (this.blueberry) {
            this.price = 400;
        } else {
            this.price = 300;
        }
        baseMuffinPrice=this.price;
    }
    private int extraToppingsPrice=100;

    private int extraCreamPrice=150;

    private int addSodaPrice=20;

    private int baseMuffinPrice;
    private int toGoPrice=10;


    private boolean extraToppingsAdded=false;
    private boolean extraCreamAdded=false;
    private boolean sodaAdded =false;
    private boolean toGo=false;


    public void addToppings(){
        extraToppingsAdded=true;
    this.price+=extraToppingsPrice;
    }

    public void addCream(){
        extraCreamAdded=true;
    this.price+=extraCreamPrice;
    }
    public void addSoda(){
        sodaAdded=true;
    this.price+=addSodaPrice;
    }
    public void toGo(){
        toGo=true;
    this.price+=toGoPrice;
    }
    private String bill= "";

    public void getBill(){
        System.out.println("Muffin Base Price +$" + baseMuffinPrice );
        if(extraCreamAdded){
            bill+= "Extra Cream: +$" + extraCreamPrice + "\n";
        }
        if(extraToppingsAdded){
            bill+= "Extra Toppings: +$" + extraToppingsPrice+ "\n";
        }
        if(sodaAdded){
            bill+= "Extra Soda: +$" + addSodaPrice+ "\n";
        }
        if(toGo){
            bill+=  "To Go: +$" + toGoPrice+ "\n";
        }
        bill+= "---------------------" + "\n";
        bill+= "Final Bill $" + this.price + "\n";
        System.out.println(bill);
    }

    }








