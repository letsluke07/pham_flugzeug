public class Flugzeug
{
    private String  modell;
    private int     sitzplaetze;
    private boolean langstrecke;
    
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
}