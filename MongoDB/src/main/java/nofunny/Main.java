package nofunny;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MongoClient mc = new MongoClient("localhost",27017);
        MongoDatabase db = mc.getDatabase("users");
        MongoCollection<Document>coll = db.getCollection("User");

        FindIterable<Document> cur1 = coll.find();

        Iterator it1 = cur1.iterator();
        BasicDBObject search = new BasicDBObject();
        search.append("last name","Ivanov");
        BasicDBObject setInfo = new BasicDBObject();
        setInfo.append("$inc", new BasicDBObject().append("age",1));
//        search.append("last name","Ivanov");
        while(it1.hasNext()) {
//            System.out.println(it.next());
            System.out.println(it1.next());
        }
        coll.updateMany(search,setInfo);
        FindIterable<Document> cur = coll.find();
        Iterator it = cur.iterator();
        System.out.println();
        while(it.hasNext()) {
//            System.out.println(it.next());
            System.out.println(it.next());
        }
    }
}
