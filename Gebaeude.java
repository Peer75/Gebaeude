
public class Gebaeude
{
    protected double hoehe;
    protected String gebauedeArt; 
    protected int besucher;
    
    public Gebaeude( double pHoehe, int pBesucher )
    {
        hoehe = pHoehe;
        besucher = pBesucher;
    }

    public double getHoehe()
    {
        return hoehe;
    }
    
    public int anzahlBesucher() {
        return besucher;
    }
    
}
