import kotlin.random.Random


class Carta(val nome: String, var ataque: Int, var defesa: Int, var vida: Int) {
    fun estaViva(): Boolean {
        return vida > 0
    }
}

class Jogador(val nome: String, val baralho: MutableList<Carta>) {
    fun temCartas(): Boolean {
        return baralho.isNotEmpty()
    }
}

class Duelo(val jogador1: Jogador, val jogador2: Jogador) {
    fun iniciarDuelo() {
        println("Iniciando duelo entre ${jogador1.nome} e ${jogador2.nome}!")
        
        while (jogador1.temCartas() && jogador2.temCartas()) {
            val carta1 = jogador1.baralho.random()
            val carta2 = jogador2.baralho.random()
            
            println("${jogador1.nome} escolheu ${carta1.nome} (${carta1.vida} HP)")
            println("${jogador2.nome} escolheu ${carta2.nome} (${carta2.vida} HP)")
            
            // Importante para não criar loop infinito
            val multi1 = Random.nextDouble(1.0, 2.0)
            val multi2 = Random.nextDouble(1.0, 2.0)
            
            val dano1 = maxOf((carta1.ataque * multi1 - carta2.defesa).toInt(), 0)
            val dano2 = maxOf((carta2.ataque * multi2 - carta1.defesa).toInt(), 0)
            
            carta2.vida -= dano1
            carta1.vida -= dano2
            
            println("${carta1.nome} causou $dano1 de dano em ${carta2.nome}!")
            println("${carta2.nome} causou $dano2 de dano em ${carta1.nome}!")
            
            if (carta1.vida <= 0) {
                println("${carta1.nome} foi eliminado!")
                jogador1.baralho.remove(carta1)
            }
            if (carta2.vida <= 0) {
                println("${carta2.nome} foi eliminado!")
                jogador2.baralho.remove(carta2)
            }
            println("-----------------------------")
        }
        
        if (jogador1.temCartas()) {
            println("${jogador1.nome} venceu o duelo!")
        } else {
            println("${jogador2.nome} venceu o duelo!")
        }
    }
}

val cartasDisponiveis = listOf(
    Carta("Dragão Flamejante", 7, 4, 20),
    Carta("Elfo da Floresta", 3, 2, 12),
    Carta("Fênix de Cinzas", 6, 3, 18),
    Carta("Cavaleiro de Ébano", 5, 6, 15),
    Carta("Golem de Pedra", 4, 9, 25),
    Carta("Assassino das Sombras", 8, 2, 14),
    Carta("Mago Arcano", 5, 4, 16),
    Carta("Troll da Ponte", 6, 7, 22),
    Carta("Serpente Abissal", 9, 3, 18),
    Carta("Lobisomem da Noite", 7, 5, 20)
).shuffled()

fun main() {
    val jogador1 = Jogador("Alex", cartasDisponiveis.shuffled().take(3).toMutableList())
    val jogador2 = Jogador("Will", cartasDisponiveis.shuffled().take(3).toMutableList())
    
    val duelo = Duelo(jogador1, jogador2)
    duelo.iniciarDuelo()
}
