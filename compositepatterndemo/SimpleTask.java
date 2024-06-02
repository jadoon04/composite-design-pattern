/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterndemo;

public class SimpleTask implements Task {
    private String title;
 
    public SimpleTask(String title) {
        this.title = title;
    }
 
    @Override
    public String getTitle() {
        return title;
    }
 
    @Override
    public void setTitle(String title) {
        this.title = title;
    }
 
    @Override
    public void display() {
        System.out.println("Simple Task: " + title);
    }
}
