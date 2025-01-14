package main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import configuration.ServiceModule;
import facade.UserFacade;
import repository.CoffeeMachineRepository;
import shared.BrewConfig;
import shared.CoffeeType;

public class Application {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ServiceModule());

        CoffeeMachineRepository repository = injector.getInstance(CoffeeMachineRepository.class);
        UserFacade userFacade = injector.getInstance(UserFacade.class);

        repository.setWaterLevelMl(1000);
        repository.setBeanLevelGrams(200);
        repository.setMilkLevelMl(1000);

        userFacade.brewCoffee(new BrewConfig(CoffeeType.ESPRESSO));
        userFacade.checkSupplyStatus();
        userFacade.startCleaning();
    }
}
