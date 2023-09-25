import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BienImmobilierTest {
    @Test
    public void testSurfaceHabitable() {

    Vendeur vendeur = new Vendeur("anas", null, null, null);
        BienImmobilier bienImmobilier = new Appartement("123 rue stade", "annecy", "12345", vendeur, "1");
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
        Vendeur vendeur = new Vendeur("anas", null, null, null);
        BienImmobilier bienImmobilier = new Appartement("123 rue rhone", "annecy", "12345", vendeur, "1");
        TypePiece pieceHabitable = new TypePiece("Chambre", true, true);
        TypePiece pieceNonHabitable = new TypePiece("Garage", false, true);

        Piece piece1 = new PieceParallelogramme(pieceNonHabitable, "Rez-de-chaussée", 4.0, 6.0);
        Piece piece2 = new PieceTrapezoidale(pieceNonHabitable, "Étage 1", 3.0, 5.0, 2.0);
        bienImmobilier.ajouterPiece(piece1);
        bienImmobilier.ajouterPiece(piece2);

        
        double expectedSurface = (4.0 * 6.0) + (0.5 * 2.0) * (3.0 + 5.0);

        assertEquals(expectedSurface, bienImmobilier.surfaceNonhabitable(), 0);
    }
}
