package com.l14io;

import java.io.*;

public class main {

    public static void main(String[] args) {

        // readFromConsoleInput();
        // consoleWrite();
        // outputStream();
        // outputStream("UTF-8");

        // directoryList();
        // removeDirectory();
        removeDirectoryForce("D:\\tmp\\test1\\");
        //createDirectory("D:\\tmp\\test1");
    }


    /**
     * 从控制台读取字符
     */
    static void readFromConsoleInput() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下q键退出。");

        do {
            try {
                char c = (char) br.read();
                if (c == 'q') break;
                System.out.print(c);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } while (true);
    }

    /**
     * 将字符写入到控制台
     */
    static void consoleWrite() {

        int b = 'A';
        System.out.write(b);
        System.out.write('\n'); // 不经常用,pintln() 和 print() 更方便
    }

    /**
     * 写入 读取文件
     */
    static void outputStream() {
        try {
            String fileName = "test.txt";
            OutputStream ops = new FileOutputStream(fileName);
            byte[] bytes = {11, 21, 3, 40, 5};
            for (byte b : bytes) {
                ops.write(b);
            }
            ops.close();

            InputStream ips = new FileInputStream(fileName);
            int size = ips.available();
            for (int i = 0; i < size; i++) {
                System.out.print((char) ips.read() + " ");
            }
            ips.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * 写入文件 读取文件，"UTF-8"
     *
     * @param encode
     */
    static void outputStream(String encode) {

        try {

            String fileName = "test1.txt";
            File f = new File(fileName);
            FileOutputStream fop = new FileOutputStream(f);
            OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
            writer.write("中华人民");
            writer.append("\r\n");
            writer.append("this reader a string");
            writer.close();

            FileInputStream fis = new FileInputStream(fileName);
            InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                sb.append((char) reader.read());
            }
            reader.close();
            System.out.println(sb.toString());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void directoryList() {

        String p = "D:\\working";
        File f = new File(p);
        if (f.isDirectory()) {
            // 获取文件夹下的文件和文件夹
            String[] list = f.list();
            for (String l : list) {
                String path = p.concat("\\" + l);
                File file = new File(path);
                System.out.println("isFile: " + file.isFile() + "," + file.getAbsolutePath());
            }
        }
    }

    static void removeDirectory() {

        String path = "D:\\tmp\\test";
        File f = new File(path);
        if (f.isDirectory()) {
            if (f.delete()) {
                System.out.println("删除成功！");
            } else
                System.out.println("删除失败！");
        } else {
            System.out.println("这不是一个目录！");
        }
    }

    /**
     * 创建一个文件夹
     *
     * @param dirPath 文件夹路径
     */
    static void createDirectory(String dirPath) {

        File f = new File(dirPath);
        if (!f.exists()) {
            f.mkdir();
        }
    }

    /**
     * 删除文件夹，连同子文件和文件夹一并删除
     *
     * @param path 文件夹路径
     */
    static void removeDirectoryForce(String path) {

        File f = new File(path);
        if (f.isDirectory()) {
            String[] list = f.list();
            if (list.length > 0) {
                for (int i = 0; i < list.length; i++) {
                    String absolutePath = path.concat("\\" + list[i]);
                    removeDirectoryForce(absolutePath);
                }
            }
        }

        boolean isDeleted = f.delete();
        System.out.println(isDeleted + " : " + path);
    }

    static void test() {

        try {

            String name = "test3.txt";
            File f = new File(name);
            FileOutputStream fos = new FileOutputStream(f);
            OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8");
            writer.write("a");
            writer.append("b");
            writer.close();

            FileInputStream fis = new FileInputStream(f);
            InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
            reader.read();
            reader.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
