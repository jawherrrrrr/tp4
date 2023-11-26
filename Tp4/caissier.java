
public class caissier extends employe{
    public int numc;

    public caissier(int ident, String nom, String adrs, double nbhm, int numc) {
        super(ident, nom, adrs, nbhm);
        this.numc = numc;
    }

    public void afficheemploye(){

        super.afficheemploye();
        System.out.println("le le numero de caisse"+numc);
    }

    public double salairecaiss()
    {
        double sal=0;
        if(nbhm>180)
            sal+=(nbhm-180)*5+1.15;

        else
            sal= nbhm*5;

        return sal;


    }
}
