package ar.edu.udeci.pv.sockets;

import java.io.*;
import java.net.*;
import java.util.Scanner;

class ClientSocket {
    Socket socket = null;
    PrintWriter printWriter;
    DataInputStream inputStream;
    String inputData;
    String host;

    public void init(){
        try{
            host = "127.0.0.1";
            socket = new Socket(host,15000);
            printWriter = new PrintWriter(socket.getOutputStream(),true);
            inputStream = new DataInputStream(socket.getInputStream());


            Scanner scanner = new Scanner(System.in);

            String read = "";

            do{
                read = scanner.nextLine();
                if(!read.equals("")) {
                    sendMessage(read);
                }
            }while(!read.equals("FIN"));

        }catch (IOException e){
            System.err.println("Problemas");
        }
    }

    public void stop(){
        try{
            inputStream.close();
            printWriter.close();
            socket.close();
        }catch (IOException e){
        }
    }

    public void sendMessage(String message){
        try{
            printWriter.println(message);
            int l = inputStream.readInt();
            String fromServer = inputStream.readLine();
            System.out.println(fromServer);
        }catch (IOException e){
        }
    }
}

public class Client{

    public static void main(String[] args){
        ClientSocket clientSocket = new ClientSocket();
        clientSocket.init();

    }
}
