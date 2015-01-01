package th.co.odde;

import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.Date;

/**
 * Created by roof on 12/31/14.
 */
public class MongoLogService {
    DBCollection coll;
    public MongoLogService() {
        MongoClient mongoClient = null;
        try {
            mongoClient = new MongoClient("localhost");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        DB db = mongoClient.getDB( "omr" );
        this.coll = db.getCollection("testCollection");
        mongoClient.setWriteConcern(WriteConcern.JOURNALED);
    }

    public void persist() throws UnknownHostException {
        this.coll.insert(createDBObject());
    }

    private DBObject createDBObject() {
        BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
        docBuilder.append("apiName", "/captcha");
        docBuilder.append("ip", "127.0.0.1");
        docBuilder.append("accessDate", new Date());
        return docBuilder.get();
    }
}
