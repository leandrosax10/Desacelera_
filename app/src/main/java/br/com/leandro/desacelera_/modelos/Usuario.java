package br.com.leandro.desacelera_.modelos;

public class Usuario implements Cloneable{
    private int id;
    private String NomeUsuario;
    private String SobrenomeUsuario;
    private String EmailUsuarioLogin;
    private String TelefoneUsuario;
    private String DataNascimentoUsuario;
    private String SenhaCadastroUsuario;

    public Usuario(){

    }


    public Usuario(String EmailUsuarioLogin, String SenhaCadastroUsuario){
        this.EmailUsuarioLogin = EmailUsuarioLogin;
        this.SenhaCadastroUsuario = SenhaCadastroUsuario;
    }

    public Usuario(String NomeUsuario,String SobrenomeUsuario,String EmailUsuarioLogin,
                   String TelefoneUsuario,String DataNascimentoUsuario,String SenhaCadastroUsuario){
        this.NomeUsuario = NomeUsuario;
        this.SobrenomeUsuario = SobrenomeUsuario;
        this.EmailUsuarioLogin = EmailUsuarioLogin;
        this.TelefoneUsuario = TelefoneUsuario;
        this.DataNascimentoUsuario = DataNascimentoUsuario;
        this.SenhaCadastroUsuario = SenhaCadastroUsuario;
    }


    public Usuario(int id,String NomeUsuario,String SobrenomeUsuario,String EmailUsuarioLogin,
                   String TelefoneUsuario,String DataNascimentoUsuario,String SenhaCadastroUsuario){
        this.id = id;
        this.NomeUsuario = NomeUsuario;
        this.SobrenomeUsuario = SobrenomeUsuario;
        this.EmailUsuarioLogin = EmailUsuarioLogin;
        this.TelefoneUsuario = TelefoneUsuario;
        this.DataNascimentoUsuario = DataNascimentoUsuario;
        this.SenhaCadastroUsuario = SenhaCadastroUsuario;
    }

    public Usuario(Usuario u){
        this.id = u.id;
        this.NomeUsuario = u.NomeUsuario;
        this.SobrenomeUsuario = u.SobrenomeUsuario;
        this.EmailUsuarioLogin = u.EmailUsuarioLogin;
        this.TelefoneUsuario = u.TelefoneUsuario;
        this.DataNascimentoUsuario = u.DataNascimentoUsuario;
        this.SenhaCadastroUsuario = u.SenhaCadastroUsuario;
    }

    //metodos gets e sets
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeUsuario() {

        return this.NomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.NomeUsuario = nomeUsuario;
    }

    public String getSobrenomeUsuario() {
        return this.SobrenomeUsuario;
    }

    public void setSobrenomeUsuario(String sobrenomeUsuario) {
        this.SobrenomeUsuario = sobrenomeUsuario;
    }

    public String getEmailUsuario() {
        return this.EmailUsuarioLogin;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.EmailUsuarioLogin = emailUsuario;
    }

    public String getTelefoneUsuario() {
        return this.TelefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.TelefoneUsuario = telefoneUsuario;
    }

    public String getDataNascimentoUsuario() {
        return this.DataNascimentoUsuario;
    }

    public void setDataNascimentoUsuario(String dataNascimentoUsuario) {
        this.DataNascimentoUsuario = dataNascimentoUsuario;
    }

    public String getSenhaCadastroUsuario() {
        return this.SenhaCadastroUsuario;
    }

    public void setSenhaCadastroUsuario(String senhaCadastroUsuario) {
        this.SenhaCadastroUsuario = senhaCadastroUsuario;
    }

    @Override
    public Object clone(){

        Usuario clone = new Usuario(this);

        return clone;
    }


}
