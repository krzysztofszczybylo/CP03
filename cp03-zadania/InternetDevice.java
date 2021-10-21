
public class InternetDevice
{
    String name;
    boolean connected;
    //static int connectedDevices;
    
    
    public InternetDevice(String name){
        this.name = name;
    }
    public InternetDevice(String name, boolean connected){
        this.name = name;
        this.connected = connected;
        
    }
    boolean connect(boolean connected){
        return(connected = true);
    }
    boolean disconnect(boolean connected){
        return(connected = false);
    }
    void isConnected(){
        if (connected == true){
            System.out.println("The device is connected.");
        }
        else {
            System.out.println("The device is not connected.");
        }
    }
    void displayStatus(){
        System.out.println("Name: " + name);
        

    }
    
    public static void main(String[] args){
           InternetDevice device1 = new InternetDevice("TV", false);
           InternetDevice device2 = new InternetDevice("Smatrphone", true);
           InternetDevice device3 = new InternetDevice("Internet radio", true);
           InternetDevice device4 = new InternetDevice("laptop", true);
           InternetDevice device5 = new InternetDevice("Tablet", false); 
           
           device1.displayStatus();
           device1.isConnected();
           device2.displayStatus();
           device2.isConnected();
           device3.displayStatus();
           device3.isConnected();
           device4.displayStatus();
           device4.isConnected();
           device5.displayStatus();
           device5.isConnected();
       }
}
