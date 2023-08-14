import factory.CarroFactory;
import factory.FiatFactory;
import factory.FordFactory;
import interfaces.CarroPopular;
import interfaces.CarroSedan;

public class Main {
    public static void main(String[] args) throws Exception {
        /// ABSTRACT FACTORY///
        /*
         *** O Abstract Factory lida com múltiplas famílias de objetos relacionados,
         * proporcionando uma interface para criar objetos
         * de várias classes concretas.
         * - Define uma interface (ou classe abstrata) para criar objetos de cada
         * família de classes relacionadas.
         * - As subclasses concretas implementam essa interface para criar objetos
         * específicos.
         * - Fornece uma maneira de criar famílias completas de objetos relacionados.
         */

        // FORD//
        try {
            CarroFactory fabricaFord = new FordFactory(); // A CLASSE QUE CRIA OS CARROS SEDAN E POPULAR VÃO INSTÂNCIAR
                                                          // A CRIAÇÃO DAS FÁBRICAS DE CARROS

            CarroPopular fiesta = fabricaFord.criarCarroPopular("fiesta");
            fiesta.exibirInfoPopular();

            CarroSedan fiestaSedan = fabricaFord.criarCarroSedan("fiesta sedan");
            fiestaSedan.exibirInfoSedan();
        } catch (NullPointerException e) {
            System.out.println("Erro! Carro não pertencente a marca Ford: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // FIAT
        try {
            CarroFactory fabricaFiat = new FiatFactory();
            CarroPopular palio = fabricaFiat.criarCarroPopular("palio");
            palio.exibirInfoPopular();

            CarroSedan siena = fabricaFiat.criarCarroSedan("siena");
            siena.exibirInfoSedan();
        } catch (NullPointerException e) {
            System.out.println("Erro! Carro não pertencente a marca Fiat: " + e.getMessage());
        } catch (Exception e) {
            System.out.println();
        }
    }
}
