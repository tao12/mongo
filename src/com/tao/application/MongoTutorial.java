package com.tao.application;

import static java.util.Arrays.asList;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Sorts.ascending;
import static java.util.Arrays.asList;

public class MongoTutorial {

	public static void mongoTutorial() throws Exception {

		MongoClient mongoClient = new MongoClient("tzhang-06080.tribunemedia.com", 27017);
		MongoDatabase db = mongoClient.getDatabase("test");

		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
		db.getCollection("restaurants")
				.insertOne(
						new Document("address",
								new Document().append("street", "2 Avenue").append("zipcode", "10075")
										.append("building", "1480").append("coord", asList(-73.9557413, 40.7720266)))
												.append("borough", "Manhattan")
												.append("cuisine",
														"Italian")
												.append("grades",
														asList(new Document()
																.append("date", format.parse("2014-10-01T00:00:00Z"))
																.append("grade", "A").append("score",
																		11),
																new Document()
																		.append("date",
																				format.parse("2014-01-16T00:00:00Z"))
																		.append("grade", "B").append("score", 17)))
						.append("name", "Vella").append("restaurant_id", "41704620"));

		FindIterable<Document> iterable = db.getCollection("restaurants").find(new Document("borough", "Manhattan"));
		FindIterable<Document> iterable1 = db.getCollection("restaurants").find(eq("borough", "Manhattan"));
		FindIterable<Document> iterable2 = db.getCollection("restaurants")
				.find(new Document("address.zipcode", "10075"));
		FindIterable<Document> iterable3 = db.getCollection("restaurants").find(new Document("grades.grade", "B"));
		FindIterable<Document> iterable4 = db.getCollection("restaurants")
				.find(new Document("grades.score", new Document("$gt", 30)));
		FindIterable<Document> iterable5 = db.getCollection("restaurants").find(gt("grades.score", 30));
		// db.inventory.find( { ratings: { $elemMatch: { $gt: 5, $lt: 9 } } } )
		FindIterable<Document> iterable6 = db.getCollection("restaurants")
				.find(new Document("cuisine", "Italian").append("address.zipcode", "10075"));
		// db.getCollection("restaurants").find(and(eq("cuisine", "Italian"),
		// eq("address.zipcode", "10075")));
		FindIterable<Document> iterable7 = db.getCollection("restaurants").find(new Document("$or",
				asList(new Document("cuisine", "Italian"), new Document("address.zipcode", "10075"))));
		// db.getCollection("restaurants").find(or(eq("cuisine", "Italian"),
		// eq("address.zipcode", "10075")));
		FindIterable<Document> iterable8 = db.getCollection("restaurants").find()
				.sort(new Document("borough", 1).append("address.zipcode", -1));

		iterable.forEach(new Block<Document>() {
			@Override
			public void apply(final Document document) {
				System.out.println(document);
			}
		});

		mongoClient.close();
	}
}
