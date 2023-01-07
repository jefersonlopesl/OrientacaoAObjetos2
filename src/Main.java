public class Main {
    public static void main(String[] args) {
        User userA = new User();
        userA.firstName = "Paulo";
        userA.lastName = "Emo";
        userA.getfullName();

        System.out.println(userA.getfullName());
    }
}