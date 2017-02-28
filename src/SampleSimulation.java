/**
 * 
 * @author Peter Laskai
 *
 */

public class SampleSimulation
{
    public static void main(String[] args)
    {
        int currentSecond;
        final int MAX_TIME_FOR_SIMULATION = 90*60; // 90 minutes
        final double PROBABILITY_OF_ARRIVAL = 20.0 / (60*60);
        final int TIME_TO_CHECKOUT = 5*60;
        int numCustomersArrived = 0;
        boolean serverFree = true;
        int workToDo = 0;
        int arrivalTime = 0;
        int numCustomersServed=0, totalWaitTime=0;
        Queue<Integer> customerArrivalQueue = new Queue<Integer>();

        for (currentSecond = 0; currentSecond < MAX_TIME_FOR_SIMULATION; currentSecond++)
        {
            if (Math.random() < PROBABILITY_OF_ARRIVAL)
            {
                numCustomersArrived++;
                customerArrivalQueue.add(currentSecond);
                System.out.println("At time " + currentSecond + " a customer arrived");
            }
            if (serverFree && customerArrivalQueue.size() > 0)
            {
                serverFree = false;
                workToDo = TIME_TO_CHECKOUT;
                arrivalTime = customerArrivalQueue.remove();
                numCustomersServed++;
                System.out.println("At " + currentSecond + " started working on customer who arrived at "+arrivalTime);
                totalWaitTime += currentSecond - arrivalTime;
            }
            if (!serverFree)
            {
                workToDo--;
                if (workToDo <= 0)
                {
                    serverFree = true;
                    System.out.println("At " + currentSecond + " server free!");
                }
            }
        }  
        double avgWaitTime = totalWaitTime / numCustomersServed;
        System.out.println("\n" + numCustomersArrived + " customers arrived");
        System.out.println("Number of customers served: "+numCustomersServed);
        System.out.println("Average Wait Time to be Served: "+avgWaitTime+" seconds");
        System.out.println("number of customers stuck on line: "+customerArrivalQueue.size());
    }
}