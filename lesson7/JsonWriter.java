package lesson7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.stream.Collectors;

public class JsonWriter {
    public static boolean isSerializable(Object obj) {
        boolean serializable = false;
        Class<? extends Object> clazz = obj.getClass();
        return clazz.getAnnotation(JSONSerializible.class) != null;
    }
    public static String getJson(Object obj) throws IllegalAccessException {
        Class<? extends Object> clazz = obj.getClass();
        java.util.HashMap<String, Object> map = new HashMap<String, Object>();
        for (Field field : clazz.getDeclaredFields()) {
            JSONElement elAnn = field.getAnnotation(JSONElement.class);
            if ( elAnn != null) {
            field.setAccessible(true);
            map.put(elAnn.key().isEmpty() ? field.getName() : elAnn.key(), field.get(obj));
            }
        }
        String json = map.entrySet().stream().map(e -> "\"" + e.getKey() + "\" : \""+e.getValue() + "\"" ).collect(Collectors.joining(","));

        return "{" + json + "}";
    }

    public static void methodInvoke(Object object) throws InvocationTargetException, IllegalAccessException {
        Class<? extends  Object> clazz = object.getClass();
        for (Method method : clazz.getDeclaredMethods())
        {
//            if(method.getAnnotations(MethodInv.class) != null)
//            {
//                method.setAccessible(true);
//                method.invoke(object);
//            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Dog dog = new Dog();
        dog.setAge(123);
        dog.setName("Tuzik");

        String json = "";

        if(isSerializable(dog))
        {
            json = getJson(dog);
        }
        System.out.println(json);
    }
}
