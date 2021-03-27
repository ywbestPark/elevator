import com.sun.javafx.scene.traversal.Direction;
import org.junit.Test;

public class ElevatorManagerTest {
    @Test
    public void test(){
        ElevatorManager elevatorManager = new ElevatorManager(2, 0);
        elevatorManager.requestElevator(10, Direction.UP);
    }
}
