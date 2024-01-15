package test;
import java.io.*;
import java.security.KeyStore.Entry;
/*
import { BaseModel } from "../../../common/beans/BaseModel";
export class OffenderCases extends BaseModel
{
	private _createUserId: string;
	private _code: string;
	private _offenderBookId: number;
	private _modifyDatetime: Date;
	private _offenderChargeId: number;
	private _caseStatus: string;
	private _statusUpdateDate: Date;
	private _modifyUserId: string;
	private _offenceType: string;
	private _description: string;
	private _caseType: string;
	private _serialVersionUID: number;
	private _sentenceEventId: number;
	private _offenceCode: string;
	private _lidsCaseNumber: number;
	private _caseId: number;
	private _statusUpdateComment: string;
	private _sealFlag: string;
	private _offenceDate: Date;
	private _caseSeq: number;
	private _statusUpdateStaffId: number;
	private _complicityTypeDesc: string;
	private _caseInfoPrefix: string;
	private _statusUpdateReason: string;
	private _offenceDescription: string;
	private _chargeInfoNumber: string;
	private _createDatetime: Date;
	private _beginDate: Date;
	private _caseInfoNumber: string;
	private _chargeId: string;
	private _agyLocId: string;
	private _victimLiaisonUnit: string;
	get createUserId(): string{ return this._createUserId; }
	set createUserId(pcreateUserId: string){ this._createUserId = pcreateUserId ;}
	get code(): string{ return this._code; }
	set code(pcode: string){ this._code = pcode ;}
	get offenderBookId(): number{ return this._offenderBookId; }
	set offenderBookId(poffenderBookId: number){ this._offenderBookId = poffenderBookId ;}
	get modifyDatetime(): Date{ return this._modifyDatetime; }
	set modifyDatetime(pmodifyDatetime: Date){ this._modifyDatetime = pmodifyDatetime ;}
	get offenderChargeId(): number{ return this._offenderChargeId; }
	set offenderChargeId(poffenderChargeId: number){ this._offenderChargeId = poffenderChargeId ;}
	get caseStatus(): string{ return this._caseStatus; }
	set caseStatus(pcaseStatus: string){ this._caseStatus = pcaseStatus ;}
	get statusUpdateDate(): Date{ return this._statusUpdateDate; }
	set statusUpdateDate(pstatusUpdateDate: Date){ this._statusUpdateDate = pstatusUpdateDate ;}
	get modifyUserId(): string{ return this._modifyUserId; }
	set modifyUserId(pmodifyUserId: string){ this._modifyUserId = pmodifyUserId ;}
	get offenceType(): string{ return this._offenceType; }
	set offenceType(poffenceType: string){ this._offenceType = poffenceType ;}
	get description(): string{ return this._description; }
	set description(pdescription: string){ this._description = pdescription ;}
	get caseType(): string{ return this._caseType; }
	set caseType(pcaseType: string){ this._caseType = pcaseType ;}
	get serialVersionUID(): number{ return this._serialVersionUID; }
	set serialVersionUID(pserialVersionUID: number){ this._serialVersionUID = pserialVersionUID ;}
	get sentenceEventId(): number{ return this._sentenceEventId; }
	set sentenceEventId(psentenceEventId: number){ this._sentenceEventId = psentenceEventId ;}
	get offenceCode(): string{ return this._offenceCode; }
	set offenceCode(poffenceCode: string){ this._offenceCode = poffenceCode ;}
	get lidsCaseNumber(): number{ return this._lidsCaseNumber; }
	set lidsCaseNumber(plidsCaseNumber: number){ this._lidsCaseNumber = plidsCaseNumber ;}
	get caseId(): number{ return this._caseId; }
	set caseId(pcaseId: number){ this._caseId = pcaseId ;}
	get statusUpdateComment(): string{ return this._statusUpdateComment; }
	set statusUpdateComment(pstatusUpdateComment: string){ this._statusUpdateComment = pstatusUpdateComment ;}
	get sealFlag(): string{ return this._sealFlag; }
	set sealFlag(psealFlag: string){ this._sealFlag = psealFlag ;}
	get offenceDate(): Date{ return this._offenceDate; }
	set offenceDate(poffenceDate: Date){ this._offenceDate = poffenceDate ;}
	get caseSeq(): number{ return this._caseSeq; }
	set caseSeq(pcaseSeq: number){ this._caseSeq = pcaseSeq ;}
	get statusUpdateStaffId(): number{ return this._statusUpdateStaffId; }
	set statusUpdateStaffId(pstatusUpdateStaffId: number){ this._statusUpdateStaffId = pstatusUpdateStaffId ;}
	get complicityTypeDesc(): string{ return this._complicityTypeDesc; }
	set complicityTypeDesc(pcomplicityTypeDesc: string){ this._complicityTypeDesc = pcomplicityTypeDesc ;}
	get caseInfoPrefix(): string{ return this._caseInfoPrefix; }
	set caseInfoPrefix(pcaseInfoPrefix: string){ this._caseInfoPrefix = pcaseInfoPrefix ;}
	get statusUpdateReason(): string{ return this._statusUpdateReason; }
	set statusUpdateReason(pstatusUpdateReason: string){ this._statusUpdateReason = pstatusUpdateReason ;}
	get offenceDescription(): string{ return this._offenceDescription; }
	set offenceDescription(poffenceDescription: string){ this._offenceDescription = poffenceDescription ;}
	get chargeInfoNumber(): string{ return this._chargeInfoNumber; }
	set chargeInfoNumber(pchargeInfoNumber: string){ this._chargeInfoNumber = pchargeInfoNumber ;}
	get createDatetime(): Date{ return this._createDatetime; }
	set createDatetime(pcreateDatetime: Date){ this._createDatetime = pcreateDatetime ;}
	get beginDate(): Date{ return this._beginDate; }
	set beginDate(pbeginDate: Date){ this._beginDate = pbeginDate ;}
	get caseInfoNumber(): string{ return this._caseInfoNumber; }
	set caseInfoNumber(pcaseInfoNumber: string){ this._caseInfoNumber = pcaseInfoNumber ;}
	get chargeId(): string{ return this._chargeId; }
	set chargeId(pchargeId: string){ this._chargeId = pchargeId ;}
	get agyLocId(): string{ return this._agyLocId; }
	set agyLocId(pagyLocId: string){ this._agyLocId = pagyLocId ;}
	get victimLiaisonUnit(): string{ return this._victimLiaisonUnit; }
	set victimLiaisonUnit(pvictimLiaisonUnit: string){ this._victimLiaisonUnit = pvictimLiaisonUnit ;}
toJSON(): any {
	return { 
	   'createUserId': this._createUserId,
	   'code': this._code,
	   'offenderBookId': this._offenderBookId,
	   'modifyDatetime': this._modifyDatetime,
	   'offenderChargeId': this._offenderChargeId,
	   'caseStatus': this._caseStatus,
	   'statusUpdateDate': this._statusUpdateDate,
	   'modifyUserId': this._modifyUserId,
	   'offenceType': this._offenceType,
	   'description': this._description,
	   'caseType': this._caseType,
	   'serialVersionUID': this._serialVersionUID,
	   'sentenceEventId': this._sentenceEventId,
	   'offenceCode': this._offenceCode,
	   'lidsCaseNumber': this._lidsCaseNumber,
	   'caseId': this._caseId,
	   'statusUpdateComment': this._statusUpdateComment,
	   'sealFlag': this._sealFlag,
	   'offenceDate': this._offenceDate,
	   'caseSeq': this._caseSeq,
	   'statusUpdateStaffId': this._statusUpdateStaffId,
	   'complicityTypeDesc': this._complicityTypeDesc,
	   'caseInfoPrefix': this._caseInfoPrefix,
	   'statusUpdateReason': this._statusUpdateReason,
	   'offenceDescription': this._offenceDescription,
	   'chargeInfoNumber': this._chargeInfoNumber,
	   'createDatetime': this._createDatetime,
	   'beginDate': this._beginDate,
	   'caseInfoNumber': this._caseInfoNumber,
	   'chargeId': this._chargeId,
	   'agyLocId': this._agyLocId,
	   'victimLiaisonUnit': this._victimLiaisonUnit,
		};
	} 
}
*/  
//	  for(int i=0;i<se.length();i++) {
//	  if(se.equals("private"))
//	  System.out.println(se.equals("privat);//}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Demo 
{
	static ArrayList arob=null;
	static HashMap hmob=null;
	static HashSet hsob=null;
	static Entry en=null;
	static String sd="",sv="",sa="";
	public static void main(String[] args) throws Exception
	{
		BufferedReader omj=new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream("C:\\Users\\SANTOSH\\OneDrive\\Desktop\\OffenderCases.ts"))));String ii;
	
		while((ii=omj.readLine())!=null)
		  {
			  String []o = ii.split(" ");
			  for (int i = 0; i < o.length; i++) 
			  {
				  if(o[i].contains("private"))
				  {
					  sa+=o[i].replaceAll("[' ','\t','\r','\n' ]", " ");
					  
				  }
//				  System.out.println(sa);
				  
//				  if(o[i].startsWith("_")&&o[i].endsWith(":"))
//				  {
//					  sv = o[i].substring(1,o[i].length()-1);
//				  }
//				  
//				  if((o[i].startsWith(":")||o[i].endsWith(";"))&&(o[i].contains("string") || o[i].contains("Date") || o[i].contains("number")))
//				  {
//					  sd = o[i].substring(0,o[i].length()-1);
//				  }
			  }
			  arob =new ArrayList();
			  arob.add(sa);
//				  System.out.println(arob);
			  hmob=new HashMap();
			  hmob.put(sv, sd);			  
		}
		System.out.println(new Demo().instanceVariable());
	}
	public String instanceVariable() 
	{
//		arob.forEach(p->{System.out.println(p);});
		return ""+arob;
	}
	
	public void variable( ) 
	{
		
	}
	public void dataType() 
	{
		
	}	
}

//			System.out.println(sa);
//			for(int j=0;j<o.length;j++){}System.out.println(sv);
//			for(int k=0;k<o.length;k++){}System.out.println(sd);

 // FileInputStream obi = new
// FileInputStream("C:\\Users\\SANTOSH\\OneDrive\\Desktop\\OffenderCases.ts");
 
 // se+=(char)ii; // System.out.println(ii);
 
 // ArrayList om = new ArrayList(); // for(int i=0;i<om.size();i++) //
// om.add(o[i]);