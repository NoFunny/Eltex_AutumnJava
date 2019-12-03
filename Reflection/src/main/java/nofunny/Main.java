package nofunny;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        MyClass test = new MyClass();
        for(Field info : test.getClass().getFields()) {
            MyAnn myann = info.getAnnotation(MyAnn.class);
            info.set(test,myann.version());
            info.set(test,myann.author());
            info.set(test,myann.date());
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.writeValue(new File("Annotation.json"), test);
        System.out.println("Write to JSON successful!");
    }
}
