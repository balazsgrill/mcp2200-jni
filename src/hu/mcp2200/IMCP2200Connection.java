/**
 * 
 */
package hu.mcp2200;

/**
 * Instances of this interface wraps the claimed USB interfaces of the MCP2200 device. This is an actual and exclusive access
 * for the device which locks any other access to the device until it is disposed or the device is removed from the system.
 * 
 * @author balazs.grill
 *
 */
public interface IMCP2200Connection {

	/**
	 * Close the connection and dispose any allocated resources. Any call to to this object after calling this method will result
	 * in an exception.
	 */
	public void dispose();
	
	/**
	 * Send the given configuration to the device.
	 * 
	 * @param configuration
	 * @throws MCP2200Exception
	 */
	public void configure(MCP2200Configuration configuration) throws MCP2200Exception;
	
	/**
	 * Set the given output pin to the digital high value
	 *  
	 * @param pin
	 * @throws MCP2200Exception
	 */
	public void setPin(int pin) throws MCP2200Exception;
	
	/**
	 * Set the given output pin to the digital low value
	 *  
	 * @param pin
	 * @throws MCP2200Exception
	 */
	public void clearPin(int pin) throws MCP2200Exception;
	
	/**
	 * Send command to the device to write the given value at the given address
	 * to the internal EEPROM
	 * 
	 * @param address
	 * @param value
	 * @throws MCP2200Exception
	 */
	public void writeEEPROM(int address, int value) throws MCP2200Exception;
	
	/**
	 * Read and return the value at the given address from the internal EEPROM of the device
	 * 
	 * @param address
	 * @return
	 * @throws MCP2200Exception
	 */
	public int readEEPROM(int address) throws MCP2200Exception;
	
	/**
	 * Get the device for that this objects holds connection to
	 * 
	 * @return
	 */
	public IMCP2200Device getDevice();
	
	/**
	 * Send the contents of the given byte array through the serial interface of the device.
	 * 
	 * @param data
	 * @throws MCP2200Exception
	 */
	public void send(byte[] data) throws MCP2200Exception;
	
	/**
	 * Attempt to fill the given byte array with received data if available. The actual number of bytes written into the array is returned.
	 * 
	 * @param data
	 * @return
	 * @throws MCP2200Exception
	 */
	public int receive(byte[] data) throws MCP2200Exception;
	
}
