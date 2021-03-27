import com.sun.javafx.scene.traversal.Direction;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private int strategyID;
    private List<ElevatorController> controllerList;

    public ElevatorManager(int controllerCount, int strategyID){
        controllerList = new ArrayList<>();
        for (int i=0; i<controllerCount; i++){
            ElevatorController elevatorController = new ElevatorController(i);
            controllerList.add(elevatorController);
        }
        this.strategyID = strategyID;

    }

    public void requestElevator(int destination, Direction direction){
        ElevatorSchduler scheduler = SchedulerFactory.getScheduler(strategyID);
        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllerList.get(selectedElevator).gotoFloor(destination);
    }

}
