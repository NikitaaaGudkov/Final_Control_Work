package Presenters;

import java.util.ArrayList;
import java.util.List;

import Models.HomeAnimal;
import Models.Model;
import Views.ConsoleView;

public class Presenter {
    ConsoleView view;
    Model model;
    public Presenter() {
        view = new ConsoleView();
        model = new Model();
    }
    public void Run() {
        Boolean isExit = false;
        while (!isExit) {
            Integer act = view.GetAction("Выберите дальнейшее действие:\n" +
                "1 - Завести новое животное\n" +
                "2 - Увидеть список команд, которые выполняет животное\n" +
                "3 - Обучить животное новым командам\n" +
                "4 - Выход");
            Integer numberAnimal;
            switch (act) {
                case 1:
                    numberAnimal = view.GetAction("Кого добавляем?\n" +
                        "1 - Собаку\n" +
                        "2 - Кошку\n" +
                        "3 - Хомяка\n" +
                        "4 - Назад в главное меню");
                    switch (numberAnimal) {
                        case 1:
                        case 2:
                        case 3:
                            String name = view.InputData("Как зовут Вашего друга?");
                            List<String> commands = view.GetCommands("Сколько команд знает Ваш друг?");
                            String birthday = view.InputData("Когда у него день рождения? Введите дату в формате DD.MM.YYYY");
                            model.AddAnimal(numberAnimal, name, commands, birthday);
                            view.OutputData("Питомец был успешно добавлен\n");
                            break;
                        case 4:
                            view.OutputData("Возврат в главное меню\n");
                            break;

                        default:
                            view.OutputData("Мы не можем добавить такого животного, перепроверьте ввод.\n");
                            break;
                    }
                    break;
                
                case 2:
                    numberAnimal = view.GetAction("Какое животное мы ищем?\n" +
                        "1 - Собаку\n" +
                        "2 - Кошку\n" +
                        "3 - Хомяка\n" +
                        "4 - Назад в главное меню");
                    switch (numberAnimal) {
                        case 1:
                        case 2:
                        case 3:
                            String name = view.InputData("Как зовут питомца?");
                            HomeAnimal pet = model.SearchAnimal(numberAnimal, name);
                            if (pet == null) {
                                view.OutputData("Питомец не найден\n");
                            } else {
                                List<String> commands = pet.GetCommands();
                                if (commands.size() > 0) {
                                    view.OutputData("Питомец знает следующие команды:\t");
                                    for (String command : commands) {
                                        view.OutputData(command + " ");
                                    }
                                } else {
                                    view.OutputData("Питомец не знает никаких команд:\n");
                                }
                            }
                            break;
                        case 4:
                            view.OutputData("Возврат в главное меню\n");
                            break;

                        default:
                            view.OutputData("Нераспознанное действие, возврат в главное меню\n");
                            break;
                    }
                    break;
                
                case 3:
                    numberAnimal = view.GetAction("Какое животное мы ищем?\n" +
                        "1 - Собаку\n" +
                        "2 - Кошку\n" +
                        "3 - Хомяка\n" +
                        "4 - Назад в главное меню");
                    switch (numberAnimal) {
                        case 1:
                        case 2:
                        case 3:
                            String name = view.InputData("Как зовут питомца?");
                            HomeAnimal pet = model.SearchAnimal(numberAnimal, name);
                            if (pet == null) {
                                view.OutputData("Питомец не найден\n");
                            } else {
                                String commands = view.InputData("Введите новые команды через пробел");
                                String[] arrayCommands = commands.split(" ");
                                List<String> newCommands = new ArrayList<>();
                                for (String command : arrayCommands) {
                                    newCommands.add(command);
                                }
                                pet.AddCommands(newCommands);
                                view.OutputData("Команды были успешно добавлены\n");
                            }
                            break;
                        case 4:
                            view.OutputData("Возврат в главное меню\n");
                            break;

                        default:
                            view.OutputData("Нераспознанное действие, возврат в главное меню\n");
                            break;
                    }
                    break;
                
                case 4:
                    isExit = true;
                    view.OutputData("Завершение работы программы\n");
                    view.CloseScanner();
                    break;
            
                default:
                    view.OutputData("Некорректное действие! Повторите попытку.\n");
                    break;
            }
        }
    }
}
