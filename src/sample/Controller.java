package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable
{
    @FXML
    private Tank tank;


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        tank.move();
    }

    /**
     * 键盘行为增加方向方法
     * @param event
     */
    public void addDirection(KeyEvent event)
    {
        KeyCode keyCode = event.getCode();
        switch (keyCode)
        {
            case LEFT  : tank.setLeft(true);   break;
            case UP    : tank.setUp(true);     break;
            case RIGHT : tank.setRight(true);  break;
            case DOWN  : tank.setDown(true);   break;
            default :                          break;
        }
    }

    /**
     * 键盘行为停止方向方法
     * @param event
     */
    public void stopDirection(KeyEvent event)
    {
        KeyCode keyCode = event.getCode();
        switch (keyCode)
        {
             case LEFT   : tank.setLeft(false);   break;
             case UP     : tank.setUp(false);     break;
             case RIGHT  : tank.setRight(false);  break;
             case DOWN   : tank.setDown(false);   break;
             default :                            break;
        }
    }

}
