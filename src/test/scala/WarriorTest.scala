
package cl.ravenhill.alpaca

class WarriorTest extends munit.FunSuite {
  val name = "Test Character"
  val hp = 100
  var mage: Warrior = _

  override def beforeEach(context: BeforeEach): Unit = {
    mage = new Warrior(name, hp)
  }

  test("A Warrior can be created with a name and hp") {
    assertEquals(mage.name, name)
    assertEquals(mage.hp, hp)
    assertEquals(mage.currentHp, hp)
  }
}
