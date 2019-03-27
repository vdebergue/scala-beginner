package game_of_life

import java.awt.event.{WindowAdapter, WindowEvent}

import doodle.image.Image
import doodle.java2d.java2DRenderer

object Ui {

  def show(events: Events[Image]): Unit = {

    val canvas = java2DRenderer.frame(java2DRenderer.default).unsafeRunSync()
    var running = true

    canvas.addWindowListener(
      new WindowAdapter {
        override def windowClosed(evt: WindowEvent): Unit =
          running = false
      }
    )

    events.foreach { image =>
      if (running) {
        val renderIO = canvas.panel.render(algebra => image.compile(algebra))
        renderIO.unsafeRunAsyncAndForget()
      }
    }
  }

}