package ALKHANOV;

/**
 * Created by Админ on 07.02.2019.
 */
public class RemoteController {
    private TV tv;


    public RemoteController(TV tv) {
        this.tv = tv;
    }

    public void pressButton(int buttonNumber) {
        tv.showChannel(buttonNumber);
    }
}
