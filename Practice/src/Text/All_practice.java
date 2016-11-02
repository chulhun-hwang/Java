/**
 * 파일명 : All_practice.java
 * 작성일 : 2016. 7. 27.
 * 파일설명 :
 */
package Text;

/*import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;*/
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
	public void save_sql(){
	/*
		String sql1 = "insert into table1 values(" + id + ",'" + sex + "','" + ages + "','" + when_write + "')";
		String sql2 = "insert into table2 values(" + tema + ",'" + who_with + "','" + when_go + "')";
		String sql3 = "insert into table3 values(" + sleep + ",'" + transport + "','" + food + "')";
		String sql3 = "insert into table4 values(" + city + ",'" + sort + "','" + person + "','" + stay_long + "')";
	
		table.executeUpdate(sql1);
		table.executeUpdate(sql2);
		table.executeUpdate(sql3);
		table.executeUpdate(sql4);
	 */
	}
	
	public void clear(){
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
		/////////////////
		this.detail_food = "null";
		this.detail_spot = "null";
		this.spot = "null";
	}
}
////////////////////////////////////////////////////////////
///////////////////////디렉토리에서 파일을 읽기 위한 클라스/////////////////////
public class All_practice {
	
	public void subDirList(String source) {
		// TODO Auto-generated method stub
		File dir=new File(source);
		File[] FileList=dir.listFiles();
		Make_table mtt = new Make_table();
		try{
			for(int i = 0; i<FileList.length;i++){
				File file = FileList[i];
				
				if(file.isFile()){
					//파일이 존재한다면 읽는다.
					//System.out.println("\t파일이름 = "+file.getName());
					try {
						
						String file_url = source + file.getName();
						FileInputStream fin = new FileInputStream(file_url);
						InputStreamReader inreader = new InputStreamReader(fin, "euc-kr");
						BufferedReader breader = new BufferedReader(inreader);
						//int s;
						String s;
						
						while((s =/*inreader.read()*/ breader.readLine()) != /*-1*/ null){
							//System.out.println(/*(char)*/s);
							//이부분이  파일 내용을 반복해서 문장으로 읽어들이는 부분입니다.
							mtt.setsort("네이버");
							String path = ""+file;
							System.out.println(path);
							String file_name[] = path.split("crowling");
							String sort_file = file_name[file_name.length-1].substring(1);
							
							if(sort_file.substring(0, 2).equals("01")){		//*****************고양시*************************//
								mtt.setcity("고양시");
								//mtt.getcity();
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("02")){//*****************과천시*************************//
								mtt.setcity("과천시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}		
							}else if(sort_file.substring(0, 2).equals("03")){//*****************광명시*************************//
								mtt.setcity("광명시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("04")){//*****************광주시*************************//
								mtt.setcity("광주시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("05")){//*****************구리시*************************//
								mtt.setcity("구리시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("06")){//*****************군포시*************************//
								mtt.setcity("군포시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("07")){//*****************김포시*************************//
								mtt.setcity("김포시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("08")){//*****************남양주시*************************//
								mtt.setcity("남양주시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("09")){//*****************동두천시*************************//
								mtt.setcity("동두천시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("10")){//*****************부천시*************************//
								mtt.setcity("부천시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("11")){//*****************성남시*************************//
								mtt.setcity("성남시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("12")){//*****************수원시*************************//
								mtt.setcity("수원시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("13")){//*****************시흥시*************************//
								mtt.setcity("시흥시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("14")){//*****************안산시*************************//
								mtt.setcity("안산시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("15")){//*****************안성시*************************//
								mtt.setcity("안성시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("16")){//*****************안양시*************************//
								mtt.setcity("안양시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("17")){//*****************양주시*************************//
								mtt.setcity("양주시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("18")){//*****************여주시*************************//
								mtt.setcity("여주시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("19")){//*****************오산시*************************//
								mtt.setcity("오산시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("20")){//*****************용인시*************************//
								mtt.setcity("용인시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("21")){//*****************의왕시*************************//
								mtt.setcity("의왕시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("22")){//*****************의정부시*************************//
								mtt.setcity("의정부시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("23")){//*****************이천시*************************//
								mtt.setcity("이천시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("24")){//*****************파주시*************************//
								mtt.setcity("파주시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("25")){//*****************평택시*************************//
								mtt.setcity("평택시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("26")){//*****************포천시*************************//
								mtt.setcity("포천시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("27")){//*****************하남시*************************//
								mtt.setcity("하남시");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("28")){//*****************화성시*************************//
								mtt.setcity("화성시");
								if(sort_file.substring(2, 4).equals("01")){			//고양시 - 식도락
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("29")){//*****************가평군*************************//
								mtt.setcity("가평군");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("30")){//*****************양평군*************************//
								mtt.setcity("양평군");
								if(sort_file.substring(2, 4).equals("01")){			
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){	
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){	
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}else if(sort_file.substring(0, 2).equals("31")){//*****************연천군*************************//
								mtt.setcity("연천군");
								if(sort_file.substring(2, 4).equals("01")){			//고양시 - 식도락
									mtt.settema("식도락");
								}
								else if(sort_file.substring(2, 4).equals("02")){
									mtt.settema("레저");
								}
								else if(sort_file.substring(2, 4).equals("03")){
									mtt.settema("힐링");
								}
								else if(sort_file.substring(2, 4).equals("04")){	
									mtt.settema("쇼핑");
								}
								else if(sort_file.substring(2, 4).equals("05")){	
									mtt.settema("체험");
								}
								else if(sort_file.substring(2, 4).equals("06")){	
									mtt.settema("관광명소");
								}
							}
							
							if(s.indexOf("postViewArea")>-1){
								System.out.println("\n text : " + s);
								
								//성별찾기
								if(s.indexOf("남자")> -1 || s.indexOf("남성")>-1||s.indexOf("아저씨")>-1 || s.indexOf("남정네")>-1||s.indexOf("아재")>-1){
									mtt.setsex("남자");
								}else if(s.indexOf("여자")>-1 ||s.indexOf("여성")>-1||s.indexOf("아가씨")>-1||s.indexOf("여인네")>-1){
									mtt.setsex("여성");
								}else{
									mtt.setsex("null");
								}
								
								//여행기간 찾기
								if(s.indexOf("당일")>-1||s.indexOf("1일")>-1){
									mtt.setstaylong("당일");
								}else if(s.indexOf("1박2일")>-1 || s.indexOf("1박 2일")>-1){
									mtt.setstaylong("1박2일");
								}else if(s.indexOf("2박3일")>-1 || s.indexOf("2박 3일")>-1){
									mtt.setstaylong("2박3일");
								}else if(s.indexOf("3박4일")>-1 || s.indexOf("3박 4일")>-1){
									mtt.setstaylong("3박4일");
								}else if(s.indexOf("4박5일")>-1 || s.indexOf("4박 5일")>-1){
									mtt.setstaylong("4박5일");
								}else if(s.indexOf("5박6일")>-1 || s.indexOf("5박 6일")>-1){
									mtt.setstaylong("5박6일");
								}else if(s.indexOf("6박7일")>-1 || s.indexOf("6박 7일")>-1||s.indexOf("일주일")>-1){
									mtt.setstaylong("일주일");
								}else{
									mtt.setstaylong("null");
								}
								
								//동반자 //인원
								if(s.indexOf("혼자")>-1||s.indexOf("혼여")>-1||s.indexOf("혼남")>-1||s.indexOf("나홀로")>-1){
									mtt.setwho_with("혼자");
									mtt.setperson("1인");
								}else if(s.indexOf("연인")>-1||s.indexOf("남자친구")>-1 || s.indexOf("남친")>-1||s.indexOf("여자인구")>-1||s.indexOf("여친")>-1||s.indexOf("애인")>-1||s.indexOf("부부")>-1||s.indexOf("남편")>-1||s.indexOf("서방")>-1||s.indexOf("부인")>-1||s.indexOf("와이프")>-1||s.indexOf("커플")>-1||s.indexOf("결혼")>-1||s.indexOf("둘이서")>-1){
									mtt.setwho_with("연인");
									mtt.setperson("2인");
								}else if(s.indexOf("가족")>-1||s.indexOf("부모님")>-1||s.indexOf("아버지")>-1||s.indexOf("아빠")>-1||s.indexOf("엄마")>-1||s.indexOf("어머니")>-1||s.indexOf("아이들")>-1||s.indexOf("아이")>-1||s.indexOf("아들")>-1||s.indexOf("딸")>-1||s.indexOf("자식")>-1||s.indexOf("아기")>-1){
									mtt.setwho_with("가족");
								}else if(s.indexOf("친구")>-1||s.indexOf("동창")>-1||s.indexOf("단짝")>-1||s.indexOf("칭구")>-1||s.indexOf("베프")>-1||s.indexOf("동성친구")>-1){
									mtt.setwho_with("친구");
								}else if(s.indexOf("회사")>-1||s.indexOf("야유회")>-1||s.indexOf("워크샵")>-1){
									mtt.setwho_with("회사");
								}else{
									mtt.setwho_with("null");
								}
								
								//숙소
								if(s.indexOf("모텔")>-1||s.indexOf("모탤")>-1){
									mtt.setsleep("모텔");
								}else if(s.indexOf("호텔")>-1||s.indexOf("호탤")>-1){
									mtt.setsleep("호텔");
								}else if(s.indexOf("펜션")>-1||s.indexOf("팬션")>-1){
									mtt.setsleep("펜션");
								}else if(s.indexOf("민박")>-1||s.indexOf("여관")>-1){
									mtt.setsleep("민박");
								}else if(s.indexOf("게스트하우스")>-1||s.indexOf("게하")>-1){
									mtt.setsleep("게스트하우스");
								}else if(s.indexOf("찜질방")>-1||s.indexOf("찜방")>-1){
									mtt.setsleep("찜질방");
								}else if(s.indexOf("콘도")>-1||s.indexOf("리조트")>-1||s.indexOf("리조토")>-1){
									mtt.setsleep("리조트");
								}else{
									mtt.setsleep("null");
								}
								
								//교통수단
								if(s.indexOf("버스")>-1||s.indexOf("빠스")>-1){
									mtt.settransport("버스");
								}else if(s.indexOf("지하철")>-1||s.indexOf("자철")>-1||s.indexOf("전철")>-1||s.indexOf("경춘선")>-1||s.indexOf("호선")>-1){
									mtt.settransport("지하철");
								}else if(s.indexOf("기차")>-1||s.indexOf("ktx")>-1||s.indexOf("무궁화호")>-1||s.indexOf("itx")>-1||s.indexOf("KTX")>-1||s.indexOf("ITX")>-1||s.indexOf("새마을")>-1||s.indexOf("열차")>-1){
									mtt.settransport("기차");
								}else if(s.indexOf("택시")>-1){
									mtt.settransport("택시");
								}else if(s.indexOf("자가용")>-1||s.indexOf("자동차")>-1||s.indexOf("자차")>-1||s.indexOf("차끌고")>-1||s.indexOf("차 끌고")>-1||s.indexOf("차 타고")>-1||s.indexOf("차타고")>-1){
									mtt.settransport("자가용");
								}else if(s.indexOf("바이크")>-1||s.indexOf("자전거")>-1||s.indexOf("오토바이")>-1||s.indexOf("스쿠터")>-1){
									mtt.settransport("바이크");
								}else{
									mtt.settransport("null");
								}
								
								//동반
								if(s.indexOf("혼자")>-1||s.indexOf("혼여")>-1||s.indexOf("혼남")>-1||s.indexOf("나홀로")>-1){
									mtt.setperson("1인");
								}else if(s.indexOf("연인")>-1||s.indexOf("남자친구")>-1 || s.indexOf("남친")>-1||s.indexOf("여자인구")>-1||s.indexOf("여친")>-1||s.indexOf("애인")>-1||s.indexOf("부부")>-1||s.indexOf("남편")>-1||s.indexOf("서방")>-1||s.indexOf("부인")>-1||s.indexOf("와이프")>-1||s.indexOf("커플")>-1||s.indexOf("결혼")>-1||s.indexOf("둘이서")>-1){
									mtt.setperson("2인");
								}else if(s.indexOf("3인")>-1||s.indexOf("3명")>-1||s.indexOf("세명")>-1||s.indexOf("셋이서")>-1||s.indexOf("세 명")>-1||s.indexOf("4인")>-1||s.indexOf("4명")>-1||s.indexOf("네명")>-1||s.indexOf("네 명")>-1||s.indexOf("넷이서")>-1||s.indexOf("네 명")>-1){
									mtt.setperson("3~4인");
								}else if(s.indexOf("5인")>-1||s.indexOf("5명")>-1||s.indexOf("다섯명")>-1||s.indexOf("6인")>-1||s.indexOf("6명")>-1||s.indexOf("6인")>-1||s.indexOf("6명")>-1||s.indexOf("여섯이서")>-1||s.indexOf("단체")>-1||s.indexOf("다섯 명")>-1||s.indexOf("여섯 명")>-1){
									mtt.setperson("5인 이상");
								}else{
									mtt.setperson("null");
								}
								
								if(s.indexOf("10대")>-1||s.indexOf("열살")>-1||s.indexOf("열한살")>-1||s.indexOf("열두살")>-1||s.indexOf("열세살")>-1||s.indexOf("열네살")>-1||s.indexOf("열다섯살")>-1||s.indexOf("열여섯살")>-1||s.indexOf("열일곱살")>-1||s.indexOf("열여덟살")>-1||s.indexOf("열아홉살")>-1||s.indexOf("10살")>-1||s.indexOf("11살")>-1||s.indexOf("12살")>-1||s.indexOf("13살")>-1||s.indexOf("14살")>-1||s.indexOf("15살")>-1||s.indexOf("16살")>-1||s.indexOf("17살")>-1||s.indexOf("18살")>-1||s.indexOf("19살")>-1||s.indexOf("열 살")>-1||s.indexOf("열한 살")>-1||s.indexOf("열두 살")>-1||s.indexOf("열세 살")>-1||s.indexOf("열네 살")>-1||s.indexOf("열다섯 살")>-1||s.indexOf("열여섯 살")>-1||s.indexOf("열일곱 살")>-1||s.indexOf("열여덟 살")>-1||s.indexOf("열아홉 살")>-1){
									mtt.setages("10대");
								}else if(s.indexOf("20대")>-1||s.indexOf("스무살")>-1||s.indexOf("스물한살")>-1||s.indexOf("스물두살")>-1||s.indexOf("스물세살")>-1||s.indexOf("스물네살")>-1||s.indexOf("스물다섯살")>-1||s.indexOf("스물여섯살")>-1||s.indexOf("스물일곱살")>-1||s.indexOf("스물여덟살")>-1||s.indexOf("스물아홉살")>-1||s.indexOf("20살")>-1||s.indexOf("21살")>-1||s.indexOf("22살")>-1||s.indexOf("23살")>-1||s.indexOf("24살")>-1||s.indexOf("25살")>-1||s.indexOf("26살")>-1||s.indexOf("27살")>-1||s.indexOf("28살")>-1||s.indexOf("29살")>-1||s.indexOf("스물살")>-1||s.indexOf("스물한 살")>-1||s.indexOf("스물두 살")>-1||s.indexOf("스물세 살")>-1||s.indexOf("스물네 살")>-1||s.indexOf("스물다섯 살")>-1||s.indexOf("스물여섯 살")>-1||s.indexOf("스물일곱 살")>-1||s.indexOf("스물여덟 살")>-1||s.indexOf("스물아홉 살")>-1){
									mtt.setages("20대");
								}else if(s.indexOf("30대")>-1||s.indexOf("서른살")>-1||s.indexOf("서른한살")>-1||s.indexOf("서른두살")>-1||s.indexOf("서른세살")>-1||s.indexOf("서른네살")>-1||s.indexOf("서른다섯살")>-1||s.indexOf("서른여섯살")>-1||s.indexOf("서른일곱살")>-1||s.indexOf("서른여덟살")>-1||s.indexOf("서른아홉살")>-1||s.indexOf("20살")>-1||s.indexOf("21살")>-1||s.indexOf("22살")>-1||s.indexOf("23살")>-1||s.indexOf("24살")>-1||s.indexOf("25살")>-1||s.indexOf("26살")>-1||s.indexOf("27살")>-1||s.indexOf("28살")>-1||s.indexOf("29살")>-1||s.indexOf("서른살")>-1||s.indexOf("서른한 살")>-1||s.indexOf("서른두 살")>-1||s.indexOf("서른세 살")>-1||s.indexOf("서른네 살")>-1||s.indexOf("서른다섯 살")>-1||s.indexOf("서른여섯 살")>-1||s.indexOf("서른일곱 살")>-1||s.indexOf("서른여덟 살")>-1||s.indexOf("서른아홉 살")>-1){
									mtt.setages("30대");
								}else if(s.indexOf("40대")>-1||s.indexOf("스무살")>-1||s.indexOf("마흔한살")>-1||s.indexOf("마흔두살")>-1||s.indexOf("마흔세살")>-1||s.indexOf("마흔네살")>-1||s.indexOf("마흔다섯살")>-1||s.indexOf("마흔여섯살")>-1||s.indexOf("마흔일곱살")>-1||s.indexOf("마흔여덟살")>-1||s.indexOf("마흔아홉살")>-1||s.indexOf("20살")>-1||s.indexOf("21살")>-1||s.indexOf("22살")>-1||s.indexOf("23살")>-1||s.indexOf("24살")>-1||s.indexOf("25살")>-1||s.indexOf("26살")>-1||s.indexOf("27살")>-1||s.indexOf("28살")>-1||s.indexOf("29살")>-1||s.indexOf("마흔살")>-1||s.indexOf("마흔한 살")>-1||s.indexOf("마흔두 살")>-1||s.indexOf("마흔세 살")>-1||s.indexOf("마흔네 살")>-1||s.indexOf("마흔다섯 살")>-1||s.indexOf("마흔여섯 살")>-1||s.indexOf("마흔일곱 살")>-1||s.indexOf("마흔여덟 살")>-1||s.indexOf("마흔아홉 살")>-1){
									mtt.setages("40대");
								}else if(s.indexOf("50대")>-1||s.indexOf("스무살")>-1||s.indexOf("쉰한살")>-1||s.indexOf("쉰두살")>-1||s.indexOf("쉰세살")>-1||s.indexOf("쉰네살")>-1||s.indexOf("쉰다섯살")>-1||s.indexOf("쉰여섯살")>-1||s.indexOf("쉰일곱살")>-1||s.indexOf("쉰여덟살")>-1||s.indexOf("쉰아홉살")>-1||s.indexOf("20살")>-1||s.indexOf("21살")>-1||s.indexOf("22살")>-1||s.indexOf("23살")>-1||s.indexOf("24살")>-1||s.indexOf("25살")>-1||s.indexOf("26살")>-1||s.indexOf("27살")>-1||s.indexOf("28살")>-1||s.indexOf("29살")>-1||s.indexOf("쉰살")>-1||s.indexOf("쉰한 살")>-1||s.indexOf("쉰두 살")>-1||s.indexOf("쉰세 살")>-1||s.indexOf("쉰네 살")>-1||s.indexOf("쉰다섯 살")>-1||s.indexOf("쉰여섯 살")>-1||s.indexOf("쉰일곱 살")>-1||s.indexOf("쉰여덟 살")>-1||s.indexOf("쉰아홉 살")>-1){
									mtt.setages("50대 이상");
								}else{
									mtt.setages("null");
								}
								
								/*==================================================================================================================
								 * 
								 * 자 여기는 
								 *==================================================================================================================*/
								int index;
								if((index = s.indexOf("백숙"))>-1||(index =s.indexOf("찌개"))>-1||(index =s.indexOf("찌게"))>-1||(index =s.indexOf("생선구이"))>-1||
										(index =s.indexOf("갈치 구이"))>-1||	(index =s.indexOf("조림"))>-1||(index =s.indexOf("게장"))>-1||(index =s.indexOf("편육"))>-1||
										(index =s.indexOf("국수"))>-1||(index =s.indexOf("게장"))>-1||(index =s.indexOf("곰탕"))>-1||(index =s.indexOf("무국"))>-1||
										(index =s.indexOf("국수"))>-1||(index =s.indexOf("국밥"))>-1||(index =s.indexOf("곱창"))>-1||(index =s.indexOf("떡국"))>-1||
										(index =s.indexOf("덮밥"))>-1||(index =s.indexOf("김치"))>-1||(index =s.indexOf("굴비"))>-1||(index =s.indexOf("젓갈"))>-1||
										(index =s.indexOf("식혜"))>-1||(index =s.indexOf("식해"))>-1||(index =s.indexOf("절편"))>-1||(index =s.indexOf("족발"))>-1||
										(index =s.indexOf("쫄명"))>-1||(index =s.indexOf("잡채"))>-1||(index =s.indexOf("무침"))>-1||(index =s.indexOf("숭늉"))>-1||
										(index =s.indexOf("찜닭"))>-1||(index =s.indexOf("파전"))>-1) {
									mtt.setfood("한식");
									String sub_str = s.substring(index, index+2);
									mtt.setdetailfood(sub_str);
									
								}else if((index =s.indexOf("고등어 구이"))>-1||(index =s.indexOf("고등어구이"))>-1||(index =s.indexOf("감자탕"))>-1||(index =s.indexOf("감자전"))>-1
										||(index =s.indexOf("갈비탕"))>-1||(index =s.indexOf("갈비찜"))>-1||(index =s.indexOf("해물찜"))>-1||(index =s.indexOf("호박죽"))>-1
										||(index =s.indexOf("계란찜"))>-1||(index =s.indexOf("추어창"))>-1||(index =s.indexOf("호박전"))>-1||(index =s.indexOf("청국장"))>-1
										||(index =s.indexOf("감자전"))>-1||(index =s.indexOf("짱아치"))>-1||(index =s.indexOf("인절미"))>-1||(index =s.indexOf("전복죽"))>-1
										||(index =s.indexOf("육개장"))>-1||(index =s.indexOf("닭갈비"))>-1||(index =s.indexOf("장조림"))>-1||(index =s.indexOf("새우장"))>-1
										||(index =s.indexOf("삼계탕"))>-1||(index =s.indexOf("아구찜"))>-1||(index =s.indexOf("아귀찜"))>-1||(index =s.indexOf("빈대떡"))>-1
										||(index =s.indexOf("설렁탕"))>-1||(index =s.indexOf("순두부"))>-1||(index =s.indexOf("낙지젓"))>-1||(index =s.indexOf("창란젓"))>-1
										||(index =s.indexOf("수제비"))>-1||(index =s.indexOf("수제비"))>-1||(index =s.indexOf("미역국"))>-1||(index =s.indexOf("매운탕"))>-1
										||(index =s.indexOf("메밀묵"))>-1||(index =s.indexOf("순댓국"))>-1||(index =s.indexOf("비빔밥"))>-1||(index =s.indexOf("순대국"))>-1
										||(index =s.indexOf("보신탕"))>-1||(index =s.indexOf("명란젓"))>-1||(index =s.indexOf("닭갈비"))>-1||(index =s.indexOf("빈대떡"))>-1
										||(index =s.indexOf("볶음밥"))>-1||(index =s.indexOf("보리밥"))>-1||(index =s.indexOf("현미밥"))>-1||(index =s.indexOf("과메기"))>-1
										||(index =s.indexOf("겉절이"))>-1){
											mtt.setfood("한식");
											String sub_str = s.substring(index, index+3);
											mtt.setdetailfood(sub_str);									
								}else if((index =s.indexOf("한국 음식"))>-1||(index =s.indexOf("한국요리"))>-1||(index =s.indexOf("도토리묵"))>-1||(index =s.indexOf("어리굴젓"))>-1
										||(index =s.indexOf("떡만두국"))>-1||(index =s.indexOf("시래기국"))>-1||(index =s.indexOf("생선 구이"))>-1||(index =s.indexOf("가락국수"))>-1
										||(index =s.indexOf("떡만둣국"))>-1||(index =s.indexOf("곤드레밥"))>-1||(index =s.indexOf("소고기국"))>-1||(index =s.indexOf("두루치기"))>-1
										||(index =s.indexOf("오징어젓"))>-1){
									mtt.setfood("한식");
									String sub_str = s.substring(index, index+4);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("떡"))>-1){
									mtt.setfood("한식");
									String sub_str = s.substring(index, index+1);
									mtt.setdetailfood(sub_str);
								}
								else if((index =s.indexOf("꽃빵"))>-1||(index =s.indexOf("중식"))>-1||(index =s.indexOf("중국"))>-1||(index =s.indexOf("짜장"))>-1||
										(index =s.indexOf("짬뽕"))>-1||(index =s.indexOf("짱깨"))>-1||(index =s.indexOf("춘장"))>-1||(index =s.indexOf("딤섬"))>-1) {
									mtt.setfood("중식");
									String sub_str = s.substring(index, index+2);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("라조기"))>-1||(index =s.indexOf("취두부"))>-1||(index =s.indexOf("딴딴면"))>-1||(index =s.indexOf("탕수육"))>-1||
										(index =s.indexOf("양꼬치"))>-1||(index =s.indexOf("유린기"))>-1||(index =s.indexOf("자장명"))>-1||(index =s.indexOf("불도장"))>-1||
										(index =s.indexOf("이금기"))>-1||(index =s.indexOf("짜장면"))>-1||(index =s.indexOf("동파육"))>-1||(index =s.indexOf("깐풍기"))>-1||
										(index =s.indexOf("군만두"))>-1||(index =s.indexOf("양장피"))>-1){
									mtt.setfood("중식");
									String sub_str = s.substring(index, index+3);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("난자완스"))>-1||(index =s.indexOf("북경오리"))>-1||(index =s.indexOf("마파두부"))>-1||(index =s.indexOf("꿔바로우"))>-1||
										(index =s.indexOf("북경 오리"))>-1||(index =s.indexOf("고추잡채"))>-1||(index =s.indexOf("깐쇼새우"))>-1||(index =s.indexOf("중국음식"))>-1){
									mtt.setfood("중식");
									String sub_str = s.substring(index, index+4);
									mtt.setdetailfood(sub_str);
								}
								else if((index =s.indexOf("양식"))>-1||(index =s.indexOf("펜네"))>-1||(index =s.indexOf("파스타"))>-1||(index =s.indexOf("피자"))>-1||
										(index =s.indexOf("나초"))>-1||(index =s.indexOf("스프"))>-1||(index =s.indexOf("라자냐"))>-1||(index =s.indexOf("케밥"))>-1||
										(index =s.indexOf("나쵸"))>-1||(index =s.indexOf("수푸"))>-1||(index =s.indexOf("타코"))>-1||(index =s.indexOf("팬네"))>-1	){
										mtt.setfood("양식");
										String sub_str = s.substring(index, index+2);
										mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("멕시코요리"))>-1||(index =s.indexOf("프랑스 요리"))>-1||(index =s.indexOf("이태리요리"))>-1||(index =s.indexOf("프랑스요리"))>-1||
										(index =s.indexOf("이태리 요리"))>-1||(index =s.indexOf("리조또"))>-1||(index =s.indexOf("미트볼"))>-1||(index =s.indexOf("샐러드"))>-1||
										(index =s.indexOf("부리또"))>-1||(index =s.indexOf("소시지"))>-1||(index =s.indexOf("알리오 올리오"))>-1||(index =s.indexOf("알리오올리오"))>-1||
										(index =s.indexOf("파르페"))>-1||(index =s.indexOf("치폴레"))>-1||(index =s.indexOf("셀러드"))>-1||(index =s.indexOf("수플리"))>-1||
										(index =s.indexOf("케이준"))>-1||(index =s.indexOf("소세지"))>-1||(index =s.indexOf("멕시코 요리"))>-1){
									mtt.setfood("양식");
									String sub_str = s.substring(index, index+3);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("이탈리아 요리"))>-1||(index =s.indexOf("이탈리아요리"))>-1||(index =s.indexOf("이탈리아 요리"))>-1||(index =s.indexOf("치아바타"))>-1||
										(index =s.indexOf("마카로니"))>-1||(index =s.indexOf("라비올리"))>-1||(index =s.indexOf("카프레제"))>-1||(index =s.indexOf("스파게티"))>-1){
									mtt.setfood("양식");
									String sub_str = s.substring(index, index+4);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("까르보나라"))>-1||(index =s.indexOf("까르보나라"))>-1){
									mtt.setfood("양식");
									String sub_str = s.substring(index, index+5);
									mtt.setdetailfood(sub_str);
								}
								else if((index =s.indexOf("일식"))>-1||(index =s.indexOf("라멘"))>-1||(index =s.indexOf("초밥"))>-1||(index =s.indexOf("우동"))>-1||
										(index =s.indexOf("회"))>-1||(index =s.indexOf("낫토"))>-1||(index =s.indexOf("모밀"))>-1||(index =s.indexOf("메밀"))>-1||
										(index =s.indexOf("오뎅"))>-1||(index =s.indexOf("규동"))>-1){
									mtt.setfood("일식");
									String sub_str = s.substring(index, index+2);
									mtt.setdetailfood(sub_str);
									}
								else if((index =s.indexOf("고로케"))>-1||(index =s.indexOf("가츠동"))>-1||(index =s.indexOf("사시미"))>-1||(index =s.indexOf("돈부리"))>-1||
										(index =s.indexOf("덴뿌라"))>-1){
									mtt.setfood("일식");
									String sub_str = s.substring(index, index+3);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("고추냉이"))>-1||(index =s.indexOf("타코야끼"))>-1||(index =s.indexOf("야키소바"))>-1||(index =s.indexOf("타코야기"))>-1||
										(index =s.indexOf("스키야키"))>-1||(index =s.indexOf("오차즈케"))>-1||(index =s.indexOf("타코야키"))>-1||(index =s.indexOf("부타나베"))>-1||
										(index =s.indexOf("나가사키"))>-1||(index =s.indexOf("우메보시"))>-1||(index =s.indexOf("후리가케"))>-1){
									mtt.setfood("일식");
									String sub_str = s.substring(index, index+4);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("하이라이스"))>-1||(index =s.indexOf("가쓰오부시"))>-1||(index =s.indexOf("오므라이스"))>-1){
									mtt.setfood("일식");
									String sub_str = s.substring(index, index+5);
									mtt.setdetailfood(sub_str);
								}
								else if((index =s.indexOf("오코노미야키"))>-1||(index =s.indexOf("오코노미야끼"))>-1){
									mtt.setfood("일식");
									String sub_str = s.substring(index, index+6);
									mtt.setdetailfood(sub_str);
								}
								else if((index =s.indexOf("뷔페"))>-1||(index =s.indexOf("부페"))>-1){
									mtt.setfood("뷔페");
									String sub_str = s.substring(index, index+2);
									mtt.setdetailfood(sub_str);
								}
								else if((index =s.indexOf("치킨"))>-1||(index =s.indexOf("쉑쉑"))>-1||(index =s.indexOf("피자"))>-1){
									mtt.setfood("패스트푸드");
									String sub_str = s.substring(index, index+2);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("페스트푸드"))>-1||(index =s.indexOf("패스트푸드"))>-1||(index =s.indexOf("페스트 푸드"))>-1||(index =s.indexOf("패스트 푸드"))>-1){
									mtt.setfood("패스트푸드");
									String sub_str = s.substring(index, index+5);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("햄버거"))>-1||(index =s.indexOf("닭강정"))>-1){
									mtt.setfood("패스트푸드");
									String sub_str = s.substring(index, index+3);
									mtt.setdetailfood(sub_str);
								}
								else if((index =s.indexOf("분식"))>-1||(index =s.indexOf("김밥"))>-1||(index =s.indexOf("순대"))>-1||
										(index =s.indexOf("튀김"))>-1||(index =s.indexOf("만두"))>-1||(index =s.indexOf("라면"))>-1){
									mtt.setfood("분식");
									String sub_str = s.substring(index, index+2);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("떡볶이"))>-1||(index =s.indexOf("떡튀순"))>-1){
									mtt.setfood("분식");
									String sub_str = s.substring(index, index+3);
									mtt.setdetailfood(sub_str);
								}
								else if((index =s.indexOf("주점"))>-1||(index =s.indexOf("소주"))>-1||(index =s.indexOf("양주"))>-1||(index =s.indexOf("꼬냑"))>-1||
										(index =s.indexOf("술집"))>-1||(index =s.indexOf("맥주"))>-1||(index =s.indexOf("럼"))>-1||(index =s.indexOf("탁주"))>-1||
										(index =s.indexOf("청주"))>-1||(index =s.indexOf("와인"))>-1||(index =s.indexOf("약주"))>-1){
									mtt.setfood("주류");
									String sub_str = s.substring(index, index+2);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("막걸리"))>-1||(index =s.indexOf("막거리"))>-1||(index =s.indexOf("브랜디"))>-1||(index =s.indexOf("고량주"))>-1||
										(index =s.indexOf("위스키"))>-1||(index =s.indexOf("데낄라"))>-1||(index =s.indexOf("포도주"))>-1||(index =s.indexOf("보드카"))>-1||
										(index =s.indexOf("데킬라"))>-1||(index =s.indexOf("바카디"))>-1||(index =s.indexOf("담금주"))>-1||(index =s.indexOf("전통주"))>-1||
										(index =s.indexOf("칵테일"))>-1||(index =s.indexOf("중국술"))>-1||(index =s.indexOf("샴페인"))>-1){
									mtt.setfood("주류");
									String sub_str = s.substring(index, index+3);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("이과두주"))>-1){
									mtt.setfood("주류");
									String sub_str = s.substring(index, index+4);
									mtt.setdetailfood(sub_str);
								}
								else if((index =s.indexOf("카페"))>-1||(index =s.indexOf("커피"))>-1||(index =s.indexOf("와플"))>-1||(index =s.indexOf("라떼"))>-1||
										(index =s.indexOf("전병"))>-1||(index =s.indexOf("도넛"))>-1||(index =s.indexOf("케잌"))>-1||(index =s.indexOf("케익"))>-1||
										(index =s.indexOf("월병"))>-1||(index =s.indexOf("쿠키"))>-1||(index =s.indexOf("파이"))>-1){
									mtt.setfood("디저트");
									String sub_str = s.substring(index, index+2);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("마카롱"))>-1||(index =s.indexOf("타르트"))>-1||(index =s.indexOf("프레첼"))>-1||(index =s.indexOf("프레즐"))>-1||
										(index =s.indexOf("도너츠"))>-1||(index =s.indexOf("단팥빵"))>-1||(index =s.indexOf("오믈렛"))>-1||(index =s.indexOf("카나페"))>-1||
										(index =s.indexOf("또띠야"))>-1||(index =s.indexOf("베이글"))>-1||(index =s.indexOf("바게트"))>-1||(index =s.indexOf("소보로"))>-1||
										(index =s.indexOf("마들렌"))>-1||(index =s.indexOf("비엔나"))>-1||(index =s.indexOf("또띠아"))>-1){
									mtt.setfood("디저트");
									String sub_str = s.substring(index, index+3);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("베이커리"))>-1||(index =s.indexOf("마끼아또"))>-1||(index =s.indexOf("델리만주"))>-1||(index =s.indexOf("카스텔라"))>-1||
										(index =s.indexOf("카스테라"))>-1||(index =s.indexOf("델리만쥬"))>-1||(index =s.indexOf("호두과자"))>-1||(index =s.indexOf("토르티야"))>-1||
										(index =s.indexOf("샌드위치"))>-1||(index =s.indexOf("크루아상"))>-1){
									mtt.setfood("디저트");
									String sub_str = s.substring(index, index+4);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("아메리카노"))>-1||(index =s.indexOf("마스카포네"))>-1){
									mtt.setfood("디저트");
									String sub_str = s.substring(index, index+5);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("빵"))>-1){
									mtt.setfood("디저트");
									String sub_str = s.substring(index, index+1);
									mtt.setdetailfood(sub_str);
								}
								else if((index =s.indexOf("태국음식"))>-1||(index =s.indexOf("태국 음식"))>-1||(index =s.indexOf("강황"))>-1||(index =s.indexOf("카레"))>-1||
										(index =s.indexOf("똥양"))>-1||(index =s.indexOf("똠얌"))>-1||(index =s.indexOf("인도요리"))>-1||(index =s.indexOf("태국 요리"))>-1||
										(index =s.indexOf("태국요리"))>-1||(index =s.indexOf("커리"))>-1||(index =s.indexOf("인도 요리"))>-1){
									mtt.setfood("아시안푸드");
									String sub_str = s.substring(index, index+2);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("아시안푸드"))>-1||(index =s.indexOf("베트남 음식"))>-1||(index =s.indexOf("얌운쎈"))>-1||(index =s.indexOf("팟타이"))>-1||
										(index =s.indexOf("탄두리"))>-1||(index =s.indexOf("쌀국수"))>-1||(index =s.indexOf("베트남요리"))>-1||(index =s.indexOf("월남쌈"))>-1||
										(index =s.indexOf("베트남음식"))>-1||(index =s.indexOf("팟씨유"))>-1||(index =s.indexOf("베트남 요리"))>-1){
									mtt.setfood("아시안푸드");
									String sub_str = s.substring(index, index+3);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("인도네시아 요리"))>-1||(index =s.indexOf("인도네시아요리"))>-1){
									mtt.setfood("아시안푸드");
									String sub_str = s.substring(index, index+5);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("나시고랭"))>-1){
									mtt.setfood("아시안푸드");
									String sub_str = s.substring(index, index+4);
									mtt.setdetailfood(sub_str);
								}
								else if((index =s.indexOf("치마살"))>-1||(index =s.indexOf("안창살"))>-1||(index =s.indexOf("꼬들살"))>-1||(index =s.indexOf("살치살"))>-1||
										(index =s.indexOf("삼겹살"))>-1||(index =s.indexOf("꽃등심"))>-1||(index =s.indexOf("소고기"))>-1||(index =s.indexOf("채끝살"))>-1||
										(index =s.indexOf("토시살"))>-1||(index =s.indexOf("항정살"))>-1||(index =s.indexOf("부채살"))>-1||(index =s.indexOf("낙엽살"))>-1||
										(index =s.indexOf("치마살"))>-1){
									mtt.setfood("바베큐/고기");
									String sub_str = s.substring(index, index+3);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("등심"))>-1||(index =s.indexOf("안심"))>-1||(index =s.indexOf("목살"))>-1||(index =s.indexOf("갈비"))>-1||
										(index =s.indexOf("사태"))>-1||(index =s.indexOf("꽃살"))>-1||(index =s.indexOf("고기"))>-1){
									mtt.setfood("바베큐/고기");
									String sub_str = s.substring(index, index+2);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("차돌박이"))>-1||(index =s.indexOf("토시 살"))>-1||(index =s.indexOf("안창 살"))>-1||(index =s.indexOf("돼지고기"))>-1||
										(index =s.indexOf("뒷다리살"))>-1||(index =s.indexOf("제비추리"))>-1||(index =s.indexOf("차돌박이"))>-1||(index =s.indexOf("갈매기살"))>-1||
										(index =s.indexOf("앞다리살"))>-1||(index =s.indexOf("채끝 살"))>-1||(index =s.indexOf("부채 살"))>-1||(index =s.indexOf("치마 살"))>-1){
									mtt.setfood("바베큐/고기");
									String sub_str = s.substring(index, index+4);
									mtt.setdetailfood(sub_str);
								}else if((index =s.indexOf("가브리 살"))>-1||(index =s.indexOf("앞다리 살"))>-1||(index =s.indexOf("뒷다리 살"))>-1||(index =s.indexOf("돼지 고기"))>-1||
										(index =s.indexOf("가브리 살"))>-1){
									mtt.setfood("바베큐/고기");
									String sub_str = s.substring(index, index+5);
									mtt.setdetailfood(sub_str);
								}
								else {
									mtt.setfood("null");
									mtt.setdetailfood("null");
								}
								
								/////////////////////두번째 파트는 어디인지 찾기!!
								if((index =s.indexOf("등산"))>-1||(index =s.indexOf("산행"))>-1||(index =s.indexOf("산악"))>-1){
									mtt.setspot("산");
									/*String sub_str = s.substring(index, index+2);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("온천"))>-1||(index =s.indexOf("스파"))>-1){
									mtt.setspot("온천");
									/*String sub_str = s.substring(index, index+2);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("해수욕장"))>-1||(index =s.indexOf("모래사장"))>-1){
									mtt.setspot("해수욕장");
									/*String sub_str = s.substring(index, index+4);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}else if((index =s.indexOf("백사장"))>-1||(index =s.indexOf("바다"))>-1){
									mtt.setspot("해수욕장");
									/*String sub_str = s.substring(index, index+3);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("수영장"))>-1||(index =s.indexOf("수영"))>-1){
									mtt.setspot("수영장");
									/*String sub_str = s.substring(index, index+2);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("계곡"))>-1){
									mtt.setspot("계곡");
									/*String sub_str = s.substring(index, index+2);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}else if((index =s.indexOf("물놀이"))>-1){
									mtt.setspot("계곡");
									/*String sub_str = s.substring(index, index+3);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("골프"))>-1){
									mtt.setspot("골프장");
									/*String sub_str = s.substring(index, index+2);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("스키장"))>-1||(index =s.indexOf("스키"))>-1||(index =s.indexOf("보드"))>-1){
									mtt.setspot("스키장");
									/*String sub_str = s.substring(index, index+2);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("유적지"))>-1||(index =s.indexOf("유적"))>-1||(index =s.indexOf("왕릉"))>-1||(index =s.indexOf("동굴"))>-1){
									mtt.setspot("유적지");
									/*String sub_str = s.substring(index, index+2);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("유원지"))>-1){
									mtt.setspot("유원지");
									/*String sub_str = s.substring(index, index+3);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("전시회"))>-1||(index =s.indexOf("박람회"))>-1||(index =s.indexOf("박물관"))>-1||(index =s.indexOf("미술관"))>-1||(index =s.indexOf("체험관"))>-1){
									mtt.setspot("전시회");
									/*String sub_str = s.substring(index, index+3);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("한옥마을"))>-1){
									mtt.setspot("한옥마을");
									/*String sub_str = s.substring(index, index+4);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("놀이공원"))>-1||(index =s.indexOf("에버랜드"))>-1||(index =s.indexOf("테마파크"))>-1){
									mtt.setspot("테마파크");
									/*String sub_str = s.substring(index, index+4);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}else if((index =s.indexOf("아쿠아리움"))>-1){
									mtt.setspot("테마파크");
									/*String sub_str = s.substring(index, index+5);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("공원"))>-1||(index =s.indexOf("파크"))>-1){
									mtt.setspot("공원");
									/*String sub_str = s.substring(index, index+2);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}else if((index =s.indexOf("수목원"))>-1){
									mtt.setspot("공원");
									/*String sub_str = s.substring(index, index+3);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("전통시장"))>-1){
									mtt.setspot("전통시장");
									/*String sub_str = s.substring(index, index+4);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}else if((index =s.indexOf("시장"))>-1){
									mtt.setspot("전통시장");
									/*String sub_str = s.substring(index, index+2);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("음식점"))>-1||(index =s.indexOf("먹거리"))>-1){
									mtt.setspot("음식점/카페");
									/*String sub_str = s.substring(index, index+3);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}else if((index =s.indexOf("식당"))>-1||(index =s.indexOf("맛집"))>-1||(index =s.indexOf("카페"))>-1){
									mtt.setspot("음식점/카페");
									/*String sub_str = s.substring(index, index+2);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("민박"))>-1||(index =s.indexOf("팬션"))>-1||(index =s.indexOf("모텔"))>-1||(index =s.indexOf("호텔"))>-1||
										(index =s.indexOf("콘도"))>-1||(index =s.indexOf("여관"))>-1||(index =s.indexOf("펜션"))>-1||(index =s.indexOf("모탤"))>-1||
										(index =s.indexOf("찜방"))>-1||(index =s.indexOf("호탤"))>-1||(index =s.indexOf("게하"))>-1){
									mtt.setspot("숙박시설");
									/*String sub_str = s.substring(index, index+2);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}else if((index =s.indexOf("리조트"))>-1||(index =s.indexOf("찜질방"))>-1||(index =s.indexOf("게스트하우스"))>-1){
									mtt.setspot("숙박시설");
									/*String sub_str = s.substring(index, index+3);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str2[sub_str2.length-1]);*/
								}
								else if((index =s.indexOf("아울렛"))>-1||(index =s.indexOf("백화점"))>-1){
									mtt.setspot("아울렛/쇼핑");
									/*String sub_str = s.substring(index, index+3);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str+" "+sub_str2[sub_str2.length-1]);*/
								}else if((index =s.indexOf("쇼핑"))>-1){
									mtt.setspot("아울렛/쇼핑");
									/*String sub_str = s.substring(index, index+2);
									
									String sub_str2[] = s.substring(0, index).split(" ");
									mtt.setdetailspot(sub_str+" "+sub_str2[sub_str2.length-1]);*/
								}
								else {
									mtt.setspot("null");
									mtt.setdetailspot("null");
								}
								
								
								//////////////////////////////
								mtt.save_text();
								mtt.clear();
								//wait(0);
							}else{
								String title_txt[] = s.split(", ");
								//System.out.println("제목 : " + title_txt[0]);
								//System.out.println("작성자 : " + title_txt[1].replace("\"", ""));
								String userid = title_txt[1].replace("\"", "");
								mtt.setid(userid.replace(" ", ""));
								//mtt.getid();
								//System.out.println("날짜 : " + title_txt[2].replace("\"", ""));
								/*String usertime = title_txt[2].replace("\"", "");
								String wrtime = usertime.substring(0, 11);
								mtt.setwhen_write(wrtime);*/
								//String part[] = title_txt[2].replace("\"", "").split(" ");
								//mtt.setwhen_write(part[1]);
								mtt.setwhen_write(title_txt[2].replace("\"", ""));
								//mtt.getcity();
								//mtt.gettema();
								
							}
							
						}
					
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("파일 리딩 에러");
					} catch(IOException e){
						e.printStackTrace();
					}
					
					
					
				}else if(file.isDirectory()){
					System.out.println("디렉토리 이름 = "+file.getName());
					//서브디렉토리가 존재하면 재귀적 방법으로 다시 탐색
					//subDirList(file.getCanonicalPath().toString());
				}
			}
		}catch(/*IO*/Exception e){
			System.out.println("폴더 리딩 에러!!");
		}
	}

	/**
	 * @return
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		All_practice sdf = new All_practice();
		String source = "C:\\Users\\qewqs\\Desktop\\crowling\\";
		sdf.subDirList(source);
		
		
	}

}
//////////////////////////////////////////////////////////////////////////