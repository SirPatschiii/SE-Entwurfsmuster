package proxy09;

import java.util.List;

// Real object representing actual data
public class MaintenanceHistory implements ISensitiveData{
    private final List<String> historyRecords;

    public MaintenanceHistory() {
        this.historyRecords = List.of(
                "Maintenance on Engine A completed on 2025-01-01",
                "Safety inspection passed on 2025-01-05",
                "Landing gear replaced on 2025-01-10"
        );
    }

    // View the maintenance history if access is allowed
    @Override
    public void displayData(String userId, EUserRole role) {
        System.out.println("Maintenance History (Access Granted):");
        historyRecords.forEach(System.out::println);
    }
}
