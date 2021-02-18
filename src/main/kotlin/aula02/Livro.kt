package aula02

data class Livro(private var titulo: String,
                 var numeroPaginas: Int,
                 var autor: String,
                 var editora: String,
                 var seEstaAlugado: Boolean){
                 //Encapsulamento: visibilidade de uma atributo ou método
                 //publico: visiblidade geral
                 //privado: só tem visibilidade na classe a qual ela pertence

                    fun getTitulo(): String{
                        return "Título do livro: $titulo"
                    }
}
/**
class Livro{
    private  var titulo: String
    private  var numeroPaginas: Int
    private  var autor: String
    private  var editora : String
    private  var seEstaAlugado: Boolean

    //COSTRUTOR PRIMARIO
    constructor(tituloInserido: String,
                numeroPaginasInserido: Int,
                autorInserido: String,
                editoraInserido: String,
                seEstaAlugadoInserido: Boolean = false){

                titulo = tituloInserido
                numeroPaginas = numeroPaginasInserido
                autor = autorInserido
                editora = editoraInserido
                seEstaAlugado = seEstaAlugadoInserido
    }
}
*/

/**
public  class Livro{
    private String titulo;
    private Int paginas;
    private String autor;
    private String editora;
    private  bool seEstaAlugado;

    public  Livro(String titulo, int paginas, String autor, String editora){
        setTitulo(titulo)
    }

    public String getTitulo(){
        return titulo
    }

    public  void setTitulo(String tituloInserido){
        this.titulo = tituloInserido
    }

    public void alugar(alugar:bool){
    seEstaAlugado = alugar;
    }


}
*/

























