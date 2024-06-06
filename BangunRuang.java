package week9;

public class BangunRuang extends BangunDatar {
    private int diameter;
    private int tinggi;
    private static final double pi = 3.14;

    public BangunRuang(int sisi, int tinggi) 
    {
        super(sisi);
        this.tinggi = tinggi;
    }

    public BangunRuang(int panjang, int lebar, int tinggi) 
    {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double volumeKubus() 
    {
        return getSisi() * getSisi() * getSisi();
    }

    public double volumeBalok() 
    {
        return getPanjang() * getLebar() * tinggi;
    }

    public double volumeTabung() 
    {
        return pi * Math.pow(getDiameter() / 2, 2) * tinggi;
    }

    public int getTinggi() 
    {
        return tinggi;
    }

    public int getDiameter() 
    {
        return diameter;
    }

    public void setDiameter(int diameter) 
    {
        this.diameter = diameter;
    }
}
