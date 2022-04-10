package br.com.leandro.desacelera_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import br.com.leandro.desacelera_.database.BancoSQLite;
import br.com.leandro.desacelera_.modelos.Usuario;

public class LoginActivity extends AppCompatActivity {

    EditText EmailLogin;
    EditText SenhaLogin;
    ImageButton BotaoEntrarTelaLogin;
    CheckBox BotaoCheckBoxProfissionalPaciente;
    int PacienteOuNao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        BotaoCheckBoxProfissionalPaciente = findViewById(R.id.checkBoxTelaLogin);

        BotaoCheckBoxProfissionalPaciente.setOnClickListener(view -> {
            if(BotaoCheckBoxProfissionalPaciente.isChecked()){
                PacienteOuNao = 1;
            } else{
                PacienteOuNao =0;
            }
        });

        EmailLogin = findViewById(R.id.editTextLoginEmail);
        SenhaLogin = findViewById(R.id.editTextSenhaTelaLogin);
        BotaoEntrarTelaLogin = findViewById(R.id.imageButtonEntrar);


        BotaoEntrarTelaLogin.setOnClickListener(view -> {
            BancoSQLite db = new BancoSQLite(this);
            try{
                Usuario usuario = db.selecionarUsuario(EmailLogin.getText().toString());

                if(usuario.getSenhaCadastroUsuario().equals(SenhaLogin.getText().toString())){
                    Intent intent = new Intent(getApplicationContext(), ListaProfissionaisActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(this, "Usuário não cadastrado!", Toast.LENGTH_SHORT).show();
            }catch (Exception e){
                Toast.makeText(this, "Usuário não cadastrado", Toast.LENGTH_SHORT).show();
            }
        });


        //Back to the home
        ImageButton BotaoBackTelaLogin = (ImageButton) findViewById(R.id.imageButtonBackTelaLogin);

        BotaoBackTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back) {
                Intent b = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(b);
            }
        });

        //CALL OF PAGES FOOTER
        ImageButton BotaoAjudaMeTelaLogin = (ImageButton) findViewById(R.id.imageButtonAjudaMenuTelaLogin);

        BotaoAjudaMeTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnAjuda) {
                Intent i = new Intent(getApplicationContext(), AjudaActivity.class);
                startActivity(i);
            }
        });

        ImageButton BotaoLivroTelaLogin = (ImageButton) findViewById(R.id.imageButtonLivroMenuTelaLogin);

        BotaoLivroTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLivro) {
                Intent l = new Intent(getApplicationContext(), LivroActivity.class);
                startActivity(l);
            }
        });

        ImageButton BotaoPlayListTelaLogin = (ImageButton) findViewById(R.id.imageButtonPlaylistMenuTelaLogin);

        BotaoPlayListTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), PlayListActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoExerciciosTelaLogin = (ImageButton) findViewById(R.id.imageButtonExercicioMenuTelaLogin);

        BotaoExerciciosTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), ExerciciosActivity.class);
                startActivity(p);
            }
        });
        ImageButton BotaoCadastreSeTelaLogin = (ImageButton) findViewById(R.id.imageButtonCadastroMenuTelaLogin);

        BotaoCadastreSeTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastro) {
                Intent c = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(c);
            }
        });
        ImageButton BotaoLoginTelaLogin =(ImageButton) findViewById(R.id.imageButtonProfissionaisMenuTelaLogin);
        BotaoLoginTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLogin) {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
            }
        });

        Button BotaoRecuperarSenha = (Button) findViewById(R.id.buttonEsqueciMinhaSenha);

        BotaoRecuperarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent senhaR = new Intent(getApplicationContext(), EsqueciMinhaSenhaActivity.class);
                startActivity(senhaR);
            }
        });
    }
}