package mx.com.ejemplo.webapp.beans;

public class IataCodesResponse {
	private int id;
	private String code;
	private String countryCode;
	private String name;
	
	/**
	 * 
	 */
	public IataCodesResponse() {
		super();
	}
	/**
	 * 
	 * @param id
	 * @param code
	 * @param countryCode
	 * @param name
	 */
	public IataCodesResponse(int id, String code, String countryCode, String name) {
		super();
		this.id = id;
		this.code = code;
		this.countryCode = countryCode;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IataCodes [id=" + id + ", code=" + code + ", countryCode=" + countryCode + ", name=" + name + "]";
	}

}
