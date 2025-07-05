package com.example.pooherancakotlin

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var txtFuncionarios : TextView
    lateinit var txtNomes : TextView
    lateinit var txtDataAdm : TextView
    lateinit var txtSalario : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        iniciarComponentesDoLayout()

        criarObjetos()



        lateinit var joao: Funcionario

        joao.setNome("Joao")
        joao.setsalario(1200)
        joao.setDataAdmissao("01/02/2024")

        lateinit var gerentePedro: Gerente

        gerentePedro.setNome("Pedro")
        gerentePedro.setDataAdmissao("01/01/2022")
        gerentePedro.setsalario(2400)
        gerentePedro.setcomissao(10.5)
        gerentePedro.setTotalFuncionarios(25)

    }

    private fun criarObjetos() {



    }

    private fun iniciarComponentesDoLayout() {

        txtFuncionarios = findViewById(R.id.txtFuncionarios)
        txtNomes = findViewById(R.id.txtNomes)
        txtDataAdm = findViewById(R.id.txtDataAdm)
        txtSalario = findViewById(R.id.txtSalario)

    }
}