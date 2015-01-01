package th.co.odde;

import org.junit.Test;
import java.net.UnknownHostException;

/**
 * Created by roof on 1/1/15.
 */
public class MongoLogServiceTest {
    @Test
    public void persist() {
        MongoLogService mongoLogService = new MongoLogService();
        try {
            mongoLogService.persist();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
