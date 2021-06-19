package by.andervyd.standard_libraries.output.reding_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadingPing {
    public static void main(String[] args) {

        try {
            Process process = Runtime.getRuntime().exec("ping localhost");

            InputStream input = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println("java> " + line);
            }
            // >>   java> PING localhost (127.0.0.1) 56(84) bytes of data.
            //      java> 64 bytes from localhost (127.0.0.1): icmp_seq=1 ttl=64 time=0.134 ms
            //      java> 64 bytes from localhost (127.0.0.1): icmp_seq=2 ttl=64 time=0.125 ms
            //      ...
            //      java> 64 bytes from localhost (127.0.0.1): icmp_seq=20 ttl=64 time=0.129 ms
            //      java> 64 bytes from localhost (127.0.0.1): icmp_seq=21 ttl=64 time=0.128 ms
            //      java>
            //      java> --- localhost ping statistics ---
            //      java> 21 packets transmitted, 21 received, 0% packet loss, time 20471ms
            //      java> rtt min/avg/max/mdev = 0.073/0.120/0.143/0.022 ms

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
