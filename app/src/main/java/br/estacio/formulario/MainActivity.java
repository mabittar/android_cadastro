package br.estacio.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtName;
    private EditText txtEmail;
    private EditText txtSenha;
    private EditText txtSenhaConf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (EditText) findViewById(R.id.txtName);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        txtSenhaConf = (EditText) findViewById(R.id.txtSenhaConf);
    }

    public void btnGravar(View view){
        String name = txtName.getText().toString();
        String email = txtEmail.getText().toString();
        String senha = txtSenha.getText().toString();
        String senhaconf = txtSenhaConf.getText().toString();

        if(senha.equals(senhaconf) && !senha.isEmpty()){
            Toast.makeText(MainActivity.this, (name + " - " + email + " - " + senha), Toast.LENGTH_SHORT).show();
            txtName.setText("");
            txtEmail.setText("");
            txtSenha.setText("");
            txtSenhaConf.setText("");
        }else{
            Toast.makeText(MainActivity.this, "As senhas não conferem!!!", Toast.LENGTH_SHORT).show();
        }

    }
}