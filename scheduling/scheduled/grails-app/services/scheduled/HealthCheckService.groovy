package scheduled

import org.springframework.scheduling.annotation.Scheduled

class HealthCheckService {

    // https://jira.spring.io/browse/SPR-12872
    // https://github.com/grails/grails-core/issues/2216#issuecomment-236266875
    boolean lazyInit = false

    //@Scheduled(cron="0 0 * * * *")
    //@Scheduled(fixedDelay = 5000L) // From last invocation
    @Scheduled(fixedRate = 5000L, initialDelay = 5000L)
    def diskSpace() {
        def freeSpaceKb = new File("/").freeSpace.intdiv(1024)
        if (freeSpaceKb < 100_000) {
            println "low free space on '/'!"
        } else {
            println "all good!"
        }
    }
}
