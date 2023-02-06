public class Main {
    public static void main(String[] args) {
        Country country1 = new Country();
        country1.setNameOfCountry("Kyrgyzstan");
        country1.setPopulationOfCountry(7000000);
        country1.setNameOfPresident("Sadyr Japarov");
        country1.setLanguage("Kygyz");
        country1.setCurrency("Som");

        Country country2 = new Country();
        country2.setNameOfCountry("Kazakstan");
        country2.setPopulationOfCountry(17000000);
        country2.setNameOfPresident("Joomart Tokaev");
        country2.setLanguage("Kazak");
        country2.setCurrency("Tenge");

        Country country3 = new Country();
        country3.setNameOfCountry("Kyrgyzstan");
        country3.setPopulationOfCountry(7000000);
        country3.setNameOfPresident("Sadyr Japarov");
        country3.setLanguage("Kygyz");
        country3.setCurrency("Som");

        City city1 = new City();
        city1.setNameOfCity("Bishkek");
        city1.setArea(169.6);
        city1.setPopulation(1074075);
        city1.setPostalCode(720000);

        City city2 = new City();
        city2.setNameOfCity("Astana");
        city2.setArea(810.2 );
        city2.setPopulation(1350228);
        city2.setPostalCode(010000);

        City city3 = new City();
        city3.setNameOfCity("Osh");
        city3.setArea(182.5);
        city3.setPopulation(1074075);
        city3.setPostalCode(720000);

        Adress adress1 = new Adress();
        adress1.setDistric("Ala too");
        adress1.setStreet("Erkin too2");
        adress1.setNumberOfHome(15);

        Adress adress2 = new Adress();
        adress2.setDistric("Ala too");
        adress2.setStreet("Erkin too2");
        adress2.setNumberOfHome(15);

        Adress adress3 = new Adress();
        adress3.setDistric("Ala archa");
        adress3.setStreet("Alarcha12");
        adress3.setNumberOfHome(14);

        Person person1 = new Person();
        person1.setFirstName("Manas");
        person1.setLastName("Abdugani uulu");
        person1.setAge(28);
        person1.setNationality("Kyrgyz");
        person1.setAdress(adress1);
        person1.setCitizen(country1);
        person1.setCityOfBorn(city1);

        Person person2 = new Person();
        person2.setFirstName("Askat");
        person2.setLastName("torojanov");
        person2.setAge(28);
        person2.setNationality("Kazak");
        person2.setAdress(adress2);
        person2.setCitizen(country2);
        person2.setCityOfBorn(city2);

        Person person3 = new Person();
        person3.setFirstName("Bakyt");
        person3.setLastName("Juma uulu");
        person3.setAge(28);
        person3.setNationality("Kyrgyz");
        person3.setAdress(adress3);
        person3.setCitizen(country3);
        person3.setCityOfBorn(city3);

        Country[] country = new Country[]{country1,country2,country3};
        int counter4 = 0;
        for (Country a:country) {
            counter4++;
            System.out.println("------------------------------------------------------\n"+counter4+" country.");
            System.out.println("Name of country: "+a.getNameOfCountry()+"\nPopulation of country: "+a.getPopilationOfCountry()+"\nName of President: "+a.getNameOfPresident()+" "+a.getNameOfPresident()+"" +
                    "\nCurrency: "+a.getCurrency()+"\nLanguage: "+a.getLanguage());
        }
        City[] city = new City[]{city1,city2,city3};
        int counter3 = 0;
        for (City a:city) {
            counter3++;
            System.out.println("------------------------------------------------------\n"+counter3+" city.");
            System.out.println("Name of city: "+a.getNameOfCity()+"\n Population of city: "+a.getPopulationOfCity()+"" +
                    "\nArea: "+a.getArea()+"\nPostal code: "+a.getPostalCode());
        }
        Adress[] adress = new Adress[]{adress1,adress2,adress3};
        int counter1 = 0;
        for (Adress a:adress) {
            counter1++;
            System.out.println("------------------------------------------------------\n"+counter1+" adress.");
            System.out.println("District: "+a.getDistric()+"\nStreet: "+a.getStreet()+"\nNumber of home: "+a.getNumberOfHome());
        }
        Person[] person = new Person[]{person1,person2,person3};
        int counter = 0;
        for (Person a:person) {
            counter++;
            System.out.println("------------------------------------------------------\n"+counter+" person.");
            System.out.println("First name: "+a.getFirstName()+"\nLast name: "+a.getLastName()+"\n" +
                    "Age: "+a.getAge()+"\nNationality: "+a.getNationality()+"\nCitizen: "+a.getCitizen().getNameOfCountry()+
                    "\nCity of born: "+a.getCityOfBorn().getNameOfCity()+"\nDistrict: "+a.getAdress().getDistric()+
                    "\nStreet: "+a.getAdress().getStreet()+"\nNumber of home: "+a.getAdress().getNumberOfHome());
        }
    }
}