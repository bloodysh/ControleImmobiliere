import java.util.ArrayList;

public abstract class BienImmobilier {
    private String rue;
    private String ville;
    private String codePostal;
    private Vendeur unVendeur;
    private ArrayList <TypePiece> lesPieces;


    public BienImmobilier (String rue, String ville, String codePostal, Vendeur unVendeur)
    {
        this.rue = rue;
        this.ville=ville;
        this.codePostal=codePostal;
        this.unVendeur=unVendeur;
    }

}
