package _33_StaticKeyword;

public class main {
    //static = modifier. A single copy of a varible / method is created and shared.
    //         The class "Owns " the static member;
public static void main(String[] args) {

    Friend friend1= new Friend("Keshu");
    Friend friend2= new Friend("badal");
    Friend friend3= new Friend("Akash");
    Friend friend4= new Friend("Ayush");
    Friend friend5= new Friend("Anand");
    Friend friend6= new Friend("Akhil");
    Friend friend7= new Friend("Aman");

    // System.out.println(Friend.NoOfFriends);
    Friend.friends();
}

}
