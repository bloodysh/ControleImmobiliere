public class Appartement extends BienImmobilier{
    private String etage;
    private boolean ascenseur;

    public Appartement (String rue, String ville, String codePostal, Vendeur unVendeur, String etage)
    {
        super (rue, ville, codePostal, unVendeur);
        this.etage = etage;
        this.ascenseur=false;
    }

    public Appartement (String rue, String ville, String codePostal, Vendeur unVendeur, String etage, boolean ascenseur)
    {
        super (rue, ville, codePostal, unVendeur);
        this.etage = etage;
        this.ascenseur=ascenseur;
    }

    public String typeBien() {
        int nombreDePiecesComptabilisees = 0;

        for (Piece piece : getLesPieces()) {
            TypePiece typePiece = piece.getTypePiece();

            if (typePiece.isPiece()) {
                nombreDePiecesComptabilisees++;
            }
        }

        if (nombreDePiecesComptabilisees == 0) {
            return "T0";
        } else if (nombreDePiecesComptabilisees <= 7) {
            return "T" + nombreDePiecesComptabilisees;
        } else {
            return "T7+"; 
        }
    }

    @Override
    public String toString() {
        String resultat = "";
        resultat = "Appartement de type "+ typeBien();
        if(ascenseur)
        {
            resultat+=" avec ascenseur";

        }
        resultat+= " situé au "+ etage + " ";
        resultat+= super.toString();
        return resultat;
    }

    
}

