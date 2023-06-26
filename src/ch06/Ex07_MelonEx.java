package ch06;

public class Ex07_MelonEx {

	public static void main(String[] args) {
		Melon m1 = new Melon();
		m1.setRank(1);
		m1.setTitle("퀸카 (Queencard)");
		m1.setArtist("(여자)아이들");
		m1.setAlbum("I feel");
		m1.setImgUrl("https://cdnimg.melon.co.kr/cm2/album/images/112/40/232/11240232_20230509151820_500.jpg/melon/resize/120/quality/80/optimize");
		System.out.println(m1);
		
		Melon m2 = new Melon(2, "I AM", "IVE (아이브)", "I've IVE", null);
		System.out.println(m2);
		
		Melon[] melonChart = new Melon[2];
		melonChart[0] = m1;
		melonChart[1] = m2;
		for (Melon m: melonChart) System.out.println(m);

	}

}
