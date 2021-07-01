package com.bruno.layoutgooglekeep

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)

        val lista = mutableListOf<anotacao>(
            anotacao(titulo="Tarefas", texto="Fazer as compras do mês"),
            anotacao(titulo="Receita de um bom almoço", texto="arroz, feijão, carne branca e salada"),
            anotacao(titulo="Trabalho", texto="Reunião dia 23/04 as 14hs no salão principal"),
            anotacao(titulo="Estudos", texto="Começar a fazer o treinamento da Oracle Academy"),
        )

        rv.adapter = anotacaoAdapter(lista)

        // Exibe os itens em uma coluna única no padrão vertical
        //rv.layoutManager = LinearLayoutManager(this)

        // Exibe os itens em uma coluna única no padrão horizontal
        // rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // Exibe os itens em uma tabela com x colunas
        rv.layoutManager = GridLayoutManager(this, 2)

        // Exibe os itens em uma tabela porém as células são ajustadas automaticamente de acordo com o conteúdo (Google Keep, Pintrest)
        // rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

    }
}