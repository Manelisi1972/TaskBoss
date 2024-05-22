/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskboss;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class TaskBoss {
    private static final ArrayList<Task>tasks = new ArrayList<>();

    
     
    
    public static void main(String[] args) {
        
            
            
        
        
        
       
       
       
        
        while(true) {
            JOptionPane.showMessageDialog(null, "Welcome to EasyKhanban");
            JOptionPane.showMessageDialog(null, "How many tasks do you want to add? add on the next page");
            String[] options ={"Add a Task", "View Task" , "Quit"};//Searching an array
            int choice = JOptionPane.showOptionDialog(null, "Choose an option","Task Manager",JOptionPane.DEFAULT_OPTION , JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            
            if(choice == 0){
                addTask();
            }else if(choice == 1){
                viewTasks();
            }
            else if(choice == 2){
                System.exit(0);
            }
        }
        
    }

    private static void addTask() {
        
        String taskName = JOptionPane.showInputDialog("Enter task name");
        String taskDescription = JOptionPane.showInputDialog("Enter task Description.  (: Should not be more than 50 characters");
        
        if(taskDescription.length()> 50) {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
            
                   
                    
        }else{
            JOptionPane.showMessageDialog(null, "Task successfully captured");//Display the success message
          
        }
        String developer = JOptionPane.showInputDialog("Please enter Developer name");
        int duration = Integer.parseInt(JOptionPane.showInputDialog("Please enter estimated duration in hours"));
        
        Task task = new Task(taskName, taskDescription, developer, duration);
        tasks.add(task);
        
        JOptionPane.showMessageDialog(null, "Task is successfully captured");//Display the success message
    }

    private static void viewTasks() {
        //Create a multiline string to display all task details
        String message = "";
        for(Task task : tasks){
            //Get methods for Task Status , Developer details , Task Name , Task Description , Task ID, and  duration
            message += "Status: " + task.getStatus() + "\n";
            message += "Developer: " + task.getDeveloper() + "\n";
            message += "TaskNumber: " + task.getTaskNumber() + "\n";
            message += "Task Name: " + task.getTaskName() + "\n";
            message += "Task Description: " + task.getTaskDescription() + "\n";
            message += "Task ID: " + task.getTaskID()+ "\n";
            message += "Duration: " + task.getDuration() + "hours\n\n";
            
             
        }
        //Display the message dialog with all task details
        JOptionPane.showMessageDialog(null, message);
    }
    
}
