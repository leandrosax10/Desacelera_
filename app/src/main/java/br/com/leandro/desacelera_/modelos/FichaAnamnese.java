package br.com.leandro.desacelera_.modelos;

public class FichaAnamnese implements Cloneable{

    private  int id;
    private String OqueVoceEstaSentindo;
    private String ComoComecou;
    private String Foirepentino;
    private String QuaisSintomas;

    public FichaAnamnese(){ }

    public FichaAnamnese(String OqueVoceEstaSentindo, String ComoComecou,
                     String Foirepentino, String QuaisSintomas ) {

    this.OqueVoceEstaSentindo =OqueVoceEstaSentindo;
    this.ComoComecou = ComoComecou;
    this.Foirepentino = Foirepentino;
    this.QuaisSintomas = QuaisSintomas;
}

    public FichaAnamnese(int id,String OqueVoceEstaSentindo, String ComoComecou,
                         String Foirepentino, String QuaisSintomas ) {
        this.id = id;
        this.OqueVoceEstaSentindo =OqueVoceEstaSentindo;
        this.ComoComecou = ComoComecou;
        this.Foirepentino = Foirepentino;
        this.QuaisSintomas = QuaisSintomas;
    }

    public FichaAnamnese (FichaAnamnese u){
        this.id = u.id;
        this.OqueVoceEstaSentindo = u.OqueVoceEstaSentindo;
        this.ComoComecou =u.ComoComecou;
        this.Foirepentino = u.Foirepentino;
        this.QuaisSintomas = u.QuaisSintomas;

    }

    //gets e sets
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOqueVoceEstaSentindo() {
        return this.OqueVoceEstaSentindo;
    }

    public  void setOqueVoceEstaSentindo(String oqueVoceEstaSentindo) {
        this.OqueVoceEstaSentindo = oqueVoceEstaSentindo;
    }

    public String getComoComecou() {
        return this.ComoComecou;
    }

    public void setComoComecou(String comoComecou) {
        this.ComoComecou = comoComecou;
    }

    public String getFoirepentino() {
        return this.Foirepentino;
    }

    public void setFoirepentino(String foirepentino) {
        this.Foirepentino = foirepentino;
    }

    public String getQuaisSintomas() {
        return this.QuaisSintomas;
    }

    public void setQuaisSintomas(String quaisSintomas) {
        this.QuaisSintomas = quaisSintomas;
    }

    @Override
    public Object clone(){

        FichaAnamnese clone = new FichaAnamnese(this);

        return clone;
    }

}