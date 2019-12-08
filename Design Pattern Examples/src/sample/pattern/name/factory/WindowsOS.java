/**
 * 
 */
package sample.pattern.name.factory;

/**
 * @author deshp
 *
 */
public class WindowsOS implements OS {
	
	private String osName;
	private String osType;
	private String osVersion;
	
	/**
	 * 
	 */
	public WindowsOS(String name, String type, String version) {
		// TODO Auto-generated constructor stub
		this.osName = name;
		this.osType = type;
		this.osVersion = version;
	}

	/* (non-Javadoc)
	 * @see sample.pattern.name.factory.OS#displayInfo()
	 */
	@Override
	public void getOSInfo() {
		// TODO Auto-generated method stub
		System.out.println("Windows Info : " + osName + " --- " + osType + " --- " + osVersion);
	}

}
