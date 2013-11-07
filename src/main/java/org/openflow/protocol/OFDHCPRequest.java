package org.openflow.protocol;

import org.openflow.util.U16;

public class OFDHCPRequest extends OFMessage {
	public static int MINIMUM_LENGTH = 8;
	private String SrcMACAddress;
    
	byte[] payload;
	public OFDHCPRequest() {
        super();
        this.type = OFType.DHCP_REQUEST;
        this.length = U16.t(OFDHCPRequest.MINIMUM_LENGTH);
    }
	public void Init(String MacAddress){
		SrcMACAddress=MacAddress;
	}
	public String GetSrcMACAddress(){
		return SrcMACAddress;
	}
}
