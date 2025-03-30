// Desafio 1 - Questão 2:

fun main() {
    println("Digite um número de 4 dígitos (entre 1000 e 9999):")
    val numero = readLine()?.toIntOrNull()

    // Valida
    if (numero == null || numero < 1000 || numero > 9999) {
        println("Entrada inválida. Por favor, insira um número de 4 dígitos entre 1000 e 9999.")
        return
    }

    // Divide o número em duas partes
    val parte1 = numero / 100 // Extrai os dois primeiros dígitos (milhar e centena)
    val parte2 = numero % 100 // Extrai os dois últimos dígitos (dezena e unidade)

    // Calcula a soma das duas partes
    val soma = parte1 + parte2

    // Calcula o quadrado da soma
    val quadrado = soma * soma

    // Verifica se o quadrado é igual ao número original
    if (quadrado == numero) {
        println("$numero obedece à característica descrita ($parte1 + $parte2 = $soma, e $soma x $soma = $numero).")
    } else {
        println("$numero não obedece à característica descrita.")
    }
}