// Desafio 1 - Questão 4:

fun main() {
    var soma = 0.0

    // 50 primeiros termos da série
    for (n in 1..50) {
        val numerador = 1000 - 3 * (n - 1)
        val denominador = n.toDouble()

        // Convertendo os sinais positivo e negativo
        val sinal = if ((n + 1) % 2 == 0) -1.0 else 1.0

        // Calcula o termo atual
        val termo = (numerador / denominador) * sinal
        soma += termo
    }
    println("A soma dos 50 primeiros elementos da série é: $soma")
}