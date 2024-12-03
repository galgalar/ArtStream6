

import java.util.ArrayList;


public class Client extends Informations{
    
    private static ArrayList <String> names = new ArrayList<>();
    private static ArrayList <String> pass = new ArrayList<>();
    private static ArrayList<DashboardClient> dashboardClient = new ArrayList<>();

    public static int noOfClient = 0;

    public Client(String username,String password)
    {
        super(username,password);
        
        try
        {           
            names.add(username);
            pass.add(password);
            
            DashboardClient client = new DashboardClient(username);
            client.setVisible(false);
            dashboardClient.add(client);
 
             System.out.println(names.get(noOfClient));
             System.out.println(pass.get(noOfClient));
             
            ++noOfClient;
            
        }catch(Exception e)
        {
            System.out.print("sdfdsf");
        }

    }

    public Client()
    {
        super("Unknown","LOL");
    }
        
    public boolean isSameName(String name)
    {
        boolean isSameUsername = false;

        for(int i = 0; i < names.size(); ++i)
        {
            if(name.equals(names.get(i)))
            {
                isSameUsername = true;
                System.out.println(names.get(i));
                break;
            }       
        }

        return isSameUsername;
    }
    
    public boolean isSamePassword(String password)
    {
        boolean isSamePassword = false;

        for(int i = 0; i < pass.size(); ++i)
        {
            if(password.equals(pass.get(i)))
            {
                isSamePassword = true;
                System.out.println(pass.get(i));
                break;
            }   
        }
        return isSamePassword;
    }
    




}
