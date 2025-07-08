package Backend;

public class Register {
    
    private String name;
    private String product;
    
    public Register (String name, String product){
        this.name = name;
        this.product = product;
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
    
}
