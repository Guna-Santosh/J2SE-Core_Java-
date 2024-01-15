package test;

import java.util.List;

public class OffenderSampleSubstancesCommitBean 
{
	private List<OffenderSamples>insertList;
	
	private List<OffenderSamples>updatelist;
	
	private List<OffenderSamples>deleteList;
	
	private OffenderSamples  offenderSampleTemp  ;

	public OffenderSamples getOffenderSampleTemp() {
		return offenderSampleTemp;
	}

	public void setOffenderSampleTemp(OffenderSamples offenderSampleTemp) {
		this.offenderSampleTemp = offenderSampleTemp;
	}

	public List<OffenderSamples> getInsertList() {
		return insertList;
	}

	public void setInsertList(List<OffenderSamples> insertList) {
		this.insertList = insertList;
	}

	public List<OffenderSamples> getUpdatelist() {
		return updatelist;
	}

	public void setUpdatelist(List<OffenderSamples> updatelist) {
		this.updatelist = updatelist;
	}

	public List<OffenderSamples> getDeleteList() {
		return deleteList;
	}

	public void setDeleteList(List<OffenderSamples> deleteList) {
		this.deleteList = deleteList;
	}
}
/*public Integer subTestCommit(final OffenderSampleSubstancesCommitBean commitBean) {
		int liReturn = 0;
		// insertRecords
		if (commitBean.getInsertList() != null && commitBean.getInsertList().size() > 0) {
			for (final OffenderSampleSubstances obj : commitBean.getInsertList()) {
				obj.setCreateUserId(commitBean.getCreateUserId());
				obj.setModifyUserId(commitBean.getCreateUserId());
				OffenderSamples offenderSamples = new OffenderSamples();
				offenderSamples.setOffenderSampleId(obj.getOffenderSampleId());
				Integer returnObj = oidstestRepository.setPositiveTestedFlag(offenderSamples);
				if (returnObj > 0) {
					commitBean.getOffenderSamples().setTestedPositive("Y");
				} 
			}OffenderSamplesCommitBean offenderSamplesCommitBean = new OffenderSamplesCommitBean();
//			offenderSamplesCommitBean.setUpdateList(commitBean);
			liReturn = oidstestRepository.subTestInsertOffenderSampleSubstances(commitBean.getInsertList());
		}
		// updateRecords
		if (commitBean.getUpdateList() != null && commitBean.getUpdateList().size() > 0) {
			for (final OffenderSampleSubstances obj : commitBean.getUpdateList()) {
				obj.setModifyUserId(commitBean.getCreateUserId());
				OffenderSamples offenderSamples = new OffenderSamples();
				offenderSamples.setOffenderSampleId(obj.getOffenderSampleId());
				Integer returnObj = oidstestRepository.setPositiveTestedFlag(offenderSamples);
				if (returnObj > 0) {
					offenderSamples.setTestedPositive("Y");					
				} else {
					offenderSamples.setTestedPositive("N");
				}
			}
			liReturn = oidstestRepository.subTestUpdateOffenderSampleSubstances(commitBean.getUpdateList());
		}
		// deleteRecords
		if (commitBean.getDeleteList() != null && commitBean.getDeleteList().size() > 0) {
			liReturn = oidstestRepository.subTestDeleteOffenderSampleSubstances(commitBean.getDeleteList());
		}
		return liReturn;
	}

*/