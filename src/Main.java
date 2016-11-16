
import classes.Customer;
import classes.Employee;
import classes.MyMethods;
import classes.Person;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.nio.charset.MalformedInputException;
import java.util.*;



public class Main {

    public static void main(String[] args) {





        List<String> girlFriends = new ArrayList<String>();
        girlFriends.add(" angel");
        girlFriends.add(" kate");
        girlFriends.add(" shine");
        girlFriends.add(" nichole");
        girlFriends.add(" Ruffa");

        Random getRand = new Random();
        //int getRandomNumberForFriends = getRand.nextInt(myFriends.size());
        //int getRandomNumberForRelationships = getRand.nextInt(relationships.size());
        int getRandomNumberForgirlFriends = getRand.nextInt(girlFriends.size());



        Random getRandValue = new Random();
        boolean isFriends = getRandValue.nextBoolean();
        if(isFriends){
            System.out.println(MyMethods.myRandomFriends()+ relationships.get(getRandomNumberForRelationships)+ girlFriends.get(getRandomNumberForgirlFriends));
        }else{
            System.out.println(girlFriends.get(getRandomNumberForgirlFriends)+ relationships.get(getRandomNumberForRelationships)+ myFriends.get(getRandomNumberForFriends));
        }

    }
}
