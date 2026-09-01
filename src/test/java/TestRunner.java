
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestRunner {
    
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("      GAME RENTAL SYSTEM TEST REPORT   ");
        System.out.println("========================================");
        System.out.println("Execution Time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println();
        
        // Test classes to run
        Class<?>[] testClasses = {
            CustomerTest.class,
            GameTest.class,
            ListingTest.class,
            RentalTest.class,
            PaymentTest.class,
            StaffTest.class,
            IntegrationTest.class
        };
        
        int totalTests = 0;
        int totalFailures = 0;
        long totalTime = 0;
        
        for (Class<?> testClass : testClasses) {
            System.out.println("Running " + testClass.getSimpleName() + "...");
            System.out.println("----------------------------------------");
            
            long startTime = System.currentTimeMillis();
            Result result = JUnitCore.runClasses(testClass);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            
            totalTests += result.getRunCount();
            totalFailures += result.getFailureCount();
            totalTime += duration;
            
            System.out.printf("Tests run: %d, Failures: %d, Time: %dms%n", 
                            result.getRunCount(), result.getFailureCount(), duration);
            
            if (result.getFailureCount() > 0) {
                System.out.println("FAILURES:");
                for (Failure failure : result.getFailures()) {
                    System.out.println("  ❌ " + failure.getTestHeader());
                    System.out.println("     " + failure.getMessage());
                }
            } else {
                System.out.println("✅ All tests passed!");
            }
            System.out.println();
        }
        
        // Summary
        System.out.println("========================================");
        System.out.println("              SUMMARY                   ");
        System.out.println("========================================");
        System.out.printf("Total Tests: %d%n", totalTests);
        System.out.printf("Passed: %d%n", totalTests - totalFailures);
        System.out.printf("Failed: %d%n", totalFailures);
        System.out.printf("Success Rate: %.1f%%%n", ((double)(totalTests - totalFailures) / totalTests) * 100);
        System.out.printf("Total Execution Time: %dms%n", totalTime);
        
        if (totalFailures == 0) {
            System.out.println("🎉 ALL TESTS PASSED! 🎉");
        } else {
            System.out.println("⚠️  SOME TESTS FAILED - Please review above");
        }
        System.out.println("========================================");
    }
}
