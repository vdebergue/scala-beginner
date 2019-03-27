package game_of_life

// The "Image" DSL is the easiest way to create images
import doodle.image._
import doodle.image.syntax._
// Colors and other useful stuff
import doodle.core._
// Render to a window using Java2D (must be running in the JVM)
import doodle.java2d.java2DRenderer

object Main {

  def main(args: Array[String]): Unit = {
    println("Welcome to Game of Life !")

    // grid example, this show positioning using doodle library
    // you can uncomment this when you understand the syntax and operations used below
    val square = Image.rectangle(30, 30).fillColor(Color.red)
    val row = square beside square beside square
    val grid = row above row above row
    grid.draw()

    // Uncomment next line once you are ready to start GameOfLife !
    // GameOfLife.start(3)
  }
}
