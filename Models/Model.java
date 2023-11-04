package Models;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<HomeAnimal> animals;

    public Model() {
        animals = new ArrayList<>();
    }

    public void AddAnimal(Integer type, String name, List<String> command, String birthday)
    {
        HomeAnimal animal = null;
        switch (type) {
            case 1:
                animal = new Dog(name, command, birthday);
                break;

            case 2:
                animal = new Cat(name, command, birthday);
                break;
            
            case 3:
                animal = new Hamster(name, command, birthday);
                break;
        }
        animals.add(animal);
    }

    public HomeAnimal SearchAnimal(int type, String name) {
        HomeAnimal result = null;
        for (HomeAnimal homeAnimal : animals) {
            if(homeAnimal.GetName().equals(name)) {
                switch (type) {
                    case 1:
                        if (homeAnimal instanceof Dog) {
                            result = homeAnimal;
                        }
                        break;

                    case 2:
                        if (homeAnimal instanceof Cat) {
                            result = homeAnimal;
                        }
                        break;
                    
                    case 3:
                        if (homeAnimal instanceof Hamster) {
                            result = homeAnimal;
                        }
                        break;
                }
            }
        }
        return result;
    }
}
