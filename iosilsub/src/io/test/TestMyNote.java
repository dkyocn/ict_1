package io.test;

import java.util.Scanner;

import io.silsub1.MyNote;

public class TestMyNote {

    public static void main(String[] a) {
        menu();
    }

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        MyNote myNote = new MyNote();

        do {
            System.out.println("******   MyNote  *******");
            System.out.println();
            System.out.println("1. 노트 새로 만들기");
            System.out.println("2. 노트 열기");
            System.out.println("3. 노트 열어서 수정하기");
            System.out.println("4. 끝내기");

            System.out.printf("메뉴 선택: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myNote.fileSave();    
                    break;
                case 2:
                    myNote.fileOpen();
                    break;
                case 3:
                    myNote.fileEdit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");;
            }


        } while(true);
    }

}
