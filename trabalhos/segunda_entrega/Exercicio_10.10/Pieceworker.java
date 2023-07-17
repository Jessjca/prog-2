// Subclasse Pieceworker
public class Pieceworker extends Employee {
    private double wagePerPiece;
    private int pieces;

    // Construtor
    public Pieceworker(String firstName, String lastName, String socialSecurityNumber, double wagePerPiece, int pieces) {
        super(firstName, lastName, socialSecurityNumber);
        this.wagePerPiece = wagePerPiece;
        this.pieces = pieces;
    }

    // Getter e Setter para wagePerPiece e pieces

    // Implementação do método earnings para Pieceworker
    @Override
    public double earnings() {
        return wagePerPiece * pieces;
    }

    // Retorna a representação em String do Pieceworker
    @Override
    public String toString() {
        return String.format("Pieceworker: %s%nWage per Piece: $%.2f%nPieces produced: %d%nEarnings: $%.2f", super.toString(), wagePerPiece, pieces, earnings());
    }
}