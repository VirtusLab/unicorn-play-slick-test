package models

import play.api.db.slick.Config.driver.simple._

class FooTable(tag: Tag) extends Table[Foo](tag, "FOOS") {

  def id = column[FooId]("FOO_ID", O.PrimaryKey, O.AutoInc)
  def title = column[String]("SEC_TITLE", O.NotNull)
  def description = column[String]("SEC_DESCRIPTION")

  def * = (title, description, id) <> (Foo.tupled, Foo.unapply)
}
