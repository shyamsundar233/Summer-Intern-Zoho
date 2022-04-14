package TasksAllocator;

public class display extends Home {

    public void viewAll(){

        for(int j=0;j<table.masterTable[0].length && table.masterTable[0][j]!=null;j++){
            System.out.println("Name: " + table.masterTable[0][j]);
            for(int i=1;i<table.masterTable.length && table.masterTable[i][j]!=null;i++){
                String[] sp = table.masterTable[i][j].split(",");
                System.out.println("Task: " + sp[0] + " - " + sp[1]);
            }
        }

    }

    public void viewSpecific(int index){
        System.out.println("Name: " + table.masterTable[0][index]);
        for(int i = 1; (i < table.masterTable.length) && (table.masterTable[i][index] != null); i++){
            String[] sp = table.masterTable[i][index].split(",");
            System.out.println("Task: " + sp[0] + " - " + sp[1]);
        }
    }

    public void viewTasks(int index){
        for(int i=1;i<table.masterTable.length && table.masterTable[i][index]!=null;i++){
            String[] sp = table.masterTable[i][index].split(",");
            System.out.println(i + ". " + sp[0] + " - " + sp[1]);
        }
    }

}
