import com.sun.javafx.scene.traversal.Direction;

public interface ElevatorSchduler {

    abstract int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction);
}
