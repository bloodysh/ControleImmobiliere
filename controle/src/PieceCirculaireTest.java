import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceCirculaireTest {
    @Test
    public void testPieceCirculaireSurface() {
        TypePiece typePiece = new TypePiece("Cuisine", true, true);
        PieceCirculaire pieceCirculaire = new PieceCirculaire(typePiece, "Étage 1", 5.0);
        double expectedSurface = Math.PI * 5.0 * 5.0;
        assertEquals(expectedSurface, pieceCirculaire.surface(), 0.01);
    }

    @Test
    public void testPieceCirculaireZeroDiameterSurface() {
        TypePiece typePiece = new TypePiece("Salle de bain", true, true);
        PieceCirculaire pieceCirculaire = new PieceCirculaire(typePiece, "Rez-de-chaussée", 0.0);
        double expectedSurface = 0.0;
        assertEquals(expectedSurface, pieceCirculaire.surface(), 0.01);
    }


    @Test
    public void testPieceQuadrilatereSurface() {
        TypePiece typePiece = new TypePiece("Cuisine", true, true);
        PieceQuadrilatere pieceQuadrilatere = new PieceQuadrilatere(typePiece, "Étage 1", 4.0, 6.0);
        double expectedSurface = 4.0 * 6.0;
        assertEquals(expectedSurface, pieceQuadrilatere.surface(), 0.01);
    }

    @Test
    public void testPieceTrapezoidaleSurface() {
        TypePiece typePiece = new TypePiece("Salon", true, true);
        PieceTrapezoidale pieceTrapezoidale = new PieceTrapezoidale(typePiece, "Rez-de-chaussée", 4.0, 6.0, 3.0);
        double expectedSurface = (0.5 * 3.0) * (4.0 + 6.0);
        assertEquals(expectedSurface, pieceTrapezoidale.surface(), 0.01);
    }

    @Test
    public void testPieceTriangulaireSurface() {
        TypePiece typePiece = new TypePiece("Chambre", true, true);
        PieceTriangulaire pieceTriangulaire = new PieceTriangulaire(typePiece, "Étage 2", 4.0, 6.0);
        double expectedSurface = (4.0 * 6.0) / 2;
        assertEquals(expectedSurface, pieceTriangulaire.surface(), 0.01);
    }
}
