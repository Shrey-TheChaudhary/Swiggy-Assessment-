# Magical Arena

## Overview

Magical Arena is a simple turn-based game where two players battle each other until one player's health reaches zero. Each player is characterized by their health, strength, and attack attributes. Players attack and defend in turns using dice rolls to determine the outcome of each action. The player with the lower health attacks first. 

## Features

- **Turn-based combat:** Players take turns attacking and defending.
- **Dynamic damage calculation:** Damage is calculated based on dice rolls and player attributes.
- **Automatic game flow:** The game continues until one player's health reaches zero.
- **Customizable player attributes:** Easily modify player attributes for varied gameplay.

## Technologies Used

- **Language:** Java
- **Build Tool:** Maven
- **Testing Framework:** JUnit

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Installation

1. **Clone the repository:**
   ```bash
   git clone <your-repo-url>
   cd magical-arena
   
## Build the project:**


Run the game:
bashCopyjava -jar target/magical-arena-1.0-SNAPSHOT.jar
Usage
The game runs in the console. It will simulate a match between two predefined players with the following attributes:

```bash
Player A: 50 health, 5 strength, 10 attack
Player B: 100 health, 10 strength, 5 attack

The game will automatically manage the turns and print the results of each attack and defense, including the remaining health of each player.
Example Output
CopyPlayer A attacks and rolls die: 5
Player B defends and rolls die: 2
Attack damage: 50, Defense strength: 20
Player B health reduced by 30 to 70

Player B attacks and rolls die: 4
Player A defends and rolls die: 3
Attack damage: 20, Defense strength: 15
Player A health reduced by 5 to 45

...

Player B has died. Player A wins!
```
Testing
To run the unit tests, use the following command:
```bash
bashCopymvn test
```
Project Structure
```bash
Copymagical-arena/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── magicalarena/
│   │   │           ├── Game.java
│   │   │           ├── Player.java
│   │   │           └── Dice.java
│   ├── test/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── magicalarena/
│   │   │           ├── GameTest.java
│   │   │           ├── PlayerTest.java
│   │   │           └── DiceTest.java
├── pom.xml
└── README.md
```
Commit History
Frequent and meaningful commits have been made to ensure the project is well-documented and the development process is transparent.
Contributing
Feel free to fork this repository, make your changes, and submit a pull request. For major changes, please open an issue first to discuss what you would like to change.
License
This project is licensed under the MIT License - see the LICENSE file for details.



