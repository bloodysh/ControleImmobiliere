import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppartementTest {
    @Test
    public void testTypeBienWithZeroPiece() {
        Vendeur vendeur = new Vendeur("John", null, null, null);
        Appartement appartement = new Appartement("123 Main St", "City", "12345", vendeur, "1");
        
        String expectedTypeBien = "T0";
        
        assertEquals(expectedTypeBien, appartement.typeBien());
    }

    @Test
    public void testTypeBienWithFewPieces() {
        Vendeur vendeur = new Vendeur("John", null, null, null);
        Appartement appartement = new Appartement("123 Main St", "City", "12345", vendeur, "1");

        TypePiece pieceHabitable = new TypePiece("Chambre", true, true);
        Piece piece1 = new PieceParallelogramme(pieceHabitable, "Étage 1", 4.0, 6.0);
        Piece piece2 = new PieceTriangulaire(pieceHabitable, "Étage 2", 3.0, 5.0);
        appartement.ajouterPiece(piece1);
        appartement.ajouterPiece(piece2);

        String expectedTypeBien = "T2";
        
        assertEquals(expectedTypeBien, appartement.typeBien());
    }

    @Test
    public void testTypeBienWithManyPieces() {
        Vendeur vendeur = new Vendeur("John", null, null, null);
        Appartement appartement = new Appartement("123 Main St", "City", "12345", vendeur, "1");
        TypePiece pieceHabitable = new TypePiece("Chambre", true, true);
        for (int i = 1; i <= 8; i++) {
            Piece piece = new PieceParallelogramme(pieceHabitable, "Étage " + i, 4.0, 6.0);
            appartement.ajouterPiece(piece);
        }

        String expectedTypeBien = "T7+";
        
        assertEquals(expectedTypeBien, appartement.typeBien());
    }

    
}
