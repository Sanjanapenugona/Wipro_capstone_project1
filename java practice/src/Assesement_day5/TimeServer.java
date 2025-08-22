package Assesement_day5;

import java.time.LocalDateTime;

public class TimeServer {
	public interface Client {
        void updateTime(String time);
    }

    public void notifyClient(Client client) {
        client.updateTime(LocalDateTime.now().toString());
    }
}

class DigitalClock implements TimeServer.Client {
    @Override
    public void updateTime(String time) {
        System.out.println("Digital Clock: " + time);
    }

}
class AnalogClock implements TimeServer.Client {
    @Override
    public void updateTime(String time) {
        System.out.println("Analog Clock: " + time);
    }


	public static void main(String[] args) {
		  TimeServer server = new TimeServer();
	        TimeServer.Client digitalClock = new DigitalClock();
	        TimeServer.Client analogClock = new AnalogClock();

	        server.notifyClient(digitalClock);
	        server.notifyClient(analogClock);

	}

}
