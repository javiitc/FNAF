# FNAF — Five Nights at Freddy's Text Adventure

A text-based survival game inspired by **Five Nights at Freddy's**, built entirely in Java. Survive five nights at Freddy Fazbear's Pizza by managing your power, keeping your sanity, and making the right decisions before the animatronics get to you.

---

## About the Game

You are a night-shift security guard at Freddy Fazbear's Pizza. Each night, animatronic characters roam the building and will try to reach your office. Using limited power and your wits, you must survive from 12 AM to 6 AM — five nights in a row.
The game is entirely console-based: no graphics, just text prompts and numeric input. Every playthrough is different thanks to the random event system.

---

## How to Play

1. When the game starts, enter your name (or press Enter to default to *William Afton*).
2. Each night, events will occur randomly — animatronics will approach or bonus events will appear.
3. When an animatronic approaches, you'll be given three options:
   - **1 — Hide** behind the Freddy mask (risky, outcome is random)
   - **2 — Close the door / curtain** (safe, but costs 10 power)
   - **3 — Do nothing** (risky, outcome is random)
4. Survive all 5 nights to win. Run out of power or get caught and it's Game Over.

> **Always enter a valid number (1, 2, or 3).** Invalid input during an animatronic encounter counts as an instant death.

---

## Game Mechanics

The player has two core stats that persist across all five nights:

| Stat | Starting Value | Description |
|------|:--------------:|-------------|
| **Sanity** (`cordura`) | 150 | Decreases by 5 after every event. Watching TV restores +15. Currently does not directly cause death. |
| **Power** (`energia`) | 150 | Consumed by closing doors (-10) and by Freddy (-15% of current). If it reaches **0**, you die instantly. |

---

## The Animatronics

| Animatronic | Hide | Close Door | Do Nothing | Notes |
|-------------|:----:|:----------:|:----------:|-------|
| **Bonnie** | 25% death | Safe (-10 pwr) | 25% death | First enemy. Appears Night 1. |
| **Chica** | 25% death | Safe (-10 pwr) | 25% death | Same mechanics as Bonnie. Appears Night 2. |
| **Foxy** | 50% death | Safe (-10 pwr) | ~33% death | More dangerous. Appears Night 3. |
| **Freddy** | — | — | — | Auto-drains 15% of your current power. No player choice. Appears Night 4. |
| **Golden Freddy** | — | — | 75% death | You are paralyzed. Outcome is automatic. Appears Night 5 only. |
| **TV Event** | — | — | — | A bonus event. Watch TV to spend 10 power and restore 15 sanity. |

---

## Night Progression

Difficulty increases each night with more events, more moves, and new animatronics:

| Night | Moves | Enemies & Events | What's New |
|:-----:|:-----:|------------------|------------|
| 1 | 3 | Bonnie | Introduction night. Only Bonnie appears. |
| 2 | 4 | Bonnie, Chica, TV | Chica and the TV event are introduced. |
| 3 | 5 | Bonnie, Chica, Foxy, TV | Foxy joins — and he's faster and more dangerous. |
| 4 | 5 | Bonnie, Chica, Foxy, Freddy, TV | Freddy appears and drains your power automatically. |
| 5 | 6 | Bonnie, Chica, Foxy, Freddy, Golden Freddy, TV | The final night. Golden Freddy can appear at any time. |

---

## Win & Lose Conditions

**You WIN if:**
- You survive all 5 nights (use up all moves each night without dying).

**Game Over if:**
- An animatronic catches you after a failed Hide or Do Nothing action.
- Your power reaches 0 — the lights go out and the animatronics attack.
- Golden Freddy appears and your death roll is unfavorable (Night 5).
- You enter invalid input during an animatronic encounter.

---

## Documentation

A full technical and gameplay documentation file has been created for this project. It covers:

- Complete game explanation and how to play
- All stats, resources, win/lose conditions
- Detailed breakdown of every section of code (Main, Noches, Animatronics)
- How the probability/RNG system works
- Tips and strategy guide
- Known bugs and suggested improvements

**File:** `docs/FNAF_Documentacion_Juego.docx`

---

## Workflow Diagram

A visual workflow diagram has been created that maps out the entire game flow, including:

- The main game loop from start to finish
- How each night progresses (event selection, player choices, stat updates)
- The individual logic for every animatronic encounter
- Decision points, random rolls, and death/survival branches

📊 **File:** `docs/workflow.png`

---
