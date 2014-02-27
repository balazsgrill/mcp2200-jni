/**
 * 
 */
package hu.mcp2200;

/**
 * @author balazs.grill
 *
 */
public class MCP2200Exception extends Exception {

	public static String getMessage(int code){
		switch (code) {
		case 0: return "LIBUSB_SUCCESS";
		case -1: return "LIBUSB_ERROR_IO";
		case -2: return "LIBUSB_ERROR_INVALID_PARAM";
		case -3: return "LIBUSB_ERROR_ACCESS";
		case -4: return "LIBUSB_ERROR_NO_DEVICE";
		case -5: return "LIBUSB_ERROR_NOT_FOUND";
		case -6: return "LIBUSB_ERROR_BUSY";
		case -7: return "LIBUSB_ERROR_BUSY";
		case -8: return "LIBUSB_ERROR_OVERFLOW";
		case -9: return "LIBUSB_ERROR_PIPE";
		case -10: return "LIBUSB_ERROR_INTERRUPTED";
		case -11: return "LIBUSB_ERROR_NO_MEM";
		case -12: return "LIBUSB_ERROR_NOT_SUPPORTED";
		case -99: return "LIBUSB_ERROR_OTHER";
		
		case -101: return "MCP2200_INVALID_CONNECTION_ID";
		case -102: return "MCP2200_INVALID_RESPONSE";
		case -103: return "MCP2200_IO_ERROR";
		default:
			return "Unknown error ("+code+")!";
		}
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6956010085548095780L;

	private final int code;
	
	public MCP2200Exception(int code) {
		super(getMessage(code));
		this.code = code;
	}
	
	/**
	 * Return the underlying LIBUSB/MCP2200 error code
	 * 
	 * @return
	 */
	public int getCode() {
		return code;
	}
	
	/**
	 * Returns true if the error is caused by the absence of the device. If the result is false,
	 * the connection may recover from the erroneous state, otherwise it is impossible.
	 * 
	 * @return
	 */
	public boolean isDeviceDisconnected(){
		return code == -4;
	}
	
}
