package models

import play.api.libs.json.Json

/**
  * Created by stakaya on 2016/01/11.
  */
case class Person(name: String){

}

object Person{
  implicit val personFormat = Json.format[Person]
}
