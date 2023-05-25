public class Invoice {
    private String number;        // Número da fatura
    private String description;   // Descrição do item
    private int quantity;         // Quantidade comprada do item
    private double pricePerItem;  // Preço por item

    public Invoice(String number, String description, int quantity, double pricePerItem) {
        this.number = number;
        this.description = description;
        setQuantity(quantity);          // Chama o método setQuantity para configurar a quantidade
        setPricePerItem(pricePerItem);  // Chama o método setPricePerItem para configurar o preço por item
    }

    public void setNumber(String number) {
        this.number = number;  // Configura o número da fatura
    }

    public String getNumber() {
        return number;  // Retorna o número da fatura
    }

    public void setDescription(String description) {
        this.description = description;  // Configura a descrição do item
    }

    public String getDescription() {
        return description;  // Retorna a descrição do item
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;  // Configura a quantidade comprada do item
        } else {
            this.quantity = 0;  // Configura a quantidade como 0 se for negativa
        }
    }

    public int getQuantity() {
        return quantity;  // Retorna a quantidade comprada do item
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem >= 0.0) {
            this.pricePerItem = pricePerItem;  // Configura o preço por item
        } else {
            this.pricePerItem = 0.0;  // Configura o preço por item como 0.0 se for negativo
        }
    }

    public double getPricePerItem() {
        return pricePerItem;  // Retorna o preço por item
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;  // Calcula o valor total da fatura multiplicando a quantidade pelo preço por item
    }
}