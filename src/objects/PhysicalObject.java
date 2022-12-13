package objects;
import java.util.Objects;

public abstract class PhysicalObject {
    String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
    @Override
    public String toString(){
        return name;
    }

}
