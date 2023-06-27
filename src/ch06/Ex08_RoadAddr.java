package ch06;

public class Ex08_RoadAddr {

	public static void main(String[] args) throws Exception {
		RoadAddress roadAddress = new RoadAddress();
		String roadAddr = roadAddress.getRoadAddr("경기도청");
		System.out.println(roadAddr);
	}

}
