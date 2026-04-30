import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        UserStory story1 = new UserStory(1, "Форма реєстрації", 3);
        UserStory story2 = new UserStory(2, "Авторизація користувача", 4, story1);
        story2.complete();
        System.out.println(story2.isCompleted());
        story1.complete();
        story2.complete();
        System.out.println(story1);
        System.out.println(story2);
        System.out.println(story2.isCompleted());
        Bug bug1 = Bug.createBug(3, "Додати перевірку пароля", 2, story1);
        Bug bug2 = Bug.createBug(4, "Помилка входу", 2, new UserStory(5, "Нова історія", 2));
        System.out.println(bug1);
        System.out.println(bug2);
        Sprint sprint = new Sprint(10, 3);
        UserStory story3 = new UserStory(6, "Профіль користувача", 4);
        System.out.println(sprint.addUserStory(story3));
        System.out.println(sprint.addBug(bug1));
        System.out.println(sprint.addBug(bug2));
        System.out.println(sprint.getTotalEstimate());
        System.out.println(Arrays.toString(sprint.getTickets()));
    }
}