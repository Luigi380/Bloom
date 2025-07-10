package Backend;

public class Suppliers extends Register{
    
    private String phone;
    private String email;
    private String cep;
    private int cnpj;
    public Register reg;
    
    public Suppliers(String name, String product, int id, String phone, String email, String cep, int cnpj){
        super(name, product, id);
        this.phone = phone;
        this.email = email;
        this.cep = cep;
        this.cnpj = cnpj;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
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
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
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
    
    public String printSuppliersId() {
        return reg.printId("S");
    }
}
