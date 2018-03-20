package com.company;

public class Main {

    public static void main(String[] args) {
        ContactsManager myContactManager = new ContactsManager();

        Contact friendHulk = new Contact();

        friendHulk.name = "Bruce Banner";
        friendHulk.email = "the_big_guy@gmail.com";
        friendHulk.phoneNumber = "9851234567";

        myContactManager.addContact(friendHulk);

        Contact friendThor = new Contact();

        friendThor.name = "Thor son of Odin";
        friendThor.email = "N/A";
        friendThor.phoneNumber = "N/A";

        myContactManager.addContact(friendThor);

        Contact friendIronMan = new Contact();

        friendIronMan.name = "Tony Stark";
        friendIronMan.email = "tony_stank@starkindustries.com";
        friendIronMan.phoneNumber = "7777777777";

        myContactManager.addContact(friendIronMan);

        Contact friendCap = new Contact();

        friendCap.name = "Steve Rogers";
        friendCap.email = "steverogers@goarmy.com";
        friendCap.phoneNumber = "4444444444";

        myContactManager.addContact(friendCap);

        System.out.println(myContactManager.searchContact("Tony Stark").email);

    }
}
