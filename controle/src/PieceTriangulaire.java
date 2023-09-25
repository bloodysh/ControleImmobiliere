public class PieceTriangulaire extends Piece{
    private double d1;
    private double d2;

    public PieceTriangulaire (TypePiece typePiece, String niveau, double d1, double d2)
    {
        super (typePiece, niveau);
        this.d1= d1;
        this.d2=d2;
    }

    @Override
    public double surface()
    {
        return (d1*d2)/2;
    }
}
