package br.com.leandro.desacelera_.modelos;

public class Profissional implements Cloneable{

    private int id;
    private String NomeProfissional;
    private String SobrenomeProfissional;
    private String EmailProfissionalLogin;
    private String NumeroRegistroCRM;
    private String DataNascimentoProfissional;
    private String SenhaCadastroProfissional;


    public Profissional(){}


    public Profissional(String EmailProfissionalLogin, String SenhaCadastroProfissional){
        this.EmailProfissionalLogin = EmailProfissionalLogin;
        this.SenhaCadastroProfissional = SenhaCadastroProfissional;
    }
    public Profissional(String NomeProfissional,String SobrenomeProfissional,String EmailProfissionalLogin,
                        String NumeroRegistroCRM,String DataNascimentoProfissional,String SenhaCadastroProfissional){

        this.NomeProfissional = NomeProfissional;
        this.SobrenomeProfissional = SobrenomeProfissional;
        this.EmailProfissionalLogin = EmailProfissionalLogin;
        this.NumeroRegistroCRM = NumeroRegistroCRM;
        this.DataNascimentoProfissional = DataNascimentoProfissional;
        this.SenhaCadastroProfissional = SenhaCadastroProfissional;
    }


    public Profissional(int id,String NomeProfissional,String SobrenomeProfissional,String EmailProfissionalLogin,
                   String NumeroRegistroCRM,String DataNascimentoProfissional,String SenhaCadastroProfissional){
        this.id = id;
        this.NomeProfissional = NomeProfissional;
        this.SobrenomeProfissional = SobrenomeProfissional;
        this.EmailProfissionalLogin = EmailProfissionalLogin;
        this.NumeroRegistroCRM = NumeroRegistroCRM;
        this.DataNascimentoProfissional = DataNascimentoProfissional;
        this.SenhaCadastroProfissional = SenhaCadastroProfissional;
    }

    public Profissional(Profissional u){
        this.id = u.id;
        this.NomeProfissional = u.NomeProfissional;
        this.SobrenomeProfissional = u.SobrenomeProfissional;
        this.EmailProfissionalLogin = u.EmailProfissionalLogin;
        this.NumeroRegistroCRM = u.NumeroRegistroCRM;
        this.DataNascimentoProfissional = u.DataNascimentoProfissional;
        this.SenhaCadastroProfissional = u.SenhaCadastroProfissional;
    }

    //metodos gets e sets
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProfissional() {
        return this.NomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.NomeProfissional = nomeProfissional;
    }

    public String getSobrenomeProfissional() {
        return this.SobrenomeProfissional;
    }

    public void setSobrenomeProfissional(String sobrenomeProfissional) {
        this.SobrenomeProfissional = sobrenomeProfissional;
    }

    public String getEmailProfissionalLogin() {
        return this.EmailProfissionalLogin;
    }

    public void setEmailProfissionalLogin(String emailProfissionalLogin) {
        this.EmailProfissionalLogin = emailProfissionalLogin;
    }

    public String getNumeroRegistroCRM() {
        return this.NumeroRegistroCRM;
    }

    public void setNumeroRegistroCRM(String numeroRegistroCRM) {
        this.NumeroRegistroCRM = numeroRegistroCRM;
    }

    public String getDataNascimentoProfissional() {
        return this.DataNascimentoProfissional;
    }

    public void setDataNascimentoProfissional(String dataNascimentoProfissional) {
        this.DataNascimentoProfissional = dataNascimentoProfissional;
    }

    public String getSenhaCadastroProfissional() {
        return this.SenhaCadastroProfissional;
    }

    public void setSenhaCadastroProfissional(String senhaCadastroProfissional) {
        this.SenhaCadastroProfissional = senhaCadastroProfissional;
    }

    @Override
    public Object clone(){

        Profissional clone = new Profissional(this);

        return clone;
    }

}
