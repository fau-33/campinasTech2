package aula01

fun main(){
    //Aula 01

    //var: posso subscrever o valor atribuído
    //val: não posso subscrever o valor atribuído

    //String
    //var nome = "Flávio"

    //Inteiros(int)
    //var idade = 37

    //Booleanos (Boolean)
    //val souLegal = false

    //Double
    //val valorNaMinhaConta = 0.00

    //Inicializar por atribuição sem especificar o tipo
    //val possuiConta = true

    //Inicialização especificando o tipo
    //var cnpj : String? = null
    //var idade : Int? = null

    //println("Qual a sua idade? ")
    //idade = readLine()?.toInt()
    //println(idade)

    //val provas : MutableList<Double?> = mutableListOf(4.6, null, 9.6)
    //val provasDoSistema : List<Double?> = provas

    //fun addNota(nota : Double? = null) = provas.add(nota)

    //fun getNotas(): List<Double?>{
    //    return provasDoSistema
    //}

    //addNota()
    //addNota(7.8)

    //println("Insira a nota do aluno? ")
    //FORCE UNWRAP !!
    //Força a não verificação (isto é, se é nulo ou não)
    //do retorno da função, no cado do readLine()
    //val resposta = readLine()?.toDoubleOrNull()

    //addNota(resposta)
    //println(getNotas())

    //MPA
    //val listaFuncionarios: MutableMap<Int, String> = mutableMapOf(1 to "Ana", 6 to "Priscilla")
    //val funcionario: Map<Int, String> = listaFuncionarios
    //
    //Tipos de inicialização tardia
    //var credencial: Int = 0
    //var nome: String
    //
    //do {
    //    println("Insira a credencial")
    //    val respostaCredencial = readLine()?.toIntOrNull()
    //
    //    respostaCredencial?.let{
    //        credencial : it
    //    }while(respostaCredencial == null && nome.isEmpty())
    //        listaFuncionarios[credencial] = nome
    //        println(funcionario)
   // }

   // val alunos : List<String> = listOf("André", "André", "André", "André")
   // val aluno : Set<String> = setOf("André", "André", "André", "André")

   // println("Lista: $alunos")
   // println("Set: "+ aluno)

   //val voceVaiMeEnxergar = true


    //fun teste(){
    //    voceVaiMeEnxergar
    //    fun teste2(){
    //        voceVaiMeEnxergar
    //    }
    //}





}