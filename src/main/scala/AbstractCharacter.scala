
package cl.ravenhill.alpaca

abstract class AbstractCharacter(val name: String, val hp: Int) extends GameCharacter {
  override var currentHp: Int = hp
  override def attack(target: GameCharacter): Unit
}
