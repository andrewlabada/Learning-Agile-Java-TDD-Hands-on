/**
 * 
 */
package DesignPatterns.BuilderPattern;

/**
 * @author ANREW25
 *
 */
public class LunchOrderBean {

	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	public LunchOrderBean() {}
	
	public LunchOrderBean(String bread,String condiments,String dressing, String meat) {
		this.bread=bread;
		this.condiments=condiments;
		this.dressing=dressing;
		this.meat=meat;
	}
	
	public String getBread() {
		return bread;
	}
	public String getCondiments() {
		return condiments;
	}
	public String getDressing() {
		return dressing;
	}
	public String getMeat() {
		return meat;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}
	public void setDressing(String dressing) {
		this.dressing = dressing;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	
	
}
