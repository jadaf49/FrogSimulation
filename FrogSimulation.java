import.java.util.Scanner;
public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist,int numHops)
    {
        goalDistance=dist;
        maxHops=numHops;
    }

    private int hopDistance()
    { 
        Scanner s =new Scanner(System.in);
        System.out.println("How far?");
        return s.nextInt();
    }

    public boolean simulate()
    { 
        int hops=0
        int distance=0;

        while (hops<maxHops)
        {
            distance += hopDistance();
            if (distance<0) return false;
            if (distance>=goalDistance)return true;
            hops++;
        }
        return false;
    }

    
    public double runSimulations(int num)
    { /* to be implemented in part (b) */ }
}