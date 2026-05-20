import java.io.*;

public class Curtain {
    private int id;
    private double price;
    private String type;
    private String color;

    public Curtain(){
        id = 0;
        type = "";
        price = 0.0;
        color = "";
    }
    
    public Curtain(int id, double price, String type, String color){
        this.id = id;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    public int getId(){              return id;       }
    public String getType(){         return type;     }
    public String getColor(){        return color;    }
    public double getPrice(){        return price;    }

    public void setId(int id){                   this.id = id;              }
    public void setPrice(double price){          this.price = price;        }
    public void setType(String type){            this.type = type;          }
    public void setColor(String color){          this.color = color;        }

    public void display(){
        System.out.println("ID: " + id + "\nPrice: " + price + 
                            "\nColor: " + color + "\nType: " + type);
    }

    public void display(Curtain arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println("ID: " + arr[i].id + "\nPrice: " + arr[i].price + 
                            "\nColor: " + arr[i].color + "\nType: " + arr[i].type);
        }
    }

    public void addToFile() throws IOException {
        FileWriter fout = new FileWriter("curtains.txt", true);

        fout.write(id + "," + price + "," + type + "," + color + "\n");
        fout.close();    
    }

    

    // public void addToFile2() throws IOException {
    //     PrintWriter fout = new PrintWriter (new FileWriter("curtains.txt"));

    //     fout.println(id + "," + price + "," + type + "," + color);
    //     fout.close();    
    // }


}
