import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BienImmobilierTest {
    @Test
    public void testSurfaceHabitable() {

    Vendeur vendeur = new Vendeur("John Doe", null, null, null);
        BienImmobilier bienImmobilier = new Appartement("123 Main St", "City", "12345", vendeur, "1");
        TypePiece pieceHabitable = new TypePiece("Chambre", true, true);
        TypePiece pieceNonHabitable = new TypePiece("Garage", false, true);

        
        Piece piece1 = new PieceParallelogramme(pieceHabitable, "Étage 1", 4.0, 6.0);
        Piece piece2 = new PieceTriangulaire(pieceHabitable, "Étage 2", 3.0, 5.0);
        bienImmobilier.ajouterPiece(piece1);
        bienImmobilier.ajouterPiece(piece2);

        
        double expectedSurface = (4.0 * 6.0) + ((3.0 * 5.0) / 2);

        
        assertEquals(expectedSurface, bienImmobilier.surfaceHabitable(), 0);
    }

    @Test
    public void testSurfaceNonhabitable() {
        Vendeur vendeur = new Vendeur("John Doe", null, null, null);
        BienImmobilier bienImmobilier = new Appartement("123 Main St", "City", "12345", vendeur, "1");
        TypePiece pieceHabitable = new TypePiece("Chambre", true, true);
        TypePiece pieceNonHabitable = new TypePiece("Garage", false, true);

        // Créez et ajoutez des pièces non habitables à votre bien immobilier
        Piece piece1 = new PieceParallelogramme(pieceNonHabitable, "Rez-de-chaussée", 4.0, 6.0);
        Piece piece2 = new PieceTrapezoidale(pieceNonHabitable, "Étage 1", 3.0, 5.0, 2.0);
        bienImmobilier.ajouterPiece(piece1);
        bienImmobilier.ajouterPiece(piece2);

        
        double expectedSurface = (4.0 * 6.0) + (0.5 * 2.0) * (3.0 + 5.0);

        // Utilisez assertEquals pour vérifier si la méthode surfaceNonHabitable() renvoie la bonne valeur
        assertEquals(expectedSurface, bienImmobilier.surfaceNonhabitable(), 0);
    }
}
