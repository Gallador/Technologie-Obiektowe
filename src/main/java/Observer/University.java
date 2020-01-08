/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mrmas
 */
class University {
    private List<Observer> observers = new ArrayList<Observer>();
    private List<String> students = new ArrayList<String>();
    boolean isAddedStudent, isRemovedStudent, isAddedObserver, isRemovedObserver;
    public void addStudent(String name) {
        students.add(name);
        notifyObservers();
        isAddedStudent = true;
    }
    public void removeStudent(String name) {
        students.remove(name);
        notifyObservers();
        isRemovedStudent = true;
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
        isAddedObserver = true;
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        isRemovedObserver = true;
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.event(students);
        }
    }
    public boolean isAddedStudent() {
        return isAddedStudent;
    }
     public boolean isRemovedStudent() {
        return isRemovedStudent;
    }
     public boolean isAddedObserver() {
        return isAddedObserver;
    }
     public boolean isRemovedObserver() {
        return isRemovedObserver;
    }
}
