public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("123", "Teclado", 5, 29.99);  // Cria uma instância da classe Invoice com valores de exemplo

        System.out.println("Informações da Fatura:");
        System.out.println("Número: " + invoice.getNumber());                   // Exibe o número da fatura
        System.out.println("Descrição: " + invoice.getDescription());         // Exibe a descrição do item
        System.out.println("Quantidade: " + invoice.getQuantity());               // Exibe a quantidade comprada do item
        System.out.println("Preço por Item: " + invoice.getPricePerItem());     // Exibe o preço por item
        System.out.println("Valor da Fatura: " + invoice.getInvoiceAmount());    // Exibe o valor total da fatura
    }
}