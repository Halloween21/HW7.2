public class Team implements OlympicsTeam{
    String name;
    int numberOfAthletes;
    int numberOfGoldMedals;

    public Team(String name, int numberOfAthletes, int numberOfGoldMedals){
    this.name=name;
    this.numberOfAthletes=numberOfAthletes;
    this.numberOfGoldMedals=numberOfGoldMedals;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + " ,Number of Athletes: " + numberOfAthletes + " ,Number of Gold Medals: " + numberOfGoldMedals);
    }


    @Override
    public void printNumOfAthletes() {
        System.out.println("Name: " + name + ", Number of Athletes: " + numberOfAthletes);

    }

    @Override
    public void printNumOfGoldMedals() {
        System.out.println("Name: " + name + ", Number of Gold Medals: " + numberOfGoldMedals);

    }


}
