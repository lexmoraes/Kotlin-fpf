// Desafio 1 - Questão 3:

import kotlin.Int

fun main() {
    println("Digite um valor inteiro para A:")
    val a = readLine()?.toDoubleOrNull()

    println("Digite um valor inteiro para B:")
    val b = readLine()?.toDoubleOrNull()

    println("Digite um valor inteiro para C:")
    val c = readLine()?.toDoubleOrNull()

    // Valida a entrada
    if (a == null || b == null || c == null) {
        println("Entrada inválida. Por favor, insira números válidos para A, B e C.")
        return
    }

    // Verifica se A é zero (não é uma equação do 2º grau)
    if (a == 0.0) {
        println("O valor de A não pode ser zero, pois isso não configura uma equação do 2º grau.")
        return
    }

    // Calcula delta
    val delta = b * b - 4 * a * c

    // Analisa o discriminante para determinar o tipo de raízes
    if (delta > 0) {
        // Duas raízes reais distintas
        val x1 = (-b + Math.sqrt(delta)) / (2 * a)
        val x2 = (-b - Math.sqrt(delta)) / (2 * a)
        println("A equação possui duas raízes reais e distintas:")
        println("x1 = $x1")
        println("x2 = $x2")
    } else if (delta == 0.0) {
        // raízes iguais
        val x = -b / (2 * a)
        println("A equação possui uma única raiz real (raízes iguais):")
        println("x = $x")
    } else {
        // Raízes complexas
        println("A equação não possui raízes reais")
    }
}