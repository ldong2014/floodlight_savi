package org.openflow.protocol;

import org.openflow.util.U16;

public class OFDHCPReply extends OFMessage{
	public static int MINIMUM_LENGTH = 8;
	private String OFFER_IPAddress;
    byte[] payload;
	public OFDHCPReply() {
        super();
        this.type = OFType.DHCP_REPLY;
        this.length = U16.t(OFDHCPReply.MINIMUM_LENGTH);
    }
	public void Init(String IPAddress){
		OFFER_IPAddress=IPAddress;
	}
	public String GetSrcMACAddress(){
		return OFFER_IPAddress;
	}
}
