package handgame;

import java.util.Random;
import java.util.Scanner;

public class HandGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"가위", "바위", "보"};

        int com = random.nextInt(choices.length);
        String comChoice = choices[com];

                System.out.println("가위(r) 바위(s) 보(p) 중 하나 선택하세요." +
                        "\n문자로 입력\n선택 :");
            String uesr = scanner.nextLine();
            System.out.printf("컴퓨터 :%s%n", comChoice);

            if (uesr.equals(comChoice)) {
                System.out.println("비김");
            } else if (
                    (uesr.equals("r") && comChoice.equals("p")) ||
                            (uesr.equals("s") && comChoice.equals("r")) ||
                            (uesr.equals("p") && comChoice.equals("p"))
            ) {
                System.out.println("허접");
            } else {
                System.out.println("축하");
            }
            scanner.close();
        }
    }