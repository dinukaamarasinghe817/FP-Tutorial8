case class Point(var x: Int, var y: Int) {
    def add(a:Point) = new Point(this.x + a.x, this.y + a.y)
    def +(a:Point) = new Point(this.x + a.x, this.y + a.y)
    

    def move(x:Int, y:Int):Unit = {
        this.x = this.x + x
        this.y = this.y + y
    }

    def distance(a:Point) : Double = {
        var xDist:Int = this.x - a.x
        var yDist:Int = this.y - a.y
        var dist: Int = xDist*xDist + yDist*yDist
        scala.math.sqrt(dist)
    }

    def invert() :Unit = {
        var tmp = this.x
        this.x = this.y
        this.y = tmp
    }

    override def toString(): String = "("+x+","+y+")"

}

object tutorial8 extends App {

    var a = Point(1,2)
    var b = Point(4,10)
    print("\npoint a : ")
    println(a)
    print("point b : ")
    println(b)
    print("addtion of point a and b : ")
    println(a+b)
    
    a.move(x = 2, y = 4)
    print("\nafter moving : ")
    println(a)
    
    var c = a.distance(b)
    print("\ndistance between point a and point b : ")
    println(c)
    
    a.invert()
    print("\nafter inverting point a : ")
    println(a)
}