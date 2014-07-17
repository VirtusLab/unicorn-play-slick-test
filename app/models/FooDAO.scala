package models

import play.api.db.slick.Config.driver.simple._

object FooDAO {
  val tableQuery = TableQuery[FooTable]

  def findById(id: FooId): Query[FooTable, Foo, Seq] = {
    tableQuery.filter(_.id === id)
  }
}
