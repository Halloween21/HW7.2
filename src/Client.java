public class Client {

    public static void main(String[] args) {
        Team Teakwondo = new Team("Teakwondo",10,1);
        Team Waterpolo = new Team("Waterpolo", 14,2);
        Team ArtisticGymnastics =new Team("ArtisticGymnastics", 7,2);
        Team Shooting =new Team("Shooting", 15, 0);
        Team Cycling =new Team ("Cycling", 17,1);
        Team Tennis =new Team("Tennis", 5,2);
        Team TableTennis =new Team ("TableTennis", 8, 1);
        Team Football =new Team("Football", 23,4);
        Team AlpineSky =new Team("AlpineSky", 6, 3);
        Team Football2 =new Team("Football", 24,0);
        Team Swimmingteam=new Team("SwimmingTeam", 9,2);

        Composite WomansTeamChina =new Composite();
        Composite WomansTeamGermany =new Composite();
        Composite WomansTeamItaly =new Composite();

        Composite MensTeamChina =new Composite();
        Composite MensTeamGermany =new Composite();
        Composite MensTeamItaly =new Composite();

        Composite ChinaTeam =new Composite();
        Composite GermanyTeam =new Composite();
        Composite AfghanistanTeam =new Composite();
        Composite ItalyTeam =new Composite();

        Composite AsiaTeam =new Composite();
        Composite AfricaTeam =new Composite();
        Composite EuropeTeam =new Composite();
        Composite SouthAmericaTeam =new Composite();

        Composite Olympia =new Composite();


        WomansTeamChina.addTeam(Teakwondo);
        WomansTeamChina.addTeam(Waterpolo);
        WomansTeamChina.addTeam(ArtisticGymnastics);

        MensTeamChina.addTeam(Shooting);

        WomansTeamGermany.addTeam(Cycling);
        WomansTeamGermany.addTeam(Tennis);

        MensTeamGermany.addTeam(TableTennis);
        MensTeamGermany.addTeam(Football);

        WomansTeamItaly.addTeam(AlpineSky);

        MensTeamItaly.addTeam(Football2);
        MensTeamItaly.addTeam(Swimmingteam);

        ChinaTeam.addTeam(WomansTeamChina);
        ChinaTeam.addTeam(MensTeamChina);

        GermanyTeam.addTeam(WomansTeamGermany);
        GermanyTeam.addTeam(MensTeamGermany);

        ItalyTeam.addTeam(WomansTeamItaly);
        ItalyTeam.addTeam(MensTeamItaly);

        AsiaTeam.addTeam(ChinaTeam);
        AsiaTeam.addTeam(AfghanistanTeam);

        EuropeTeam.addTeam(GermanyTeam);
        EuropeTeam.addTeam(ItalyTeam);

        Olympia.addTeam(AsiaTeam);
        Olympia.addTeam(AfricaTeam);
        Olympia.addTeam(EuropeTeam);
        Olympia.addTeam(SouthAmericaTeam);

        System.out.println("Germany Men’s Team");
        MensTeamGermany.printNumOfAthletes();
        System.out.println("Germany");
        GermanyTeam.printNumOfGoldMedals();
        System.out.println("Asia’s Team");
        AsiaTeam.printNumOfGoldMedals();
        System.out.println("Olympic 2024");
        Olympia.printNumOfAthletes();




    }
}
