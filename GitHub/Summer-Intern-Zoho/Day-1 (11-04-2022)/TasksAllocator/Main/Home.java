package Main;

import java.util.*;

public class Home {

    public static Dynamicmemory table = new Dynamicmemory();
    public static taskAdder taskAdd = new taskAdder();
    public static display print = new display();
    public static statusEditor sEdit = new statusEditor();

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("---------------------------------------------");
            System.out.println("\t 1. Add task");
            System.out.println("\t 2. Add status to any task");
            System.out.println("\t 3. View task for a specific user");
            System.out.println("\t 4. View all tasks");
            System.out.println("\t 5. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Enter your choice: ");
            int ch = input.nextInt();
            switch (ch){
                case 1:
                    input.nextLine();
                    System.out.print("Enter the user name: ");
                    String name = input.nextLine().trim();
                    System.out.print("Enter the task: ");
                    String task = input.nextLine().trim();
                    System.out.println("1.Incomplete\t\t2.Progress\t\t3.Complete");
                    System.out.print("Enter the status of the task: ");
                    int choice = input.nextInt();
                    if(choice==1) taskAdd.addTask(name, task, "Incomplete");
                    else if(choice==2) taskAdd.addTask(name, task, "Progress");
                    else if(choice==3) taskAdd.addTask(name, task, "Complete");
                    else System.out.println("Incorrect choice");
                    System.out.println("Task added");
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Enter the name of the user: ");
                    name = input.nextLine().trim();
                    int index = table.find(name);
                    print.viewTasks(index);
                    System.out.print("Enter the task number: ");
                    int task_no = input.nextInt();
                    System.out.println("Enter the status to update");
                    System.out.println("1.Incomplete\t\t2.Progress\t\t3.Complete");
                    choice = input.nextInt();
                    if(choice==1) sEdit.editStatus(index, task_no, "Incomplete");
                    else if(choice==2) sEdit.editStatus(index, task_no, "Progress");
                    else if(choice==3) sEdit.editStatus(index, task_no, "Complete");
                    else System.out.println("Incorrect choice");
                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Enter the name of the user: ");
                    name = input.nextLine().trim();
                    index = table.find(name);
                    if(index==-1) System.out.println("User not found");
                    else print.viewSpecific(index);
                    break;
                case 4:
                    System.out.println("Tasks assigned");
                    print.viewAll();
                    break;
                case 5:
                    System.out.println("Thank you");
                    System.exit(0);
            }
        }

    }

}
