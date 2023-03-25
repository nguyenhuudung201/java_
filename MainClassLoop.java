package com.class2;

public class MainClassLoop {
    public static void main(String[] args) {
        int arrayInt[]= new int[5];
        Person persons[] = new Person[3];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();

        persons[0].setName("Tuan");
        persons[1].setName("Son");
        persons[2].setName("Nam");

//        for (int i = 0; i < 5; i++) {
//            arrayInt[i] = i * i;
//        }

        // for i
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Item " + arrayInt[i]);
//        }

//        for(int item : arrayInt) {
//            System.out.println("Item " + item);
//        }

        for (Person item : persons) {
            System.out.println(item.getName());
        }

    }
}
