package ar.edu.udeci.pv.sockets;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args){
        ServerSocket serverSocket = null;
        Socket client = null;
        boolean listen = true;
        try{
            serverSocket = new ServerSocket(15000);
            System.out.println("Socket listen en puerto 15000");
            while(listen){
                client = serverSocket.accept();
                System.out.println("Ya se conecto un client desde: " +
                        client.getInetAddress().getHostName()+
                        "("+client.getPort()+")");
                new Attend(client).start();
            }
            serverSocket.close();
        }catch (IOException e){
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}

class Attend extends Thread{
    private BufferedReader bufferedReader;
    private DataOutputStream outputStream;
    private String recive;
    private Socket client = null;
    private String nameDirIP;
    private PrintWriter out;
    public Attend(Socket client){
        this.client = client;
        nameDirIP = this.client.getInetAddress().toString();
    }



    public void run(){
        try{
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outputStream = new DataOutputStream(client.getOutputStream());
            out = new PrintWriter(client.getOutputStream(), true);
            do{
                recive = bufferedReader.readLine();
                System.out.println("("+ nameDirIP +") Llego: " + recive);
                if(recive!=null) {
                    outputStream.writeInt(recive.length());
                }
                out.println("perfecto");
            }while(recive!= null && recive.length()!=0);
            bufferedReader.close();
            client.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        System.out.println("Ya se desconecto"+"("+ nameDirIP +")");
    }


}
