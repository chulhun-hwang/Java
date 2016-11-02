/**
 * 파일명 : paxing.java
 * 작성일 : 2016. 8. 3.
 * 파일설명 :
 */
package Java_paxing;

import java.io.*;

//////////////////////////저장 및 sql 삽입을 위한 클래스/////////////////
class Make_table{
	///////////////////////
	private String id;//작성자 아이디 : 스크롤링 타이틀부분
	private String sex;//작성자 성별 : 스크롤링 본문
	private String ages;//작성자 나이 : 스크롤링 본문
	private String when_write;//작성 날짜 : 스크롱링 타이틀부분
	//////////////////////
	private String tema;//관광 테마 : 파일이름 34열
	private String who_with; //동반 : 스크롱링 본문 친구, 연인, 가족
	/////////////////////
	private String sleep;//숙소 : 스크롱링 본문
	private String transport;//교통 : 스크롱링 본문
	private String food;//음식 : 스크롱링 본문
	/////////////////////
	private String city;//시/구 : 파일이름12열
	private	String sort; //크롱링 분류 네이버/페이스북 등 : 현재 네이버 디폴트
	private String person; //인원수 : 스크롤링
	private String stay_long; //여행기간;
	////////////////////
	private String detail_food; //음식 세부이름
	private String detail_spot; //관광지 세무이름
	private String spot; //관광지 이름
	
	
	Make_table(){
		this.id ="null"; 
		this.sex ="null"; 
		this.ages ="null"; 
		this.when_write ="null"; 
		//////////////////////
		this.tema ="null";	
		this.who_with ="null";
		/////////////////////
		this.sleep ="null"; 
		this.transport ="null"; 
		this.food ="null"; 
		////////////////////
		this.city="null"; 
		this.sort="null"; 
		this.person="null";
		this.stay_long="null";
		///////////////////
		this.detail_food="null";
		this.detail_spot="null";
		this.spot = "null";
	};
	
	public void setid(String sid){
		this.id = sid;
	}
	public void getid(){
		System.out.println(this.id);
	}
	public void setsex(String ssex){
		this.sex = ssex;
	}
	public void setages(String sages){
		this.ages = sages;
	}
	public void setwhen_write(String swhen_write){
		this.when_write = swhen_write;
	}
	public void settema(String stema){
		this.tema = stema;
	}
	public void gettema(){
		System.out.println(this.tema);
	}
	public void setwho_with(String sww){
		this.who_with = sww;
	}
	public void setsleep(String ssp){
		this.sleep = ssp;
	}
	public void settransport(String stp){
		this.transport = stp;
	}
	public void setfood(String sfood){
		this.food = sfood;
	}
	public void setcity(String sct){
		this.city = sct;
	} 
	public void getcity(){
		System.out.println(this.city);
	}
	public void setsort(String sst){
		this.sort = sst;
	}
	public void setperson(String pst){
		this.person = pst;
	}
	public void setstaylong(String ssl){
		this.stay_long = ssl;
	}
	public void setdetailfood(String df){
		this.detail_food = df;
	}
	public void setdetailspot(String dsp){
		this.detail_spot = dsp;
	}
	public void setspot(String ssp){
		this.spot = ssp;
	}
	public void print_mtt(){
		String string1 = this.id+" "+this.sex+" "+this.ages+" "+this.when_write+" ";
		String string2 = this.tema+" "+this.detail_spot+" "+ this.spot +" "+this.who_with+" ";
		String string3 = this.sleep+" "+this.transport+" "+this.detail_food+ " " +this.food+" ";
		String string4 = this.city+" "+this.sort+" "+this.person+" "+this.stay_long;
		System.out.println(string1+"\n"+string2+"\n"+string3+"\n"+string4);
	}
	public void save_text(){
		String string1 = this.id+" "+this.sex+" "+this.ages+" "+this.when_write+" ";
		String string2 = this.tema+" "+this.detail_spot+" "+ this.spot +" "+this.who_with+" ";
		String string3 = this.sleep+" "+this.transport+" "+this.detail_food+ " " +this.food+" ";
		String string4 = this.city+" "+this.sort+" "+this.person+" "+this.stay_long;
				
		String txt = string1+string2+string3+string4+"\n";			//저장형식 지정
        String fileName = "C:\\Users\\qewqs\\Desktop\\class_exam\\table_row.txt" ;	//텍스트 파일 저장할 위치
         
        
        try{
            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));// BufferedWriter 와 FileWriter를 조합하여 사용 (속도 향상)
            fw.write(txt);// 파일안에 문자열 쓰기
            fw.flush();  
            fw.close(); // 객체 닫기  
        }catch(Exception e){
            e.printStackTrace();
        }
	}
	public void clear(){
		//id와 테마는 고정값이기 때문에 손대지 않는다.
		this.id ="null"; 
		this.sex ="null"; 
		this.ages ="null"; 
		this.when_write ="null"; 
		//////////////////////	
		this.who_with ="null";
		/////////////////////
		this.sleep ="null"; 
		this.transport ="null"; 
		this.food ="null"; 
		////////////////////
		this.sort="null"; 
		this.person="null";
		this.stay_long="null";
		/////////////////
		this.detail_food = "null";
		this.detail_spot = "null";
		this.spot = "null";
	}
}




