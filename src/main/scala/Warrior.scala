package cl.ravenhill.alpaca

class Warrior(name: String, hp: Int) extends AbstractCharacter(name, hp) {
  override def attack(target: AbstractCharacter): Unit =
    println(s"$name attacks ${target.name} with an axe")
}
