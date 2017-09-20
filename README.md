# spellItOut
Spell Numbers in full text up to 1 billion

Aproach:
Reusable text:
* Units
* Dozen (11~19)
* Dozes (20~99)

Reusable methods:
* Hundreds
* Generic over 1000

Generic method with string input:
* each 3 digits over one thousand can be rewritten with a string input
* Example: 123 456 789
  * spellOver1000(123, "million")
  * spellOver1000(456, "thousand")
  * Could be aplicable to higher amounts as needed
