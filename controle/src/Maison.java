public class Maison extends BienImmobilier{
    private double surfaceTerrain;
    private boolean piscine;

    public Maison (String rue, String ville, String codePostale, Vendeur uVendeur, double surfaceTerrain)
    {
        super(rue, ville, codePostale, uVendeur);
        this.surfaceTerrain = surfaceTerrain;
        this.piscine = false;
    }

    public Maison (String rue, String ville, String codePostale, Vendeur uVendeur, double surfaceTerrain, boolean piscine)
    {
        super(rue, ville, codePostale, uVendeur);
        this.surfaceTerrain = surfaceTerrain;
        this.piscine = piscine;
    }

    @Override
    public String toString() {
        String resultat= "";
        resultat ="Maison individuelle " ;
        resultat+= "avec son terrain de "+surfaceTerrain+ " m2";
        if(piscine)
        {
            resultat+= " et sa piscine";
        }
        resultat += ". "+ super.toString();
        return resultat;
    }

    
}
