package Backend;

public class Suppliers extends Register{
    
    private int phone;
    private String email;
    private int cep;
    private int cnpj;
    public Register reg;
    
    public Suppliers(String name, String product, int phone, String email, int cep, int cnpj){
        super(name, product);
        this.phone = phone;
        this.email = email;
        this.cep = cep;
        this.cnpj = cnpj;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cep
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(int cep) {
        this.cep = cep;
    }

    /**
     * @return the cnpj
     */
    public int getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    public String print(){
        return "Fornecedor: " + reg.getName() + " -- Fornece: " + reg.getProduct();
    }
}
