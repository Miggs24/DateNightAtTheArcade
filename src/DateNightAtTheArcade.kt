fun main(args: Array<String>) {
    println("Testing Card creation...")

    val card1 = Card()
    val card2 = Card()
    val card3 = Card()

    card1.displayInfo()
    card2.displayInfo()
    card3.displayInfo()

    println("\nTesting credit assignment...")
    card1.credits = 50
    card2.credits = 30

    card1.displayInfo()
    card2.displayInfo()
}
