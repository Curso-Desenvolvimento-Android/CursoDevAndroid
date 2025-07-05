package com.example.pooherancakotlin

class Gerente : Funcionario(){

    private var comissao: Double? = null
    private var totalFuncionarios : Int? = 0

    fun getcomissao(): Double{
        return comissao!!
    }

    fun setcomissao(comissao: Double?){
        this.comissao = comissao
    }

    fun getTotalFuncionarios(): Int{
        return totalFuncionarios!!
    }

    fun setTotalFuncionarios(totalFuncionarios: Int?){
        this.totalFuncionarios = totalFuncionarios
    }

}