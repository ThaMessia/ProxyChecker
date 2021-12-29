package studio.thamessia;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String fileName;

        System.out.print("Enter proxies' file name: ");
        fileName = scanner.nextLine();
        System.out.println("");

        ProxyChecker proxyChecker = new ProxyChecker();
        proxyChecker.checkProxy(fileName);
    }
}
