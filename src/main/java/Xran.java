import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Xran implements Runnable {
private DataInputStream is;
private DataOutputStream os;
public Xran(Socket socket) throws IOException {
    is= new DataInputStream(socket.getInputStream());
    os = new DataOutputStream(socket.getOutputStream());
}

    @Override
    public void run() {
    try{
            while(true){
                String message = null;
                System.out.println("received:"+ message);
                os.writeUTF(message);
                    os.flush();

            }
        }catch(Exception e){
        e.printStackTrace();
    }
    }
}
