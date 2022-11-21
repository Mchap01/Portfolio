package FinalProject;
import java.util.*;
public class Task {
    private String title;
    private String description;
    private boolean done;
    private String date;
    private static Scanner scan = new Scanner(System.in);
    public Task(){
        this.title = "blank";
        this.description = "";
        this.done = false;
        this.date = "no date";
    }

    public Task(String title,String description,String date){
        this.title = title;
        this.description = description;
        this.done = false;
        this.date = date;
    }

    public void completeTask(){
        this.done = true;
        System.out.println("Task Completed!");
    }

    public void editTask(){
        boolean flag = true;
        System.out.println("Options: title, description, date, complete, exit");
        while(flag){
            System.out.println("Please enter what you would like to edit");
            String edit = scan.nextLine().toLowerCase();

            switch (edit){
                case "title":
                    System.out.println("please enter a new title");
                    edit = scan.nextLine();
                    this.title = edit;
                    break;
                case "description":
                    System.out.println("please enter a new description");
                    edit = scan.nextLine();
                    this.description = edit;
                    break;
                case "date":
                    System.out.println("please enter a new date");
                    edit = scan.nextLine();
                    this.date = edit;
                    break;
                case "complete":
                    this.done = true;
                case "exit":
                    flag = false;
                    break;
            }
        }
    }

    public void printTask(){
        System.out.println("Title: "+this.title+"\n"+"Date: "+this.date+"\n"+"Description: "+this.title);
        if(done){
            System.out.println("Completed: True");
        }
        else{
            System.out.println("Completed: False");
        }
    }

    public String getTitle(){
        return this.title;
    }

}
