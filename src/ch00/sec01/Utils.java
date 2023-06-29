package ch00.sec01;
/**
 * 	 생일을 입력으로 받아 오늘 현재의 만 나이를 계산하고, 띠를 알려주세요
 *   주사위 3개 굴려서 상금 계산
 */

import java.time.LocalDate;
import java.util.Arrays;

public class Utils {
    public static String getAge(int bYear, int bMonth, int bDay) {
        int age = calculateAge(bYear, bMonth, bDay);
        return "만 " + age + "세";
    }

    public static String getAgePP(int bYear, int bMonth, int bDay) {
        int age = calculateAge(bYear, bMonth, bDay);
        String animals = "신유술해자축인묘진사오미";
        return "만 " + age + "세 이고 띠는 " + animals.charAt(bYear % 12);
    }

    private static int calculateAge(int bYear, int bMonth, int bDay) {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - bYear;
        int month = bMonth - today.getMonthValue();
        int day = today.getDayOfMonth() - bDay;
        if (month > 0 || (month == 0 && day >= 0)) {
            age--;
        }
        return age;
    }
    public static String rollingDIces() {
    	int[] dice = new int[3];
    	
    	String res = "";
    	for(int i=0;i<3;i++) {
    		dice[i] = 1+(int)(Math.random()*6);
    		res += "dice["+i+"] : "+dice[i]+" ";
    	}
    	Arrays.sort(dice);
    	int money;
        if (dice[0] == dice[2]) {
            money = 10000 + (dice[0] * 1000);
        } else if (dice[0] == dice[1] || dice[1] == dice[2]) {
            money = 1000 + (dice[1] * 100);
        } else {
            money = dice[2] * 100;
        }
        res += "\n상금은 " + money;
    	return res;
    }
    public static String[] showModelPP() {
    	
    	String[] cars = "buick skylark 320,plymouth satellite,amc reble sst,ford torino".split(",");
    	
    	String[] manufactures = Arrays.stream(cars).map(x -> x.split(" ")[0].trim()).toArray(String[]::new);
//    	String[] models = Arrays.stream(cars).map(x -> String.join(" ", Arrays.copyOfRange(x.split(" "), 1, x.split(" ").length)).trim()).toArray(String[]::new);
    	
    	
    	return manufactures;
    }
    
    
    
    
    
    
    
    
}

