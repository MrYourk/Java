package chapter11.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend girlFriend = GirlFriend.interFace();
        System.out.println(girlFriend);
    }
}

class GirlFriend{
    private String name;

    private static GirlFriend girlFriend = new GirlFriend("黄美女");

    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend interFace(){
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}

