package FinalProject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        HashMap<String,Task> taskList = new HashMap<String,Task>();
        boolean flag = true;

        while (flag){
            String tempCMD;
            if(taskList.isEmpty()){
                System.out.println("It looks like you don't have any tasks! Lets get you started!");
                tempCMD = "create task";
            }
            else{
                System.out.println("Please choose an option:"+"\n"+"Create task"+"\n"+"Edit task"+"\n"+"Show tasks"+"\n"+"Remove task"+"\n"+"Exit");
                tempCMD = scan.nextLine().toLowerCase();
            }

            switch (tempCMD){
                case "create task":
                    System.out.println("What kind of task would you like to create?"+"\n"+"Default Task"+"\n"+"Customized Task");
                    tempCMD = scan.nextLine();
                    switch (tempCMD){
                        case "default task":
                            System.out.println("input the name of your task");
                            tempCMD = scan.nextLine();
                            taskList.put(tempCMD,new Task());
                            break;

                        case "customized task":
                            System.out.println("input task title");
                            String title = scan.nextLine();
                            System.out.println("input a description of your task");
                            String description = scan.nextLine();
                            System.out.println("input a date for your task");
                            String date = scan.nextLine();
                            taskList.put(title,new Task(title,description,date));
                            break;
                    }
                    break;

                case "edit task":
                    System.out.println(tempCMD);
                    System.out.println("Please input the task you would like to edit"+"\n"+"Options:");
                    for(String i: taskList.keySet()){
                        System.out.println(i+"\n");
                    }
                    tempCMD = scan.nextLine();
                    for(String i: taskList.keySet()){
                        if(tempCMD.equals(i)) {
                            taskList.get(tempCMD).editTask();
                        }
                    }

                    break;


                case "remove task":
                    System.out.println("Please input the task you would like to remove"+"\n"+"Options:");
                    for(String i: taskList.keySet()){
                        System.out.println(i+"\n");
                    }
                    tempCMD = scan.nextLine();
                    taskList.remove(tempCMD);
                    break;

                case "show tasks":
                    for(String i: taskList.keySet()){
                        System.out.println(i);
                    }
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    System.out.println("I didnt quite get that lets try again. Remember to ");
                    break;


            }
        }

    }


}
