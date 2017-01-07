import java.util.Arrays;


    public class Main {
        public static void main(String[] args) {
            User[] users = new User[3];
            users[0] = new User(1, "Serg", "Levchenko", 500, 100000);
            users[1] = new User(2, "Stas", "Mikhailov", 200, 1600);
            users[2] = new User(3, "Dmitriy", "Malikov", 100, 1000);


            System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
            System.out.println(Arrays.toString(UserUtils.usersWithConditionalBalance(users, 30000)));
            System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));
            System.out.println(Arrays.toString(UserUtils.getUsersId(users)));

        }
    }

