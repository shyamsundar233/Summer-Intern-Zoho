package TasksAllocator;

import java.util.Arrays;

public class Dynamicmemory {

    public String[][] masterTable;
    public int count;

    Dynamicmemory() {
        masterTable = new String[100][100];
        count = 0;
    }

    public void insert(String name, String task, String status){
        if(count==masterTable[0].length){
            String[][] temp = new String[masterTable.length][count * 2];
            for(int i=0;i<count;i++){
                for(int j=0;j<masterTable.length;j++){
                    temp[j][i] = masterTable[j][i];
                }
            }
            masterTable = temp;
        }
        masterTable[0][count] = name;
        masterTable[1][count] = task + "," + status;
        count++;
    }

    public int find(String name){
        for(int i=0;i<count;i++){
            if(masterTable[0][i].equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void appendTask(String name, String task, String status, int index){
        int lastIndex = 0;
        for(int i=0;i<masterTable.length && masterTable[i][index]!=null;i++){
            lastIndex++;
        }
        if(lastIndex == masterTable.length){

            String[][] temp = new String[masterTable.length * 2][count];
            for(int i=0;i<masterTable.length;i++){
                for(int j=0;j<count;j++){
                    temp[i][j] = masterTable[i][j];
                }
            }
            masterTable = temp;
        }
        masterTable[lastIndex][index] = task + "," + status;
    }

    public void display(){
        for(String[] i:masterTable){
            System.out.println(Arrays.toString(i));
        }
    }

}
