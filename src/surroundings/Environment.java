package surroundings;

import objects.Hat;

import java.util.Objects;

public class Environment{
    private TimeOfDay _Time;
    private Whether _Whether;
    public enum TimeOfDay{
        MORNING ("Утро"),
        DAY ("День"),
        EVENING ("Вечер"),
        NIGHT ("Ночь");
        private final String time;
        TimeOfDay(String t){
            time = t;
        }
        @Override
        public String toString(){
            return time;
        }
    }
    public enum Whether{
        CALM ("Штиль"),
        WINDY ("Ветренно"),
        RAINY ("Дождливо"),
        SNOWY ("Снежно");
        private final String whether;
        Whether(String w){
            whether = w;
        }
        @Override
        public String toString(){
            return whether;
        }
    }
    public void setTime(TimeOfDay time){
        _Time = time;
    }
    public void setWhether(Whether whether){
        _Whether = whether;
    }

    public Whether getWhether() {
        return _Whether;
    }

    public TimeOfDay getTime() {
        return _Time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this._Whether);
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!object.getClass().equals(this.getClass())) return false;
        Environment other = (Environment) object;
        return _Time.equals(other._Time) && _Whether.equals(other._Whether);
    }

}


