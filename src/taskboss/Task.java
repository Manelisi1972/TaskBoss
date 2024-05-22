/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskboss;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    //Static variable to keep track of the task number
    private static int taskNumberCounter = 0;//Each task will have a unique number
    
    private String taskName;
    private String taskDesciption;
    private String developer ;
    private int duration;
    private String taskID;
    private  int taskNumber;
    private String status;
    private Object tasks;

    public Task(String taskName, String taskDescription, String developer, int duration){
    this.taskName = taskName;
    //Set task Description
    this.taskDesciption = taskDescription;
    //Set Developer
    this.developer = developer;
    //Set Duration
    this.duration = duration;
    //Set Task ID
    this.taskID = generateTaskID();
    this.taskNumber = taskNumberCounter++;
    this.status = "To Do";
    }
    
    //...other methods
    
    
        
    

    

    
    

    public  String getTaskName() {
       return taskName; 
    }

    public  String getDeveloper() {
        return developer;
    }

    public  String getStatus() {
        return status;//Returns the tasks full details and status of each task
        
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public    String getTaskDescription() {
        
        return this.taskDesciption;
    }

    public   String getTaskID() {
        return taskID;
    }

    public    int getDuration() {//Total Hours of all entered tasks
        return duration;
    }

    private String generateTaskID() {
        String firstTwoLetters = taskName.substring(0, 2).toUpperCase();
        String lastThreeLetters = developer.substring(developer.length()-3).toUpperCase();
        return firstTwoLetters + ":" + taskNumber + ":" + lastThreeLetters;
        
    }

    public int getTaskNumber() {
        return taskNumber;
        
    }
    
}
