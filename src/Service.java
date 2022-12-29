import java.time.LocalDate;
import java.util.*;

public class Service {
private Map<Integer,Task>mapOfTasks;

public Service(){
    mapOfTasks=new HashMap<>();
}
public void addTask(Task task){
    mapOfTasks.put(task.getId(), task);

}
    public  void deleteTask(Scanner scanner){
        System.out.println("Введите ID задачи:");
        Integer id=scanner.nextInt();
        for (Iterator<Integer>iterator=mapOfTasks.keySet().iterator(); iterator.hasNext();){
            Integer key= iterator.next();
            if (key==id){
                iterator.remove();
            }
        }
        System.out.println(mapOfTasks);


}

public List<Task> getTasksForOneDay(LocalDate date){
    List<Task>result=new ArrayList<>();

    for (Map.Entry<Integer,Task> entry: mapOfTasks.entrySet()){
        Task task=entry.getValue();
        if ( task instanceof Repeatable&&((Repeatable)task).checkIfSuitable(date)){
            result.add(task);
        } else if (task.getDateTime().toLocalDate().equals(date)) {
            result.add(task);
            
        }
    }
    result.sort(Comparator.comparing(Task :: getDateTime));
    return result;
}
    public void removeTask(int id){
        mapOfTasks.remove(id);
    }
}
