package lambdasfunction.bonus;

import java.util.List;
import java.util.stream.Collectors;

public class BatchJobSimulator {
    static class Job {
        private final String name;
        private final String status;

        public Job(String name, String status) {
            this.name = name;
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public String getStatus() {
            return status;
        }
    }

    public static List<String> getFailedJobsUppercaseSorted(List<Job> jobs) {
        return jobs.stream()
                .filter(job -> "FAILED".equalsIgnoreCase(job.getStatus()))
                .map(job -> job.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Job> jobList = List.of(
                new Job("DataImport", "SUCCESS"),
                new Job("ReportGenerator", "FAILED"),
                new Job("EmailSender", "FAILED"),
                new Job("Backup", "SUCCESS"),
                new Job("LogArchiver", "FAILED")
        );

        List<String> failedJobs = getFailedJobsUppercaseSorted(jobList);

        System.out.println("Failed jobs:");
        failedJobs.forEach(System.out::println);
    }
}
