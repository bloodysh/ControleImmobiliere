import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnnonceTest {
    @Test
    public void testPrix() {
        Vendeur vendeur = new Vendeur("John", null, null, null);
        BienImmobilier bienImmobilier = new Appartement("123 Main St", "City", "12345", vendeur, "1");

        TypePiece pieceHabitable = new TypePiece("Chambre", true, true);
        TypePiece pieceNonHabitable = new TypePiece("Garage", false, true);
        Piece piece1 = new PieceParallelogramme(pieceHabitable, "Étage 1", 4.0, 6.0);
        Piece piece2 = new PieceParallelogramme(pieceNonHabitable, "Rez-de-chaussée", 3.0, 5.0);
        bienImmobilier.ajouterPiece(piece1);
        bienImmobilier.ajouterPiece(piece2);

        Annonce annonce = new Annonce("REF123", "2023-09-25", "Bel appartement à vendre", 100.0, bienImmobilier);

        double expectedPrix = (piece1.surface() * 100.0) + (piece2.surface() * 100.0 * 0.25);
        assertEquals(expectedPrix, annonce.prix(), 0.01);
    }
}
