package schwartz

import com.agileorbit.schwartz.SchwartzJob
import org.quartz.JobExecutionContext
import org.quartz.JobExecutionException

class EmailService implements SchwartzJob {

    void buildTriggers() { }

    void execute(JobExecutionContext context) throws JobExecutionException {
        String email = context.mergedJobDataMap.email
        println "Sending email to $email"
    }
}
