/**
 * 
 */
package hu.mcp2200;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import hu.mcp2200.impl.MCP2200Device;

/**
 * Singleton utility class to enumerate available devices
 * 
 * @author balazs.grill
 *
 */
public final class MCP2200Manager {
	
	private MCP2200Manager() {}
	
	/**
	 * Enumerate all devices connected with the system which has the default MCP2200 vendorID:productID.
	 * 
	 * @param vendorID
	 * @param productID
	 * @return
	 */
	public static Collection<IMCP2200Device> detectDevices(){
		return detectDevices(MCP2200JNI.VENDOR_ID, MCP2200JNI.PRODUCT_ID);
	}
	
	/**
	 * Enumerate all devices connected with the system which has the given vendorID:productID.
	 * 
	 * @param vendorID
	 * @param productID
	 * @return
	 */
	public static Collection<IMCP2200Device> detectDevices(int vendorID, int productID){
		int count = MCP2200JNI.getInstance().list_devices(vendorID, productID);
		List<IMCP2200Device> devices = new ArrayList<IMCP2200Device>(count);
		for(int i=0;i<count;i++){
			devices.add(new MCP2200Device(i));
		}
		return Collections.unmodifiableList(devices);
	}
	
}
