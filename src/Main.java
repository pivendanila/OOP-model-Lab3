import creatures.Troll;
import objects.*;
import surroundings.*;

public class Main {
    public static void main(String[] args) {
        Troll mumitroll = new Troll("Муми-тролль");
        Troll snusmumrik = new Troll("Снусмумрик");

        Environment env = new Environment();

        Boat boat = new Boat();
        boat.setName("Лодка");
        boat.setSize("Маленькая");

        Hat hat = new Hat();
        hat.setName("Шляпа");
        hat.setCondition("Старая");

        SmokingPipe pipe = new SmokingPipe();
        pipe.setName("Трубка");

        env.setWhether(Whether.CALM);
        env.setTime(TimeOfDay.NIGHT);

        snusmumrik.ownAccessory(hat);
        mumitroll.ownAccessory(pipe);

        snusmumrik.row(boat);
        mumitroll.look(hat);
        mumitroll.use(pipe);
        mumitroll.look(pipe.rings);
        mumitroll.think("Теперь все будет хорошо");
    }
}

