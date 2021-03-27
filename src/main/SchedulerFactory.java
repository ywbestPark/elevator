public class SchedulerFactory {

    private static ElevatorSchduler scheduler;

    public static ElevatorSchduler getScheduler(int strategyID){
        switch (strategyID){
            case 0:
                scheduler = new ResponseTimeScheduler();
                break;
            case 1:
                scheduler = new ThroughputScheduler();
                break;
            case 2:
                break;
        }
        return scheduler;
    }
}
