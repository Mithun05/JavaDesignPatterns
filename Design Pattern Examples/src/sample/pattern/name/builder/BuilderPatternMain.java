/**
 * 
 */
package sample.pattern.name.builder;

/**
 * @author deshp
 *
 */
public class BuilderPatternMain {

	public static void main(String[] args) {
		CompanyBag companyBag = new CompanyBag.CompanyBagBuilder("UD", "DU").setNamePic("TT").setNameTag("PT").build();
		System.out.println(companyBag.getCompanyLogo() + companyBag.getNameTag());
	}
	
}
