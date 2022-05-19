package Task1;

import java.io.FileWriter;

public class Books {
private String name;
private String author;
private String format;
private int year;
private String genre;
private String description;
private String location;

public Books() {
	
}

public Books(String name, String author, String format, int year, String genre, String description, String location){
	this.name=name;
	this.author=author;
	this.format=format;
	this.year=year;
	this.genre=genre;
	this.description=description;
	this.location=location;
}
@Override
public String toString() {
		 return "{" +
        " Название книги :'" + this.name  + "\r\n"+
        " Автор :'" + this.author  + "\r\n"+
        " Формат :'" + this.format  + "\r\n"+
        " Год :'" + this.year  + "\r\n"+
        " Жанр :'" + this.genre  + "\r\n"+
        " Описание :'" + this.description  + "\r\n"+
        " Расположение :'" + this.location  + "\r\n"+
        '}';
}
public String search(String x2) {
	String x="0";
		if(this.name.equals(x2)==true)
			x="1";
	return x;
}
public void delFile() throws Exception {
	FileWriter nFile = new FileWriter("Books.txt", false); //значение False указывает на то,
	//что файл будет перезаписываться
    nFile.write("");
    nFile.close();
}
public void add(String name, String author, String format, String year, String genre, String description, String location) throws Exception {
	FileWriter nFile = new FileWriter("Books.txt", true); //значение true указывает на то,
	//что файл будет дозаписываться
    nFile.write(name + System.lineSeparator());
    nFile.write(author + System.lineSeparator());
    nFile.write(format + System.lineSeparator());
    nFile.write(year + System.lineSeparator());
    nFile.write(genre + System.lineSeparator());
    nFile.write(description + System.lineSeparator());
    nFile.write(location + System.lineSeparator());
    nFile.close();
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getFormat() {
	return format;
}

public void setFormat(String format) {
	this.format = format;
}
}
