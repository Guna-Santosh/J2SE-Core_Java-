package test;

import java.util.Collection;
import java.util.stream.Collector;

public class Demo 
{
	public void name(OffenderSampleSubstancesCommitBean commitBean) 
	{
		OffenderSamplesCommitBean offenderSamplesCommitBean =new OffenderSamplesCommitBean();
		OffenderSamples ok=new OffenderSamples();
//offenderSamplesCommitBean.setUpdatelist(new OffenderSampleSubstancesCommitBean().setUpdatelist(Collections.singletonList(commitBean)));
//offenderSamplesCommitBean.setUpdatelist(new OffenderSampleSubstancesCommitBean<>(commitBean));
//offenderSamplesCommitBean.setUpdatelist(Collections.singletonList(commitBean));
//offenderSamplesCommitBean.setUpdatelist(Arrays.asList(commitBean));
//offenderSamplesCommitBean.setUpdatelist(new Collection().stream());
//offenderSamplesCommitBean.setUpdatelist(commitBean.getOffenderSampleTemp());
//offenderSamplesCommitBean.setUpdatelist(new Collector(commitBean).stream);
		offenderSamplesCommitBean.setUpdatelist(new OffenderSampleSubstancesCommitBean().getUpdatelist());
		offenderSamplesCommitBean.setUpdatelist(commitBean.getUpdatelist());
		
	}
	public static void main(String[] args) 
	{
			//offenderSamples.setTestedPositive(returnObj > 0 ? "Y" : "N");
			
	}

}
