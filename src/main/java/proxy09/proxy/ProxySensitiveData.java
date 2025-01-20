package proxy09.proxy;

import lombok.AllArgsConstructor;
import proxy09.subject.EUserRole;
import proxy09.subject.ISensitiveData;
import proxy09.subject.MaintenanceHistory;

import java.util.Map;
import java.util.Set;

// Proxy to control access
@AllArgsConstructor
public class ProxySensitiveData implements ISensitiveData {
    private final Set<String> authorizedUsers;
    private final Map<String, EUserRole> userRoles;

    // View the data, but with access control
    @Override
    public void displayData(String userId, EUserRole role) {
        // Verify that the user is authorized and has the correct role
        if (authorizedUsers.contains(userId) && userRoles.get(userId) == role) {
            // If the user is authorized, the proxy accesses the real object
            MaintenanceHistory realData = new MaintenanceHistory();
            realData.displayData(userId, role); // Transfer to the real object
        } else {
            // If the user is not authorized, access will be denied
            System.out.println("Access Denied: You are not authorized to view this data.");
        }
    }
}
