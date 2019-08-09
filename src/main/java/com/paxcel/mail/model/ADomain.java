package com.paxcel.mail.model;

import org.springframework.data.annotation.Id;

public class ADomain {
	
	    @Id
	    public String adId;

	    public String adName;
	    public String adUrl;
	    public String location; //self/blank
	    
	    
		public String getAdId() {
			return adId;
		}
		public void setAdId(String adId) {
			this.adId = adId;
		}
		public String getAdName() {
			return adName;
		}
		public void setAdName(String adName) {
			this.adName = adName;
		}
		public String getAdUrl() {
			return adUrl;
		}
		public void setAdUrl(String adUrl) {
			this.adUrl = adUrl;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
	    
	    

}
