import kotlin.random.Random

class Game(val cost: Int) {

    fun play(card: Card) {
        if (card.credits >= cost) {
            card.credits = card.credits - cost
            val ticketsWon = Random.nextInt(0, 16)  // 0-15 tickets
            card.tickets = card.tickets + ticketsWon
            println("Card #${card.id} won ${ticketsWon} tickets! New total: ${card.tickets} tickets")
        } else {
            println("Insufficient balance, please recharge")
        }
    }
}
