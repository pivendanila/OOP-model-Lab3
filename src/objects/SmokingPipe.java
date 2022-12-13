package objects;


public class SmokingPipe extends PhysicalObject{
    public SmokeRings rings;

    public void smoke(){
        this.rings = new SmokeRings();
        rings.setName("Кольца");
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!object.getClass().equals(this.getClass())) return false;
        SmokingPipe other = (SmokingPipe) object;
        return name.equals(other.name);
    }
}
