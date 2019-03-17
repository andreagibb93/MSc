package classTest;

public class MusicTrack {
	
	// question 1
	
	// declaration of data fields
	public String trackName;
	public String artistName;
	public double runTime;
	
	
	//constructor for data fields, set to meaningful default values
	//constructor has the same name as the class
	public MusicTrack() {
		this.trackName = "default";
		this.artistName = "default";
		this.runTime = 0.0;
		
	}
	
	//getter
	public String gettrackName() {
		return this.trackName;
	}
	
	//setter
	public void settrackName(String trackName) {
		this.trackName = trackName;
	}
	
	//getter
	public String getartistName() {
		return this.artistName;
	}
	
	//setter
	public void getartistName(String artistName) {
		this.artistName = artistName;
	}
	
	//getter
	public double getrunTime() {
		return this.runTime;
	}
	
	//setter
	public void setrunTime(double runTime) {
		this.runTime = runTime;
	}
	
	// question 2
	
	
	//second constructor with parameters 
	//assign the their values to the their data fields
	public MusicTrack(String trackName, String artistName, double runTime) {
		this.trackName = trackName;
		this.artistName = artistName;
		this.runTime = runTime;
		
	}
	
	// question 3
	
	//prints the details of data fields
	public void printDetails() {
		System.out.println(trackName);
		System.out.println(artistName);
		System.out.println(runTime);
		System.out.println("This is the informatio stored about this music track");
	}
	
	// question 4 
	
	//re-define equals method
	public boolean equals(Object obj) {
		
		//cast music track
		MusicTrack toCompare = (MusicTrack) obj;
		// if statement
		if(this.trackName.toLowerCase().equals(toCompare.trackName) && this.artistName.toLowerCase().equals(toCompare.artistName));
		return true;
			} else {
		return false;
			}
}
