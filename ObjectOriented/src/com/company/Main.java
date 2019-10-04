package com.company;

public class Main {

    public static void main(String[] args)  {
        // write your code here
//        Car jeep = new Car();
//        Car toyota = new Car();
//        System.out.println();
//        // jeep. to see methods and states related to class
//
//        jeep.setModel("compas");
//
//        jeep.setModel("compass");
//        String model1 = jeep.getModel();
//        System.out.println(model1);

//        BankAccount myAccount = new BankAccount();
//        BankAccount myAccount2 = new BankAccount("123456",300,"kevin2","234@123.com","123-123-1235");
//        BankAccount defaultAccount = new BankAccount();
//        BankAccount defaultAccount2 = new BankAccount("12342",30);
//
//        myAccount.setAccountNumber("12345");
//        myAccount.setBalance(500);
//        myAccount.setCustomerName("Kevin");
//        myAccount.setEmail("123@123.com");
//        myAccount.setPhoneNumber("123-123-1234");
//        System.out.println("account number: "+myAccount.getAccountNumber());
//        System.out.println("balance: "+myAccount.getBalance());
//        System.out.println("holder name: "+myAccount.getCustomerName());
//        System.out.println("email: "+myAccount.getEmail());
//        System.out.println("phone: "+myAccount.getPhoneNumber());
//        myAccount.depost(-400);
//        myAccount.depost(400);
//        myAccount.withdraw(300);
//        myAccount.withdraw(-300);
//        myAccount.withdraw(3000);
//
//        System.out.println("account number: "+myAccount2.getAccountNumber());
//        System.out.println("balance: "+myAccount2.getBalance());
//        System.out.println("holder name: "+myAccount2.getCustomerName());
//        System.out.println("email: "+myAccount2.getEmail());
//        System.out.println("phone: "+myAccount2.getPhoneNumber());
//
//        System.out.println("account number: "+defaultAccount.getAccountNumber());
//        System.out.println("balance: "+defaultAccount.getBalance());
//        System.out.println("holder name: "+defaultAccount.getCustomerName());
//        System.out.println("email: "+defaultAccount.getEmail());
//        System.out.println("phone: "+defaultAccount.getPhoneNumber());
//
//        System.out.println("account number: "+defaultAccount2.getAccountNumber());
//        System.out.println("balance: "+defaultAccount2.getBalance());
//        System.out.println("holder name: "+defaultAccount2.getCustomerName());
//        System.out.println("email: "+defaultAccount2.getEmail());
//        System.out.println("phone: "+defaultAccount2.getPhoneNumber());
//
//        VIPCustomer c1 = new VIPCustomer();
//        VIPCustomer c2 = new VIPCustomer("Kevin",3000, "123@123.com");
//        VIPCustomer c3 = new VIPCustomer("kevin","0@0.com");
//
//        System.out.println(c1.getName());
//        System.out.println(c1.getCreditLimit());
//        System.out.println(c1.getEmail());
//        System.out.println(c2.getName());
//        System.out.println(c2.getCreditLimit());
//        System.out.println(c2.getEmail());
//        System.out.println(c3.getName());
//        System.out.println(c3.getCreditLimit());
//        System.out.println(c3.getEmail());


        // Inheritance

//        Animal animal = new Animal("animal",1,1,5,5);
//
//        Fish fish1 = new Fish("Dory",2,2,2,2,3);
//
//        Fish dory = fish1; // dory is a reference same location in memory
//
//        dory.setFins(1);
//        dory.getFins();
//        fish1.getFins();
//        fish1.setFins(3);
//        dory.getFins();
//        fish1.getFins();
//
//        System.out.println(fish1 instanceof Fish);
//        System.out.println(animal instanceof Fish);
//        System.out.println(fish1 instanceof Animal);


//        fish1.swim(3);
//        fish1.rest();
//
//        Dog dog1 = new Dog("Retriever", 5,5,2,4,1,12,"golden");
//        dog1.eat();
//        dog1.bark();
//        animal.eat();
//
//        dog1.walk();
//        dog1.move(2);
//        dog1.run();
//        animal.move(3);

//        SUV compass = new SUV("Jeep","jeep1",5,false,"compass");
//
//        compass.changeGear(3);
//        compass.steer(30);
//        compass.accelerate(20);

//        Dimensions dimensions = new Dimensions(30,50,50);
//        Case theCase = new Case("tower","Cooler Master","Cosair 240",dimensions);
//        Monitor theMonitor = new Monitor("SS27B","Samsung",27, new Resolution(2540,1440));
//        Motherboard theMotherboard = new Motherboard("GB-200","gigabyte",4,4,"v2.22");
//        PC thePC = new PC(theCase,theMonitor,theMotherboard);
////        thePC.getMonitor().drawPixelAt(100,100,"red");
////        System.out.println(thePC.getMonitor().getNativeResolution().getHeight());
//        thePC.powerUp();
//
        Bed standardBed1 = new Bed("someBrand",new Dimensions(100, 30, 180), "Queen");
        Window standardWindow1 = new Window(new Dimensions(50,50,5),"Clear","Patterned");
        Wall wall1 = new Wall("North","plain");
        Wall wall2 = new Wall("South","plain");
        Wall wall3 = new Wall("East","plain");
        Wall wall4 = new Wall("West","plain");
        Ceiling ceiling = new Ceiling(200,"white");
        Lamp lamp = new Lamp("old",35);


        Room room1 = new Room("room1",standardBed1,standardWindow1,wall1,wall2,wall3,wall4,ceiling,lamp);


        room1.occupying();
        room1.vaccant();
        room1.getRoom1Window().closeWindow();
        room1.getLamp().turnOff();
        room1.getLamp().turnOn();
    }
}
