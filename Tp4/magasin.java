
public class magasin {


    public int ident;
    public String libel;
    public String adrs;
    public int cap = 50;
    public Produit[] produits = new Produit[50];
    int nbrproduit = 0;
    int nbrempl = 0;
    public int numero;
    public static int cpt;
    public employe[] employ = new employe[20];
    public double prix;

    public magasin(int ident, String libel, String adrs) {
        this.libel = libel;
        this.ident = ident;
        this.adrs = adrs;

    }

    public magasin(int ident, String adrs, int cap) {

        this.ident = ident;
        this.adrs = adrs;
        this.cap = cap;
        numero = cpt;
        cpt++;
    }


    public void ajouter(Produit pds) {

        if (nbrproduit <= cap) {
            produits[nbrproduit] = pds;
            nbrproduit++;
        } else
            System.out.println(" impbossible");


    }

    public void ajoutempl(employe empl) {
        if (nbrempl <= 20) {
            employ[nbrempl] = empl;

            nbrempl++;
        }


    }


    public void affiche() {
        int i;
        System.out.println("identifiant mgs : " + ident + " adresse: " + adrs + "capacite" + cap);
        for (i = 0; i < nbrproduit; i++) {
            produits[i].affichep();

        }


    }


    public void affichetout() {
        int i;
        System.out.println("identifiant mgs : " + ident + "nom :" + libel + " adresse: " + adrs + "capacite" + cap);
        for (i = 0; i < nbrproduit; i++) {
            produits[i].affichep();

        }
        for (i = 0; i < nbrempl; i++) {
            employ[i].afficheemploye();

        }
    }


    public boolean comparer(Produit pdt) {

        if ((this.ident == pdt.ident) && (this.libel == pdt.libel) && (this.prix == pdt.prix))
            return true;
        else
            return false;


    }


    public boolean comparer1(Produit pdt1, Produit pdt2) {

        if ((pdt1.ident == pdt2.ident) && (pdt1.libel == pdt2.libel) && (pdt1.prix == pdt2.prix))


            return true;
        else

            return false;


    }
}


