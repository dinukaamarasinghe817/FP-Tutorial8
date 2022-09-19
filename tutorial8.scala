// encapulates methods
trait Operators{
    def +(p:Point):Point
    def add(p:Point):Point
}

// extends with traits
case class Point(x: Int, y: Int) extends Operators {
    // overrride the methods in the trait
    override def +(p: Point):Point = Point(x + p.x, y + p.y)
    override def add(p: Point):Point = Point(x + p.x, y + p.y)

    // return a new point with updated coordinates
    def move(dx: Int,dy: Int):Point = Point(x+dx, y+dy)

    // return the distance between two points
    // pythagores theorem used
    def distance(p: Point): Double = scala.math.sqrt(scala.math.pow((this.x-p.x).abs,2)+scala.math.pow((this.y-p.y).abs,2))

    // interchange the values of x and y coordinates
    def invert = Point(this.y,this.x)
}

object tutorial8 extends App{
    val a = Point(3,4)
    val b = a.copy(x=5,y=6)
    println("Creating two points")
    println("a = "+a)
    println("b = "+b)
    
    print("\nAddition of two points : ")
    println(a+b)
    // println(a.add(b))
    
    print("\nMove point a by 1 : ")
    println(a.move(1,1))
    
    print("\nDistant of two points : ")
    println(a.distance(b))
    
    print("\nInvert of point a : ")
    println(a.invert)
}