public class responsable extends employe{



    public double prime;

    public responsable(int ident, String nom, String adrs, double nbhm, double prime) {
        super(ident, nom, adrs, nbhm);
        this.prime = prime;
    }




    public void afficheemploye(){

        super.afficheemploye();
        System.out.println("le  prime: "+prime);
    }

    public double salaireresp()
    {
        double sal=1;
        if(nbhm>160)
            sal+=(nbhm-160)*10*1.2;

        else
            sal=nbhm*10;

        return sal+prime;


    }



}