package com.kirill;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collection;

public class TestStudent {
    public static void main(String[] args) {
        Collection<Student> spisok = new ArrayList<Student>();
        spisok.add(new Student("Петров", 5, new int[]{4, 5, 3, 2, 4}));
        spisok.add(new Student("Иванов", 4, new int[]{2, 4, 3, 3, 5}));
        spisok.add(new Student("Сидоров", 2, new int[]{3, 4, 4, 5, 5}));
        for (Student s : spisok) {
            System.out.println(s.toString() + "---------------------------");

        }
    }
}
