/*- Задача 13
    1. Дан класс User, который содержит поля с именем и возрастом. Необходимо реализовать следующий метод:
        1. На входе коллекция пользователей
        2. Необходимо удалить все дубли (одинаковое имя и возраст)
        3. Отсортировать по возрасту и имени
        4. Вернуть самого старого пользователя*/


package pro.sky.demo_testQuestion;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService{
    private final List<User> userCollection = new ArrayList<>(List.of(
            new User("user1",20),
            new User("user1",20),
            new User("user2",21),
            new User("user3",22),
            new User("user4",20),
            new User("user7",27)
    ));

    @Override
    public User uniqueSortedUsers(List<User> userCollection) {
        Set<User> sortedSet = new TreeSet<User>(new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        userCollection.clear();
        userCollection.addAll(sortedSet);

        return userCollection.stream().max().get);
    }
}

