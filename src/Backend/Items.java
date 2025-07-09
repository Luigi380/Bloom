package Backend;

public class Items extends Register{
    
    private int id;
    private double val;
    private int amount;
    public Register reg;
    
    public Items(String name, String product, double val, int id, int amount){
        super(name, product);
        this.val = val;
        this.id = id;
        this.amount = amount;
    }

    /**
     * @return the val
     */
    public double getVal() {
        return val;
    }

    /**
     * @param val the val to set
     */
    public void setVal(double val) {
        this.val = val;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public String print(){
        return id + ": " + reg.getName() + " -- Tipo: " + reg.getProduct() + " -- R$" + val;
    }
}
