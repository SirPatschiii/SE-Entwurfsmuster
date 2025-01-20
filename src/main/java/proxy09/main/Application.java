package proxy09.main;

import proxy09.proxy.ProxySensitiveData;
import proxy09.subject.EUserRole;
import proxy09.subject.ISensitiveData;
import proxy09.subject.MaintenanceHistory;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        // Initialize roles and access
        Map<String, EUserRole> userRoles = new HashMap<>();
        userRoles.put("user1", EUserRole.ADMIN);
        userRoles.put("user2", EUserRole.TECHNICIAN);
        userRoles.put("user3", EUserRole.PASSENGER);

        // Authorized users
        Set<String> authorizedUsers = new HashSet<>(Arrays.asList("user1", "user2"));

        // Proxy instance
        ISensitiveData proxy = new ProxySensitiveData(authorizedUsers, userRoles);

        // Test access
        System.out.println("User1 Access:");
        proxy.displayData("user1", EUserRole.ADMIN);

        System.out.println("\nUser2 Access:");
        proxy.displayData("user2", EUserRole.TECHNICIAN);

        System.out.println("\nUser3 Access:");
        proxy.displayData("user3", EUserRole.PASSENGER);
    }
}
