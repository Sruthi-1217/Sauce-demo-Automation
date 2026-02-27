package utils;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class popupHandler {
	public static void handlePasswordPopup() {
        try {
            Robot robot = new Robot();
            Thread.sleep(3000);

            // IF popup present → ENTER clicks OK
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            System.out.println("Chrome password popup handled");

        } catch (Exception e) {
            System.out.println("Popup not present, continuing test");
        }
    }
}
