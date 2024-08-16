package com.example.aulaaprendendojavadozero;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aulaaprendendojavadozero.classes.Cliente;
import com.example.aulaaprendendojavadozero.classes.ContaBancaria;
import com.example.aulaaprendendojavadozero.classes.FuncionarioBanco;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        FuncionarioBanco funcionario = new FuncionarioBanco();
        funcionario.calcularSalarioComDesconto();

        ContaBancaria contabancaria = new ContaBancaria();
        contabancaria.sacar();

        Cliente cliente = new Cliente();
        cliente.sacar();

    }
}