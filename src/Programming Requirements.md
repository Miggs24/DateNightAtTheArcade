# Programming Requirements - Date Night at the Arcade

## Project Overview
This program models an arcade system with cards, games, prizes, and terminals.

## Card Class Requirements

### Responsibilities:
- Store a unique card ID number (automatically assigned: 1, 2, 3, etc.)
- Store current credit balance (cannot be negative)
- Store current ticket balance (cannot be negative)
- Provide access to view balances

### Limitations:
- Cannot perform any calculations or math operations
- Cannot check if it has sufficient credits for games
- Cannot validate balance changes

### Properties Needed:
- Card ID (unique integer)
- Credit balance (integer, >= 0)
- Ticket balance (integer, >= 0)

## Game Class Requirements

### Responsibilities:
- Store the credit cost required to play this game
- Accept a card when someone wants to play
- Check if the card has sufficient credits
- Subtract credits from the card when played
- Award random number of tickets to the card
- Display messages about game results

### Properties Needed:
- Credit cost per play (integer)

## Prize Category Class Requirements

### Responsibilities:
- Store the prize name (e.g., "Candy", "Hat", "Glasses")
- Store the number of tickets required to earn this prize
- Store the count of how many items of this category remain in stock
- Allow one prize to be taken (reduce stock count by 1)

### Limitations:
- Does not know which terminal it belongs to
- Cannot validate if someone has enough tickets

### Properties Needed:
- Prize name (string)
- Tickets required (integer)
- Stock count (integer, >= 0)

## Terminal Class Requirements

### Responsibilities:
- Convert money to credits (2 credits per $1)
- Add credits to any card
- Display card balances (including card number)
- Transfer credits between cards (all or partial amounts)
- Transfer tickets between cards (all or partial amounts)
- Manage 3 different prize categories
- Exchange tickets for prizes
- Display appropriate messages for all operations

### Limitations:
- Must validate all transactions (sufficient credits/tickets)
- Must check prize availability before awarding

### Properties Needed:
- Collection of 3 prize categories
- Magnetic card reader capability (simulated through methods)

