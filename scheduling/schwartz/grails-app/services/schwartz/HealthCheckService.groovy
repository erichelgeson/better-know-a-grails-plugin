package schwartz

import com.agileorbit.schwartz.SchwartzJob
import org.quartz.JobExecutionContext
import org.quartz.JobExecutionException


class HealthCheckService implements SchwartzJob {

    void buildTriggers() {
        triggers << factory('healthCheck')
                .intervalInSeconds(5)
                .build()
        triggers << factory()
                .hour(12)
                .minute(30)
                .day(1).build()
        triggers << factory("name").cronExpression()

    }

    void execute(JobExecutionContext context) throws JobExecutionException {
        println "Every 5 seconds"
    }
}
