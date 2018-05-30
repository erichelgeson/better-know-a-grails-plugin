package quartz

class HealthCheckJob {

    static triggers = {
        simple repeatInterval: 1000
    }

    void execute() {
        println "Job run!"
    }
}