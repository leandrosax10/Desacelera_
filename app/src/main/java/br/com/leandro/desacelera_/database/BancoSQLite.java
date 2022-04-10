package br.com.leandro.desacelera_.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import br.com.leandro.desacelera_.modelos.FichaAnamnese;
import br.com.leandro.desacelera_.modelos.Profissional;
import br.com.leandro.desacelera_.modelos.Usuario;

public class BancoSQLite extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "Dados_Desacerela.db";
    //--------------------------------DADOS DOS USUARIOS----------------------------------

    private static final String TABELA ="usuarios";
    private static final String ID = "id";
    private static final String NOME_USUARIO = "nome_usuario";
    private static final String SOBRENOME_USUARIO = "sobrenome_usuario";
    private static final String EMAIL_USUARIO_LOGIN = "email_usuario_login";
    private static final String TELEFONE_USUARIO = "telefone_usuario";
    private static final String DATA_NASCIMENTO_USUARIO = "data_nascimento_usuario";
    private static final String SENHA_CADASTRO_USUARIO = "senha_cadastro_usuario";

//-------------------------------DADOS DOS PROFISSIONAIS---------------------------------------

    private static final String TABELA_PROFISSIONAIS ="profissionais";
    private static final String ID_PROFISSIONAL = "id_profissional";
    private static final String NOME_PROFISSIONAL = "nome_profissional";
    private static final String SOBRENOME_PROFISSIONAL = "sobrenome_profissional";
    private static final String EMAIL_PROFISSIONAL_LOGIN = "email_profissional_login";
    private static final String NUMERO_REGISTRO_CRM = "numero_registro_crm";
    private static final String DATA_NASCIMENTO_PROFISSIONAL = "data_nascimento_profissional";
    private static final String SENHA_CADASTRO_PROFISSIONAL = "senha_cadastro_profissional";

//----------------------------------FICHA DE ANAMNESE---------------------------------------------

    private static final String TABELA_FICHA_ANAMNESE = "ficha_anamnese";
    private static final String ID_FICHA ="id_anamnese";
    private static final String O_QUE_VOCE_ESTA_SENTINDO = "oquevoceestasentindo";
    private static final String COMO_COMECOU ="comocomecou";
    private static final String FOI_REPENTINO_OU_GRADUAL = "foirepentinoougradual";
    private static final String QUAIS_SINTOMAS = "quaissintomas";

  //-------------------------------------------------------------------------------------------

    private static final int VERSAO = 1;

    public BancoSQLite(Context context) {
        super(context, NOME_BANCO, null, VERSAO);
    }

    //Tabela de usuários
    public void onCreate(SQLiteDatabase db){
        //CREATE TABLE usuarios (id INTERGER PRIMARY KEY AUTOINCREMENT, login TEXT, senha TEXT)

        String CREATE_USUARIOS_TABLE = "CREATE TABLE " + TABELA + " ( "+
                ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"+
                NOME_USUARIO +" TEXT,"+
                SOBRENOME_USUARIO +" TEXT,"+
                EMAIL_USUARIO_LOGIN +" TEXT,"+
                TELEFONE_USUARIO +" TEXT,"+
                DATA_NASCIMENTO_USUARIO +" TEXT,"+
                SENHA_CADASTRO_USUARIO +" TEXT )" ;
        db.execSQL(CREATE_USUARIOS_TABLE);

        //CRIAÇÃO DA TABELA DE PROFISSIONAIS

        String CREATE_PROFISSIONAIS_TABLE = " CREATE TABLE " + TABELA_PROFISSIONAIS + " ( "+
                ID_PROFISSIONAL + " INTEGER PRIMARY KEY AUTOINCREMENT,"+
                NOME_PROFISSIONAL +" TEXT,"+
                SOBRENOME_PROFISSIONAL +" TEXT,"+
                EMAIL_PROFISSIONAL_LOGIN +" TEXT,"+
                NUMERO_REGISTRO_CRM +" TEXT,"+
                DATA_NASCIMENTO_PROFISSIONAL +" TEXT,"+
                SENHA_CADASTRO_PROFISSIONAL +" TEXT )" ;
        db.execSQL(CREATE_PROFISSIONAIS_TABLE);

        //CRIAÇÃO DA TABELA DE PROFISSIONAIS

        String CREATE_FICHA_ANAMNESE_TABLE = " CREATE TABLE " + TABELA_FICHA_ANAMNESE + " ( " +
                ID_FICHA + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                O_QUE_VOCE_ESTA_SENTINDO + " TEXT, "+
                COMO_COMECOU + " TEXT, "+
                FOI_REPENTINO_OU_GRADUAL + " TEXT, "+
                QUAIS_SINTOMAS + " TEXT )";
        db.execSQL(CREATE_FICHA_ANAMNESE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABELA);
        db.execSQL("DROP TABLE IF EXISTS " + TABELA_PROFISSIONAIS);
        db.execSQL("DROP TABLE IF EXISTS " + TABELA_FICHA_ANAMNESE);
        onCreate(db);
    }
