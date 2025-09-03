package ar.edu.udeci.pv.oop;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientApplet extends Applet implements ActionListener{
    Socket socket = null;
    PrintWriter printWriter;
    DataInputStream inputStream;
    String inputData;
    String host;
    TextField outputData = new TextField(20);
    TextField recivedData = new TextField(4);
    Button sendData = new Button("Conectandose");

    public void init(){
        sendData.setEnabled(false);
        add(sendData);
        add(outputData);
        add(new Label("Long: "));
        add(recivedData);
        sendData.addActionListener(this);
        try {
            host = getCodeBase().getHost();
            socket = new Socket(host,15000);
            printWriter = new PrintWriter(socket.getOutputStream(),true);
            inputStream = new DataInputStream(socket.getInputStream());
            sendData.setLabel("Envia");
            sendData.setEnabled(true);
        }catch (IOException e){
            outputData.setText(e.getMessage());
            sendData.setLabel("No pudo");
            System.err.println("Problemas");
        }
    }

    public void actionPerformed(ActionEvent e){
        sendMessage(outputData.getText());
    }
    public void stop(){
        try{
            inputStream.close();
            printWriter.close();
            socket.close();
        }catch (IOException e){
            outputData.setText(e.getMessage());
            sendData.setLabel("Desconectado");
            sendData.setEnabled(false);
        }
    }

    public void sendMessage(String message){
        try{
            printWriter.println(message);
            int l = inputStream.readInt();
            recivedData.setText(String.valueOf(l));
            if (l==0){
                sendData.setLabel("Desconectado");
                sendData.setEnabled(false);
                doLayout();
            }
        }catch (IOException e){
            outputData.setText(e.getMessage());
            sendData.setLabel("Desconectado");
            sendData.setEnabled(false);
        }
    }
}


