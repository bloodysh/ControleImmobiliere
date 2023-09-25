import java.text.DecimalFormat;

public class PieceCirculaire extends Piece{
    private double d1;
    

    public PieceCirculaire(TypePiece typePiece, String niveau, double d1)
    {
        super(typePiece, niveau);
        this.d1= d1;
    }

    @Override
    public double surface()
    {
        double resultat= 0.0;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        numberFormat.format(resultat = Math.PI*(d1*d1));
        return resultat;
    }
}
