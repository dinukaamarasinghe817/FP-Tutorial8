trait Operators{
    def +(p:Point):Point
    def -(p:Point):Point
}

case class Point(x: Int, y: Int) extends Operators {
    override def +(p: Point):Point = Point(x + p.x, y + p.y)
    override def -(p: Point):Point = Point(x - p.x, y - p.y)
    def move(dx: Int,dy: Int):Point = Point(x+dx, y+dy)
    def distance(p: Point): Double = scala.math.sqrt(scala.math.pow((this.x-p.x).abs,2)+scala.math.pow((this.y-p.y).abs,2))
    def invert = Point(this.y,this.x)
    override def toString(): String = "(" + x + ", " + y + ")"
}

object tutorial8 extends App{

    val a = Point(3,4)
    val b = a.copy(x=5,y=6)
    println("Creating two points")
    println("a = "+a)
    println("b = "+b)
    
    print("\nAddition of two points : ")
    println(a+b)
    
    print("\nMove point a by 1 : ")
    println(a.move(1,1))
    
    print("\nDistant of two points : ")
    println(a.distance(b))
    
    print("\nInvert of point a : ")
    println(a.invert)
}