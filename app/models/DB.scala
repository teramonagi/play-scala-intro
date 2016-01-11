package models

import sorm._
/**
  * Created by stakaya on 2016/01/11.
  */
object DB extends Instance(entities = Seq(Entity[Person]()), url = "jdbc:h2:mem:test")