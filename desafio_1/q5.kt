// Desafio 1 - Questão 5

fun ehPrimo(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun encontrarPrimosParaGoldbach(n: Int): Pair<Int, Int>? {
    for (i in 2..n / 2) {
        val complemento = n - i
        if (ehPrimo(i) && ehPrimo(complemento)) {
            return Pair(i, complemento)
        }
    }
    return null
}

fun main() {
    println("Digite um número par maior que 2:")
    val numero = readLine()?.toIntOrNull()

    // Valida a entrada
    if (numero == null || numero <= 2 || numero % 2 != 0) {
        println("Entrada inválida. Por favor, insira um número par maior que 2.")
        return
    }

    val resultado = encontrarPrimosParaGoldbach(numero)

    if (resultado != null) {
        println("$numero = ${resultado.first} + ${resultado.second}")
    } else {
        println("Não foi possível encontrar dois números primos que somem $numero.")
    }
}