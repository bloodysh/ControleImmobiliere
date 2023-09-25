public class Annonce {
    private String reference;
    private String date;
    private String titre;
    private double prixM2Habitable;
    private BienImmobilier logement;
    private double COEF_NON_HABITABLE = 0.25;

    public Annonce (String reference, String date, String titre, double prixM2Habitable, BienImmobilier logement)

    {
        this.reference = reference;
        this.date=date;
        this.titre= titre;
        this.prixM2Habitable=prixM2Habitable;
        this.logement=logement;
    }

    public double prix()
    {
        double lePrix=0.0;
        lePrix += logement.surfaceHabitable() * prixM2Habitable;
        lePrix+= logement.surfaceNonhabitable()  * prixM2Habitable * COEF_NON_HABITABLE;

        return lePrix;
    }

    @Override
    public String toString() {
        return titre + "\n" + "Annonce "
        + reference + " du " + date + "\n"
        + logement.toString() + "\n"
        + " - Prix du m2 habitable : "+prixM2Habitable + "\n" 
        + " - Prix du m2 non habitable : " + (prixM2Habitable * COEF_NON_HABITABLE) + "\n" 
        + "Valeur du bien: "+ prix() + "\n"
        + "Contact: "+ logement.getUnVendeur().getEmail() + " / " + logement.getUnVendeur().getNumeroTelephone();

    }

    
}
