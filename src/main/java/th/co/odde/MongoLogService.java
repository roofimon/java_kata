package th.co.odde;

import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.Set;

/**
 * Created by roof on 12/31/14.
 */
public class MongoLogService {
    public static void listCollection() throws UnknownHostException {
        MongoClient mongoClient = new MongoClient("localhost");
        DB db = mongoClient.getDB( "omr" );
        Set<String> colls = db.getCollectionNames();
        for (String s : colls) {
            System.out.println(s);
        }
    }


    public static void persistToMongo() throws UnknownHostException {
        MongoClient mongoClient = new MongoClient("localhost");
        DB db = mongoClient.getDB( "omr" );
        DBCollection coll = db.getCollection("testCollection");
        mongoClient.setWriteConcern(WriteConcern.JOURNALED);
        BasicDBObject doc = new BasicDBObject("name", "MongoDB")
                .append("type", "database")
                .append("count", 1)
                .append("info", new BasicDBObject("x", 203).append("y", 102));
        coll.insert(doc);
    }

    public static  void main(String args[]) {
        try {
            persistToMongo();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
