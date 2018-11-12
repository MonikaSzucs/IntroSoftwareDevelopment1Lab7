
/**
 * Write a description of class DebugMain here.
 *
 * @author Mike Mulder
 * @version 1.0
 */
public class MainDebug
{
    /**
     * Main method
     */
    public static void main() {
        
        ClockDisplayDebug clockDisplay = new ClockDisplayDebug(11, 2);
        HistoricalMomentDebug moment1 = new HistoricalMomentDebug("March 2013 Equinox", clockDisplay);
        moment1.printDetails();
        moment1.addMinuteToTimeOfEvent();
        moment1.printDetails();
    }
}
