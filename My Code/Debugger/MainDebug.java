
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
        
        ClockDisplayDebug clockDisplayCommon = new ClockDisplayDebug(10,0);
        ClockDisplayDebug clockDisplayRef = clockDisplayCommon;
        HistoricalMomentDebug momentTest1 = new HistoricalMomentDebug("Test Event 1", clockDisplayCommon);
        HistoricalMomentDebug momentTest2 = new HistoricalMomentDebug("Test Event 2", clockDisplayRef);
        
        momentTest1.printDetails();
        momentTest2.printDetails();
       
        momentTest1.addMinuteToTimeOfEvent();
        
        momentTest1.printDetails();
        momentTest2.printDetails();
        
    }
}
