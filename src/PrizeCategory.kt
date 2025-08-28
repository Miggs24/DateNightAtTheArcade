class PrizeCategory (val name:String, val ticketCost:Int, var quantity: Int) {
    fun isAvailable(): Boolean {
        return quantity > 0
    }
    fun canAfford(card: Card): Boolean {
        return card.tickets >= ticketCost
    }
    fun claimPrize(card: Card) {
        card.tickets = card.tickets - ticketCost
        quantity = quantity - 1
    }
}