import java.util.ArrayList;

public class Composite implements OlympicsTeam{

    private ArrayList<OlympicsTeam> Teams=new ArrayList<OlympicsTeam>();

    public void addTeam (OlympicsTeam t){
        Teams.add(t);
    }
    public void removeTeam (OlympicsTeam t){
        Teams.remove(t);
    }

    @Override
    public void print() {
        for (OlympicsTeam t : Teams) {
            t.print();
        }
    }

    @Override
    public void printNumOfAthletes() {
        for (OlympicsTeam t : Teams) {
            t.printNumOfAthletes();
        }
    }

    @Override
    public void printNumOfGoldMedals() {
        for (OlympicsTeam t : Teams) {
            t.printNumOfGoldMedals();
        }
    }
}
