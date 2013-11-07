package org.openflow.protocol;

public class OFBindingTable {
	private static OFBindingTable BindingTable =null;
	private static String[] MACTable;
	private static String[] IPTable;
	
	public OFBindingTable(){
		MACTable=new String[256];
		IPTable=new String[256];
	}
	public enum BindingStatus{
        NO_MATCH, EXISTED
    }
	
	public void AddToBindingTable(String MACAddress,String IPAddress,Short CurrentPort){
		MACTable[CurrentPort]=MACAddress;
		IPTable[CurrentPort]=IPAddress;
	}
	
	
	public BindingStatus CheckStatus(String MACAddress,String IPAddress ,Short CurrentPort ){
		if (MACTable[CurrentPort]==MACAddress){
			return BindingStatus.EXISTED;
		}else if(IPTable[CurrentPort]==IPAddress){
			return BindingStatus.EXISTED;
		}else
			return BindingStatus.NO_MATCH;
	}
	
	public OFBindingTable Init() {
		if(BindingTable==null)
		{
			BindingTable= new OFBindingTable();			
		}
        return BindingTable;
    }
	
}
