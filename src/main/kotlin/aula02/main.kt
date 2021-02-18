package aula02

import java.util.*

fun main(){
   // var readLine : Int?
   // var scanner: Int?

    //Permite valores nulos e outros formatos de caracteres Scanner, não:
    //println("Testando o método readLine()")
    //readLine = readLine()?.toIntOrNull()

    //println("Testando o método scanner")
    //scanner = Scanner(System.`in`).nextInt()

    //println(readLine)
    //println(scanner)

    var livro3 : Livro? = null

    val livro1 = Livro(
        titulo = "Harry Potter",
        autor = "J K. Rowling ",
        editora = "Saraiva",
        numeroPaginas = 200,
        seEstaAlugado = true)

    val livro2 = Livro(
        titulo = "Capitães de areia",
        autor = "Jorge Amado",
        editora = "Saraiva",
        numeroPaginas = 150,
        seEstaAlugado = false)

    println(livro1)
    println(livro1.getTitulo())

    var listaLivros : MutableList<Livro> = mutableListOf(livro1, livro2)

    val resultado = Soma(3,2).somar()

    val carro1 = Carro(nome = "ABC", placa = "XPTO")
    val carro2 = Carro(nomeInserido = "DEF", placaInserida = "DEF", modeloNovo = true)

    println("${carro1.nome}, ${carro1.placa}")

    //Só exibe de forma completa no log só se for um dataclasse
    println(carro1)

    val tipo = EnumTiposPokemon.FOGO

    val mensagem = when(tipo){
        EnumTiposPokemon.FOGO -> "Tá pegando fogo, bicho!"
        EnumTiposPokemon.DRAGAO -> "Dragão"
        else -> "Alguma coisa...."
    }

    println(mensagem)

    val casa = Imovel(valor = 350000.00, qtdQuartos = 4, endereco = "Onde judas perdeu as botas")
    val apartamento = Imovel(valor = 450000.00,qtdQuartos = 3,endereco = "Rua Alameda", numeroAndares = 8)






}