package studio.thamessia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.*;

public class ProxyChecker {
    public void checkProxy(String fileName) throws IOException {
        String fileStringManager;

        File file = new File(fileName);
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        for (int i = 0; (fileStringManager = bufferedReader.readLine()) != null; i++) {
            stringBuilder.append(fileStringManager);
            InetAddress address = InetAddress.getByName(fileStringManager);

            if (!address.isReachable(5000)) System.out.println("PROXY: " + fileStringManager + " is working");
            else System.out.println("PROXY: " + fileStringManager + " is not working.");
        }

    }
}
