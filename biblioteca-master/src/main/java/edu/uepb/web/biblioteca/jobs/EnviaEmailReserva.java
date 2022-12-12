package edu.uepb.web.biblioteca.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @autor geovanniovinhas <vinhasgeovannio@gmail.com
 */
public class EnviaEmailReserva implements Job{
	public static final/*@ spec_public non_null @*/ String EMAIL = "email";
	public static final /*@ spec_public non_null @*/String DATA_PEGAR = "dataPegar";
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		
	}
}

