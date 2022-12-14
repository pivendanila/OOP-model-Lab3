package creatures;
import objects.*;
import objects.PhysicalObject;

import java.util.ArrayList;
import java.util.Objects;

public class Troll implements Thinkable, Rowable {
    private final String name;
    ArrayList<PhysicalObject> accessories = new ArrayList<>();

    public Troll(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void think(String phrase) {
        System.out.println(phrase);
    }

    @Override
    public void row(Boat boat) {
        System.out.println(this.name + " гребет в " + boat.getName());
        boat.sail();
    }

    public void look(PhysicalObject object) {
        System.out.println(this.name + " посмотрел на " + object.getName());
    }

    public void ownAccessory(PhysicalObject object) {
        this.accessories.add(object);
    }

    public String[] showAccessories() {
        String[] list = new String[accessories.size()];
        for (int i = 0; i < accessories.size(); i++) {
            list[i] = accessories.get(i).toString();
        }
        return list;
    }
    public void use(PhysicalObject object){
        System.out.println(this.name + " использовал " + object.getName());
    }
    public void use(SmokingPipe pipe){
        System.out.println(this.name + " покурил " + pipe.getName());
        pipe.smoke();
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!object.getClass().equals(this.getClass())) return false;
        Troll other = (Troll) object;
        return name.equals(other.name);
    }
    @Override
    public String toString(){
        return name;
    }
}