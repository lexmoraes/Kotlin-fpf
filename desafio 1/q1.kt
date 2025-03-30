// Desafio 1 - Questão 1:

// - Resolução Questão 1:

fun main() {
  println("Digite a quantidade de segundos:")
  val totalSegundos = readLine()?.toLongOrNull()

  // Validation
  if (totalSegundos == null || totalSegundos < 0) {
      println("Entrada inválida. Por favor, insira um número inteiro positivo.")
      return
  }

  val horas = totalSegundos / 3600
  val restoSegundos = totalSegundos % 3600
  val minutos = restoSegundos / 60
  val segundos = restoSegundos % 60

  // Formata no formato hh:mm:ss
  val resultado = String.format("%02d:%02d:%02d", horas, minutos, segundos)

  println("O tempo equivalente é: $resultado")
}