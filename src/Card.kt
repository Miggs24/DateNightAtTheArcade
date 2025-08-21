class Card {
    companion object {
        private var nextId = 1    // Shared ID space
    }
    val id: Int = nextId++    // Each card gets unique ID
    private var _credits: Int = 0    // Private storage for balances
    private var _tickets: Int = 0

    // Safe access to credits
    var credits: Int
        get() = _credits
        set(value) {
            if (value >= 0) {
                _credits = value
            }
        }

    // Safe access to tickets
    var tickets: Int
        get() = _tickets
        set(value) {
            if (value >= 0) {
                _tickets = value
            }
        }
    fun displayInfo() {
        println("Card #$id - Credits: $credits, Tickets: $tickets")
    }
}
