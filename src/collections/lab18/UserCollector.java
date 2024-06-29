//package collections.lab18;
//
//import java.util.HashMap;
//import java.util.Map;
//
///*
//Napisz program o nazwie UserCollector zarządzający (przechowuje całą kolekcję, wyświetla wybrane pozycje)
//obiektami typu User za pomocą unikalnych identyfikatorów.
// Obiekty User powinny zawierać takie właściwości jak imię, nazwisko oraz wiek.
// */
//
//public class UserCollector {
//    private Map<Integer, User> users;
//
//    public UserCollector() {
//        users = new HashMap<>();
//        users.put(1, new User("Jan", "Kowalski", 24));
//        users.put(2, new User("Tomasz", "Piotrowski", 12));
//        users.put(3, new User("Agata", "Nowak", 33));
//        users.put(4, new User("Agata", "Nowak", 33));
//        users.put(5, new User("Agata", "Nowak", 33));
//        users.put(6, new User("Agata", "Nowak", 33));
//        users.put(7, new User("Agata", "Nowak", 33));
//
//        System.out.println("Użytkownik o numerze 3: " + users.get(3));
////        for( Map.Entry<Integer, User> entry : users.entrySet()) {
////            System.out.println(entry.getKey() + " -> " ........);
////        }
//
//        for (User user : users.values()) {
//            System.out.println(user);
//        }
//
//    }
//}
