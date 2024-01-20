fun main() {
  val car1 = Car()
    car1.name= "Tesla"
    car1.model = "S Plaid"
    car1.color = "BLue"
    car1.doors = 4

    println("Name= ${car1.name}")
    println("Model= ${car1.model}")
    println("Color= ${car1.color}")
    println("Doors= ${car1.doors}")

    car1.move()
    car1.stop()

        println("\n")
    

    var car2 = Car()
    car2.name =" SUZUKI"
    car2.model  = "S2"
    car2.color ="Red"
    car2.doors= 4
     println("Name= ${car2.name}")
     println("Model= ${car2.name}")
     println("Color= ${car2.name}")
     println("Doors= ${car2.name}")

    car2.move()
    car2.stop()

}
class Car {
    var  name = ""
    var model =""
    var color= ""
    var doors =0

    fun move()
    {

        println("the car $name  is moving")
    }

    fun stop()
    {
       println("the car $name is not moving")

    }

}