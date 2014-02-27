/**
 * 
 */
package hu.mcp2200;

/**
 * Instances of this interface denotes a single MCP2200 device connected to the machine. Note that this is only a handle and does not
 * reserve any actual resources.
 * 
 * @author balazs.grill
 *
 */
public interface IMCP2200Device {

	public int getBus();
	
	public int getAddress();
	
	/**
	 * This method attempts to claim the USB interfaces of the device. It returns the connection instance object if succeeded. In case of any
	 * error, it throws an exception. Callers can assume the result to never be null.
	 * 
	 * @return
	 * @throws MCP2200Exception
	 */
	public IMCP2200Connection connect() throws MCP2200Exception;
	
}
