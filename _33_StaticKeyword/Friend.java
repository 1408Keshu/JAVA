package _33_StaticKeyword;

public class Friend {
    String name;
    static int NoOfFriends;

    Friend(String name){
        this.name= name;
        NoOfFriends++;

    }
    static void friends(){
        System.out.println("You have "+NoOfFriends+" Friends" );
    }
}
