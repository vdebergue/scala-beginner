package game_of_life

import doodle.image._
import doodle.image.syntax._
import doodle.core._

object GameOfLife {

  def start(size: Int) {
    val clock: Events[Unit] = Events.every(200)
    // val worldInit: World = World.init(size)
    // val worldInit: World = World.test


    val worlds: Events[World] = ???

    val images: Events[Image] = worlds.map(???)

    Ui.show(images)
  }

}

trait World
