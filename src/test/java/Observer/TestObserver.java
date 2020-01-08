/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mrmas
 */
public class TestObserver {
    @Test
    public void TestObserver() {
       University university = new University();
        Director director = new Director();
        university.addStudent("Artem");
        assertEquals(true, university.isAddedStudent);
        university.addObserver(director);
        assertEquals(true, university.isAddedObserver);
        university.addStudent("Anna");
        assertEquals(true, university.isAddedStudent);
        university.removeStudent("Artem"); 
        assertEquals(true, university.isRemovedStudent);
    }
}
