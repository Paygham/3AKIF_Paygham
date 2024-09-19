public class Auto
{
    
    private String marke;
    private int baujahr;
    private boolean unfallauto;
    
    public void auto(){
        setMarke("Audi");
        setBaujahr(2014);
        setUnfallauto(true);
    
        
    }
    
    public String getMarke (){
            return marke;
        }
    public int  getBaujahr (){
            return baujahr;
        }
    public boolean getUnfallauto (){
            return unfallauto;
    }

    
    
    public void setMarke(String neuMarke)
    {
    
        this.marke = neuMarke;
    
    }
    
    public void setBaujahr(int neuBaujahr)
    {
        this.baujahr = neuBaujahr;
    
    }
    
    public void setUnfallauto(boolean unfallauto)
    {
        this.unfallauto = unfallauto;
        
    }
    
    public String notString(String str) {
  if(str.substring(0,2).equals("not")){
    return str;
  }
  return "not" + str;
}


}