package leyman.wiley;

import java.lang.reflect.Method;

public class Message {
    @Bye
    public static void getMessage() {
        Message mess = new Message();
        try {
            Class<?> message = mess.getClass();
            Method method = message.getMethod("getMessage");
            Bye bye = method.getAnnotation(Bye.class);
            System.out.println(bye.name());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден");
        }
    }
}
