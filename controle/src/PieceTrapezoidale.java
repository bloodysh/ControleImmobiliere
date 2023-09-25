public class PieceTrapezoidale extends Piece{
    private double d1;
    private double d2;
    private double h;

    public PieceTrapezoidale(TypePiece typePiece, String niveau, double d1, double d2, double h)
    {
        super(typePiece, niveau);
        this.d1= d1;
        this.d2=d2;
        this.h = h;
    }

    @Override
    public double surface()
    {
        return (0.5*h)*(d1+d2);
    }
}
