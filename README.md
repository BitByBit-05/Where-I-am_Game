# Where-I-am_Game
Welcome to the game **Where I am** project! This JavaFX application simulates a player moving on a 2D grid based on a set of instructions. It’s a fun way to explore grid-based navigation and validate complex instruction sets.

## Why This Project is Cool
- **Grid-Based Simulation**: Watch how a player moves across a grid based on your instructions.
- **Instruction Validation**: The program checks if the instructions are valid and ensures the player stays within the grid bounds.
- **Interactive GUI**: A user-friendly interface makes it easy to input instructions and see the results instantly.

### **Game Overview**
- The player starts at position `(0, 0)` (the top-left corner of the grid).
- You provide a set of instructions (e.g., `U1L2D6U2R3`) to move the player **Up**, **Down**, **Left**, or **Right**.
- The program validates the instructions and calculates the player’s final position on the grid.

---

### **Instruction Rules**
The instructions are written in a specific format:
- Each command consists of a **letter** (U, D, L, R) followed by a **number** (0-9).
- Commands are case-sensitive and must be in pairs (e.g., `U1`, `D2`, `L3`, `R4`).

#### **Valid Commands**
| Command | Description          | Example       |
|---------|----------------------|---------------|
| `U`     | Move **Up**          | `U3` (Up 3)   |
| `D`     | Move **Down**        | `D2` (Down 2) |
| `L`     | Move **Left**        | `L9` (Left 9) |
| `R`     | Move **Right**       | `R1` (Right 1)|

---

### **Validation Rules**
The program checks if the instruction set is valid. An instruction set is **invalid** if:
1. It contains any letter other than `U`, `D`, `L`, or `R` (e.g., `U2A3`).
2. It is less than 2 characters long (e.g., `U`).
3. It has an odd length (e.g., `U1D3U`).
4. A command is a valid letter but is not followed by a number (e.g., `U1DU`).

---

## Example
- **Input**: `D2R2U1R1`  
- **Grid**: 3 rows, 4 columns  
- **Output**: `The player is at position 1, 3!`

## Screenshots
Here’s what the program looks like in action:

### Initial Launch
![Initial Launch](https://github.com/BitByBit-05/Where-I-am_Game/blob/main/Initial.png?raw=true)

### Valid Instruction Set
| Output | Visual Representation |
|---------|---------|
| ![Image 1](https://github.com/BitByBit-05/Where-I-am_Game/blob/main/Output.png?raw=true) | ![Image 2](https://github.com/BitByBit-05/Where-I-am_Game/blob/main/VisualR.png?raw=true) |

### Out of Bounds
![Out of Bounds](https://github.com/BitByBit-05/Where-I-am_Game/blob/main/OutOfBounds.png?raw=true)

### Invalid Instruction Set
![Invalid Instruction Set](https://github.com/your-username/BlackJack_Game/raw/main/pathway_invalid.png)

---

## Try It Yourself
1. Clone the repository.
2. Run the `PathwayCheckerGUI.java` file.
3. Enter your instructions and see where the player lands!

---
