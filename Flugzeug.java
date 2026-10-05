public class Flugzeug
{
    private String  modell;
    private int     sitzplaetze;
    private boolean langstrecke;
    
    public Flugzeug(String neuModell, int neuSitzplaetze, boolean neuLangstrecke)
    {
        setModell(neuModell);
        setSitzplaetze(neuSitzplaetze);
        setLangstrecke(neuLangstrecke);
    }
    
    public Flugzeug(int neuSitzplaetze, boolean neuLangstrecke)
    {
        setModell("UNKN");
        setSitzplaetze(neuSitzplaetze);
        setLangstrecke(neuLangstrecke);
    }
    
    public Flugzeug(boolean neuLangstrecke)
    {
        setModell("UNKN");
        setSitzplaetze(0);
        setLangstrecke(neuLangstrecke);
    }
    
    public Flugzeug()
    {
        setModell("UNKN");
        setSitzplaetze(0);
        setLangstrecke(false);
    }
    
    public String getModell()
    {
        return modell;
    }
    
    public int getSitzplaetze()
    {
        return sitzplaetze;
    }
    
    public boolean getLangstrecke()
    {
        return langstrecke;
    }
    
    public void setModell(String neuModell)
    {
        modell = neuModell;
    }
    
    public void setSitzplaetze(int neuSitzplaetze)
    {
        sitzplaetze = neuSitzplaetze;
    }
    
    public void setLangstrecke(boolean neuLangstrecke)
    {
        langstrecke = neuLangstrecke;
    }
    
    public void printFlugzeug()
    {
        System.out.println("Flugzeug: " + modell + " - " + sitzplaetze + " - " + langstrecke);
    }
}