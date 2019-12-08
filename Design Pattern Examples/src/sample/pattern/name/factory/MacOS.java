/**
 * 
 */
package sample.pattern.name.factory;

/**
 * @author deshp
 *
 */
public class MacOS implements OS {

	private String osName;
	private String osType;
	private String osVersion;
	
	
	
	/**
	 * @param osName
	 * @param osType
	 * @param osVersion
	 */
	public MacOS(String osName, String osType, String osVersion) {
		super();
		this.osName = osName;
		this.osType = osType;
		this.osVersion = osVersion;
	}



	/* (non-Javadoc)
	 * @see sample.pattern.name.factory.OS#getOSInfo()
	 */
	@Override
	public void getOSInfo() {
		// TODO Auto-generated method stub
		System.out.println("MAC Info : " + osName + " --- " + osType + " --- " + osVersion);
	}

}
