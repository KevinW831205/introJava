package com.company;

public class AnotherClass {

    public String doSomething() {
        System.out.println("AnotherClass class's name is: " + getClass().getSimpleName());
        return Main.doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                System.out.println("anonymous class name is: " + getClass().getSimpleName());
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, "String1", "String2");
    }

    public String doSomething2() {
        UpperConcat uc = (s1, s2) -> {
            System.out.println("Lambda expression's class is " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        System.out.println("AnotherClass class's name in Lambda is " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");
    }

    public String doSomethingNested() {
        final int i = 0;
        {

            UpperConcat uc = new UpperConcat() {
                @Override
                public String upperAndConcat(String s1, String s2) {
                    System.out.println("i" + i);
                    return s1.toUpperCase() + s2.toUpperCase();
                }
            };
            System.out.println("Nested upperconcat " + getClass().getSimpleName());
//            i++;
            System.out.println("i" + i);

            return Main.doStringStuff(uc, "String1", "String2");
        }
    }

    public String doSomethingNested2() {
        int i = 0;
//        i++;

        UpperConcat uc = (s1,s2)->{
            int k =0;
            System.out.println("Nested upperconcat with lambda " + getClass().getSimpleName());
            System.out.println("lambda i "+i);
            return s1.toUpperCase() + s2.toUpperCase();
        };

//        s1 = hello;
        System.out.println("Nested upperconcat " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");
    }

    public void printValue(){
        int number =25;

        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Value of is "+number);
        };

        new Thread(r).start();
    }


}
