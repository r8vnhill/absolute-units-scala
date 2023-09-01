package cl.ravenhill.alpaca

class Warrior(name: String, hp: Int) extends GameCharacter(name, hp) {
  def this(hp: Int) = {
    this("Warrior", hp)
  }
}
