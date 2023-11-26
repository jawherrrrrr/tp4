public class testmagasin {

    public static void main(String[] args) {

        Produit p1 = new Produit(1021, "lait", "delice", 1.200);
        Produit pp = new Produit(1021, "lait", "delice", 1.200);
        Produit p2 = new Produit(2510, "yaourt", "vitalait", 1.600);
        Produit p3 = new Produit(3250, "tomate", "sicam", 1.200);
        magasin mgs = new magasin(12, "sidibouzid", 20);
        mgs.ajouter(p1);
        mgs.ajouter(p2);
        mgs.ajouter(p3);
        mgs.affiche();


        if (p1.comparer(p2)) {

            System.out.println("le deux produit identique");
        } else {

            System.out.println("les deux produit different");
        }
        ;


        if (p1.comparer(p1))

            System.out.println("le deux produit identique");

        else

            System.out.println("les deux produit different");


        System.out.println("le magasin numero  " + mgs.numero + " comporte " + mgs.nbrproduit + " produits ");
        magasin mgs1 = new magasin(1, "aziza", "centre ville");
        magasin mgs2 = new magasin(2, "monprix", "csidibouzid");
        caissier caisaziza1 = new caissier(1, "cais aziza1", "tunis", 12, 3);
        caissier caisaziza2 = new caissier(2, "caiss aziza2", "sousse", 10, 4);
        Vendeur vendeuraziza = new Vendeur(1, "vendeuraziza", "sisibouzid", 10, 16);
        responsable respensableaziza = new responsable(1, "responsable aziza", "sidibouzid", 16, 18.6);
        caissier caismonprix = new caissier(1, "caismon prix1", "tunis", 12, 3);
        responsable respensablemonprix = new responsable(1, "responsable mon prix", "sidibouzid", 16, 18.6);
        Vendeur vendeurmonprix1 = new Vendeur(1, "vendeur mon prix 1 ", "sisibouzid", 10, 16);
        Vendeur vendeurmonprix2 = new Vendeur(2, "vendeur mon prix 2 ", "sisibouzid", 10, 16);
        Vendeur vendeurmonprix3 = new Vendeur(3, "vendeur mon prix3", "sisibouzid", 10, 16);


        mgs1.ajoutempl(caisaziza1);
        mgs1.ajoutempl(caisaziza2);
        mgs1.ajoutempl(vendeuraziza);
        mgs1.ajoutempl(respensableaziza);
        mgs2.ajoutempl(caismonprix);
        mgs2.ajoutempl(respensablemonprix);
        mgs2.ajoutempl(vendeurmonprix1);
        mgs2.ajoutempl(vendeurmonprix2);
        mgs2.ajoutempl(vendeurmonprix3);
        caisaziza1.afficheemploye();
        caisaziza2.afficheemploye();
        vendeuraziza.afficheemploye();
        respensableaziza.afficheemploye();
        mgs1.ajouter(p1);
    }
}
