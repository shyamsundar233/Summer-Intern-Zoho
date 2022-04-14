package TasksAllocator;

public class taskAdder extends Home{

    public void addTask(String name, String task, String status){

        int index = table.find(name);
        if(index==-1){
            table.insert(name, task, status);
        }else{
            table.appendTask(name, task, status, index);
        }

    }

}
