import java.text.DecimalFormat;

public class PieceParallelogramme extends Piece{
    private double d1;
    private double d2;

    public PieceParallelogramme(TypePiece typePiece, String niveau, double d1, double d2)
    {
        super(typePiece, niveau);
        this.d1 = d1;
        this.d2=d2;
    }

    @Override
    public double surface()
    {
        double resultat= 0.0;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        numberFormat.format(resultat = (d1*d2));
        return resultat;
        
    }
}
