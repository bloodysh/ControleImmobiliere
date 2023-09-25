import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class BienImmobilier {
    private String rue;
    private String ville;
    private String codePostal;
    private Vendeur unVendeur;
    private ArrayList <Piece> lesPieces;


    public BienImmobilier (String rue, String ville, String codePostal, Vendeur unVendeur)
    {
        this.rue = rue;
        this.ville=ville;
        this.codePostal=codePostal;
        this.unVendeur=unVendeur;
        this.lesPieces = new ArrayList<>();
    }
    

    public double surfaceHabitable() {
        double surfaceTotaleHabitable = 0.0;

        for (Piece piece : lesPieces) {
            if (piece.getTypePiece().isSurfaceHabitable()) {
                surfaceTotaleHabitable += piece.surface();
            }
        }
        return surfaceTotaleHabitable;
    }

    public ArrayList<Piece> getLesPieces() {
        return lesPieces;
    }


    public double surfaceNonhabitable()
    
    {
        double surfaceNonHabitable=0.0;
        for (Piece piece : lesPieces) {
            if (!piece.getTypePiece().isSurfaceHabitable()) {
                surfaceNonHabitable += piece.surface();
            }
        }
        return surfaceNonHabitable;
    }

    public void ajouterPiece(Piece piece)
    {
        lesPieces.add(piece);
    }


    public Vendeur getUnVendeur() {
        return unVendeur;
    }

    


    @Override
    public String toString() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return "\nLocalisation : " + rue + " "+ codePostal+ " "+ ville+"\n \nDescriptiondu bien : \n" + lesPieces.toString() +
        "\nPour une surface habitable de : " +
        numberFormat.format(surfaceHabitable())+
        " m2 et une surface non habitable de : "+
        numberFormat.format(surfaceNonhabitable()) + " m2";
    }


    

    
    

}

