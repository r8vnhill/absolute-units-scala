
package cl.ravenhill.alpaca

class Mage(name: String, hp: Int) extends AbstractCharacter(name, hp) {
  def this(hp: Int) = {
    this("Mage", hp)
  }
}
