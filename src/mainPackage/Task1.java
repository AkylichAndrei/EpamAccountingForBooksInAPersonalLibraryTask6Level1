package mainPackage;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import javax.mail.Message;

import Task1.Roles;
import Task1.Books;

//Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
//Общие требования к заданию:
//• Система учитывает книги как в электронном, так и в бумажном варианте.
//• Существующие роли: пользователь, администратор.
//• Пользователь может просматривать книги в каталоге книг, осуществлять поиск книг в каталоге.
//• Администратор может модифицировать каталог.
//• *При добавлении описания книги в каталог оповещение о ней рассылается на e-mail всем пользователям
//• ***Пользователь может предложить добавить книгу в библиотеку, переслав её администратору на e-mail.
//• Каталог книг хранится в текстовом файле.
//• Данные аутентификации пользователей хранятся в текстовом файле. Пароль не хранится в открытом виде

//											РЕГИСТР ВАЖЕН!!!!!!!!!!!!!
//===========пароль доступа к правам Администратора (Логин:Admin Пароль:1111)====================
//===========пароль доступа к правам Пользователь (Логин:User Пароль:2222)====================
public class Task1 {

	public static void main(String[] args) throws Exception {//волшебнная фраза (безопасность привыше всего)
		   List<Books> books = new ArrayList<>(); // создадим список
		   FileReader fr = new FileReader( "Books.txt" ); //подключим файл с книгами
		   Scanner scan3 = new Scanner(fr);
		   //наполним список книгами
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
		System.out.println("Вы зашли в “Учет книг в домашней библиотеке“");
		System.out.println("Добро пожаловать!");
		System.out.println("1. Для создания учётной записи введите ==> 1");
        System.out.println("2. Если хотите воспользоваться уже существующей введите ==> 2");
        System.out.println("3. Для выхода введите ==> 0");
        ss="9";
        s = scan.next();
        try {
            x = Integer.parseInt(s);
        } catch (NumberFormatException e){
            System.out.println("Неверный ввод");
        }
        switch (x){
        case 1:	
            // вызов метода 1
        	System.out.println("===== Выбран пункт меню 1 =====");
        	System.out.println("Введите имя пользователя:");
         	s1=scan.next();
        	scan.nextLine();
        	System.out.println("Введите пароль:");
        	s2=scan.nextLine();
        	System.out.println("Введите Email:");
        	s3=scan.nextLine();
        	R1.registration(s1, s2, s3);
        	System.out.println("Учётная запись успешно создана!");
            break;
        case 2:
            // вызов метода 2
        	System.out.println("===== Выбран пункт меню 2 =====");
        	System.out.println("Введите имя пользователя:");
        	s1=scan.next();
        	scan.nextLine();
        	System.out.println("Введите пароль:");
         	s2=scan.nextLine();
            pas=R1.search(s1,s2);
            if(Integer.parseInt(pas)==146731693)	
            {
            	System.out.println("Права доступа: Администратор ");
            	while (!"0".equals(ss)){
            		System.out.println("1. Для просмотра каталога введите ==> 1");
                    System.out.println("2. Для поиска введите ==> 2");
                    System.out.println("3. Что бы добавить книгу в каталог введите ==> 3");
                    System.out.println("4. Что бы удалить книгу введите ==> 4");
                    System.out.println("5. Для выхода введите ==> 0");
                    ss = scan.next();
                    try {
                        x = Integer.parseInt(ss);
                    } catch (NumberFormatException e){
                        System.out.println("Неверный ввод");
                    }
                    switch (x){
                    case 1:	
                        // вызов метода 1
                    	System.out.println("===== Выбран пункт меню 1 =====");
                     	for (Books u : books) {
                   	    	System.out.println(u);
                   	    }
                        break;
                    case 2:
                        // вызов метода 2
                    	System.out.println("===== Выбран пункт меню 2 =====");
                    	System.out.println("Введите название книги для поиска: ");
                    	scan.nextLine();
                    	x2=scan.nextLine();
                    	for (Books u : books) 
                    		if(u.search(x2)=="1") {
                    		System.out.println("По вашему запросу найдена книга");
                   	    	System.out.println(u);
                   	    	bol=true;
                    		}
                   	    if(bol==false)
                   	    	System.out.println("К сожелению по вашему запросу ниего не найдено!");
                        break;
                    case 3:
                        // вызов метода 3
                    	System.out.println("===== Выбран пункт меню 3 =====");
                    	System.out.println("Введите название книги:");
                    	s1=scan.next();
                    	scan.nextLine();
                    	System.out.println("Введите Автора:");
                     	s2=scan.nextLine();
                     	System.out.println("Введите формат книги:");
                     	s3=scan.nextLine();
                     	System.out.println("Введите год создания:");
                     	s4=scan.nextLine();
                     	System.out.println("Введите жанр:");
                     	s5=scan.nextLine();
                     	System.out.println("Введите описание:");
                     	s6=scan.nextLine();
                     	System.out.println("Введите расположение книги или электронный адрес:");
                     	s7=scan.nextLine();
                        //R2.add(s1,s2,s3,s4,s5,s6,s7);
                        //добавим книгу в список
                        Books objBooks = new Books(s1, s2, s3, Integer.parseInt(s4),s5,s6, s7);
        	            books.add(objBooks);
                        
        	          //очистим файл
               	    	R2.delFile();
        	            for (Books u2 : books) 
                  	    	 R2.add(u2.getName(),u2.getAuthor(),u2.getFormat(),Integer.toString(u2.getYear()),
                  	    			 u2.getGenre(),u2.getDescription(),u2.getLocation());
                        break;
                    case 4:
                        // вызов метода 4
                    	System.out.println("===== Выбран пункт меню 4 =====");
                    	System.out.println("Введите название книги:");
                    	bol=false;
                    	scan.nextLine();
                    	s1=scan.nextLine();
                    	for (Books u : books) 
                    		if(u.search(s1)=="1") {
                   	    	bol=true;
                   	    	books.remove(u);
                   	    	System.out.println("Книга успешно удалена!");	
                   	    	//очистим файл
                   	    	R2.delFile();
                   	    	//перезапишем файл
                   	    	for (Books u2 : books) 
                   	    	 R2.add(u2.getName(),u2.getAuthor(),u2.getFormat(),Integer.toString(u2.getYear()),
                   	    			 u2.getGenre(),u2.getDescription(),u2.getLocation());
                   	    	break;
                    		}
                   	    if(bol==false)
                   	    	System.out.println("К сожелению книга по вашему запросу не найдена!");
                    	
                        break;
                    }
            		}	
            }
            if(Integer.parseInt(pas)==2645995) {
            	System.out.println("Права доступа: Пользователь ");
            	while (!"0".equals(ss)){
            		System.out.println("1. Для просмотра каталога введите ==> 1");
                    System.out.println("2. Для поиска введите ==> 2");
                    System.out.println("3. Что бы предложить добавить книгу в каталог введите ==> 3");
                    System.out.println("4. Для выхода введите ==> 0");
                    ss = scan.next();
                    try {
                        x = Integer.parseInt(ss);
                    } catch (NumberFormatException e){
                        System.out.println("Неверный ввод");
                    }
                    switch (x){
                    case 1:	
                        // вызов метода 1
                    	System.out.println("===== Выбран пункт меню 1 =====");
                     	for (Books u : books) {
                   	    	System.out.println(u);
                   	    }
                        break;
                    case 2:
                        // вызов метода 2
                    	System.out.println("===== Выбран пункт меню 2 =====");
                    	System.out.println("Введите название книги для поиска: ");
                    	scan.nextLine();
                    	x2=scan.nextLine();
                    	for (Books u : books) 
                    		if(u.search(x2)=="1") {
                    		System.out.println("По вашему запросу найдена книга");
                   	    	System.out.println(u);
                   	    	bol=true;
                    		}
                   	    if(bol==false)
                   	    	System.out.println("К сожелению по вашему запросу ниего не найдено!");
                        break;
                    case 3:
                        // вызов метода 2
                    	System.out.println("===== Выбран пункт меню 3 =====");
                    	System.out.println("===== Для проверки пункта меню требуются персональные данные"
                    			+ " администратора =====");
                    	//
                    	//создадим ссылку на класс Properties
                		//Properties p = new Properties();
                		//выставим путь
                		//p.put("mail.smtp.host","smtp.yandex.ru");
                		//выставим порт
                		//p.put("mail.smtp.socketFactory.port", 465);
                		//установить протокол безопасности
                		//p.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
                		//выставим разрешение для входа в аккаунт
                		//p.put("mail.smtp.auth", "true");
                		//повторим порт
                		//p.put("mail.smtp.port", 465);
                		
                		//создадим сессию
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
                		//	mess.setSubject("Тестовое письмо");
                		//	mess.setText("Проверка качества отправки электронного письма");
                			//отправим письмо
                		//	Transport.send(mess);
                		//	JOptionPane.showMessageDialog(null, "Письмо успешно отправлено!!");
                		//}catch(Exception ex) {
                		//	JOptionPane.showConfirmDialog(null, "Что-то пошло не так" + ex );
                		//}
                        
                        break;
                    }
            		}	
            }
            break;
        }
		}
		System.out.println("До свидания!");
	    scan.close();
	  //  scan2.close();
	}

}
