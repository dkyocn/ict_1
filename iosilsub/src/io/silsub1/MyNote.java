package io.silsub1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MyNote {

    Scanner sc = new Scanner(System.in);

    public MyNote() {

    }


    public void fileSave() {

        System.out.printf("파일의 저장할 내용을 입력하세요. ");
        String str = null;
        StringBuilder stringBuilder = new StringBuilder();
        while(!(str = sc.nextLine()).equals("exit")) {
            stringBuilder.append(str);
            stringBuilder.append("\n");
        }
        
        System.out.printf("저장하시겠습니까?(y/n) ");
            if(sc.next().toLowerCase().charAt(0) == 'y'){

                BufferedOutputStream bufferedOutputStream;
               
                try {

                    System.out.printf("저장할 파일명(.txt): ");
                    String fileName = sc.next();

                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName));

                    bufferedOutputStream.write(stringBuilder.toString().getBytes());


                    bufferedOutputStream.flush();

                    bufferedOutputStream.close();

                    System.out.println(fileName+" 파일에 성공적으로 저장하였습니다.");
            
            
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

    }

    public void fileOpen() {

        System.out.printf("열기할 파일명(.txt): ");
        String fileName = sc.next();

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName))) {
            
            File openFile = new File(fileName);
            byte[] readDatas = new byte[(int)openFile.length()];

			bufferedInputStream.read(readDatas);
            System.out.println(new String(readDatas));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void fileEdit() {

        StringBuilder stringBuilder = new StringBuilder();

        System.out.printf("수정할 파일명(.txt) : ");
        String fileName = sc.next();

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName,true))) {
            
            // 파일 내용 읽기
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName));

            File openFile = new File(fileName);
            byte[] readDatas = new byte[(int)openFile.length()];

			bufferedInputStream.read(readDatas);

            stringBuilder.append(new String(readDatas));

            bufferedInputStream.close();

            // 파일에 내용 StringBuilder에 추가
            System.out.printf("파일에 추가할 내용을 입력하시오. ");
            String str = null;
            while(!(str = sc.nextLine()).equals("exit")) {
                stringBuilder.append(str);
                stringBuilder.append("\n");
            }

            System.out.printf("변경된 내용을 파일에 추가하시겠습니까?(y/n) : ");
            if(sc.next().toLowerCase().charAt(0) == 'y'){
                bufferedOutputStream.write(stringBuilder.toString().getBytes());
                bufferedOutputStream.flush();

                System.out.println(fileName+" 파일의 내용이 변경되었습니다.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 }


