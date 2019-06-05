public class Simulation {
    private Integer numDice;
    private Integer rolls;
    private Dice dice;
    private Bins bins;

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();

    }

    Simulation(Integer numDice, Integer rolls){
      this.numDice = numDice;
      this.rolls = rolls;

      this.dice = new Dice(numDice);
      this.bins = new Bins(numDice, numDice*6);

    }

    public void runSimulation() {
        for (int i = 0; i <= rolls ; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults(){

        for (int i = numDice; i < numDice*6+1 ; i++) {
            double div = ((double)bins.getBin(i) / (double)rolls);
            String stars = stars(div); // stars
            System.out.println(String.format("%2d4 : \t%2d5\t:%1.2f %s", i, bins.getBin(i), div, stars));
        }
    }

    private String stars(double nums){
        String result = "";
        double a = Double.parseDouble(String.format("%1.2f", nums));
        for(double i = 0.00; i<=a; i+=.01)
            result += "*";
        return result;
    }

}
