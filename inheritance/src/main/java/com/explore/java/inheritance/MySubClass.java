package com.explore.java.inheritance;

public class MySubClass {

    @Override
    public int hashCode() {
        return 23;
    }

    public int  sum(int a , int b) {
        return a+b;
    }
    public int  sum(int a , int b, int c) {
        return  a+b+c;
    }
    public int  sum(long a , long b) {
        return (int) (a+b);
    }

    public static void main(String [] a) {
        Object abcd1 = new MySubClass();
        Object abcd2 = new MySubClass();
        Object abcd3 = new MySubClass();
        Class<MySubClass> abcd1ClasInfo = (Class<MySubClass>) abcd1.getClass();
        Class<MySubClass> abcd2ClasInfo = (Class<MySubClass>) abcd2.getClass();
        Class<MySubClass> abcd3ClasInfo = (Class<MySubClass>) abcd3.getClass();
        Class<?> s1dABCDClassInfo = abcd1ClasInfo.getClass();
        Class<?> s2ABCDClassInfo = abcd2ClasInfo.getClass();
        Class<?> s3ABCDClassInfo = abcd3ClasInfo.getClass();
        String className = abcd1ClasInfo.getName();
        //+ "@" +
        String hashCode = Integer.toHexString(abcd1.hashCode());
        System.out.println(className +  " " + hashCode);
        System.out.println(abcd1.toString());
        System.out.println(abcd1);
        System.out.println(abcd2);
        System.out.println(abcd3);
    }
}


