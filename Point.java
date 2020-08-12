public class Point {
    private double x;   //x- coordinate
    private double y;   //y- coordinate

    public Point(){ //Default constructor to initialize the variables.
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y){ //Constructor to set specific x and y coordinates.
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }
    public double getX(){
        return x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getY(){
        return y;
    }
    public void show(){ //A method to display the x and y coordinate
        System.out.println("Coordinate X " +x);
        System.out.println("Coordinate Y " +y);
    }
    public Point add(Point a, Point b){   //Adds point coordinates and returns the added points.
        Point resultPoint = new Point();   //The point that will result from the addition of coordinates
        
        resultPoint.x = first.x + second.x;   //Adding x coordinates
        resultPoint.y = first.y + second.y; //Adding y coordinates
        return resultPoint;
    }
    public Point subtract(Point a, Point b){   //Adds point coordinates and returns the added points.
        Point resultPoint = new Point();   
        
        resultPoint.x = a.x - b.x;   //Subtracting x coordinates 
        resultPoint.y = a.y - b.y;  //Subtracting y coordinates
        return resultPoint;
    }  
}