public class paxing {

	public void subDirList(String source) {
		// TODO Auto-generated method stub
		File dir=new File(source);
		File[] FileList=dir.listFiles();
		Make_table mtt = new Make_table();
		try{
			for(int i = 0; i<FileList.length;i++){
				File file = FileList[i];
				if(file.isFile()){
					//파일이 있으면
					System.out.println("\t파일이름 = "+file.getName());
					//추가적인 내용!!
					if(file.getName().substring(0, 2).equals("01")){
						System.out.println("고양시");
						mtt.setcity("고양시");
					}else if(file.getName().substring(0,2).equals("02")){
						System.out.println("과천시");
						mtt.setcity("과천시");
					}else if(file.getName().substring(0,2).equals("03")){
						System.out.println("광명시");
						mtt.setcity("광명시");
					}else if(file.getName().substring(0,2).equals("04")){
						System.out.println("광주시");
						mtt.setcity("광주시");
					}else if(file.getName().substring(0,2).equals("05")){
						System.out.println("구리시");
						mtt.setcity("구리시");
					}else if(file.getName().substring(0,2).equals("06")){
						System.out.println("군포시");
						mtt.setcity("군포시");
					}else if(file.getName().substring(0,2).equals("07")){
						System.out.println("김포시");
						mtt.setcity("김포시");
					}else if(file.getName().substring(0,2).equals("08")){
						System.out.println("남양주시");
						mtt.setcity("남양주시");
					}else if(file.getName().substring(0,2).equals("09")){
						System.out.println("동두천시");
						mtt.setcity("동두천시");
					}else if(file.getName().substring(0,2).equals("10")){
						System.out.println("부천시");
						mtt.setcity("부천시");
					}else if(file.getName().substring(0,2).equals("11")){
						System.out.println("성남시");
						mtt.setcity("성남시");
					}else if(file.getName().substring(0,2).equals("12")){
						System.out.println("수원시");
						mtt.setcity("수원시");
					}else if(file.getName().substring(0,2).equals("13")){
						System.out.println("시흥시");
						mtt.setcity("시흥시");
					}else if(file.getName().substring(0,2).equals("14")){
						System.out.println("안산시");
						mtt.setcity("안산시");
					}else if(file.getName().substring(0,2).equals("15")){
						System.out.println("안성시");
						mtt.setcity("안성시");
					}else if(file.getName().substring(0,2).equals("16")){
						System.out.println("안양시");
						mtt.setcity("안양시");
					}else if(file.getName().substring(0,2).equals("17")){
						System.out.println("양주시");
						mtt.setcity("양주시");
					}else if(file.getName().substring(0,2).equals("18")){
						System.out.println("여주시");
						mtt.setcity("여주시");
					}else if(file.getName().substring(0,2).equals("19")){
						System.out.println("오산시");
						mtt.setcity("오산시");
					}else if(file.getName().substring(0,2).equals("20")){
						System.out.println("용인시");
						mtt.setcity("용인시");
					}else if(file.getName().substring(0,2).equals("21")){
						System.out.println("의왕시");
						mtt.setcity("의왕시");
					}else if(file.getName().substring(0,2).equals("22")){
						System.out.println("의정부시");
						mtt.setcity("의정부시");
					}else if(file.getName().substring(0,2).equals("23")){
						System.out.println("이천시");
						mtt.setcity("이천시");
					}else if(file.getName().substring(0,2).equals("24")){
						System.out.println("파주시");
						mtt.setcity("파주시");
					}else if(file.getName().substring(0,2).equals("25")){
						System.out.println("평택시");
						mtt.setcity("평택시");
					}else if(file.getName().substring(0,2).equals("26")){
						System.out.println("포천시");
						mtt.setcity("포천시");
					}else if(file.getName().substring(0,2).equals("27")){
						System.out.println("하남시");
						mtt.setcity("하남시");
					}else if(file.getName().substring(0,2).equals("28")){
						System.out.println("화성시");
						mtt.setcity("화성시");
					}else if(file.getName().substring(0,2).equals("29")){
						System.out.println("가평군");
						mtt.setcity("가평군");
					}else if(file.getName().substring(0,2).equals("30")){
						System.out.println("양평군");
						mtt.setcity("양평군");
					}else if(file.getName().substring(0,2).equals("31")){
						System.out.println("연천군");
						mtt.setcity("연천군");
					}
					
					if(file.getName().substring(2, 4).equals("01")){
						System.out.println("식도락");
						mtt.settema("식도락");
					}else if(file.getName().substring(2, 4).equals("02")){	
						System.out.println("레저");
						mtt.settema("레저");
					}
					else if(file.getName().substring(2, 4).equals("03")){	
						System.out.println("힐링");
						mtt.settema("힐링");
					}
					else if(file.getName().substring(2, 4).equals("04")){	
						System.out.println("쇼핑");
						mtt.settema("쇼핑");
					}
					else if(file.getName().substring(2, 4).equals("05")){	
						System.out.println("체험");
						mtt.settema("체험");
					}
					else if(file.getName().substring(2, 4).equals("06")){	
						System.out.println("관광명소");
						mtt.settema("관광명소");
					}		
					
					//여기까지가 시도 및 테마 추출 : 파일 이름으로 분류
					mtt.setsort("네이버블로그");
					try{
						String file_url = source + file.getName();
						FileInputStream fin = new FileInputStream(file_url);
						InputStreamReader inreader = new InputStreamReader(fin, "euc-kr");
						BufferedReader breader = new BufferedReader(inreader);
						String s;
						while((s=breader.readLine())!= null){
							if(s.indexOf("postViewArea")>-1){
								
							}else{
								System.out.println(s);
								
							}
						}
						
						
						
					}catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("파일 리딩 에러");
					} catch(IOException e){
						e.printStackTrace();
					}
					
					
				}else if(file.isDirectory()){
					System.out.println("디렉토리 이름 = "+file.getName());
					//서브디렉토리가 존재하면 재귀적 방법으로 다시 탐색
					subDirList(file.getCanonicalPath().toString());
				}
			}
		}catch(/*IO*/Exception e){
			System.out.println("에러!!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paxing sdf = new paxing();
		String source = "C:\\Users\\qewqs\\Desktop\\crowling\\";
		sdf.subDirList(source);
	}

}
