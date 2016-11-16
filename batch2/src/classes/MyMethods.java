package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by JPMPC-B220 on 11/12/2016.
 */
public class MyMethods {

    public static void whileLoop(){
        int sum=0;
        int n = 1;
        while(n<=6)

        {
            sum+=n;
            n++;
        }
        System.out.println(sum);



    }
public static String myRandomFriends(){
    List<String> myFriends = new ArrayList<String>();
    myFriends.add("Bert");
    myFriends.add("Boo");
    myFriends.add("Jard");
    myFriends.add("Will");
    myFriends.add("Jay");
    Random getRand = new Random();
    int getRandomNumberForFriends = getRand.nextInt(myFriends.size());
    return myFriends.get(getRandomNumberForFriends);
}

public static String myRandomRelationship(){
    List<String> relationships = new ArrayList<String>();
    relationships.add(" love");
    relationships.add(" hate");
    relationships.add(" heart");
    relationships.add(" crushes");
    relationships.add(" angry");

    int getRandomNumberForRelationships = getRand.nextInt(relationships.size());
    return relationships.get(getRandomNumberForRelationships);
}

}

