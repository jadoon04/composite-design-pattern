/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterndemo;
  import java.util.ArrayList;
import java.util.List;
 
// Composite
 
public class TaskList implements Task {
    private String title;
    private List<Task> tasks;
 
    public TaskList(String title) {
        this.title = title;
        this.tasks = new ArrayList<>();
    }
 
    @Override
    public String getTitle() {
        return title;
    }
 
    @Override
    public void setTitle(String title) {
        this.title = title;
    }
 
    public void addTask(Task task) {
        tasks.add(task);
    }
 
    public void removeTask(Task task) {
        tasks.remove(task);
    }
 
    @Override
    public void display() {
        System.out.println("Task List: " + title);
        for (Task task : tasks) {
            task.display();
        }
    }
} 

