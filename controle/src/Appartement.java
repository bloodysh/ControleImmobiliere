public class Appartement extends BienImmobilier{
    private String etage;

    public Appartement (String rue, String ville, String codePostal, Vendeur unVendeur, String etage)
    {
        super (rue, ville, codePostal, unVendeur);
        this.etage = etage;
    }
}