//INSERIR
    public boolean inserirUsuario(Usuario u) {
        long result;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NOME_USUARIO,u.getNomeUsuario());
        values.put(SOBRENOME_USUARIO,u.getSobrenomeUsuario());
        values.put(EMAIL_USUARIO_LOGIN, u.getEmailUsuario());
        values.put(TELEFONE_USUARIO,u.getTelefoneUsuario());
        values.put(DATA_NASCIMENTO_USUARIO,u.getDataNascimentoUsuario());
        values.put(SENHA_CADASTRO_USUARIO, u.getSenhaCadastroUsuario());

        result = db.insert(TABELA, null, values);
        db.close();

        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean inserirProfissional(Profissional u) {
        long result;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NOME_PROFISSIONAL, u.getNomeProfissional());
        values.put(SOBRENOME_PROFISSIONAL, u.getSobrenomeProfissional());
        values.put(EMAIL_PROFISSIONAL_LOGIN, u.getEmailProfissionalLogin());
        values.put(NUMERO_REGISTRO_CRM, u.getNumeroRegistroCRM());
        values.put(DATA_NASCIMENTO_PROFISSIONAL, u.getDataNascimentoProfissional());
        values.put(SENHA_CADASTRO_PROFISSIONAL, u.getSenhaCadastroProfissional());

        result = db.insert(TABELA_PROFISSIONAIS, null, values);
        db.close();

        if(result == -1)
            return false;
        else
            return true;
    }
    public boolean inserirFicha(FichaAnamnese u) {
        long result;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(O_QUE_VOCE_ESTA_SENTINDO, u.getOqueVoceEstaSentindo());
        values.put(COMO_COMECOU, u.getComoComecou());
        values.put(FOI_REPENTINO_OU_GRADUAL, u.getFoirepentino());
        values.put(QUAIS_SINTOMAS, u.getQuaisSintomas());

        result = db.insert(TABELA_FICHA_ANAMNESE, null, values);
        db.close();

        if(result == -1)
            return false;
        else
            return true;
    }


    //SELECIONAR USUARIO
    public Usuario selecionarUsuario(String email_usuario_login){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA,
                new String[]{ID,NOME_USUARIO,SOBRENOME_USUARIO, EMAIL_USUARIO_LOGIN,TELEFONE_USUARIO, DATA_NASCIMENTO_USUARIO, SENHA_CADASTRO_USUARIO},
                EMAIL_USUARIO_LOGIN + " = ? ",
                new String[]{String.valueOf(email_usuario_login) }, null, null, null, null);

        if(cursor != null){
            cursor.moveToFirst();

            Usuario user = new Usuario(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6));

            return (Usuario) user.clone();
        } else
            return null;
    }
    //SELECIONAR PROFISSIONAL
    public Profissional selecionarProfissional(String email_profissional_login){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA_PROFISSIONAIS,
                new String[]{ID_PROFISSIONAL,NOME_PROFISSIONAL,SOBRENOME_PROFISSIONAL, EMAIL_PROFISSIONAL_LOGIN,NUMERO_REGISTRO_CRM,DATA_NASCIMENTO_PROFISSIONAL, SENHA_CADASTRO_PROFISSIONAL},
                EMAIL_PROFISSIONAL_LOGIN + " = ? ",
                new String[]{String.valueOf(email_profissional_login) }, null, null, null, null);

        if(cursor != null){
            cursor.moveToFirst();

            Profissional user = new Profissional(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6));

            return (Profissional) user.clone();
        } else
            return null;
    }

    public Usuario selecionarUsuarioporID(String id){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA,
                new String[]{ID, EMAIL_USUARIO_LOGIN, SENHA_CADASTRO_USUARIO},
                ID + " = ?",
                new String[]{ String.valueOf(id) }, null, null, null, null);

        if(cursor != null) {
            cursor.moveToFirst();

            Usuario user = new Usuario(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6));

            return (Usuario) user.clone();
        } else
            return null;
    }

        //Tabela de profissionais
        public Profissional selecionarProfissionalporID(String id){
            SQLiteDatabase db = this.getReadableDatabase();

            Cursor cursor = db.query(
                    TABELA_PROFISSIONAIS,
                    new String[]{ID_PROFISSIONAL, EMAIL_PROFISSIONAL_LOGIN, SENHA_CADASTRO_PROFISSIONAL},
                    ID_PROFISSIONAL + " = ?",
                    new String[]{ String.valueOf(id) }, null, null, null, null);

            if(cursor != null) {
                cursor.moveToFirst();

                Profissional user = new Profissional(
                        Integer.parseInt(cursor.getString(0)),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5),
                        cursor.getString(6));

                return (Profissional) user.clone();
            } else
                return null;
        }

        public Cursor listaProfissionais(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABELA_PROFISSIONAIS, new String[]{ID_PROFISSIONAL,NOME_PROFISSIONAL,SOBRENOME_PROFISSIONAL, EMAIL_PROFISSIONAL_LOGIN,NUMERO_REGISTRO_CRM,DATA_NASCIMENTO_PROFISSIONAL, SENHA_CADASTRO_PROFISSIONAL}, null, null, null, null, null);
                if(cursor != null){
                    cursor.moveToFirst();
                }
                return cursor;
        }

}
