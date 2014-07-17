package controllers

import models._
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import play.api.mvc._

object Application extends Controller {

  def index = DBAction { implicit rs =>
    Ok(views.html.index(FooDAO.findById(FooId(0)).firstOption))
  }
}
