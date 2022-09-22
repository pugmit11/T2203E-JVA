package session2;

import session1.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Car c = new Car();
        // c.brand = "Honda";
        Hunman h = new Hunman();
        h.run(5);
        h.run("Cho Duoi");
        h.run(10,"Cho Duoi");
        h.run("Cho Duoi",10);

        Hunman h2 = new Hunman("Nguyen Tuan Anh");
        System.out.println(h2.name);

        Student s = new Student("Nguyen Van An", "0981998873", "so 8 Ton That Thuye", 18);
        s.girlFriends[0] = "Ngoc Tring";
        s.girlFriends[1] = "Thi No";
        s.myCar = new Car();
        s.myCar.brand = "Toyota";

        int[] marks = new int[4];
        marks[0] = 19;

        Student[] students = new  Student[10];
        Car c1 = new Car();
        c1.brand = "Honda";
        students[0] = new Student("Ha Hoang Hung", "012345678", "8 Ton That Thuyet", 18);

        for(int i=0; i<students.length; i++){
            students[i] = new Student();
        }
        // set 10 sinh vien theo do tuoi tu 20-->29
        for (int i=0; i<students.length; i++){
            students[i].setAge(i+20);
        }

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].getAge());
        }

        for (Student st : students){
            System.out.println(st.getAge());  // st <=> students[i]
        }
    }
}
