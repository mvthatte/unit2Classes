

/**
 * A car class tracks fuel capacity and consumption based on efficency
 * 
 * @author mihirishere
 * @version 9/12/14
 */
public class Car
{
    /** fuel efficiency od the car in mpg*/
    private int fuelEfficiency; 
    
    /**Amount of fuel in gas tank in gallons*/
    private int fuelInTank;
    
    /**
     * Constructor that specifies the fuel efficiency of this car*/
    public Car( int efficiency2)
    {
        this.fuelEfficiency = efficiency2;
        this.fuelInTank = 0;
    }

    /**
     *The drive method reduces the fuel in the tank based on the specified miles and efficiency of this car.
     *
     * @pre this method is never invoked with a value for miles that consumes more than the available gas in the tank.
     * @param miles number of miles driven
     */
    public void drive(int miles)
    {
        // put your code here
    }
    
    /**
     * Adds the specified amount of gas in gallons to this car's tank.
     * @pre     the specified amount of gas doesnt exceed the capacity of the car's tank
     * @param   gallons number of gallons of gas to add to this car's tank
     */
    public void addGas(int gallons)
    {
    }

    /**
     * Returns the number of gallons of gas remaining in this car's tank
     * @return  gallons of gas remaining in this car's tank
     */
    public double getGasInTank()
    {
        // put your code here
        return 0;
    }

    
}
