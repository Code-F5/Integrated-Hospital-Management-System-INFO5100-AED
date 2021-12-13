/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Dell
 */
public class GovernmentFundRequest extends WorkRequest {

    private String region;
    private int population;
    private double amountRequested;

    public GovernmentFundRequest(String location, int population, double requestAmount) {
        this.region = location;
        this.population = population;
        this.amountRequested = requestAmount;

    }

    @Override
    public String toString() {
        return region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getAmountRequested() {
        return amountRequested;
    }

    public void setAmountRequested(double amountRequested) {
        this.amountRequested = amountRequested;
    }

}
