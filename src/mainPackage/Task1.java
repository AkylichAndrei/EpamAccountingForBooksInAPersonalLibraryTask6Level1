package mainPackage;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import javax.mail.Message;

import Task1.Roles;
import Task1.Books;

//������� 1: ������� ���������� ���������� ����� ���� � �������� ����������.
//����� ���������� � �������:
//� ������� ��������� ����� ��� � �����������, ��� � � �������� ��������.
//� ������������ ����: ������������, �������������.
//� ������������ ����� ������������� ����� � �������� ����, ������������ ����� ���� � ��������.
//� ������������� ����� �������������� �������.
//� *��� ���������� �������� ����� � ������� ���������� � ��� ����������� �� e-mail ���� �������������
//� ***������������ ����� ���������� �������� ����� � ����������, �������� � �������������� �� e-mail.
//� ������� ���� �������� � ��������� �����.
//� ������ �������������� ������������� �������� � ��������� �����. ������ �� �������� � �������� ����

//											������� �����!!!!!!!!!!!!!
//===========������ ������� � ������ �������������� (�����:Admin ������:1111)====================
//===========������ ������� � ������ ������������ (�����:User ������:2222)====================
public class Task1 {

	public static void main(String[] args) throws Exception {//���������� ����� (������������ ������� �����)
		   List<Books> books = new ArrayList<>(); // �������� ������
		   FileReader fr = new FileReader( "Books.txt" ); //��������� ���� � �������
		   Scanner scan3 = new Scanner(fr);
		   //�������� ������ �������
		   while (scan3.hasNextLine()) {
	           Books objBooks = new Books(scan3.nextLine(), scan3.nextLine(), scan3.nextLine(),
	           		Integer.parseInt(scan3.nextLine()), scan3.nextLine(), scan3.nextLine(), scan3.nextLine());
	           books.add(objBooks);
	      }
		   scan3.close();
	      fr.close();
		Roles R1 = new Roles();
		Books R2 = new Books();
		Scanner scan = new Scanner(System.in);
		String s ="",s1="",s2="",s3="",s4="",s5="",s6="",s7="",pas="",ss="",x2="";
		boolean bol=false; 
		int x = 0;
		while (!"0".equals(s)){
		System.out.println("�� ����� � ����� ���� � �������� ����������");
		System.out.println("����� ����������!");
		System.out.println("1. ��� �������� ������� ������ ������� ==> 1");
        System.out.println("2. ���� ������ ��������������� ��� ������������ ������� ==> 2");
        System.out.println("3. ��� ������ ������� ==> 0");
        ss="9";
        s = scan.next();
        try {
            x = Integer.parseInt(s);
        } catch (NumberFormatException e){
            System.out.println("�������� ����");
        }
        switch (x){
        case 1:	
            // ����� ������ 1
        	System.out.println("===== ������ ����� ���� 1 =====");
        	System.out.println("������� ��� ������������:");
         	s1=scan.next();
        	scan.nextLine();
        	System.out.println("������� ������:");
        	s2=scan.nextLine();
        	System.out.println("������� Email:");
        	s3=scan.nextLine();
        	R1.registration(s1, s2, s3);
        	System.out.println("������� ������ ������� �������!");
            break;
        case 2:
            // ����� ������ 2
        	System.out.println("===== ������ ����� ���� 2 =====");
        	System.out.println("������� ��� ������������:");
        	s1=scan.next();
        	scan.nextLine();
        	System.out.println("������� ������:");
         	s2=scan.nextLine();
            pas=R1.search(s1,s2);
            if(Integer.parseInt(pas)==146731693)	
            {
            	System.out.println("����� �������: ������������� ");
            	while (!"0".equals(ss)){
            		System.out.println("1. ��� ��������� �������� ������� ==> 1");
                    System.out.println("2. ��� ������ ������� ==> 2");
                    System.out.println("3. ��� �� �������� ����� � ������� ������� ==> 3");
                    System.out.println("4. ��� �� ������� ����� ������� ==> 4");
                    System.out.println("5. ��� ������ ������� ==> 0");
                    ss = scan.next();
                    try {
                        x = Integer.parseInt(ss);
                    } catch (NumberFormatException e){
                        System.out.println("�������� ����");
                    }
                    switch (x){
                    case 1:	
                        // ����� ������ 1
                    	System.out.println("===== ������ ����� ���� 1 =====");
                     	for (Books u : books) {
                   	    	System.out.println(u);
                   	    }
                        break;
                    case 2:
                        // ����� ������ 2
                    	System.out.println("===== ������ ����� ���� 2 =====");
                    	System.out.println("������� �������� ����� ��� ������: ");
                    	scan.nextLine();
                    	x2=scan.nextLine();
                    	for (Books u : books) 
                    		if(u.search(x2)=="1") {
                    		System.out.println("�� ������ ������� ������� �����");
                   	    	System.out.println(u);
                   	    	bol=true;
                    		}
                   	    if(bol==false)
                   	    	System.out.println("� ��������� �� ������ ������� ����� �� �������!");
                        break;
                    case 3:
                        // ����� ������ 3
                    	System.out.println("===== ������ ����� ���� 3 =====");
                    	System.out.println("������� �������� �����:");
                    	s1=scan.next();
                    	scan.nextLine();
                    	System.out.println("������� ������:");
                     	s2=scan.nextLine();
                     	System.out.println("������� ������ �����:");
                     	s3=scan.nextLine();
                     	System.out.println("������� ��� ��������:");
                     	s4=scan.nextLine();
                     	System.out.println("������� ����:");
                     	s5=scan.nextLine();
                     	System.out.println("������� ��������:");
                     	s6=scan.nextLine();
                     	System.out.println("������� ������������ ����� ��� ����������� �����:");
                     	s7=scan.nextLine();
                        //R2.add(s1,s2,s3,s4,s5,s6,s7);
                        //������� ����� � ������
                        Books objBooks = new Books(s1, s2, s3, Integer.parseInt(s4),s5,s6, s7);
        	            books.add(objBooks);
                        
        	          //������� ����
               	    	R2.delFile();
        	            for (Books u2 : books) 
                  	    	 R2.add(u2.getName(),u2.getAuthor(),u2.getFormat(),Integer.toString(u2.getYear()),
                  	    			 u2.getGenre(),u2.getDescription(),u2.getLocation());
                        break;
                    case 4:
                        // ����� ������ 4
                    	System.out.println("===== ������ ����� ���� 4 =====");
                    	System.out.println("������� �������� �����:");
                    	bol=false;
                    	scan.nextLine();
                    	s1=scan.nextLine();
                    	for (Books u : books) 
                    		if(u.search(s1)=="1") {
                   	    	bol=true;
                   	    	books.remove(u);
                   	    	System.out.println("����� ������� �������!");	
                   	    	//������� ����
                   	    	R2.delFile();
                   	    	//����������� ����
                   	    	for (Books u2 : books) 
                   	    	 R2.add(u2.getName(),u2.getAuthor(),u2.getFormat(),Integer.toString(u2.getYear()),
                   	    			 u2.getGenre(),u2.getDescription(),u2.getLocation());
                   	    	break;
                    		}
                   	    if(bol==false)
                   	    	System.out.println("� ��������� ����� �� ������ ������� �� �������!");
                    	
                        break;
                    }
            		}	
            }
            if(Integer.parseInt(pas)==2645995) {
            	System.out.println("����� �������: ������������ ");
            	while (!"0".equals(ss)){
            		System.out.println("1. ��� ��������� �������� ������� ==> 1");
                    System.out.println("2. ��� ������ ������� ==> 2");
                    System.out.println("3. ��� �� ���������� �������� ����� � ������� ������� ==> 3");
                    System.out.println("4. ��� ������ ������� ==> 0");
                    ss = scan.next();
                    try {
                        x = Integer.parseInt(ss);
                    } catch (NumberFormatException e){
                        System.out.println("�������� ����");
                    }
                    switch (x){
                    case 1:	
                        // ����� ������ 1
                    	System.out.println("===== ������ ����� ���� 1 =====");
                     	for (Books u : books) {
                   	    	System.out.println(u);
                   	    }
                        break;
                    case 2:
                        // ����� ������ 2
                    	System.out.println("===== ������ ����� ���� 2 =====");
                    	System.out.println("������� �������� ����� ��� ������: ");
                    	scan.nextLine();
                    	x2=scan.nextLine();
                    	for (Books u : books) 
                    		if(u.search(x2)=="1") {
                    		System.out.println("�� ������ ������� ������� �����");
                   	    	System.out.println(u);
                   	    	bol=true;
                    		}
                   	    if(bol==false)
                   	    	System.out.println("� ��������� �� ������ ������� ����� �� �������!");
                        break;
                    case 3:
                        // ����� ������ 2
                    	System.out.println("===== ������ ����� ���� 3 =====");
                    	System.out.println("===== ��� �������� ������ ���� ��������� ������������ ������"
                    			+ " �������������� =====");
                    	//
                    	//�������� ������ �� ����� Properties
                		//Properties p = new Properties();
                		//�������� ����
                		//p.put("mail.smtp.host","smtp.yandex.ru");
                		//�������� ����
                		//p.put("mail.smtp.socketFactory.port", 465);
                		//���������� �������� ������������
                		//p.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
                		//�������� ���������� ��� ����� � �������
                		//p.put("mail.smtp.auth", "true");
                		//�������� ����
                		//p.put("mail.smtp.port", 465);
                		
                		//�������� ������
                		//Session s = Session.getDefaultInstance(p,
                		
                		//	new javax.mail.Authenticator() {
                		//		protected PasswordAuthentication getPasswordAuthentication() {
                		//			return new PasswordAuthentication("andykahdyk@yandex.by","04122007VFrcbv");
                		//		} 
                		//	}
                		//);
                		//try {
                			
                		//	Message mess = new MimeMessage(s);
                		//	mess.setFrom(new InternetAddress("xxx@yandex.by"));
                		//	mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse("xxx@mail.ru"));
                		//	mess.setSubject("�������� ������");
                		//	mess.setText("�������� �������� �������� ������������ ������");
                			//�������� ������
                		//	Transport.send(mess);
                		//	JOptionPane.showMessageDialog(null, "������ ������� ����������!!");
                		//}catch(Exception ex) {
                		//	JOptionPane.showConfirmDialog(null, "���-�� ����� �� ���" + ex );
                		//}
                        
                        break;
                    }
            		}	
            }
            break;
        }
		}
		System.out.println("�� ��������!");
	    scan.close();
	  //  scan2.close();
	}

}
