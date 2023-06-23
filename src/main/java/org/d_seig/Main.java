package org.d_seig;

import org.d_seig.worlds.OwnWorld;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
import java.net.InetAddress;
//import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
//import java.util.Scanner;

public class Main {
    public static final int PORT = 8129;

    public String getGreeting() {
        return "Hello World!";
    }

    private static BufferedReader reader, in;
    private static BufferedWriter out;
    private static Socket cliSocket;
    private static boolean hasSend = false;

    public static void main(String[] args) throws IOException, UnknownHostException, InterruptedException {
        OwnWorld myWorld = OwnWorld.getInstance();


        // System.out.println(myWorld);

        try {
            try (Socket cliSocket = new Socket(InetAddress.getLocalHost(), PORT)) {

                reader = new BufferedReader(new InputStreamReader(System.in));
                in = new BufferedReader(new InputStreamReader(cliSocket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(cliSocket.getOutputStream()));

                String word = "";
                while (!cliSocket.isOutputShutdown()) {
                    // = reader.readLine();
                    if (!hasSend) {
                        out.write(myWorld + cliSocket.getInetAddress().getHostName() + "\n");
                        out.flush();
                        hasSend = true;
                    } else {
                        System.out.println("Enter your message: ");
                        // out.flush();
                        word = reader.readLine();
                        out.write(word + "\n");
                        out.flush();
                    }
                    if (!word.equalsIgnoreCase("stop") || !word.equalsIgnoreCase("exit")
                            || !word.equalsIgnoreCase("quit")) {
                        break;
                    }
                    String answer = in.readLine();
                    System.out.println(answer);
                    Thread.sleep(1000);
                }

            } finally {
                System.out.println("Клиент закрыт...");
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
                if (cliSocket != null)
                    cliSocket.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        System.out.println(new Main().getGreeting());

    }
}

