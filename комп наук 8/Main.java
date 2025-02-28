import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();

        workers.add(new KitchenWorker("Иван", "Петров", "Мужчина", true, "Повар", 50000, 5, "Кухня", "Итальянская кухня"));
        workers.add(new OfficeWorker("Анна", "Сидорова", "Женщина", true, "Менеджер", 60000, 7, "Офис", "Проект X"));
        workers.add(new GuardWorker("Сергей", "Иванов", "Мужчина", true, "Охранник", 40000, 3, "Охрана", "Ночная"));

        for (Worker worker : workers) {
            worker.work(); 
        }
    }
}

