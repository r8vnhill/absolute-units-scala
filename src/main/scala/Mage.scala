
package cl.ravenhill.alpaca

class Mage(name: String, hp: Int) extends GameCharacter(name, hp) {
  def this(hp: Int) = {
    this("Mage", hp)
  }
}
