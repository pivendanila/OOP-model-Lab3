package objects;

public class Hat extends PhysicalObject{
    String condition;
    String color;
    public void setCondition(String condition){
        this.condition = condition;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getCondition(){
        return this.condition;
    }
    public String getColor(){
        return this.color;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!object.getClass().equals(this.getClass())) return false;
        Hat other = (Hat) object;
        return color.equals(other.color) && condition.equals(other.condition);
    }
}

