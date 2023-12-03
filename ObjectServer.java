import java.net.*;
import java.io.*;

public class ObjectServer
{
    private static int SRV_PORT=5000;
    private static ObjectInputStream is=null;

    public static void main(String argv[]) throws Exception
    {
        ServerSocket soketServer=new ServerSocket(SRV_PORT);
        Socket soketClient=soketServer.accept();
        is=new ObjectInputStream(soketClient.getInputStream());
        Staff pegawai=(Staff) is.readObject();
        System.out.println("Server menerima data Pegawai");
        pegawai.print();
    }
}
