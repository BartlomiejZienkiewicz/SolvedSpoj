
public class Point {
    private Integer id;
    private Integer x;
    private Integer y;

    public Point(Integer x, Integer y, Integer id){
        this.x = x;
        this.y = y;
        this.id = id;
    }
    public  Integer getId(){
        return this.id;
    }
    public Integer getX(){
        return this.x;
    }
    public Integer getY(){
        return this.y;
    }
    public String toString(){
        return x.toString() + " " + y.toString();
    }


}
