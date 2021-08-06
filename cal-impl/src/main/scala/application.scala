class application {

  val obj = new calculator

}

object main{

  def main(args: Array[String]): Unit = {

    val obj = new application
    println("+ operator for 1 and 9 gives " + obj.obj.sum(36,63))
    println("- operator for 30 and 10 gives " + obj.obj.sub(50, 60))
    println("* operator for 10 and 3 gives " + obj.obj.multi(11,30))
    println("/ operator for 360 and 9 gives " + obj.obj.div(420, 5))

  }

}
