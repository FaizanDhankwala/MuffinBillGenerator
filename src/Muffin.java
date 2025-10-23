public class Muffin {
   private int price;
    private Boolean blueberry;
    private String type="Regular Muffin";


    public void setType(String type)
    {
        this.type=type;
    }
    public String getType()
    {
        return type;
    }

    public Muffin(boolean blueberry) {

        this.blueberry = blueberry;
        if (this.blueberry) {
            this.price = 400;
        } else {
            this.price = 300;
        }
        baseMuffinPrice=this.price;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    private int extraToppingsPrice=100;


    private int extraCreamPrice=150;

    private int addSodaPrice=20;

    private int baseMuffinPrice;
    private int toGoPrice=10;
    private int chocolatePrice=50;


    private boolean extraToppingsAdded=false;
    private boolean extraCreamAdded=false;
    private boolean sodaAdded =false;
    private boolean toGo=false;
    private boolean chocolateAdded=false;


    public void addToppings(){
        extraToppingsAdded=true;
    this.price+=extraToppingsPrice;
    }
    public void addChocolate(){
        chocolateAdded=true;
        this.price+=chocolatePrice;
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

String bill= "";
    public void getBill(){
       bill += "Muffin type " + getType() + "\n";
        bill += "Base Price: $" + baseMuffinPrice + "\n";

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
        if(chocolateAdded){
            bill+= "Chocolate: +$" + chocolatePrice+ "\n";
        }

        bill+= "---------------------" + "\n";
        bill+= "Final Bill $" + this.price + "\n";
        System.out.println(bill);
    }

    }








