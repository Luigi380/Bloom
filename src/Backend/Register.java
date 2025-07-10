package Backend;

public class Register {
    
    private String name;
    private String product;
    private int id;
    
    public Register (String name, String product, int id){
        this.name = name;
        this.product = product;
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }
    
    public String print(){
        return name + product;
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
    
    public String printId(String parameter) {
        return parameter + getId();
    }
}
