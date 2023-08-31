
package cl.ravenhill.alpaca

class WarriorTest extends munit.FunSuite {
  val name = "Test Character"
  val hp = 100
  var warrior: Warrior = _

  override def beforeEach(context: BeforeEach): Unit = {
    warrior = new Warrior(name, hp)
  }

  test("A Warrior can be created with a name and hp") {
    assertEquals(warrior.name, name)
    assertEquals(warrior.hp, hp)
    assertEquals(warrior.currentHp, hp)
  }
}
