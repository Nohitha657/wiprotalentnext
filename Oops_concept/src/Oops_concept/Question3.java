package Oops_concept;

import java.util.Scanner;

public class Question3 {

   public static void main(String[] args){
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the name: ");
     String Aname=sc.nextLine();
     System.out.println("Enter the Email: ");
     String Email=sc.nextLine();
     System.out.println("Enter the gender: ");
     char gender=sc.next().charAt(0);
     sc.nextLine();
     System.out.println("Enter the Book name: ");
     String Bname=sc.nextLine();
     System.out.println("Enter the price of the book: ");
     double price =sc.nextDouble();
     System.out.println("Enter the qtyInStock: ");
     int qtyInStock=sc.nextInt();
     
     Author author=new Author(Aname,Email,gender); 
     Book book=new Book(Bname,author,price,qtyInStock); 
     book.getAuthor().getAname();


     	System.out.println("\nAuthor Details:");
        System.out.println("Name: " + author.getAname());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getgender());

        System.out.println("\nBook Details:");
        System.out.println("Book Name: " + book.getBname());
        System.out.println("Author Name: " + book.getAuthor().getAname());

        System.out.println("Price: " + book.getprice());
        System.out.println("Quantity in Stock: " + book.getqtyInStock());
}
}

class Author{
   private String Aname;
   private String Email;
   private char gender;
   
   public Author(String Aname,String Email,char gender){
        this.Aname=Aname;
        this.Email=Email;
        this.gender=gender;
   }
   public void setAName(String Aname){this.Aname=Aname;}
   public void setEmail(String Email){this.Email=Email;}
   public void setgender(char gender){this.gender=gender;}
   public String getAname(){return Aname;}
   public String getEmail(){return Email;}
   public char getgender(){return gender;}
}
class Book{
  private String Bname;
  private Author author;
  private double price;
  private int qtyInStock;
  
  public Book(String Bname,Author author,double price,int qtyInStock){
      this.Bname=Bname;
      this.author=author;
      this.price=price;
      this.qtyInStock=qtyInStock;
      
  }
      public void setBname(String Bname){this.Bname=Bname;}
      public void setAuthor(Author author) {
        this.author = author;
    }
      public void setprice(double price){this.price=price;}
      public void setqtyInStock(int qtyInStock){this.qtyInStock=qtyInStock;}
      public String getBname(){return Bname;}
       public Author getAuthor() {
        return author;
    }
      public double getprice(){return price;}
      public int getqtyInStock(){return qtyInStock;}
}



