package Task1;

import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;

public class Roles {//����� "����", ������������ ����� ������������ � ��������������
private String Name;
private String login; 
private String password;

public Roles(){
}
public String search(String s1, String s2) throws Exception { // ������� ������ � �������� ������
	//������������ ����� C:\Users\Pc\eclipse-workspace\
	String s3="", sc1="",sc2="";
	boolean bol=false;
	   FileReader fr = new FileReader( "Password.txt" );
	   Scanner scan2 = new Scanner(fr);
	   while (bol==false&&scan2.hasNextLine()) {
		   s3 = scan2.nextLine();
		   sc1 = scan2.nextLine();
		   sc2 = scan2.nextLine();
		   scan2.nextLine();
		   if(s1.hashCode()==Integer.parseInt(sc1)&&s2.hashCode()==Integer.parseInt(sc2)) {
			   bol=true;
			   System.out.println("�� ������� ����������������!");
		   }
	   }
	   if(bol==false) {
		   System.out.println("������! ����� ��� ������ �� �������!");
		   s3="0";
	   }
	   scan2.close();
	   return s3;
}
//� Java hashCode() ���������� �������� ���-���� ��� ������� �������.
public void  registration(String s1,String s2,String s3) throws Exception { //������� ������ ������ ������������
	FileWriter nFile = new FileWriter("Password.txt", true); //�������� true ��������� �� ��,
	//��� ���� ����� ���������������
    nFile.write(System.lineSeparator()+"2645995"+System.lineSeparator());
    nFile.write(s1.hashCode()+System.lineSeparator());
    nFile.write(s2.hashCode()+System.lineSeparator());
    nFile.write(s3);
    nFile.close();
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
}


