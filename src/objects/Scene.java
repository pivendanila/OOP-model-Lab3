package objects;

public class Scene extends PhysicalObject{
    private int speed = 10;
    public void rotate(){
        System.out.println(this.getName() + " поворачивается");
    }
    public void rotate(int speed){
        this.speed = speed;
        System.out.println(this.getName() + " поворачивается");
    }

}
