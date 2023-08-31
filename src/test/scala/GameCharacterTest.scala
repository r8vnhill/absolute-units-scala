
package cl.ravenhill.alpaca

class GameCharacterTest extends munit.FunSuite {
  val name = "Test Character"
  val hp = 100
  var character: GameCharacter = _

  override def beforeEach(context: BeforeEach): Unit = {
    character = new GameCharacter(name, hp)
  }

  test("A GameCharacter can be created with a name and hp") {
    assertEquals(character.name, name)
    assertEquals(character.hp, hp)
    assertEquals(character.currentHp, hp)
  }
}
