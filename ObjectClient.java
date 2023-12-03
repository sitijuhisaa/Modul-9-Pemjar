import java.net.*;
import java.io.*;

public class ObjectClient
{
    private static int SRV_PORT = 5000;
    private static ObjectOutputStream os=null;

    public static void main(String argv[]) throws Exception
    {
        try
        {
            Socket soketClient=new Socket("127.0.0.1", SRV_PORT);
            os = new
            ObjectOutputStream(soketClient.getOutputStream());
            Staff pegawai=new Staff("Steve","IT",24);
            os.writeObject(pegawai);
            System.out.println("Client mengirim data pegawai");
            pegawai.print();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
