

public final class UserUtils {
    public static User[] uniqueUsers(User[] users) {
        int count = 0;
        int index = 0;
        User[] uniqueUser = new User[users.length];
        for (User u : users) {
            for (User r : uniqueUser) {
                count++;
                if (count == uniqueUser.length) {
                    count = 0;
                    uniqueUser[index] = u;
                    index++;
                }
            }
        }
        return uniqueUser;
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        int count = 0;
        for (User r : users) {
            if (r.getBalance() == balance) {
                count++;
            }
        }
        User[] usersDetectedConditionalBalance = new User[count];
        int index = 0;
        for (User r : users) {
            if (r.getBalance() == balance) {
                usersDetectedConditionalBalance[index] = r;
                index++;
            }
        }
        return usersDetectedConditionalBalance;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        User[] paySalary = new User[users.length];
        int index = 0;
        for (User r : users) {
            r.setBalance(r.getBalance() + r.getSalary());
            paySalary[index] = r;
            index++;
        }
        return paySalary;
    }

    public static final long[] getUsersId(User[] users) {
        long[] userId = new long[users.length];
        int index = 0;
        for (User r : users) {
            userId[index] = r.getId();
            index++;
        }
        return userId;
    }

    public static User[] deleteEmptyUser(User[] users) {
        int count = 0;
        for (User r : users) {
            if (r != null) {
                count++;
            }
        }
        User[] foundUsers = new User[count];
        int index = 0;
        for (User r : users) {
            if (r != null) {
                foundUsers[index] = r;
                index++;
            }
        }
        return foundUsers;
    }
}




