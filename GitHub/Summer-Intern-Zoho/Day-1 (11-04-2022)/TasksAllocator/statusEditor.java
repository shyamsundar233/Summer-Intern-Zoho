package TasksAllocator;

import TasksAllocator.Home;

public class statusEditor extends Home {

    public void editStatus(int index, int task_no, String status){
        String[] str = table.masterTable[task_no][index].split(",");
        table.masterTable[task_no][index] = str[0] + "," + status;
    }

}
