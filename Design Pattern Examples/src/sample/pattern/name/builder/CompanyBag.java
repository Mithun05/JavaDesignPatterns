/**
 * 
 */
package sample.pattern.name.builder;

/**
 * @author deshp
 *
 */
public class CompanyBag {
	
	//required parameters
	private String companyLogo;
	private String companyName;
	
	//optional parameters
	private String nameTag;
	private String namePic;
	
	
	private CompanyBag(CompanyBagBuilder builder) {
		this.companyLogo = builder.companyLogo;
		this.companyName = builder.companyName;
		this.namePic = builder.namePic;
		this.nameTag = builder.nameTag;
	}
	
	/**
	 * @return the companyLogo
	 */
	public String getCompanyLogo() {
		return companyLogo;
	}





	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}





	/**
	 * @return the nameTag
	 */
	public String getNameTag() {
		return nameTag;
	}





	/**
	 * @return the namePic
	 */
	public String getNamePic() {
		return namePic;
	}





	public static class CompanyBagBuilder {
		
		private String companyLogo;
		private String companyName;
		
		private String nameTag;
		private String namePic;
		
		/**
		 * 
		 */
		public CompanyBagBuilder(String logo, String name) {
			// TODO Auto-generated constructor stub
			this.companyLogo = logo;
			this.companyName = name;
		}


		/**
		 * @param nameTag the nameTag to set
		 */
		public CompanyBagBuilder setNameTag(String nameTag) {
			this.nameTag = nameTag;
			return this;
		}

		/**
		 * @param namePic the namePic to set
		 */
		public CompanyBagBuilder setNamePic(String namePic) {
			this.namePic = namePic;
			return this;
		}
		
		
		public CompanyBag build() {
			return new CompanyBag(this);
		}
		
	}

}
