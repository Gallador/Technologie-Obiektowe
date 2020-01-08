/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

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
public class TestStrategy {
    @Test
    public void TestStrategy() {
        Context context = new Context(new DownloadWindownsStrategy());
        context.download("file.txt");
        assertEquals(true, context.isDownloaded());
        context = new Context(new DownloadLinuxStrategy());
        context.download("file.txt");
        assertEquals(true, context.isDownloaded());
    }
}
