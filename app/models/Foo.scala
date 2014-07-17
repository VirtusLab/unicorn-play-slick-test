package models

import scala.slick.lifted.MappedTo

// without AnyVal this works
// case class FooId(id: Long) extends MappedTo[Long] {
case class FooId(id: Long) extends AnyVal with MappedTo[Long] {
  override def value = id
}

case class Foo(var title: String, var description: String = "", id: FooId = FooId(0))
