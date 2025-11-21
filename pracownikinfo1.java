import java.util.*;

public class PracownikInfo1
{
    public static void main(String args[])
    {
        Pracownik[] wol = new Pracownik[1];

        wol[0] = new Pracownik("JK", 3000.00, 2025, 11, 14);

        System.out.print("Nazwa: " + wol[0].getNazwa() + " Pensja: " + wol[0].getPensja() + " Wyrok: " + wol[0].getDzat());
    }

    static class Pracownik
    {
        private String nazwa;
        private double pensja;
        private Date dzat; //data zatrudnienia

        //konstruktor
        public Pracownik(String n, double p, int r, int m, int d)
        {
            nazwa = n;
            pensja = p;
            // m-1 is used because Calendar months are 0-indexed (0 is January)
            GregorianCalendar rmd = new GregorianCalendar(r, m-1, d);
            dzat = rmd.getTime();
        }

        //metody
        public String getNazwa()
        {
            return nazwa;
        }

        public Date getDzat()
        {
            return dzat;
        }

        public Double getPensja()
        {
            return pensja;
        }
    }
}
