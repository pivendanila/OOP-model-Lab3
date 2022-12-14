package objects;

public class Boat extends PhysicalObject{
    private String size;

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }

    public void sail(){
        System.out.println(this.name + " плывет");
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!object.getClass().equals(this.getClass())) return false;
        Boat other = (Boat) object;
        return name.equals(other.name);
    }


}
