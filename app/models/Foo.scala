package models

import org.virtuslab.unicorn.UnicornPlay._

case class FooId(id: Long) extends AnyVal with BaseId
object FooId extends IdCompanion[FooId]

case class Foo(var title: String, var description: String = "", id: FooId = FooId(0))
