package com.proftelran.Homework.userRequestStorageSystem;

import java.nio.file.attribute.UserPrincipal;
import java.util.*;

public class Storage {
    private User user;
    private Map<User, LinkedList> table = new LinkedHashMap<>();
    private LinkedList<UserRequest> requests = new LinkedList<>();

    public Storage(User user) {
        this.user = user;
    }

    public void saveInfo(String address){
        if (address == null) address = "";
        UserRequest newRequest = new UserRequest(user);
        newRequest.setAddress(address);
        this.requests.add(newRequest);
        this.table.put(this.user, requests);

    }

    public void getInfo() {

        this.table.forEach((key, value) -> {
           for (UserRequest ur: requests){
               System.out.println(key + " -> " + ur);
           }
        });
        System.out.println();
    }


}
