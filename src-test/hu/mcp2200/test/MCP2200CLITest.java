/**
 * 
 */
package hu.mcp2200.test;

import java.util.Collection;

import hu.mcp2200.IMCP2200Device;
import hu.mcp2200.MCP2200JNI;
import hu.mcp2200.MCP2200Manager;

/**
 * @author balazs.grill
 *
 */
public class MCP2200CLITest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MCP2200JNI.getInstance().init();
		
		Collection<IMCP2200Device> devices = MCP2200Manager.detectDevices();
		
		System.out.println("Number of devices: "+devices.size());
		
		MCP2200JNI.getInstance().close();
	}

}
