fun main() {
    println("Hello, world!!!");

    var idade: Int = 29;
    val nome: String = "Will";
    var estado: String;
    var cidade: String? = null;
    var pais = "Brazil";
    var continente = "Teste";
    val inicial: Char = 'W';
    val nome: String = "Cassion Andor";
    val estaAtivo: Boolean = true;
    var endereco: String? = null;
}

fun imprimir(qualquerCoisa: any): Unit {
    println(qualquerCoisa)
}

fun lancaExcecao(): Nothing {
    throw Exception("Ocorreu um erro de recursividade!")
}