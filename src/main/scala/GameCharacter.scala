package cl.ravenhill.alpaca

trait GameCharacter {
  def name: String
  def hp: Int
  var currentHp: Int
  def attack(target: GameCharacter): Unit
}
