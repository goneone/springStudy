package hello.core.youngil;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test {

    @Test
    void test() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println("\"sadisdjaidjasidj\" = " + "sadisdjaidjasidj");
        for (String a:list) {
            System.out.println(a);
        }
    }

    @Test
    void test2() {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "test1");
        map.put(2, "test2");
        map.put(3, "test3");

        Iterator<Integer> iter = map.keySet().iterator();
        while(iter.hasNext()) {
            int key = iter.next();
            System.out.println("값은 = " + map.get(key));

        }
    }

    @Test
    void testCase() {
        System.out.println("true = " + true);
        
    }
}
